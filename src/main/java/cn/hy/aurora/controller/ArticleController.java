package cn.hy.aurora.controller;

import cn.hy.aurora.domain.AurArticleInfo;
import cn.hy.aurora.service.ArticleService;
import cn.hy.aurora.util.BaseResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.*;
import java.nio.file.Files;
import java.util.List;
import java.util.Map;

/**
 * @author hy
 */
@Controller
@RequestMapping("/article")
public class ArticleController {

    private final Logger logger = LoggerFactory.getLogger(getClass());

    @Value("${aurora.global.md-path}")
    private String path;
    @Autowired
    private ArticleService articleService;

    @GetMapping("/markdown/{id}")
    public ResponseEntity<byte[]> getFile(@PathVariable String id) {
        File file = new File(path + File.separator + id);
        HttpHeaders headers = new HttpHeaders();
        headers.setContentDispositionFormData("fileName", file.getName());
        headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);
        ResponseEntity<byte[]> result = null;
        try {
            result = new ResponseEntity<>(Files.readAllBytes(file.toPath()), headers, HttpStatus.OK);
        } catch (IOException e) {
            logger.info("获取文件出错,{}", e.getMessage());
            return null;
        }
        return result;
    }

    /**
     * 上传md文件
     *
     * @param file
     * @return
     */
    @PostMapping("/markdown")
    @ResponseBody
    public BaseResponse uploadFile(@RequestParam("mdFile") MultipartFile file) {
        if (file.isEmpty()) {
            return BaseResponse.buildSuccess("error");
        }
        String fileName = file.getOriginalFilename();
        String path = this.path;
        File uploadFile = new File(path + fileName);
        try {
            file.transferTo(uploadFile);
            return BaseResponse.buildSuccess("文件已上传");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return BaseResponse.buildError(BaseResponse.CODE_ERROR, "md文件上传失败");
    }

    /**
     * 添加文章信息
     *
     * @param aurArticleInfo
     * @return
     */
    @PostMapping("/info")
    @ResponseBody
    public BaseResponse addArticle(@RequestBody AurArticleInfo aurArticleInfo) {
        aurArticleInfo.setArticleDeleted(false);
        int num = articleService.insertArticle(aurArticleInfo);
        return num == 1 ? BaseResponse.buildSuccess("insert success") : BaseResponse.buildError("insert error");
    }


    /**
     * 更新文章信息
     *
     * @return 更新是否成功
     */
    @PutMapping("/info")
    @ResponseBody
    public BaseResponse updateArticle(@RequestBody AurArticleInfo aurArticleInfo) {
        int i = articleService.updateArticleInfo(aurArticleInfo);
        if (i == 1) {
            return BaseResponse.buildSuccess();
        } else {
            return BaseResponse.buildError();
        }
    }

    @GetMapping("/info")
    @ResponseBody
    public BaseResponse getInfoList() {
        List<Map<String, Object>> list = articleService.getInfoList();
        return BaseResponse.buildSuccess(list);
    }

    @GetMapping("/info/{id}")
    @ResponseBody
    public BaseResponse getInfo(@PathVariable int id) {
        AurArticleInfo aurArticleInfo = articleService.getInfo(id);
        return BaseResponse.buildSuccess(aurArticleInfo);
    }

}
