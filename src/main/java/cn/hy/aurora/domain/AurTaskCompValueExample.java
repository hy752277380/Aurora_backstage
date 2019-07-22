package cn.hy.aurora.domain;

import java.util.ArrayList;
import java.util.List;

public class AurTaskCompValueExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AurTaskCompValueExample() {
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

        public Criteria andValueIdIsNull() {
            addCriterion("value_id is null");
            return (Criteria) this;
        }

        public Criteria andValueIdIsNotNull() {
            addCriterion("value_id is not null");
            return (Criteria) this;
        }

        public Criteria andValueIdEqualTo(Integer value) {
            addCriterion("value_id =", value, "valueId");
            return (Criteria) this;
        }

        public Criteria andValueIdNotEqualTo(Integer value) {
            addCriterion("value_id <>", value, "valueId");
            return (Criteria) this;
        }

        public Criteria andValueIdGreaterThan(Integer value) {
            addCriterion("value_id >", value, "valueId");
            return (Criteria) this;
        }

        public Criteria andValueIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("value_id >=", value, "valueId");
            return (Criteria) this;
        }

        public Criteria andValueIdLessThan(Integer value) {
            addCriterion("value_id <", value, "valueId");
            return (Criteria) this;
        }

        public Criteria andValueIdLessThanOrEqualTo(Integer value) {
            addCriterion("value_id <=", value, "valueId");
            return (Criteria) this;
        }

        public Criteria andValueIdIn(List<Integer> values) {
            addCriterion("value_id in", values, "valueId");
            return (Criteria) this;
        }

        public Criteria andValueIdNotIn(List<Integer> values) {
            addCriterion("value_id not in", values, "valueId");
            return (Criteria) this;
        }

        public Criteria andValueIdBetween(Integer value1, Integer value2) {
            addCriterion("value_id between", value1, value2, "valueId");
            return (Criteria) this;
        }

        public Criteria andValueIdNotBetween(Integer value1, Integer value2) {
            addCriterion("value_id not between", value1, value2, "valueId");
            return (Criteria) this;
        }

        public Criteria andValueTypeIsNull() {
            addCriterion("value_type is null");
            return (Criteria) this;
        }

        public Criteria andValueTypeIsNotNull() {
            addCriterion("value_type is not null");
            return (Criteria) this;
        }

        public Criteria andValueTypeEqualTo(String value) {
            addCriterion("value_type =", value, "valueType");
            return (Criteria) this;
        }

        public Criteria andValueTypeNotEqualTo(String value) {
            addCriterion("value_type <>", value, "valueType");
            return (Criteria) this;
        }

        public Criteria andValueTypeGreaterThan(String value) {
            addCriterion("value_type >", value, "valueType");
            return (Criteria) this;
        }

        public Criteria andValueTypeGreaterThanOrEqualTo(String value) {
            addCriterion("value_type >=", value, "valueType");
            return (Criteria) this;
        }

        public Criteria andValueTypeLessThan(String value) {
            addCriterion("value_type <", value, "valueType");
            return (Criteria) this;
        }

        public Criteria andValueTypeLessThanOrEqualTo(String value) {
            addCriterion("value_type <=", value, "valueType");
            return (Criteria) this;
        }

        public Criteria andValueTypeLike(String value) {
            addCriterion("value_type like", value, "valueType");
            return (Criteria) this;
        }

        public Criteria andValueTypeNotLike(String value) {
            addCriterion("value_type not like", value, "valueType");
            return (Criteria) this;
        }

        public Criteria andValueTypeIn(List<String> values) {
            addCriterion("value_type in", values, "valueType");
            return (Criteria) this;
        }

        public Criteria andValueTypeNotIn(List<String> values) {
            addCriterion("value_type not in", values, "valueType");
            return (Criteria) this;
        }

        public Criteria andValueTypeBetween(String value1, String value2) {
            addCriterion("value_type between", value1, value2, "valueType");
            return (Criteria) this;
        }

        public Criteria andValueTypeNotBetween(String value1, String value2) {
            addCriterion("value_type not between", value1, value2, "valueType");
            return (Criteria) this;
        }

        public Criteria andValueContentIsNull() {
            addCriterion("value_content is null");
            return (Criteria) this;
        }

        public Criteria andValueContentIsNotNull() {
            addCriterion("value_content is not null");
            return (Criteria) this;
        }

        public Criteria andValueContentEqualTo(String value) {
            addCriterion("value_content =", value, "valueContent");
            return (Criteria) this;
        }

        public Criteria andValueContentNotEqualTo(String value) {
            addCriterion("value_content <>", value, "valueContent");
            return (Criteria) this;
        }

        public Criteria andValueContentGreaterThan(String value) {
            addCriterion("value_content >", value, "valueContent");
            return (Criteria) this;
        }

        public Criteria andValueContentGreaterThanOrEqualTo(String value) {
            addCriterion("value_content >=", value, "valueContent");
            return (Criteria) this;
        }

        public Criteria andValueContentLessThan(String value) {
            addCriterion("value_content <", value, "valueContent");
            return (Criteria) this;
        }

        public Criteria andValueContentLessThanOrEqualTo(String value) {
            addCriterion("value_content <=", value, "valueContent");
            return (Criteria) this;
        }

        public Criteria andValueContentLike(String value) {
            addCriterion("value_content like", value, "valueContent");
            return (Criteria) this;
        }

        public Criteria andValueContentNotLike(String value) {
            addCriterion("value_content not like", value, "valueContent");
            return (Criteria) this;
        }

        public Criteria andValueContentIn(List<String> values) {
            addCriterion("value_content in", values, "valueContent");
            return (Criteria) this;
        }

        public Criteria andValueContentNotIn(List<String> values) {
            addCriterion("value_content not in", values, "valueContent");
            return (Criteria) this;
        }

        public Criteria andValueContentBetween(String value1, String value2) {
            addCriterion("value_content between", value1, value2, "valueContent");
            return (Criteria) this;
        }

        public Criteria andValueContentNotBetween(String value1, String value2) {
            addCriterion("value_content not between", value1, value2, "valueContent");
            return (Criteria) this;
        }

        public Criteria andValueCreateIsNull() {
            addCriterion("value_create is null");
            return (Criteria) this;
        }

        public Criteria andValueCreateIsNotNull() {
            addCriterion("value_create is not null");
            return (Criteria) this;
        }

        public Criteria andValueCreateEqualTo(Integer value) {
            addCriterion("value_create =", value, "valueCreate");
            return (Criteria) this;
        }

        public Criteria andValueCreateNotEqualTo(Integer value) {
            addCriterion("value_create <>", value, "valueCreate");
            return (Criteria) this;
        }

        public Criteria andValueCreateGreaterThan(Integer value) {
            addCriterion("value_create >", value, "valueCreate");
            return (Criteria) this;
        }

        public Criteria andValueCreateGreaterThanOrEqualTo(Integer value) {
            addCriterion("value_create >=", value, "valueCreate");
            return (Criteria) this;
        }

        public Criteria andValueCreateLessThan(Integer value) {
            addCriterion("value_create <", value, "valueCreate");
            return (Criteria) this;
        }

        public Criteria andValueCreateLessThanOrEqualTo(Integer value) {
            addCriterion("value_create <=", value, "valueCreate");
            return (Criteria) this;
        }

        public Criteria andValueCreateIn(List<Integer> values) {
            addCriterion("value_create in", values, "valueCreate");
            return (Criteria) this;
        }

        public Criteria andValueCreateNotIn(List<Integer> values) {
            addCriterion("value_create not in", values, "valueCreate");
            return (Criteria) this;
        }

        public Criteria andValueCreateBetween(Integer value1, Integer value2) {
            addCriterion("value_create between", value1, value2, "valueCreate");
            return (Criteria) this;
        }

        public Criteria andValueCreateNotBetween(Integer value1, Integer value2) {
            addCriterion("value_create not between", value1, value2, "valueCreate");
            return (Criteria) this;
        }

        public Criteria andValueCreateDateIsNull() {
            addCriterion("value_create_date is null");
            return (Criteria) this;
        }

        public Criteria andValueCreateDateIsNotNull() {
            addCriterion("value_create_date is not null");
            return (Criteria) this;
        }

        public Criteria andValueCreateDateEqualTo(String value) {
            addCriterion("value_create_date =", value, "valueCreateDate");
            return (Criteria) this;
        }

        public Criteria andValueCreateDateNotEqualTo(String value) {
            addCriterion("value_create_date <>", value, "valueCreateDate");
            return (Criteria) this;
        }

        public Criteria andValueCreateDateGreaterThan(String value) {
            addCriterion("value_create_date >", value, "valueCreateDate");
            return (Criteria) this;
        }

        public Criteria andValueCreateDateGreaterThanOrEqualTo(String value) {
            addCriterion("value_create_date >=", value, "valueCreateDate");
            return (Criteria) this;
        }

        public Criteria andValueCreateDateLessThan(String value) {
            addCriterion("value_create_date <", value, "valueCreateDate");
            return (Criteria) this;
        }

        public Criteria andValueCreateDateLessThanOrEqualTo(String value) {
            addCriterion("value_create_date <=", value, "valueCreateDate");
            return (Criteria) this;
        }

        public Criteria andValueCreateDateLike(String value) {
            addCriterion("value_create_date like", value, "valueCreateDate");
            return (Criteria) this;
        }

        public Criteria andValueCreateDateNotLike(String value) {
            addCriterion("value_create_date not like", value, "valueCreateDate");
            return (Criteria) this;
        }

        public Criteria andValueCreateDateIn(List<String> values) {
            addCriterion("value_create_date in", values, "valueCreateDate");
            return (Criteria) this;
        }

        public Criteria andValueCreateDateNotIn(List<String> values) {
            addCriterion("value_create_date not in", values, "valueCreateDate");
            return (Criteria) this;
        }

        public Criteria andValueCreateDateBetween(String value1, String value2) {
            addCriterion("value_create_date between", value1, value2, "valueCreateDate");
            return (Criteria) this;
        }

        public Criteria andValueCreateDateNotBetween(String value1, String value2) {
            addCriterion("value_create_date not between", value1, value2, "valueCreateDate");
            return (Criteria) this;
        }

        public Criteria andValueModifyIsNull() {
            addCriterion("value_modify is null");
            return (Criteria) this;
        }

        public Criteria andValueModifyIsNotNull() {
            addCriterion("value_modify is not null");
            return (Criteria) this;
        }

        public Criteria andValueModifyEqualTo(Integer value) {
            addCriterion("value_modify =", value, "valueModify");
            return (Criteria) this;
        }

        public Criteria andValueModifyNotEqualTo(Integer value) {
            addCriterion("value_modify <>", value, "valueModify");
            return (Criteria) this;
        }

        public Criteria andValueModifyGreaterThan(Integer value) {
            addCriterion("value_modify >", value, "valueModify");
            return (Criteria) this;
        }

        public Criteria andValueModifyGreaterThanOrEqualTo(Integer value) {
            addCriterion("value_modify >=", value, "valueModify");
            return (Criteria) this;
        }

        public Criteria andValueModifyLessThan(Integer value) {
            addCriterion("value_modify <", value, "valueModify");
            return (Criteria) this;
        }

        public Criteria andValueModifyLessThanOrEqualTo(Integer value) {
            addCriterion("value_modify <=", value, "valueModify");
            return (Criteria) this;
        }

        public Criteria andValueModifyIn(List<Integer> values) {
            addCriterion("value_modify in", values, "valueModify");
            return (Criteria) this;
        }

        public Criteria andValueModifyNotIn(List<Integer> values) {
            addCriterion("value_modify not in", values, "valueModify");
            return (Criteria) this;
        }

        public Criteria andValueModifyBetween(Integer value1, Integer value2) {
            addCriterion("value_modify between", value1, value2, "valueModify");
            return (Criteria) this;
        }

        public Criteria andValueModifyNotBetween(Integer value1, Integer value2) {
            addCriterion("value_modify not between", value1, value2, "valueModify");
            return (Criteria) this;
        }

        public Criteria andValueModifyDateIsNull() {
            addCriterion("value_modify_date is null");
            return (Criteria) this;
        }

        public Criteria andValueModifyDateIsNotNull() {
            addCriterion("value_modify_date is not null");
            return (Criteria) this;
        }

        public Criteria andValueModifyDateEqualTo(String value) {
            addCriterion("value_modify_date =", value, "valueModifyDate");
            return (Criteria) this;
        }

        public Criteria andValueModifyDateNotEqualTo(String value) {
            addCriterion("value_modify_date <>", value, "valueModifyDate");
            return (Criteria) this;
        }

        public Criteria andValueModifyDateGreaterThan(String value) {
            addCriterion("value_modify_date >", value, "valueModifyDate");
            return (Criteria) this;
        }

        public Criteria andValueModifyDateGreaterThanOrEqualTo(String value) {
            addCriterion("value_modify_date >=", value, "valueModifyDate");
            return (Criteria) this;
        }

        public Criteria andValueModifyDateLessThan(String value) {
            addCriterion("value_modify_date <", value, "valueModifyDate");
            return (Criteria) this;
        }

        public Criteria andValueModifyDateLessThanOrEqualTo(String value) {
            addCriterion("value_modify_date <=", value, "valueModifyDate");
            return (Criteria) this;
        }

        public Criteria andValueModifyDateLike(String value) {
            addCriterion("value_modify_date like", value, "valueModifyDate");
            return (Criteria) this;
        }

        public Criteria andValueModifyDateNotLike(String value) {
            addCriterion("value_modify_date not like", value, "valueModifyDate");
            return (Criteria) this;
        }

        public Criteria andValueModifyDateIn(List<String> values) {
            addCriterion("value_modify_date in", values, "valueModifyDate");
            return (Criteria) this;
        }

        public Criteria andValueModifyDateNotIn(List<String> values) {
            addCriterion("value_modify_date not in", values, "valueModifyDate");
            return (Criteria) this;
        }

        public Criteria andValueModifyDateBetween(String value1, String value2) {
            addCriterion("value_modify_date between", value1, value2, "valueModifyDate");
            return (Criteria) this;
        }

        public Criteria andValueModifyDateNotBetween(String value1, String value2) {
            addCriterion("value_modify_date not between", value1, value2, "valueModifyDate");
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