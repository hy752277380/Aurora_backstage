package cn.hy.aurora.mapper;

import aurproject.pojo.AurArticleLabel;
import aurproject.pojo.AurArticleLabelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AurArticleLabelMapper {
    long countByExample(AurArticleLabelExample example);

    int deleteByExample(AurArticleLabelExample example);

    int insert(AurArticleLabel record);

    int insertSelective(AurArticleLabel record);

    List<AurArticleLabel> selectByExample(AurArticleLabelExample example);

    int updateByExampleSelective(@Param("record") AurArticleLabel record, @Param("example") AurArticleLabelExample example);

    int updateByExample(@Param("record") AurArticleLabel record, @Param("example") AurArticleLabelExample example);
}