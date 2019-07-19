package cn.hy.aurora.mapper;

import java.util.List;

import cn.hy.aurora.domain.AurSysUser;
import cn.hy.aurora.domain.AurSysUserExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface AurSysUserMapper {
    long countByExample(AurSysUserExample example);

    int deleteByExample(AurSysUserExample example);

    int insert(AurSysUser record);

    int insertSelective(AurSysUser record);

    List<AurSysUser> selectByExample(AurSysUserExample example);

    int updateByExampleSelective(@Param("record") AurSysUser record, @Param("example") AurSysUserExample example);

    int updateByExample(@Param("record") AurSysUser record, @Param("example") AurSysUserExample example);
}