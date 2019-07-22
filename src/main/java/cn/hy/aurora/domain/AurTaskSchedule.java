package cn.hy.aurora.domain;

public class AurTaskSchedule {
    private Integer scheduleId;

    private Integer scheduleBelong;

    private String scheduleName;

    private Boolean scheduleComplete;

    private Integer scheduleCreate;

    private String scheduleCreateDate;

    private Integer scheduleModify;

    private String scheduleModifyDate;

    public Integer getScheduleId() {
        return scheduleId;
    }

    public void setScheduleId(Integer scheduleId) {
        this.scheduleId = scheduleId;
    }

    public Integer getScheduleBelong() {
        return scheduleBelong;
    }

    public void setScheduleBelong(Integer scheduleBelong) {
        this.scheduleBelong = scheduleBelong;
    }

    public String getScheduleName() {
        return scheduleName;
    }

    public void setScheduleName(String scheduleName) {
        this.scheduleName = scheduleName == null ? null : scheduleName.trim();
    }

    public Boolean getScheduleComplete() {
        return scheduleComplete;
    }

    public void setScheduleComplete(Boolean scheduleComplete) {
        this.scheduleComplete = scheduleComplete;
    }

    public Integer getScheduleCreate() {
        return scheduleCreate;
    }

    public void setScheduleCreate(Integer scheduleCreate) {
        this.scheduleCreate = scheduleCreate;
    }

    public String getScheduleCreateDate() {
        return scheduleCreateDate;
    }

    public void setScheduleCreateDate(String scheduleCreateDate) {
        this.scheduleCreateDate = scheduleCreateDate == null ? null : scheduleCreateDate.trim();
    }

    public Integer getScheduleModify() {
        return scheduleModify;
    }

    public void setScheduleModify(Integer scheduleModify) {
        this.scheduleModify = scheduleModify;
    }

    public String getScheduleModifyDate() {
        return scheduleModifyDate;
    }

    public void setScheduleModifyDate(String scheduleModifyDate) {
        this.scheduleModifyDate = scheduleModifyDate == null ? null : scheduleModifyDate.trim();
    }
}