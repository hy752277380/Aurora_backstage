package cn.hy.aurora.mapper;

import aurproject.pojo.AurTaskItem;
import aurproject.pojo.AurTaskItemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AurTaskItemMapper {
    long countByExample(AurTaskItemExample example);

    int deleteByExample(AurTaskItemExample example);

    int insert(AurTaskItem record);

    int insertSelective(AurTaskItem record);

    List<AurTaskItem> selectByExample(AurTaskItemExample example);

    int updateByExampleSelective(@Param("record") AurTaskItem record, @Param("example") AurTaskItemExample example);

    int updateByExample(@Param("record") AurTaskItem record, @Param("example") AurTaskItemExample example);
}