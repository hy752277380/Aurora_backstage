package cn.hy.aurora.mapper;

import aurproject.pojo.AurSysPicture;
import aurproject.pojo.AurSysPictureExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AurSysPictureMapper {
    long countByExample(AurSysPictureExample example);

    int deleteByExample(AurSysPictureExample example);

    int insert(AurSysPicture record);

    int insertSelective(AurSysPicture record);

    List<AurSysPicture> selectByExample(AurSysPictureExample example);

    int updateByExampleSelective(@Param("record") AurSysPicture record, @Param("example") AurSysPictureExample example);

    int updateByExample(@Param("record") AurSysPicture record, @Param("example") AurSysPictureExample example);
}