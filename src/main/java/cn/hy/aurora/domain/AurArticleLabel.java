package cn.hy.aurora.domain;

public class AurArticleLabel {
    private Integer labelId;

    private Integer labelCategory;

    private String labelName;

    private String labelDescription;

    private Integer labelCreate;

    private String labelCreateDate;

    private Integer labelParent;

    private Boolean labelDeleted;

    public Integer getLabelId() {
        return labelId;
    }

    public void setLabelId(Integer labelId) {
        this.labelId = labelId;
    }

    public Integer getLabelCategory() {
        return labelCategory;
    }

    public void setLabelCategory(Integer labelCategory) {
        this.labelCategory = labelCategory;
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

    public String getLabelCreateDate() {
        return labelCreateDate;
    }

    public void setLabelCreateDate(String labelCreateDate) {
        this.labelCreateDate = labelCreateDate == null ? null : labelCreateDate.trim();
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