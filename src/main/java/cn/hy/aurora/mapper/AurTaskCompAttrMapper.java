package cn.hy.aurora.mapper;

import aurproject.pojo.AurTaskCompAttr;
import aurproject.pojo.AurTaskCompAttrExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AurTaskCompAttrMapper {
    long countByExample(AurTaskCompAttrExample example);

    int deleteByExample(AurTaskCompAttrExample example);

    int insert(AurTaskCompAttr record);

    int insertSelective(AurTaskCompAttr record);

    List<AurTaskCompAttr> selectByExample(AurTaskCompAttrExample example);

    int updateByExampleSelective(@Param("record") AurTaskCompAttr record, @Param("example") AurTaskCompAttrExample example);

    int updateByExample(@Param("record") AurTaskCompAttr record, @Param("example") AurTaskCompAttrExample example);
}