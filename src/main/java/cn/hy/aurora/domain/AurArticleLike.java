package cn.hy.aurora.domain;

public class AurArticleLike {
    private Integer likeId;

    private Integer likeObjectId;

    private String likeIp;

    private String likeCerateDate;

    public Integer getLikeId() {
        return likeId;
    }

    public void setLikeId(Integer likeId) {
        this.likeId = likeId;
    }

    public Integer getLikeObjectId() {
        return likeObjectId;
    }

    public void setLikeObjectId(Integer likeObjectId) {
        this.likeObjectId = likeObjectId;
    }

    public String getLikeIp() {
        return likeIp;
    }

    public void setLikeIp(String likeIp) {
        this.likeIp = likeIp == null ? null : likeIp.trim();
    }

    public String getLikeCerateDate() {
        return likeCerateDate;
    }

    public void setLikeCerateDate(String likeCerateDate) {
        this.likeCerateDate = likeCerateDate == null ? null : likeCerateDate.trim();
    }
}