package cn.hy.aurora.mapper;

import java.util.List;
import java.util.Map;

import cn.hy.aurora.domain.AurArticleLabel;
import cn.hy.aurora.domain.AurArticleLabelExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface AurArticleLabelMapper {
    long countByExample(AurArticleLabelExample example);

    int deleteByExample(AurArticleLabelExample example);

    int insert(AurArticleLabel record);

    int insertSelective(AurArticleLabel record);

    List<AurArticleLabel> selectByExample(AurArticleLabelExample example);

    int updateByExampleSelective(@Param("record") AurArticleLabel record, @Param("example") AurArticleLabelExample example);

    int updateByExample(@Param("record") AurArticleLabel record, @Param("example") AurArticleLabelExample example);

    List<Map<String, String>> selectLables();
}