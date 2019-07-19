package cn.hy.aurora.domain;

import java.util.Date;

public class AurArticleContent {
    private Integer contentId;

    private Integer articleId;

    private Integer contentCreator;

    private Date contentCreateDate;

    private Integer contentUpdate;

    private Date contentUpdateDate;

    private Float contentVersion;

    private String contentMdUrl;

    private Boolean contentDelete;

    public Integer getContentId() {
        return contentId;
    }

    public void setContentId(Integer contentId) {
        this.contentId = contentId;
    }

    public Integer getArticleId() {
        return articleId;
    }

    public void setArticleId(Integer articleId) {
        this.articleId = articleId;
    }

    public Integer getContentCreator() {
        return contentCreator;
    }

    public void setContentCreator(Integer contentCreator) {
        this.contentCreator = contentCreator;
    }

    public Date getContentCreateDate() {
        return contentCreateDate;
    }

    public void setContentCreateDate(Date contentCreateDate) {
        this.contentCreateDate = contentCreateDate;
    }

    public Integer getContentUpdate() {
        return contentUpdate;
    }

    public void setContentUpdate(Integer contentUpdate) {
        this.contentUpdate = contentUpdate;
    }

    public Date getContentUpdateDate() {
        return contentUpdateDate;
    }

    public void setContentUpdateDate(Date contentUpdateDate) {
        this.contentUpdateDate = contentUpdateDate;
    }

    public Float getContentVersion() {
        return contentVersion;
    }

    public void setContentVersion(Float contentVersion) {
        this.contentVersion = contentVersion;
    }

    public String getContentMdUrl() {
        return contentMdUrl;
    }

    public void setContentMdUrl(String contentMdUrl) {
        this.contentMdUrl = contentMdUrl == null ? null : contentMdUrl.trim();
    }

    public Boolean getContentDelete() {
        return contentDelete;
    }

    public void setContentDelete(Boolean contentDelete) {
        this.contentDelete = contentDelete;
    }
}