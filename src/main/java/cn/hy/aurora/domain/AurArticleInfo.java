package cn.hy.aurora.domain;

public class AurArticleInfo {
    private Integer articleId;

    private Integer articleCategory;

    private String articleTitle;

    private Integer articleAuthor;

    private Integer articleLabel;

    private String articleMdUrl;

    private String articleDescription;

    private Integer articleCreator;

    private String articleCreateDate;

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

    public Integer getArticleCategory() {
        return articleCategory;
    }

    public void setArticleCategory(Integer articleCategory) {
        this.articleCategory = articleCategory;
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

    public String getArticleMdUrl() {
        return articleMdUrl;
    }

    public void setArticleMdUrl(String articleMdUrl) {
        this.articleMdUrl = articleMdUrl == null ? null : articleMdUrl.trim();
    }

    public String getArticleDescription() {
        return articleDescription;
    }

    public void setArticleDescription(String articleDescription) {
        this.articleDescription = articleDescription == null ? null : articleDescription.trim();
    }

    public Integer getArticleCreator() {
        return articleCreator;
    }

    public void setArticleCreator(Integer articleCreator) {
        this.articleCreator = articleCreator;
    }

    public String getArticleCreateDate() {
        return articleCreateDate;
    }

    public void setArticleCreateDate(String articleCreateDate) {
        this.articleCreateDate = articleCreateDate == null ? null : articleCreateDate.trim();
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