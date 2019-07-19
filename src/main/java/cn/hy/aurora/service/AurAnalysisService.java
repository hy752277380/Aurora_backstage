package cn.hy.aurora.service;

import java.util.Collection;

/**
 * @author heyi
 */
public interface AurAnalysisService {
    /**
     * 查询首页中的数据分析模块
     *
     * @return Collection<Integer>
     */
    Collection<Integer> selectAnalysis();
}
