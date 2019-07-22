package cn.hy.aurora.domain;

import java.util.ArrayList;
import java.util.List;

public class AurArticleLikeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AurArticleLikeExample() {
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

        public Criteria andLikeIdIsNull() {
            addCriterion("like_id is null");
            return (Criteria) this;
        }

        public Criteria andLikeIdIsNotNull() {
            addCriterion("like_id is not null");
            return (Criteria) this;
        }

        public Criteria andLikeIdEqualTo(Integer value) {
            addCriterion("like_id =", value, "likeId");
            return (Criteria) this;
        }

        public Criteria andLikeIdNotEqualTo(Integer value) {
            addCriterion("like_id <>", value, "likeId");
            return (Criteria) this;
        }

        public Criteria andLikeIdGreaterThan(Integer value) {
            addCriterion("like_id >", value, "likeId");
            return (Criteria) this;
        }

        public Criteria andLikeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("like_id >=", value, "likeId");
            return (Criteria) this;
        }

        public Criteria andLikeIdLessThan(Integer value) {
            addCriterion("like_id <", value, "likeId");
            return (Criteria) this;
        }

        public Criteria andLikeIdLessThanOrEqualTo(Integer value) {
            addCriterion("like_id <=", value, "likeId");
            return (Criteria) this;
        }

        public Criteria andLikeIdIn(List<Integer> values) {
            addCriterion("like_id in", values, "likeId");
            return (Criteria) this;
        }

        public Criteria andLikeIdNotIn(List<Integer> values) {
            addCriterion("like_id not in", values, "likeId");
            return (Criteria) this;
        }

        public Criteria andLikeIdBetween(Integer value1, Integer value2) {
            addCriterion("like_id between", value1, value2, "likeId");
            return (Criteria) this;
        }

        public Criteria andLikeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("like_id not between", value1, value2, "likeId");
            return (Criteria) this;
        }

        public Criteria andLikeObjectIdIsNull() {
            addCriterion("like_object_id is null");
            return (Criteria) this;
        }

        public Criteria andLikeObjectIdIsNotNull() {
            addCriterion("like_object_id is not null");
            return (Criteria) this;
        }

        public Criteria andLikeObjectIdEqualTo(Integer value) {
            addCriterion("like_object_id =", value, "likeObjectId");
            return (Criteria) this;
        }

        public Criteria andLikeObjectIdNotEqualTo(Integer value) {
            addCriterion("like_object_id <>", value, "likeObjectId");
            return (Criteria) this;
        }

        public Criteria andLikeObjectIdGreaterThan(Integer value) {
            addCriterion("like_object_id >", value, "likeObjectId");
            return (Criteria) this;
        }

        public Criteria andLikeObjectIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("like_object_id >=", value, "likeObjectId");
            return (Criteria) this;
        }

        public Criteria andLikeObjectIdLessThan(Integer value) {
            addCriterion("like_object_id <", value, "likeObjectId");
            return (Criteria) this;
        }

        public Criteria andLikeObjectIdLessThanOrEqualTo(Integer value) {
            addCriterion("like_object_id <=", value, "likeObjectId");
            return (Criteria) this;
        }

        public Criteria andLikeObjectIdIn(List<Integer> values) {
            addCriterion("like_object_id in", values, "likeObjectId");
            return (Criteria) this;
        }

        public Criteria andLikeObjectIdNotIn(List<Integer> values) {
            addCriterion("like_object_id not in", values, "likeObjectId");
            return (Criteria) this;
        }

        public Criteria andLikeObjectIdBetween(Integer value1, Integer value2) {
            addCriterion("like_object_id between", value1, value2, "likeObjectId");
            return (Criteria) this;
        }

        public Criteria andLikeObjectIdNotBetween(Integer value1, Integer value2) {
            addCriterion("like_object_id not between", value1, value2, "likeObjectId");
            return (Criteria) this;
        }

        public Criteria andLikeIpIsNull() {
            addCriterion("like_ip is null");
            return (Criteria) this;
        }

        public Criteria andLikeIpIsNotNull() {
            addCriterion("like_ip is not null");
            return (Criteria) this;
        }

        public Criteria andLikeIpEqualTo(String value) {
            addCriterion("like_ip =", value, "likeIp");
            return (Criteria) this;
        }

        public Criteria andLikeIpNotEqualTo(String value) {
            addCriterion("like_ip <>", value, "likeIp");
            return (Criteria) this;
        }

        public Criteria andLikeIpGreaterThan(String value) {
            addCriterion("like_ip >", value, "likeIp");
            return (Criteria) this;
        }

        public Criteria andLikeIpGreaterThanOrEqualTo(String value) {
            addCriterion("like_ip >=", value, "likeIp");
            return (Criteria) this;
        }

        public Criteria andLikeIpLessThan(String value) {
            addCriterion("like_ip <", value, "likeIp");
            return (Criteria) this;
        }

        public Criteria andLikeIpLessThanOrEqualTo(String value) {
            addCriterion("like_ip <=", value, "likeIp");
            return (Criteria) this;
        }

        public Criteria andLikeIpLike(String value) {
            addCriterion("like_ip like", value, "likeIp");
            return (Criteria) this;
        }

        public Criteria andLikeIpNotLike(String value) {
            addCriterion("like_ip not like", value, "likeIp");
            return (Criteria) this;
        }

        public Criteria andLikeIpIn(List<String> values) {
            addCriterion("like_ip in", values, "likeIp");
            return (Criteria) this;
        }

        public Criteria andLikeIpNotIn(List<String> values) {
            addCriterion("like_ip not in", values, "likeIp");
            return (Criteria) this;
        }

        public Criteria andLikeIpBetween(String value1, String value2) {
            addCriterion("like_ip between", value1, value2, "likeIp");
            return (Criteria) this;
        }

        public Criteria andLikeIpNotBetween(String value1, String value2) {
            addCriterion("like_ip not between", value1, value2, "likeIp");
            return (Criteria) this;
        }

        public Criteria andLikeCerateDateIsNull() {
            addCriterion("like_cerate_date is null");
            return (Criteria) this;
        }

        public Criteria andLikeCerateDateIsNotNull() {
            addCriterion("like_cerate_date is not null");
            return (Criteria) this;
        }

        public Criteria andLikeCerateDateEqualTo(String value) {
            addCriterion("like_cerate_date =", value, "likeCerateDate");
            return (Criteria) this;
        }

        public Criteria andLikeCerateDateNotEqualTo(String value) {
            addCriterion("like_cerate_date <>", value, "likeCerateDate");
            return (Criteria) this;
        }

        public Criteria andLikeCerateDateGreaterThan(String value) {
            addCriterion("like_cerate_date >", value, "likeCerateDate");
            return (Criteria) this;
        }

        public Criteria andLikeCerateDateGreaterThanOrEqualTo(String value) {
            addCriterion("like_cerate_date >=", value, "likeCerateDate");
            return (Criteria) this;
        }

        public Criteria andLikeCerateDateLessThan(String value) {
            addCriterion("like_cerate_date <", value, "likeCerateDate");
            return (Criteria) this;
        }

        public Criteria andLikeCerateDateLessThanOrEqualTo(String value) {
            addCriterion("like_cerate_date <=", value, "likeCerateDate");
            return (Criteria) this;
        }

        public Criteria andLikeCerateDateLike(String value) {
            addCriterion("like_cerate_date like", value, "likeCerateDate");
            return (Criteria) this;
        }

        public Criteria andLikeCerateDateNotLike(String value) {
            addCriterion("like_cerate_date not like", value, "likeCerateDate");
            return (Criteria) this;
        }

        public Criteria andLikeCerateDateIn(List<String> values) {
            addCriterion("like_cerate_date in", values, "likeCerateDate");
            return (Criteria) this;
        }

        public Criteria andLikeCerateDateNotIn(List<String> values) {
            addCriterion("like_cerate_date not in", values, "likeCerateDate");
            return (Criteria) this;
        }

        public Criteria andLikeCerateDateBetween(String value1, String value2) {
            addCriterion("like_cerate_date between", value1, value2, "likeCerateDate");
            return (Criteria) this;
        }

        public Criteria andLikeCerateDateNotBetween(String value1, String value2) {
            addCriterion("like_cerate_date not between", value1, value2, "likeCerateDate");
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