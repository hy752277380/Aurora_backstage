package cn.hy.aurora.mapper;

import aurproject.pojo.AurTaskSchedule;
import aurproject.pojo.AurTaskScheduleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AurTaskScheduleMapper {
    long countByExample(AurTaskScheduleExample example);

    int deleteByExample(AurTaskScheduleExample example);

    int insert(AurTaskSchedule record);

    int insertSelective(AurTaskSchedule record);

    List<AurTaskSchedule> selectByExample(AurTaskScheduleExample example);

    int updateByExampleSelective(@Param("record") AurTaskSchedule record, @Param("example") AurTaskScheduleExample example);

    int updateByExample(@Param("record") AurTaskSchedule record, @Param("example") AurTaskScheduleExample example);
}