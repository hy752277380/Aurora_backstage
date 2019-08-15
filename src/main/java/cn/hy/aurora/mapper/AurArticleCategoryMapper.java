package cn.hy.aurora.mapper;

import cn.hy.aurora.domain.AurArticleCategory;
import cn.hy.aurora.domain.AurArticleCategoryExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface AurArticleCategoryMapper {
    long countByExample(AurArticleCategoryExample example);

    int deleteByExample(AurArticleCategoryExample example);

    int insert(AurArticleCategory record);

    int insertSelective(AurArticleCategory record);

    List<AurArticleCategory> selectByExample(AurArticleCategoryExample example);

    int updateByExampleSelective(@Param("record") AurArticleCategory record, @Param("example") AurArticleCategoryExample example);

    int updateByExample(@Param("record") AurArticleCategory record, @Param("example") AurArticleCategoryExample example);
}