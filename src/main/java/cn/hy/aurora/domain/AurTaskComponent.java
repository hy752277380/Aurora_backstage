package cn.hy.aurora.domain;

public class AurTaskComponent {
    private Integer componentId;

    private String componentName;

    private String componentGifUrl;

    private Integer componentCreate;

    private String componentCreateDate;

    private Integer componentModify;

    private String componentModifyDate;

    private Boolean componentEnable;

    public Integer getComponentId() {
        return componentId;
    }

    public void setComponentId(Integer componentId) {
        this.componentId = componentId;
    }

    public String getComponentName() {
        return componentName;
    }

    public void setComponentName(String componentName) {
        this.componentName = componentName == null ? null : componentName.trim();
    }

    public String getComponentGifUrl() {
        return componentGifUrl;
    }

    public void setComponentGifUrl(String componentGifUrl) {
        this.componentGifUrl = componentGifUrl == null ? null : componentGifUrl.trim();
    }

    public Integer getComponentCreate() {
        return componentCreate;
    }

    public void setComponentCreate(Integer componentCreate) {
        this.componentCreate = componentCreate;
    }

    public String getComponentCreateDate() {
        return componentCreateDate;
    }

    public void setComponentCreateDate(String componentCreateDate) {
        this.componentCreateDate = componentCreateDate == null ? null : componentCreateDate.trim();
    }

    public Integer getComponentModify() {
        return componentModify;
    }

    public void setComponentModify(Integer componentModify) {
        this.componentModify = componentModify;
    }

    public String getComponentModifyDate() {
        return componentModifyDate;
    }

    public void setComponentModifyDate(String componentModifyDate) {
        this.componentModifyDate = componentModifyDate == null ? null : componentModifyDate.trim();
    }

    public Boolean getComponentEnable() {
        return componentEnable;
    }

    public void setComponentEnable(Boolean componentEnable) {
        this.componentEnable = componentEnable;
    }
}