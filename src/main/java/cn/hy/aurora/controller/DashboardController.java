package cn.hy.aurora.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author heyi
 */
@Controller
@RequestMapping("/dashboard")
@CrossOrigin
public class DashboardController {

//    @Autowired
//    private AurAnalysisService aurAnalysisService;
//
//    @Autowired
//    private AurArticleInfoService aurArticleInfoService;
//
//    @Autowired
//    private AurArticleCommentService aurArticleCommentService;
//
//    @Autowired
//    private AurArticleLabelService aurArticleLabelService;
//
//    /**
//     * 获取文章，评论，访问，天数
//     *
//     * @return Collection<Integer>
//     */
//    @GetMapping("/analysis")
//    @ResponseBody
//    public BaseResponse articleCount() {
//        return BaseResponse.buildSuccess(aurAnalysisService.selectAnalysis());
//    }
//
//    /**
//     * 获取按时间排名的最新文章
//     *
//     * @return tag
//     */
//    @GetMapping("/recentPosts")
//    @ResponseBody
//    public BaseResponse recentPosts() {
//        return BaseResponse.buildSuccess(aurArticleInfoService.recentPosts());
//    }
//
//    /**
//     * 获取按照数量排名前10条标签
//     *
//     * @return labels
//     */
//    @GetMapping("/labels")
//    @ResponseBody
//    public BaseResponse labels() {
//        return BaseResponse.buildSuccess(aurArticleLabelService.labels());
//    }
}
