package cn.hy.aurora.mapper;

import java.util.List;

import cn.hy.aurora.domain.AurArticleContent;
import cn.hy.aurora.domain.AurArticleContentExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface AurArticleContentMapper {
    long countByExample(AurArticleContentExample example);

    int deleteByExample(AurArticleContentExample example);

    int insert(AurArticleContent record);

    int insertSelective(AurArticleContent record);

    List<AurArticleContent> selectByExample(AurArticleContentExample example);

    int updateByExampleSelective(@Param("record") AurArticleContent record, @Param("example") AurArticleContentExample example);

    int updateByExample(@Param("record") AurArticleContent record, @Param("example") AurArticleContentExample example);
}