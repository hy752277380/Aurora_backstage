package cn.hy.aurora.domain;

public class AurArticleComment {
    private Integer commentId;

    private String commentName;

    private String commentEmail;

    private String commentContent;

    private Integer commentCreate;

    private String commentCreateDate;

    private Integer commentTypeId;

    private Boolean commentType;

    private Boolean commentDeleted;

    public Integer getCommentId() {
        return commentId;
    }

    public void setCommentId(Integer commentId) {
        this.commentId = commentId;
    }

    public String getCommentName() {
        return commentName;
    }

    public void setCommentName(String commentName) {
        this.commentName = commentName == null ? null : commentName.trim();
    }

    public String getCommentEmail() {
        return commentEmail;
    }

    public void setCommentEmail(String commentEmail) {
        this.commentEmail = commentEmail == null ? null : commentEmail.trim();
    }

    public String getCommentContent() {
        return commentContent;
    }

    public void setCommentContent(String commentContent) {
        this.commentContent = commentContent == null ? null : commentContent.trim();
    }

    public Integer getCommentCreate() {
        return commentCreate;
    }

    public void setCommentCreate(Integer commentCreate) {
        this.commentCreate = commentCreate;
    }

    public String getCommentCreateDate() {
        return commentCreateDate;
    }

    public void setCommentCreateDate(String commentCreateDate) {
        this.commentCreateDate = commentCreateDate == null ? null : commentCreateDate.trim();
    }

    public Integer getCommentTypeId() {
        return commentTypeId;
    }

    public void setCommentTypeId(Integer commentTypeId) {
        this.commentTypeId = commentTypeId;
    }

    public Boolean getCommentType() {
        return commentType;
    }

    public void setCommentType(Boolean commentType) {
        this.commentType = commentType;
    }

    public Boolean getCommentDeleted() {
        return commentDeleted;
    }

    public void setCommentDeleted(Boolean commentDeleted) {
        this.commentDeleted = commentDeleted;
    }
}