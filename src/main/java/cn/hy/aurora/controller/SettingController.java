package cn.hy.aurora.controller;

import cn.hy.aurora.config.SecurityUser;
import cn.hy.aurora.domain.AurArticleCategory;
import cn.hy.aurora.domain.AurArticleInfo;
import cn.hy.aurora.domain.AurArticleLabel;
import cn.hy.aurora.service.SettingService;
import cn.hy.aurora.util.BaseResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.*;

/**
 * @author hy
 * @version 1.0
 * @date 2019/8/22 16:27
 */
@RestController
@RequestMapping("/api/setting")
@PreAuthorize("hasRole('MANAGER')")
public class SettingController {

    @Autowired
    private SettingService settingService;

    //--------------------------------------------------------------文章操作

    @PostMapping("/article")
    public BaseResponse insertArticle(@RequestBody AurArticleInfo aurArticleInfo, @AuthenticationPrincipal SecurityUser securityUser) {
        int i = settingService.insertArticle(aurArticleInfo, securityUser);
        return BaseResponse.buildSuccess("insert successful", i);
    }

    @PutMapping("/article")
    public BaseResponse updateArticle(@RequestBody AurArticleInfo aurArticleInfo) {
        int i = settingService.updateArticle(aurArticleInfo);
        return BaseResponse.buildSuccess("update successful", i);
    }

    @DeleteMapping("/article")
    public BaseResponse deleteArticle(@RequestBody AurArticleInfo aurArticleInfo) {
        int i = settingService.deleteArticle(aurArticleInfo);
        return BaseResponse.buildSuccess("delete successful", i);
    }

    //--------------------------------------------------------------分类操作

    @PostMapping("/category")
    public BaseResponse insertCategory(@RequestBody AurArticleCategory aurArticleCategory, @AuthenticationPrincipal SecurityUser aurSysUser) {
        int i = settingService.insertCategory(aurArticleCategory, aurSysUser);
        return BaseResponse.buildSuccess("insert successful", i);
    }

    @PutMapping("/category")
    public BaseResponse updateCategory(@RequestBody AurArticleCategory aurArticleCategory) {
        int i = settingService.updateCategory(aurArticleCategory);
        return BaseResponse.buildSuccess("update successful", i);
    }

    @DeleteMapping("/category")
    public BaseResponse deleteCategory(@RequestBody AurArticleCategory aurArticleCategory) {
        int i = settingService.deleteCategory(aurArticleCategory);
        return BaseResponse.buildSuccess("delete successful", i);
    }

    //--------------------------------------------------------------标签操作

    @PostMapping("/label")
    public BaseResponse insertLabel(@RequestBody AurArticleLabel aurArticleLabel, @AuthenticationPrincipal SecurityUser securityUser) {
        int i = settingService.insertLabel(aurArticleLabel, securityUser);
        return BaseResponse.buildSuccess("insert successful", i);
    }

    @PutMapping("/label")
    public BaseResponse updateLabel(@RequestBody AurArticleLabel aurArticleLabel) {
        int i = settingService.updateLabel(aurArticleLabel);
        return BaseResponse.buildSuccess("update successful", i);
    }

    @DeleteMapping("/label")
    public BaseResponse deleteLabel(@RequestBody AurArticleLabel aurArticleLabel) {
        int i = settingService.deleteLabel(aurArticleLabel);
        return BaseResponse.buildSuccess("delete successful", i);
    }

    //--------------------------------------------------------------标签操作


}
