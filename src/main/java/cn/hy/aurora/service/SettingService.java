package cn.hy.aurora.service;

import cn.hy.aurora.config.SecurityUser;
import cn.hy.aurora.domain.*;

/**
 * @author hy
 * @version 1.0
 * @date 2019/8/22 16:30
 */
public interface SettingService {

    /**
     * 新增文章信息
     *
     * @param aurArticleInfo 文章对象
     * @param securityUser   登录用户
     * @return 受影响记录数
     */
    int insertArticle(AurArticleInfo aurArticleInfo, SecurityUser securityUser);

    /**
     * 更新文章信息
     *
     * @param aurArticleInfo 文章对象
     * @return 受影响记录数
     */
    int updateArticle(AurArticleInfo aurArticleInfo);

    /**
     * 删除文章信息
     *
     * @param aurArticleInfo 文章对象
     * @return 受影响记录数
     */
    int deleteArticle(AurArticleInfo aurArticleInfo);

    /**
     * 通过验证码查找用户信息
     *
     * @param authCode 鉴别用户的验证码
     * @return 用户信息
     */
    AurSysUser findByAuthCode(String authCode);

    /**
     * 插入分类
     *
     * @param aurArticleCategory 分类对象
     * @param aurSysUser         登录用户
     * @return 受影响条数
     */
    int insertCategory(AurArticleCategory aurArticleCategory, SecurityUser aurSysUser);

    /**
     * 更新分类信息
     *
     * @param aurArticleCategory 分类对象
     * @return 受影响记录数
     */
    int updateCategory(AurArticleCategory aurArticleCategory);

    /**
     * 删除分类信息
     *
     * @param aurArticleCategory 分类对象
     * @return 受影响记录数
     */
    int deleteCategory(AurArticleCategory aurArticleCategory);

    /**
     * 插入标签信息
     *
     * @param aurArticleLabel 标签对象
     * @param aurSysUser      登录的用户信息
     * @return 受影响记录数
     */
    int insertLabel(AurArticleLabel aurArticleLabel, SecurityUser aurSysUser);

    /**
     * 更新标签信息
     *
     * @param aurArticleLabel 标签对象
     * @return 受影响记录数
     */
    int updateLabel(AurArticleLabel aurArticleLabel);

    /**
     * 删除标签信息
     *
     * @param aurArticleLabel 标签对象
     * @return 受影响记录数
     */
    int deleteLabel(AurArticleLabel aurArticleLabel);

}
