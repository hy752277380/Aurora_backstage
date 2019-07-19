package cn.hy.aurora.mapper;

import java.util.List;

import cn.hy.aurora.domain.AurArticleComment;
import cn.hy.aurora.domain.AurArticleCommentExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface AurArticleCommentMapper {
    long countByExample(AurArticleCommentExample example);

    int deleteByExample(AurArticleCommentExample example);

    int insert(AurArticleComment record);

    int insertSelective(AurArticleComment record);

    List<AurArticleComment> selectByExample(AurArticleCommentExample example);

    int updateByExampleSelective(@Param("record") AurArticleComment record, @Param("example") AurArticleCommentExample example);

    int updateByExample(@Param("record") AurArticleComment record, @Param("example") AurArticleCommentExample example);
}