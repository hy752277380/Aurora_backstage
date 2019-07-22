package cn.hy.aurora.mapper;

import aurproject.pojo.AurTaskComponent;
import aurproject.pojo.AurTaskComponentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AurTaskComponentMapper {
    long countByExample(AurTaskComponentExample example);

    int deleteByExample(AurTaskComponentExample example);

    int insert(AurTaskComponent record);

    int insertSelective(AurTaskComponent record);

    List<AurTaskComponent> selectByExample(AurTaskComponentExample example);

    int updateByExampleSelective(@Param("record") AurTaskComponent record, @Param("example") AurTaskComponentExample example);

    int updateByExample(@Param("record") AurTaskComponent record, @Param("example") AurTaskComponentExample example);
}