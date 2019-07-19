package cn.hy.aurora.mapper;

import java.util.List;

import cn.hy.aurora.domain.AurSysPicture;
import cn.hy.aurora.domain.AurSysPictureExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface AurSysPictureMapper {
    long countByExample(AurSysPictureExample example);

    int deleteByExample(AurSysPictureExample example);

    int insert(AurSysPicture record);

    int insertSelective(AurSysPicture record);

    List<AurSysPicture> selectByExample(AurSysPictureExample example);

    int updateByExampleSelective(@Param("record") AurSysPicture record, @Param("example") AurSysPictureExample example);

    int updateByExample(@Param("record") AurSysPicture record, @Param("example") AurSysPictureExample example);
}