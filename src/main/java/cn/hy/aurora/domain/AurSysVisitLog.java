package cn.hy.aurora.domain;

import java.util.Date;

public class AurSysVisitLog {
    private Integer logId;

    private Date loginTime;

    private Date leaveTime;

    private String visitIp;

    private Integer visitUser;

    private Date logCreateTime;

    public Integer getLogId() {
        return logId;
    }

    public void setLogId(Integer logId) {
        this.logId = logId;
    }

    public Date getLoginTime() {
        return loginTime;
    }

    public void setLoginTime(Date loginTime) {
        this.loginTime = loginTime;
    }

    public Date getLeaveTime() {
        return leaveTime;
    }

    public void setLeaveTime(Date leaveTime) {
        this.leaveTime = leaveTime;
    }

    public String getVisitIp() {
        return visitIp;
    }

    public void setVisitIp(String visitIp) {
        this.visitIp = visitIp == null ? null : visitIp.trim();
    }

    public Integer getVisitUser() {
        return visitUser;
    }

    public void setVisitUser(Integer visitUser) {
        this.visitUser = visitUser;
    }

    public Date getLogCreateTime() {
        return logCreateTime;
    }

    public void setLogCreateTime(Date logCreateTime) {
        this.logCreateTime = logCreateTime;
    }
}