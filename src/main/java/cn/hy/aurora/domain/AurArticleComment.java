package cn.hy.aurora.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

public class AurArticleComment {
    @JsonProperty("id")
    private Integer commentId;

    private Integer commentCreate;

    private Date commentCreateDate;

    private Integer commentUpdate;

    private Date commentUpdateDate;

    private Boolean commentVersion;

    private Boolean commentDeleted;

    private String commentContent;

    private String commentName;

    private String commentEmail;

    private Integer commentArticleId;

    private Boolean commentType;

    public Integer getCommentId() {
        return commentId;
    }

    public void setCommentId(Integer commentId) {
        this.commentId = commentId;
    }

    public Integer getCommentCreate() {
        return commentCreate;
    }

    public void setCommentCreate(Integer commentCreate) {
        this.commentCreate = commentCreate;
    }

    public Date getCommentCreateDate() {
        return commentCreateDate;
    }

    public void setCommentCreateDate(Date commentCreateDate) {
        this.commentCreateDate = commentCreateDate;
    }

    public Integer getCommentUpdate() {
        return commentUpdate;
    }

    public void setCommentUpdate(Integer commentUpdate) {
        this.commentUpdate = commentUpdate;
    }

    public Date getCommentUpdateDate() {
        return commentUpdateDate;
    }

    public void setCommentUpdateDate(Date commentUpdateDate) {
        this.commentUpdateDate = commentUpdateDate;
    }

    public Boolean getCommentVersion() {
        return commentVersion;
    }

    public void setCommentVersion(Boolean commentVersion) {
        this.commentVersion = commentVersion;
    }

    public Boolean getCommentDeleted() {
        return commentDeleted;
    }

    public void setCommentDeleted(Boolean commentDeleted) {
        this.commentDeleted = commentDeleted;
    }

    public String getCommentContent() {
        return commentContent;
    }

    public void setCommentContent(String commentContent) {
        this.commentContent = commentContent == null ? null : commentContent.trim();
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

    public Integer getCommentAtricleId() {
        return commentArticleId;
    }

    public void setCommentAtricleId(Integer commentAtricleId) {
        this.commentArticleId = commentAtricleId;
    }

    public Boolean getCommentType() {
        return commentType;
    }

    public void setCommentType(Boolean commentType) {
        this.commentType = commentType;
    }
}