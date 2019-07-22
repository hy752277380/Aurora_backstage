package cn.hy.aurora.domain;

public class AurArticleLog {
    private Integer logId;

    private Integer visitArticleId;

    private String visitIntoTime;

    private String visitIp;

    private String logCreateTime;

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

    public String getVisitIntoTime() {
        return visitIntoTime;
    }

    public void setVisitIntoTime(String visitIntoTime) {
        this.visitIntoTime = visitIntoTime == null ? null : visitIntoTime.trim();
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