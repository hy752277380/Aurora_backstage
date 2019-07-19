package cn.hy.aurora.domain;

import java.util.Date;

public class AurArticleLog {
    private Integer logId;

    private Integer visitArticleId;

    private Date visitIntoTime;

    private String visitIp;

    private Date logCreateTime;

    public Integer getLogId() {
        return logId;
    }

    public void setLogId(Integer logId) {
        this.logId = logId;
    }

    public Integer getVisitArticleId() {
        return visitArticleId;
    }

    public void setVisitArticleId(Integer visitArticleId) {
        this.visitArticleId = visitArticleId;
    }

    public Date getVisitIntoTime() {
        return visitIntoTime;
    }

    public void setVisitIntoTime(Date visitIntoTime) {
        this.visitIntoTime = visitIntoTime;
    }

    public String getVisitIp() {
        return visitIp;
    }

    public void setVisitIp(String visitIp) {
        this.visitIp = visitIp == null ? null : visitIp.trim();
    }

    public Date getLogCreateTime() {
        return logCreateTime;
    }

    public void setLogCreateTime(Date logCreateTime) {
        this.logCreateTime = logCreateTime;
    }
}