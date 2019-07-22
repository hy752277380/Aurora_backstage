package cn.hy.aurora.mapper;

import aurproject.pojo.AurArticleInfo;
import aurproject.pojo.AurArticleInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AurArticleInfoMapper {
    long countByExample(AurArticleInfoExample example);

    int deleteByExample(AurArticleInfoExample example);

    int insert(AurArticleInfo record);

    int insertSelective(AurArticleInfo record);

    List<AurArticleInfo> selectByExample(AurArticleInfoExample example);

    int updateByExampleSelective(@Param("record") AurArticleInfo record, @Param("example") AurArticleInfoExample example);

    int updateByExample(@Param("record") AurArticleInfo record, @Param("example") AurArticleInfoExample example);
}