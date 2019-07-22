package cn.hy.aurora.mapper;

import aurproject.pojo.AurSysVisitLog;
import aurproject.pojo.AurSysVisitLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AurSysVisitLogMapper {
    long countByExample(AurSysVisitLogExample example);

    int deleteByExample(AurSysVisitLogExample example);

    int insert(AurSysVisitLog record);

    int insertSelective(AurSysVisitLog record);

    List<AurSysVisitLog> selectByExample(AurSysVisitLogExample example);

    int updateByExampleSelective(@Param("record") AurSysVisitLog record, @Param("example") AurSysVisitLogExample example);

    int updateByExample(@Param("record") AurSysVisitLog record, @Param("example") AurSysVisitLogExample example);
}