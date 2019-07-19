package cn.hy.aurora.service.impl;

import cn.hy.aurora.domain.AurArticleInfo;
import cn.hy.aurora.domain.AurArticleInfoExample;
import cn.hy.aurora.mapper.AurArticleInfoMapper;
import cn.hy.aurora.service.AurArticleInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author heyi
 */
@Service
public class AurArticleInfoServiceImpl implements AurArticleInfoService {

    @SuppressWarnings("all")
    @Autowired
    private AurArticleInfoMapper aurArticleInfoMapper;

    @Override
    public long articleCount() {
        return aurArticleInfoMapper.countByExample(new AurArticleInfoExample());
    }

    @Override
    public List<AurArticleInfo> recentPosts() {
        AurArticleInfoExample aurArticleInfoExample = new AurArticleInfoExample();
        aurArticleInfoExample.createCriteria().andArticleDeletedEqualTo(false);
        aurArticleInfoExample.setOrderByClause("article_create_date desc limit 0,10");
        return aurArticleInfoMapper.selectByExample(aurArticleInfoExample);
    }
}
