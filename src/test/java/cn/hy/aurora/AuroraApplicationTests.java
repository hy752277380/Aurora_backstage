package cn.hy.aurora;

import cn.hy.aurora.service.AurAnalysisService;
import cn.hy.aurora.service.AurArticleInfoService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AuroraApplicationTests {
    @Autowired
    private AurAnalysisService aurAnalysisService;

    @Autowired
    private AurArticleInfoService aurArticleInfoService;

    @Test
    public void contextLoads() {
        System.out.println(aurArticleInfoService.articleCount());
    }

}
