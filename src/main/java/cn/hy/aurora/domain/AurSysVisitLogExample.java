package cn.hy.aurora.domain;

import java.util.ArrayList;
import java.util.List;

public class AurSysVisitLogExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AurSysVisitLogExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andLogIdIsNull() {
            addCriterion("log_id is null");
            return (Criteria) this;
        }

        public Criteria andLogIdIsNotNull() {
            addCriterion("log_id is not null");
            return (Criteria) this;
        }

        public Criteria andLogIdEqualTo(Integer value) {
            addCriterion("log_id =", value, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdNotEqualTo(Integer value) {
            addCriterion("log_id <>", value, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdGreaterThan(Integer value) {
            addCriterion("log_id >", value, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("log_id >=", value, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdLessThan(Integer value) {
            addCriterion("log_id <", value, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdLessThanOrEqualTo(Integer value) {
            addCriterion("log_id <=", value, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdIn(List<Integer> values) {
            addCriterion("log_id in", values, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdNotIn(List<Integer> values) {
            addCriterion("log_id not in", values, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdBetween(Integer value1, Integer value2) {
            addCriterion("log_id between", value1, value2, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdNotBetween(Integer value1, Integer value2) {
            addCriterion("log_id not between", value1, value2, "logId");
            return (Criteria) this;
        }

        public Criteria andVisitTimeIsNull() {
            addCriterion("visit_time is null");
            return (Criteria) this;
        }

        public Criteria andVisitTimeIsNotNull() {
            addCriterion("visit_time is not null");
            return (Criteria) this;
        }

        public Criteria andVisitTimeEqualTo(String value) {
            addCriterion("visit_time =", value, "visitTime");
            return (Criteria) this;
        }

        public Criteria andVisitTimeNotEqualTo(String value) {
            addCriterion("visit_time <>", value, "visitTime");
            return (Criteria) this;
        }

        public Criteria andVisitTimeGreaterThan(String value) {
            addCriterion("visit_time >", value, "visitTime");
            return (Criteria) this;
        }

        public Criteria andVisitTimeGreaterThanOrEqualTo(String value) {
            addCriterion("visit_time >=", value, "visitTime");
            return (Criteria) this;
        }

        public Criteria andVisitTimeLessThan(String value) {
            addCriterion("visit_time <", value, "visitTime");
            return (Criteria) this;
        }

        public Criteria andVisitTimeLessThanOrEqualTo(String value) {
            addCriterion("visit_time <=", value, "visitTime");
            return (Criteria) this;
        }

        public Criteria andVisitTimeLike(String value) {
            addCriterion("visit_time like", value, "visitTime");
            return (Criteria) this;
        }

        public Criteria andVisitTimeNotLike(String value) {
            addCriterion("visit_time not like", value, "visitTime");
            return (Criteria) this;
        }

        public Criteria andVisitTimeIn(List<String> values) {
            addCriterion("visit_time in", values, "visitTime");
            return (Criteria) this;
        }

        public Criteria andVisitTimeNotIn(List<String> values) {
            addCriterion("visit_time not in", values, "visitTime");
            return (Criteria) this;
        }

        public Criteria andVisitTimeBetween(String value1, String value2) {
            addCriterion("visit_time between", value1, value2, "visitTime");
            return (Criteria) this;
        }

        public Criteria andVisitTimeNotBetween(String value1, String value2) {
            addCriterion("visit_time not between", value1, value2, "visitTime");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeIsNull() {
            addCriterion("leave_time is null");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeIsNotNull() {
            addCriterion("leave_time is not null");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeEqualTo(String value) {
            addCriterion("leave_time =", value, "leaveTime");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeNotEqualTo(String value) {
            addCriterion("leave_time <>", value, "leaveTime");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeGreaterThan(String value) {
            addCriterion("leave_time >", value, "leaveTime");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeGreaterThanOrEqualTo(String value) {
            addCriterion("leave_time >=", value, "leaveTime");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeLessThan(String value) {
            addCriterion("leave_time <", value, "leaveTime");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeLessThanOrEqualTo(String value) {
            addCriterion("leave_time <=", value, "leaveTime");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeLike(String value) {
            addCriterion("leave_time like", value, "leaveTime");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeNotLike(String value) {
            addCriterion("leave_time not like", value, "leaveTime");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeIn(List<String> values) {
            addCriterion("leave_time in", values, "leaveTime");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeNotIn(List<String> values) {
            addCriterion("leave_time not in", values, "leaveTime");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeBetween(String value1, String value2) {
            addCriterion("leave_time between", value1, value2, "leaveTime");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeNotBetween(String value1, String value2) {
            addCriterion("leave_time not between", value1, value2, "leaveTime");
            return (Criteria) this;
        }

        public Criteria andVisitIpIsNull() {
            addCriterion("visit_ip is null");
            return (Criteria) this;
        }

        public Criteria andVisitIpIsNotNull() {
            addCriterion("visit_ip is not null");
            return (Criteria) this;
        }

        public Criteria andVisitIpEqualTo(String value) {
            addCriterion("visit_ip =", value, "visitIp");
            return (Criteria) this;
        }

        public Criteria andVisitIpNotEqualTo(String value) {
            addCriterion("visit_ip <>", value, "visitIp");
            return (Criteria) this;
        }

        public Criteria andVisitIpGreaterThan(String value) {
            addCriterion("visit_ip >", value, "visitIp");
            return (Criteria) this;
        }

        public Criteria andVisitIpGreaterThanOrEqualTo(String value) {
            addCriterion("visit_ip >=", value, "visitIp");
            return (Criteria) this;
        }

        public Criteria andVisitIpLessThan(String value) {
            addCriterion("visit_ip <", value, "visitIp");
            return (Criteria) this;
        }

        public Criteria andVisitIpLessThanOrEqualTo(String value) {
            addCriterion("visit_ip <=", value, "visitIp");
            return (Criteria) this;
        }

        public Criteria andVisitIpLike(String value) {
            addCriterion("visit_ip like", value, "visitIp");
            return (Criteria) this;
        }

        public Criteria andVisitIpNotLike(String value) {
            addCriterion("visit_ip not like", value, "visitIp");
            return (Criteria) this;
        }

        public Criteria andVisitIpIn(List<String> values) {
            addCriterion("visit_ip in", values, "visitIp");
            return (Criteria) this;
        }

        public Criteria andVisitIpNotIn(List<String> values) {
            addCriterion("visit_ip not in", values, "visitIp");
            return (Criteria) this;
        }

        public Criteria andVisitIpBetween(String value1, String value2) {
            addCriterion("visit_ip between", value1, value2, "visitIp");
            return (Criteria) this;
        }

        public Criteria andVisitIpNotBetween(String value1, String value2) {
            addCriterion("visit_ip not between", value1, value2, "visitIp");
            return (Criteria) this;
        }

        public Criteria andLogCreateTimeIsNull() {
            addCriterion("log_create_time is null");
            return (Criteria) this;
        }

        public Criteria andLogCreateTimeIsNotNull() {
            addCriterion("log_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andLogCreateTimeEqualTo(String value) {
            addCriterion("log_create_time =", value, "logCreateTime");
            return (Criteria) this;
        }

        public Criteria andLogCreateTimeNotEqualTo(String value) {
            addCriterion("log_create_time <>", value, "logCreateTime");
            return (Criteria) this;
        }

        public Criteria andLogCreateTimeGreaterThan(String value) {
            addCriterion("log_create_time >", value, "logCreateTime");
            return (Criteria) this;
        }

        public Criteria andLogCreateTimeGreaterThanOrEqualTo(String value) {
            addCriterion("log_create_time >=", value, "logCreateTime");
            return (Criteria) this;
        }

        public Criteria andLogCreateTimeLessThan(String value) {
            addCriterion("log_create_time <", value, "logCreateTime");
            return (Criteria) this;
        }

        public Criteria andLogCreateTimeLessThanOrEqualTo(String value) {
            addCriterion("log_create_time <=", value, "logCreateTime");
            return (Criteria) this;
        }

        public Criteria andLogCreateTimeLike(String value) {
            addCriterion("log_create_time like", value, "logCreateTime");
            return (Criteria) this;
        }

        public Criteria andLogCreateTimeNotLike(String value) {
            addCriterion("log_create_time not like", value, "logCreateTime");
            return (Criteria) this;
        }

        public Criteria andLogCreateTimeIn(List<String> values) {
            addCriterion("log_create_time in", values, "logCreateTime");
            return (Criteria) this;
        }

        public Criteria andLogCreateTimeNotIn(List<String> values) {
            addCriterion("log_create_time not in", values, "logCreateTime");
            return (Criteria) this;
        }

        public Criteria andLogCreateTimeBetween(String value1, String value2) {
            addCriterion("log_create_time between", value1, value2, "logCreateTime");
            return (Criteria) this;
        }

        public Criteria andLogCreateTimeNotBetween(String value1, String value2) {
            addCriterion("log_create_time not between", value1, value2, "logCreateTime");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}