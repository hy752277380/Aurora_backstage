package cn.hy.aurora.mapper;

import aurproject.pojo.AurArticleLike;
import aurproject.pojo.AurArticleLikeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AurArticleLikeMapper {
    long countByExample(AurArticleLikeExample example);

    int deleteByExample(AurArticleLikeExample example);

    int insert(AurArticleLike record);

    int insertSelective(AurArticleLike record);

    List<AurArticleLike> selectByExample(AurArticleLikeExample example);

    int updateByExampleSelective(@Param("record") AurArticleLike record, @Param("example") AurArticleLikeExample example);

    int updateByExample(@Param("record") AurArticleLike record, @Param("example") AurArticleLikeExample example);
}