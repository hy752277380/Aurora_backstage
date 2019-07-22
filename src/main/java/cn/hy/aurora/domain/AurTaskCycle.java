package cn.hy.aurora.domain;

public class AurTaskCycle {
    private Integer cycleId;

    private String cycleName;

    private String cycleCron;

    private Integer cycleCreate;

    private String cycleCreateDate;

    private Integer cycleModify;

    private String cycleModifyDate;

    public Integer getCycleId() {
        return cycleId;
    }

    public void setCycleId(Integer cycleId) {
        this.cycleId = cycleId;
    }

    public String getCycleName() {
        return cycleName;
    }

    public void setCycleName(String cycleName) {
        this.cycleName = cycleName == null ? null : cycleName.trim();
    }

    public String getCycleCron() {
        return cycleCron;
    }

    public void setCycleCron(String cycleCron) {
        this.cycleCron = cycleCron == null ? null : cycleCron.trim();
    }

    public Integer getCycleCreate() {
        return cycleCreate;
    }

    public void setCycleCreate(Integer cycleCreate) {
        this.cycleCreate = cycleCreate;
    }

    public String getCycleCreateDate() {
        return cycleCreateDate;
    }

    public void setCycleCreateDate(String cycleCreateDate) {
        this.cycleCreateDate = cycleCreateDate == null ? null : cycleCreateDate.trim();
    }

    public Integer getCycleModify() {
        return cycleModify;
    }

    public void setCycleModify(Integer cycleModify) {
        this.cycleModify = cycleModify;
    }

    public String getCycleModifyDate() {
        return cycleModifyDate;
    }

    public void setCycleModifyDate(String cycleModifyDate) {
        this.cycleModifyDate = cycleModifyDate == null ? null : cycleModifyDate.trim();
    }
}