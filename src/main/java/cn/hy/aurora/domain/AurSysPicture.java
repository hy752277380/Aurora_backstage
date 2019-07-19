package cn.hy.aurora.domain;

import java.util.Date;

public class AurSysPicture {
    private Integer pictureId;

    private String pictureName;

    private String pictureUrl;

    private Integer pictureCreate;

    private Date pictureCreateDate;

    private Integer pictureUpdate;

    private Date pictureUpdateDate;

    private Boolean pictureVersion;

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

    public Date getPictureCreateDate() {
        return pictureCreateDate;
    }

    public void setPictureCreateDate(Date pictureCreateDate) {
        this.pictureCreateDate = pictureCreateDate;
    }

    public Integer getPictureUpdate() {
        return pictureUpdate;
    }

    public void setPictureUpdate(Integer pictureUpdate) {
        this.pictureUpdate = pictureUpdate;
    }

    public Date getPictureUpdateDate() {
        return pictureUpdateDate;
    }

    public void setPictureUpdateDate(Date pictureUpdateDate) {
        this.pictureUpdateDate = pictureUpdateDate;
    }

    public Boolean getPictureVersion() {
        return pictureVersion;
    }

    public void setPictureVersion(Boolean pictureVersion) {
        this.pictureVersion = pictureVersion;
    }

    public Boolean getPictureDeleted() {
        return pictureDeleted;
    }

    public void setPictureDeleted(Boolean pictureDeleted) {
        this.pictureDeleted = pictureDeleted;
    }
}