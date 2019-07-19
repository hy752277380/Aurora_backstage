package cn.hy.aurora.domain;

import java.util.Date;

public class AurArticleLabel {
    private Integer labelId;

    private String labelName;

    private String labelDescription;

    private Integer labelCreate;

    private Date labelCreateTime;

    private Integer labelUpdate;

    private Date labelUpdateTme;

    private Integer labelParent;

    private Boolean labelDeleted;

    public Integer getLabelId() {
        return labelId;
    }

    public void setLabelId(Integer labelId) {
        this.labelId = labelId;
    }

    public String getLabelName() {
        return labelName;
    }

    public void setLabelName(String labelName) {
        this.labelName = labelName == null ? null : labelName.trim();
    }

    public String getLabelDescription() {
        return labelDescription;
    }

    public void setLabelDescription(String labelDescription) {
        this.labelDescription = labelDescription == null ? null : labelDescription.trim();
    }

    public Integer getLabelCreate() {
        return labelCreate;
    }

    public void setLabelCreate(Integer labelCreate) {
        this.labelCreate = labelCreate;
    }

    public Date getLabelCreateTime() {
        return labelCreateTime;
    }

    public void setLabelCreateTime(Date labelCreateTime) {
        this.labelCreateTime = labelCreateTime;
    }

    public Integer getLabelUpdate() {
        return labelUpdate;
    }

    public void setLabelUpdate(Integer labelUpdate) {
        this.labelUpdate = labelUpdate;
    }

    public Date getLabelUpdateTme() {
        return labelUpdateTme;
    }

    public void setLabelUpdateTme(Date labelUpdateTme) {
        this.labelUpdateTme = labelUpdateTme;
    }

    public Integer getLabelParent() {
        return labelParent;
    }

    public void setLabelParent(Integer labelParent) {
        this.labelParent = labelParent;
    }

    public Boolean getLabelDeleted() {
        return labelDeleted;
    }

    public void setLabelDeleted(Boolean labelDeleted) {
        this.labelDeleted = labelDeleted;
    }
}