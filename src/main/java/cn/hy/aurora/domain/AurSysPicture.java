package cn.hy.aurora.domain;

public class AurSysPicture {
    private Integer pictureId;

    private String pictureName;

    private String pictureUrl;

    private Integer pictureCreate;

    private String pictureCreateDate;

    private Boolean pictureDeleted;

    public Integer getPictureId() {
        return pictureId;
    }

    public void setPictureId(Integer pictureId) {
        this.pictureId = pictureId;
    }

    public String getPictureName() {
        return pictureName;
    }

    public void setPictureName(String pictureName) {
        this.pictureName = pictureName == null ? null : pictureName.trim();
    }

    public String getPictureUrl() {
        return pictureUrl;
    }

    public void setPictureUrl(String pictureUrl) {
        this.pictureUrl = pictureUrl == null ? null : pictureUrl.trim();
    }

    public Integer getPictureCreate() {
        return pictureCreate;
    }

    public void setPictureCreate(Integer pictureCreate) {
        this.pictureCreate = pictureCreate;
    }

    public String getPictureCreateDate() {
        return pictureCreateDate;
    }

    public void setPictureCreateDate(String pictureCreateDate) {
        this.pictureCreateDate = pictureCreateDate == null ? null : pictureCreateDate.trim();
    }

    public Boolean getPictureDeleted() {
        return pictureDeleted;
    }

    public void setPictureDeleted(Boolean pictureDeleted) {
        this.pictureDeleted = pictureDeleted;
    }
}