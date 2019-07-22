package cn.hy.aurora.domain;

import java.util.ArrayList;
import java.util.List;

public class AurArticleLogExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AurArticleLogExample() {
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

        public Criteria andVisitArticleIdIsNull() {
            addCriterion("visit_article_id is null");
            return (Criteria) this;
        }

        public Criteria andVisitArticleIdIsNotNull() {
            addCriterion("visit_article_id is not null");
            return (Criteria) this;
        }

        public Criteria andVisitArticleIdEqualTo(Integer value) {
            addCriterion("visit_article_id =", value, "visitArticleId");
            return (Criteria) this;
        }

        public Criteria andVisitArticleIdNotEqualTo(Integer value) {
            addCriterion("visit_article_id <>", value, "visitArticleId");
            return (Criteria) this;
        }

        public Criteria andVisitArticleIdGreaterThan(Integer value) {
            addCriterion("visit_article_id >", value, "visitArticleId");
            return (Criteria) this;
        }

        public Criteria andVisitArticleIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("visit_article_id >=", value, "visitArticleId");
            return (Criteria) this;
        }

        public Criteria andVisitArticleIdLessThan(Integer value) {
            addCriterion("visit_article_id <", value, "visitArticleId");
            return (Criteria) this;
        }

        public Criteria andVisitArticleIdLessThanOrEqualTo(Integer value) {
            addCriterion("visit_article_id <=", value, "visitArticleId");
            return (Criteria) this;
        }

        public Criteria andVisitArticleIdIn(List<Integer> values) {
            addCriterion("visit_article_id in", values, "visitArticleId");
            return (Criteria) this;
        }

        public Criteria andVisitArticleIdNotIn(List<Integer> values) {
            addCriterion("visit_article_id not in", values, "visitArticleId");
            return (Criteria) this;
        }

        public Criteria andVisitArticleIdBetween(Integer value1, Integer value2) {
            addCriterion("visit_article_id between", value1, value2, "visitArticleId");
            return (Criteria) this;
        }

        public Criteria andVisitArticleIdNotBetween(Integer value1, Integer value2) {
            addCriterion("visit_article_id not between", value1, value2, "visitArticleId");
            return (Criteria) this;
        }

        public Criteria andVisitIntoTimeIsNull() {
            addCriterion("visit_into_time is null");
            return (Criteria) this;
        }

        public Criteria andVisitIntoTimeIsNotNull() {
            addCriterion("visit_into_time is not null");
            return (Criteria) this;
        }

        public Criteria andVisitIntoTimeEqualTo(String value) {
            addCriterion("visit_into_time =", value, "visitIntoTime");
            return (Criteria) this;
        }

        public Criteria andVisitIntoTimeNotEqualTo(String value) {
            addCriterion("visit_into_time <>", value, "visitIntoTime");
            return (Criteria) this;
        }

        public Criteria andVisitIntoTimeGreaterThan(String value) {
            addCriterion("visit_into_time >", value, "visitIntoTime");
            return (Criteria) this;
        }

        public Criteria andVisitIntoTimeGreaterThanOrEqualTo(String value) {
            addCriterion("visit_into_time >=", value, "visitIntoTime");
            return (Criteria) this;
        }

        public Criteria andVisitIntoTimeLessThan(String value) {
            addCriterion("visit_into_time <", value, "visitIntoTime");
            return (Criteria) this;
        }

        public Criteria andVisitIntoTimeLessThanOrEqualTo(String value) {
            addCriterion("visit_into_time <=", value, "visitIntoTime");
            return (Criteria) this;
        }

        public Criteria andVisitIntoTimeLike(String value) {
            addCriterion("visit_into_time like", value, "visitIntoTime");
            return (Criteria) this;
        }

        public Criteria andVisitIntoTimeNotLike(String value) {
            addCriterion("visit_into_time not like", value, "visitIntoTime");
            return (Criteria) this;
        }

        public Criteria andVisitIntoTimeIn(List<String> values) {
            addCriterion("visit_into_time in", values, "visitIntoTime");
            return (Criteria) this;
        }

        public Criteria andVisitIntoTimeNotIn(List<String> values) {
            addCriterion("visit_into_time not in", values, "visitIntoTime");
            return (Criteria) this;
        }

        public Criteria andVisitIntoTimeBetween(String value1, String value2) {
            addCriterion("visit_into_time between", value1, value2, "visitIntoTime");
            return (Criteria) this;
        }

        public Criteria andVisitIntoTimeNotBetween(String value1, String value2) {
            addCriterion("visit_into_time not between", value1, value2, "visitIntoTime");
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