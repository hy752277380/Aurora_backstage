package cn.hy.aurora.mapper;

import cn.hy.aurora.domain.AurArticleInfo;
import cn.hy.aurora.domain.AurArticleInfoExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface AurArticleInfoMapper {
    long countByExample(AurArticleInfoExample example);

    int deleteByExample(AurArticleInfoExample example);

    int insert(AurArticleInfo record);

    int insertSelective(AurArticleInfo record);

    List<AurArticleInfo> selectByExample(AurArticleInfoExample example);

    int updateByExampleSelective(@Param("record") AurArticleInfo record, @Param("example") AurArticleInfoExample example);

    int updateByExample(@Param("record") AurArticleInfo record, @Param("example") AurArticleInfoExample example);

    /**
     * @return
     */
    List<Map<String, Object>> selectInfoList();
}