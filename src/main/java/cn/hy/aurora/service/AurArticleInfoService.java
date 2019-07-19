package cn.hy.aurora.service;

import cn.hy.aurora.domain.AurArticleInfo;

import java.util.List;

/**
 * @author heyi
 */
public interface AurArticleInfoService {
    /**
     * 数量
     *
     * @return long
     */
    long articleCount();

    /**
     * 最新更新的文章
     *
     * @return List<AurArticleInfo>
     */
    List<AurArticleInfo> recentPosts();


}
