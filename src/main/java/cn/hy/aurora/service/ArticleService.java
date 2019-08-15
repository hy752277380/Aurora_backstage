package cn.hy.aurora.service;

import cn.hy.aurora.domain.AurArticleInfo;
import java.util.List;
import java.util.Map;

/**
 * @author Administrator
 */
public interface ArticleService {
    /**
     * 插入文章信息
     *
     * @param aurArticleInfo
     * @return 成功记录数
     */
    int insertArticle(AurArticleInfo aurArticleInfo);

    /**
     * 获取列表- 默认时间排序
     *
     * @return
     */
    List<Map<String, Object>> getInfoList();

    /**
     * 通过id获取文章信息
     * @param id 文章id
     * @return 单个文章信息
     */
    AurArticleInfo getInfo(int id);

    /**
     * 更新文章信息
     * @param aurArticleInfo
     * @return 受影响记录数
     */
    int updateArticleInfo(AurArticleInfo aurArticleInfo);
}
