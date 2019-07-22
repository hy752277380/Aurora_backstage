package cn.hy.aurora.mapper;

import aurproject.pojo.AurTaskCycle;
import aurproject.pojo.AurTaskCycleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AurTaskCycleMapper {
    long countByExample(AurTaskCycleExample example);

    int deleteByExample(AurTaskCycleExample example);

    int insert(AurTaskCycle record);

    int insertSelective(AurTaskCycle record);

    List<AurTaskCycle> selectByExample(AurTaskCycleExample example);

    int updateByExampleSelective(@Param("record") AurTaskCycle record, @Param("example") AurTaskCycleExample example);

    int updateByExample(@Param("record") AurTaskCycle record, @Param("example") AurTaskCycleExample example);
}