package cn.hy.aurora.domain;

public class AurTaskCompAttr {
    private Integer attributeId;

    private String attributeName;

    private Integer attributeComponent;

    private Integer attributeCreate;

    private String attributeCreateDate;

    private Integer attributeModify;

    private String attributeModifyDate;

    public Integer getAttributeId() {
        return attributeId;
    }

    public void setAttributeId(Integer attributeId) {
        this.attributeId = attributeId;
    }

    public String getAttributeName() {
        return attributeName;
    }

    public void setAttributeName(String attributeName) {
        this.attributeName = attributeName == null ? null : attributeName.trim();
    }

    public Integer getAttributeComponent() {
        return attributeComponent;
    }

    public void setAttributeComponent(Integer attributeComponent) {
        this.attributeComponent = attributeComponent;
    }

    public Integer getAttributeCreate() {
        return attributeCreate;
    }

    public void setAttributeCreate(Integer attributeCreate) {
        this.attributeCreate = attributeCreate;
    }

    public String getAttributeCreateDate() {
        return attributeCreateDate;
    }

    public void setAttributeCreateDate(String attributeCreateDate) {
        this.attributeCreateDate = attributeCreateDate == null ? null : attributeCreateDate.trim();
    }

    public Integer getAttributeModify() {
        return attributeModify;
    }

    public void setAttributeModify(Integer attributeModify) {
        this.attributeModify = attributeModify;
    }

    public String getAttributeModifyDate() {
        return attributeModifyDate;
    }

    public void setAttributeModifyDate(String attributeModifyDate) {
        this.attributeModifyDate = attributeModifyDate == null ? null : attributeModifyDate.trim();
    }
}