package cn.hy.aurora.mapper;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

/**
 * @author Administrator
 */
@Mapper
public interface AurAnalysisMapper {
    /**
     * 获取首页中数据记录
     *
     * @return Collection<Integer>
     */
    List<Map<String, Integer>> selectAnalysis();
}
