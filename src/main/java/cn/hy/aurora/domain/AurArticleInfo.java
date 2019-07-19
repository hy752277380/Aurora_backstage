package cn.hy.aurora.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

public class AurArticleInfo {
    @JsonProperty("id")
    private Integer articleId;

    @JsonProperty("title")
    private String articleTitle;

    private Integer articleAuthor;

    private Integer articleLabel;

    private Integer articleCreator;

    private Date articleCreateDate;

    private Integer articleUpdateBy;

    private Date articleUpdateDate;

    private Float articleVersion;

    private Boolean articleOriginal;

    private String articleOriginalLink;

    private Boolean articleSecret;

    private Boolean articleTop;

    private Boolean articleDeleted;

    public Integer getArticleId() {
        return articleId;
    }

    public void setArticleId(Integer articleId) {
        this.articleId = articleId;
    }

    public String getArticleTitle() {
        return articleTitle;
    }

    public void setArticleTitle(String articleTitle) {
        this.articleTitle = articleTitle == null ? null : articleTitle.trim();
    }

    public Integer getArticleAuthor() {
        return articleAuthor;
    }

    public void setArticleAuthor(Integer articleAuthor) {
        this.articleAuthor = articleAuthor;
    }

    public Integer getArticleLabel() {
        return articleLabel;
    }

    public void setArticleLabel(Integer articleLabel) {
        this.articleLabel = articleLabel;
    }

    public Integer getArticleCreator() {
        return articleCreator;
    }

    public void setArticleCreator(Integer articleCreator) {
        this.articleCreator = articleCreator;
    }

    public Date getArticleCreateDate() {
        return articleCreateDate;
    }

    public void setArticleCreateDate(Date articleCreateDate) {
        this.articleCreateDate = articleCreateDate;
    }

    public Integer getArticleUpdateBy() {
        return articleUpdateBy;
    }

    public void setArticleUpdateBy(Integer articleUpdateBy) {
        this.articleUpdateBy = articleUpdateBy;
    }

    public Date getArticleUpdateDate() {
        return articleUpdateDate;
    }

    public void setArticleUpdateDate(Date articleUpdateDate) {
        this.articleUpdateDate = articleUpdateDate;
    }

    public Float getArticleVersion() {
        return articleVersion;
    }

    public void setArticleVersion(Float articleVersion) {
        this.articleVersion = articleVersion;
    }

    public Boolean getArticleOriginal() {
        return articleOriginal;
    }

    public void setArticleOriginal(Boolean articleOriginal) {
        this.articleOriginal = articleOriginal;
    }

    public String getArticleOriginalLink() {
        return articleOriginalLink;
    }

    public void setArticleOriginalLink(String articleOriginalLink) {
        this.articleOriginalLink = articleOriginalLink == null ? null : articleOriginalLink.trim();
    }

    public Boolean getArticleSecret() {
        return articleSecret;
    }

    public void setArticleSecret(Boolean articleSecret) {
        this.articleSecret = articleSecret;
    }

    public Boolean getArticleTop() {
        return articleTop;
    }

    public void setArticleTop(Boolean articleTop) {
        this.articleTop = articleTop;
    }

    public Boolean getArticleDeleted() {
        return articleDeleted;
    }

    public void setArticleDeleted(Boolean articleDeleted) {
        this.articleDeleted = articleDeleted;
    }
}