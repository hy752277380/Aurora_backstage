package cn.hy.aurora.service;

import java.util.List;
import java.util.Map;

/**
 * @author Administrator
 */
public interface AurArticleLabelService {
    /**
     * 按照数量排名的前10条标签集合
     *
     * @return list集合
     */
    List<Map<String, String>> labels();
}
