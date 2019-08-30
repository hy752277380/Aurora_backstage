package cn.hy.aurora.service.impl;

import cn.hy.aurora.config.SecurityUser;
import cn.hy.aurora.domain.*;
import cn.hy.aurora.mapper.AurArticleCategoryMapper;
import cn.hy.aurora.mapper.AurArticleInfoMapper;
import cn.hy.aurora.mapper.AurArticleLabelMapper;
import cn.hy.aurora.mapper.AurSysUserMapper;
import cn.hy.aurora.service.SettingService;
import cn.hy.aurora.util.TimeUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author hy
 * @version 1.0
 * @date 2019/8/22 16:30
 */
@Service
public class SettingServiceImpl implements SettingService {

    @SuppressWarnings("all")
    @Autowired
    private AurArticleInfoMapper aurArticleInfoMapper;

    @SuppressWarnings("all")
    @Autowired
    private AurArticleCategoryMapper aurArticleCategoryMapper;

    @SuppressWarnings("all")
    @Autowired
    private AurArticleLabelMapper aurArticleLabelMapper;

    @SuppressWarnings("all")
    @Autowired
    private AurSysUserMapper aurSysUserMapper;

    @Override
    public int insertArticle(AurArticleInfo aurArticleInfo, SecurityUser securityUser) {
        aurArticleInfo.setArticleCreator(securityUser.getUserInfo().getUserId());
        aurArticleInfo.setArticleCreateDate(TimeUtil.getSimpleFormatDate());
        aurArticleInfo.setArticleDeleted(false);
        return aurArticleInfoMapper.insert(aurArticleInfo);
    }

    @Override
    public int updateArticle(AurArticleInfo aurArticleInfo) {
        AurArticleInfoExample aurArticleInfoExample = new AurArticleInfoExample();
        aurArticleInfoExample.createCriteria().andArticleIdEqualTo(aurArticleInfo.getArticleId());
        return aurArticleInfoMapper.updateByExampleSelective(aurArticleInfo, aurArticleInfoExample);
    }

    @Override
    public int deleteArticle(AurArticleInfo aurArticleInfo) {
        AurArticleInfoExample aurArticleInfoExample = new AurArticleInfoExample();
        aurArticleInfoExample.createCriteria().andArticleIdEqualTo(aurArticleInfo.getArticleId());
        aurArticleInfo.setArticleDeleted(true);
        return aurArticleInfoMapper.updateByExampleSelective(aurArticleInfo, aurArticleInfoExample);
    }


    @Override
    public AurSysUser findByAuthCode(String authCode) {
        AurSysUserExample aurSysUserExample = new AurSysUserExample();
        aurSysUserExample.createCriteria().andUserAuthCodeEqualTo(authCode);
        return aurSysUserMapper.selectByExample(aurSysUserExample).get(0);
    }

    @Override
    public int insertCategory(AurArticleCategory aurArticleCategory, SecurityUser securityUser) {
        aurArticleCategory.setCategoryDeleted(false);
        aurArticleCategory.setCategoryCreateDate(TimeUtil.getSimpleFormatDate());
        aurArticleCategory.setCategoryCreate(securityUser.getUserInfo().getUserId());
        return aurArticleCategoryMapper.insert(aurArticleCategory);
    }

    @Override
    public int updateCategory(AurArticleCategory aurArticleCategory) {
        AurArticleCategoryExample aurArticleCategoryExample = new AurArticleCategoryExample();
        aurArticleCategoryExample.createCriteria().andCategoryIdEqualTo(aurArticleCategory.getCategoryId());
        return aurArticleCategoryMapper.updateByExampleSelective(aurArticleCategory, aurArticleCategoryExample);
    }

    @Override
    public int deleteCategory(AurArticleCategory aurArticleCategory) {
        AurArticleCategoryExample aurArticleCategoryExample = new AurArticleCategoryExample();
        aurArticleCategoryExample.createCriteria().andCategoryIdEqualTo(aurArticleCategory.getCategoryId());
        aurArticleCategory.setCategoryDeleted(true);
        return aurArticleCategoryMapper.updateByExampleSelective(aurArticleCategory, aurArticleCategoryExample);
    }

    @Override
    public int insertLabel(AurArticleLabel aurArticleLabel, SecurityUser securityUser) {
        aurArticleLabel.setLabelDeleted(false);
        aurArticleLabel.setLabelCreateDate(TimeUtil.getSimpleFormatDate());
        aurArticleLabel.setLabelCreate(securityUser.getUserInfo().getUserId());
        return aurArticleLabelMapper.insert(aurArticleLabel);
    }

    @Override
    public int updateLabel(AurArticleLabel aurArticleLabel) {
        AurArticleLabelExample aurArticleLabelExample = new AurArticleLabelExample();
        aurArticleLabelExample.createCriteria().andLabelIdEqualTo(aurArticleLabel.getLabelId());
        return aurArticleLabelMapper.insert(aurArticleLabel);
    }

    @Override
    public int deleteLabel(AurArticleLabel aurArticleLabel) {
        AurArticleLabelExample aurArticleLabelExample = new AurArticleLabelExample();
        aurArticleLabelExample.createCriteria().andLabelIdEqualTo(aurArticleLabel.getLabelId());
        aurArticleLabel.setLabelDeleted(true);
        return aurArticleLabelMapper.updateByExampleSelective(aurArticleLabel, aurArticleLabelExample);
    }
}
