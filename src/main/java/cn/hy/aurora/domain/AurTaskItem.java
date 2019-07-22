package cn.hy.aurora.domain;

public class AurTaskItem {
    private Integer itemId;

    private String itemName;

    private Integer itemCycle;

    private Integer itemComponent;

    private Integer itemSchedule;

    private Boolean itemFinish;

    private String itemCreateDate;

    private String itemFinishDate;

    private Boolean itemEnable;

    public Integer getItemId() {
        return itemId;
    }

    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName == null ? null : itemName.trim();
    }

    public Integer getItemCycle() {
        return itemCycle;
    }

    public void setItemCycle(Integer itemCycle) {
        this.itemCycle = itemCycle;
    }

    public Integer getItemComponent() {
        return itemComponent;
    }

    public void setItemComponent(Integer itemComponent) {
        this.itemComponent = itemComponent;
    }

    public Integer getItemSchedule() {
        return itemSchedule;
    }

    public void setItemSchedule(Integer itemSchedule) {
        this.itemSchedule = itemSchedule;
    }

    public Boolean getItemFinish() {
        return itemFinish;
    }

    public void setItemFinish(Boolean itemFinish) {
        this.itemFinish = itemFinish;
    }

    public String getItemCreateDate() {
        return itemCreateDate;
    }

    public void setItemCreateDate(String itemCreateDate) {
        this.itemCreateDate = itemCreateDate == null ? null : itemCreateDate.trim();
    }

    public String getItemFinishDate() {
        return itemFinishDate;
    }

    public void setItemFinishDate(String itemFinishDate) {
        this.itemFinishDate = itemFinishDate == null ? null : itemFinishDate.trim();
    }

    public Boolean getItemEnable() {
        return itemEnable;
    }

    public void setItemEnable(Boolean itemEnable) {
        this.itemEnable = itemEnable;
    }
}