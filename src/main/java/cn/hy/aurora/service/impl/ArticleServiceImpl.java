package cn.hy.aurora.service.impl;

import cn.hy.aurora.domain.AurArticleInfo;
import cn.hy.aurora.domain.AurArticleInfoExample;
import cn.hy.aurora.mapper.AurArticleInfoMapper;
import cn.hy.aurora.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @author Administrator
 */
@Service
public class ArticleServiceImpl implements ArticleService {

    @Autowired
    private AurArticleInfoMapper aurArticleInfoMapper;


    @Override
    public int insertArticle(AurArticleInfo aurArticleInfo) {
        return aurArticleInfoMapper.insert(aurArticleInfo);
    }

    @Override
    public List<Map<String, Object>> getInfoList() {
        return aurArticleInfoMapper.selectInfoList();
    }

    @Override
    public AurArticleInfo getInfo(int id) {
        AurArticleInfoExample aurArticleInfoExample = new AurArticleInfoExample();
        aurArticleInfoExample.createCriteria().andArticleIdEqualTo(id);
        return aurArticleInfoMapper.selectByExample(aurArticleInfoExample).get(0);
    }

    @Override
    public int updateArticleInfo(AurArticleInfo aurArticleInfo) {
        AurArticleInfoExample aurArticleInfoExample = new AurArticleInfoExample();
        aurArticleInfoExample.createCriteria().andArticleIdEqualTo(aurArticleInfo.getArticleId());
        return aurArticleInfoMapper.updateByExampleSelective(aurArticleInfo, aurArticleInfoExample);
    }
}
