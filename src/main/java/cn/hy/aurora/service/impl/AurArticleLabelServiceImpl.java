package cn.hy.aurora.service.impl;

import cn.hy.aurora.domain.AurArticleLabel;
import cn.hy.aurora.domain.AurArticleLabelExample;
import cn.hy.aurora.mapper.AurArticleLabelMapper;
import cn.hy.aurora.service.AurArticleLabelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @author Administrator
 */

@Service
public class AurArticleLabelServiceImpl implements AurArticleLabelService {

    @SuppressWarnings("all")
    @Autowired
    private AurArticleLabelMapper aurArticleLabelMapper;

    @Override
    public List<Map<String, String>> labels() {
        return aurArticleLabelMapper.selectLables();
    }
}
