package cn.hy.aurora.service.impl;

import cn.hy.aurora.service.AurArticleCommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author heyi
 */
@Service
public class AurArticleCommentServiceImpl implements AurArticleCommentService {

    @SuppressWarnings("all")
    @Autowired
    private AurArticleCommentMapper aurArticleCommentMapper;


    @Override
    public long commentCount() {
        AurArticleCommentExample aurArticleCommentExample = new AurArticleCommentExample();
        aurArticleCommentExample.createCriteria().andCommentTypeEqualTo(false);
        return aurArticleCommentMapper.countByExample(aurArticleCommentExample);
    }
}
