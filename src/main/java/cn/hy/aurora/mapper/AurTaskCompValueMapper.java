package cn.hy.aurora.mapper;

import aurproject.pojo.AurTaskCompValue;
import aurproject.pojo.AurTaskCompValueExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AurTaskCompValueMapper {
    long countByExample(AurTaskCompValueExample example);

    int deleteByExample(AurTaskCompValueExample example);

    int insert(AurTaskCompValue record);

    int insertSelective(AurTaskCompValue record);

    List<AurTaskCompValue> selectByExample(AurTaskCompValueExample example);

    int updateByExampleSelective(@Param("record") AurTaskCompValue record, @Param("example") AurTaskCompValueExample example);

    int updateByExample(@Param("record") AurTaskCompValue record, @Param("example") AurTaskCompValueExample example);
}