package cn.hy.aurora.domain;

public class AurSysVisitLog {
    private Integer logId;

    private String visitTime;

    private String leaveTime;

    private String visitIp;

    private String logCreateTime;

    public Integer getLogId() {
        return logId;
    }

    public void setLogId(Integer logId) {
        this.logId = logId;
    }

    public String getVisitTime() {
        return visitTime;
    }

    public void setVisitTime(String visitTime) {
        this.visitTime = visitTime == null ? null : visitTime.trim();
    }

    public String getLeaveTime() {
        return leaveTime;
    }

    public void setLeaveTime(String leaveTime) {
        this.leaveTime = leaveTime == null ? null : leaveTime.trim();
    }

    public String getVisitIp() {
        return visitIp;
    }

    public void setVisitIp(String visitIp) {
        this.visitIp = visitIp == null ? null : visitIp.trim();
    }

    public String getLogCreateTime() {
        return logCreateTime;
    }

    public void setLogCreateTime(String logCreateTime) {
        this.logCreateTime = logCreateTime == null ? null : logCreateTime.trim();
    }
}