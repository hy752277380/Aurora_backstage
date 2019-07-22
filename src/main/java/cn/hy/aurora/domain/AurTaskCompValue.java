package cn.hy.aurora.domain;

public class AurTaskCompValue {
    private Integer valueId;

    private String valueType;

    private String valueContent;

    private Integer valueCreate;

    private String valueCreateDate;

    private Integer valueModify;

    private String valueModifyDate;

    public Integer getValueId() {
        return valueId;
    }

    public void setValueId(Integer valueId) {
        this.valueId = valueId;
    }

    public String getValueType() {
        return valueType;
    }

    public void setValueType(String valueType) {
        this.valueType = valueType == null ? null : valueType.trim();
    }

    public String getValueContent() {
        return valueContent;
    }

    public void setValueContent(String valueContent) {
        this.valueContent = valueContent == null ? null : valueContent.trim();
    }

    public Integer getValueCreate() {
        return valueCreate;
    }

    public void setValueCreate(Integer valueCreate) {
        this.valueCreate = valueCreate;
    }

    public String getValueCreateDate() {
        return valueCreateDate;
    }

    public void setValueCreateDate(String valueCreateDate) {
        this.valueCreateDate = valueCreateDate == null ? null : valueCreateDate.trim();
    }

    public Integer getValueModify() {
        return valueModify;
    }

    public void setValueModify(Integer valueModify) {
        this.valueModify = valueModify;
    }

    public String getValueModifyDate() {
        return valueModifyDate;
    }

    public void setValueModifyDate(String valueModifyDate) {
        this.valueModifyDate = valueModifyDate == null ? null : valueModifyDate.trim();
    }
}