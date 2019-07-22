package cn.hy.aurora.mapper;

import aurproject.pojo.AurSysUser;
import aurproject.pojo.AurSysUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AurSysUserMapper {
    long countByExample(AurSysUserExample example);

    int deleteByExample(AurSysUserExample example);

    int insert(AurSysUser record);

    int insertSelective(AurSysUser record);

    List<AurSysUser> selectByExample(AurSysUserExample example);

    int updateByExampleSelective(@Param("record") AurSysUser record, @Param("example") AurSysUserExample example);

    int updateByExample(@Param("record") AurSysUser record, @Param("example") AurSysUserExample example);
}