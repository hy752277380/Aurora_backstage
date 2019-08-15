package cn.hy.aurora.mapper;

import cn.hy.aurora.domain.AurArticleLog;
import cn.hy.aurora.domain.AurArticleLogExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface AurArticleLogMapper {
    long countByExample(AurArticleLogExample example);

    int deleteByExample(AurArticleLogExample example);

    int insert(AurArticleLog record);

    int insertSelective(AurArticleLog record);

    List<AurArticleLog> selectByExample(AurArticleLogExample example);

    int updateByExampleSelective(@Param("record") AurArticleLog record, @Param("example") AurArticleLogExample example);

    int updateByExample(@Param("record") AurArticleLog record, @Param("example") AurArticleLogExample example);
}