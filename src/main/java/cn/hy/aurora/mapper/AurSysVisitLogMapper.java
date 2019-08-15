package cn.hy.aurora.mapper;

import cn.hy.aurora.domain.AurSysVisitLog;
import cn.hy.aurora.domain.AurSysVisitLogExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface AurSysVisitLogMapper {
    long countByExample(AurSysVisitLogExample example);

    int deleteByExample(AurSysVisitLogExample example);

    int insert(AurSysVisitLog record);

    int insertSelective(AurSysVisitLog record);

    List<AurSysVisitLog> selectByExample(AurSysVisitLogExample example);

    int updateByExampleSelective(@Param("record") AurSysVisitLog record, @Param("example") AurSysVisitLogExample example);

    int updateByExample(@Param("record") AurSysVisitLog record, @Param("example") AurSysVisitLogExample example);
}