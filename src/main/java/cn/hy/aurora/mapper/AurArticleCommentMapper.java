package cn.hy.aurora.mapper;

import aurproject.pojo.AurArticleComment;
import aurproject.pojo.AurArticleCommentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AurArticleCommentMapper {
    long countByExample(AurArticleCommentExample example);

    int deleteByExample(AurArticleCommentExample example);

    int insert(AurArticleComment record);

    int insertSelective(AurArticleComment record);

    List<AurArticleComment> selectByExample(AurArticleCommentExample example);

    int updateByExampleSelective(@Param("record") AurArticleComment record, @Param("example") AurArticleCommentExample example);

    int updateByExample(@Param("record") AurArticleComment record, @Param("example") AurArticleCommentExample example);
}