package cn.hy.aurora.domain;

import java.util.ArrayList;
import java.util.List;

public class AurTaskComponentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AurTaskComponentExample() {
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

        public Criteria andComponentIdIsNull() {
            addCriterion("component_id is null");
            return (Criteria) this;
        }

        public Criteria andComponentIdIsNotNull() {
            addCriterion("component_id is not null");
            return (Criteria) this;
        }

        public Criteria andComponentIdEqualTo(Integer value) {
            addCriterion("component_id =", value, "componentId");
            return (Criteria) this;
        }

        public Criteria andComponentIdNotEqualTo(Integer value) {
            addCriterion("component_id <>", value, "componentId");
            return (Criteria) this;
        }

        public Criteria andComponentIdGreaterThan(Integer value) {
            addCriterion("component_id >", value, "componentId");
            return (Criteria) this;
        }

        public Criteria andComponentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("component_id >=", value, "componentId");
            return (Criteria) this;
        }

        public Criteria andComponentIdLessThan(Integer value) {
            addCriterion("component_id <", value, "componentId");
            return (Criteria) this;
        }

        public Criteria andComponentIdLessThanOrEqualTo(Integer value) {
            addCriterion("component_id <=", value, "componentId");
            return (Criteria) this;
        }

        public Criteria andComponentIdIn(List<Integer> values) {
            addCriterion("component_id in", values, "componentId");
            return (Criteria) this;
        }

        public Criteria andComponentIdNotIn(List<Integer> values) {
            addCriterion("component_id not in", values, "componentId");
            return (Criteria) this;
        }

        public Criteria andComponentIdBetween(Integer value1, Integer value2) {
            addCriterion("component_id between", value1, value2, "componentId");
            return (Criteria) this;
        }

        public Criteria andComponentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("component_id not between", value1, value2, "componentId");
            return (Criteria) this;
        }

        public Criteria andComponentNameIsNull() {
            addCriterion("component_name is null");
            return (Criteria) this;
        }

        public Criteria andComponentNameIsNotNull() {
            addCriterion("component_name is not null");
            return (Criteria) this;
        }

        public Criteria andComponentNameEqualTo(String value) {
            addCriterion("component_name =", value, "componentName");
            return (Criteria) this;
        }

        public Criteria andComponentNameNotEqualTo(String value) {
            addCriterion("component_name <>", value, "componentName");
            return (Criteria) this;
        }

        public Criteria andComponentNameGreaterThan(String value) {
            addCriterion("component_name >", value, "componentName");
            return (Criteria) this;
        }

        public Criteria andComponentNameGreaterThanOrEqualTo(String value) {
            addCriterion("component_name >=", value, "componentName");
            return (Criteria) this;
        }

        public Criteria andComponentNameLessThan(String value) {
            addCriterion("component_name <", value, "componentName");
            return (Criteria) this;
        }

        public Criteria andComponentNameLessThanOrEqualTo(String value) {
            addCriterion("component_name <=", value, "componentName");
            return (Criteria) this;
        }

        public Criteria andComponentNameLike(String value) {
            addCriterion("component_name like", value, "componentName");
            return (Criteria) this;
        }

        public Criteria andComponentNameNotLike(String value) {
            addCriterion("component_name not like", value, "componentName");
            return (Criteria) this;
        }

        public Criteria andComponentNameIn(List<String> values) {
            addCriterion("component_name in", values, "componentName");
            return (Criteria) this;
        }

        public Criteria andComponentNameNotIn(List<String> values) {
            addCriterion("component_name not in", values, "componentName");
            return (Criteria) this;
        }

        public Criteria andComponentNameBetween(String value1, String value2) {
            addCriterion("component_name between", value1, value2, "componentName");
            return (Criteria) this;
        }

        public Criteria andComponentNameNotBetween(String value1, String value2) {
            addCriterion("component_name not between", value1, value2, "componentName");
            return (Criteria) this;
        }

        public Criteria andComponentGifUrlIsNull() {
            addCriterion("component_gif_url is null");
            return (Criteria) this;
        }

        public Criteria andComponentGifUrlIsNotNull() {
            addCriterion("component_gif_url is not null");
            return (Criteria) this;
        }

        public Criteria andComponentGifUrlEqualTo(String value) {
            addCriterion("component_gif_url =", value, "componentGifUrl");
            return (Criteria) this;
        }

        public Criteria andComponentGifUrlNotEqualTo(String value) {
            addCriterion("component_gif_url <>", value, "componentGifUrl");
            return (Criteria) this;
        }

        public Criteria andComponentGifUrlGreaterThan(String value) {
            addCriterion("component_gif_url >", value, "componentGifUrl");
            return (Criteria) this;
        }

        public Criteria andComponentGifUrlGreaterThanOrEqualTo(String value) {
            addCriterion("component_gif_url >=", value, "componentGifUrl");
            return (Criteria) this;
        }

        public Criteria andComponentGifUrlLessThan(String value) {
            addCriterion("component_gif_url <", value, "componentGifUrl");
            return (Criteria) this;
        }

        public Criteria andComponentGifUrlLessThanOrEqualTo(String value) {
            addCriterion("component_gif_url <=", value, "componentGifUrl");
            return (Criteria) this;
        }

        public Criteria andComponentGifUrlLike(String value) {
            addCriterion("component_gif_url like", value, "componentGifUrl");
            return (Criteria) this;
        }

        public Criteria andComponentGifUrlNotLike(String value) {
            addCriterion("component_gif_url not like", value, "componentGifUrl");
            return (Criteria) this;
        }

        public Criteria andComponentGifUrlIn(List<String> values) {
            addCriterion("component_gif_url in", values, "componentGifUrl");
            return (Criteria) this;
        }

        public Criteria andComponentGifUrlNotIn(List<String> values) {
            addCriterion("component_gif_url not in", values, "componentGifUrl");
            return (Criteria) this;
        }

        public Criteria andComponentGifUrlBetween(String value1, String value2) {
            addCriterion("component_gif_url between", value1, value2, "componentGifUrl");
            return (Criteria) this;
        }

        public Criteria andComponentGifUrlNotBetween(String value1, String value2) {
            addCriterion("component_gif_url not between", value1, value2, "componentGifUrl");
            return (Criteria) this;
        }

        public Criteria andComponentCreateIsNull() {
            addCriterion("component_create is null");
            return (Criteria) this;
        }

        public Criteria andComponentCreateIsNotNull() {
            addCriterion("component_create is not null");
            return (Criteria) this;
        }

        public Criteria andComponentCreateEqualTo(Integer value) {
            addCriterion("component_create =", value, "componentCreate");
            return (Criteria) this;
        }

        public Criteria andComponentCreateNotEqualTo(Integer value) {
            addCriterion("component_create <>", value, "componentCreate");
            return (Criteria) this;
        }

        public Criteria andComponentCreateGreaterThan(Integer value) {
            addCriterion("component_create >", value, "componentCreate");
            return (Criteria) this;
        }

        public Criteria andComponentCreateGreaterThanOrEqualTo(Integer value) {
            addCriterion("component_create >=", value, "componentCreate");
            return (Criteria) this;
        }

        public Criteria andComponentCreateLessThan(Integer value) {
            addCriterion("component_create <", value, "componentCreate");
            return (Criteria) this;
        }

        public Criteria andComponentCreateLessThanOrEqualTo(Integer value) {
            addCriterion("component_create <=", value, "componentCreate");
            return (Criteria) this;
        }

        public Criteria andComponentCreateIn(List<Integer> values) {
            addCriterion("component_create in", values, "componentCreate");
            return (Criteria) this;
        }

        public Criteria andComponentCreateNotIn(List<Integer> values) {
            addCriterion("component_create not in", values, "componentCreate");
            return (Criteria) this;
        }

        public Criteria andComponentCreateBetween(Integer value1, Integer value2) {
            addCriterion("component_create between", value1, value2, "componentCreate");
            return (Criteria) this;
        }

        public Criteria andComponentCreateNotBetween(Integer value1, Integer value2) {
            addCriterion("component_create not between", value1, value2, "componentCreate");
            return (Criteria) this;
        }

        public Criteria andComponentCreateDateIsNull() {
            addCriterion("component_create_date is null");
            return (Criteria) this;
        }

        public Criteria andComponentCreateDateIsNotNull() {
            addCriterion("component_create_date is not null");
            return (Criteria) this;
        }

        public Criteria andComponentCreateDateEqualTo(String value) {
            addCriterion("component_create_date =", value, "componentCreateDate");
            return (Criteria) this;
        }

        public Criteria andComponentCreateDateNotEqualTo(String value) {
            addCriterion("component_create_date <>", value, "componentCreateDate");
            return (Criteria) this;
        }

        public Criteria andComponentCreateDateGreaterThan(String value) {
            addCriterion("component_create_date >", value, "componentCreateDate");
            return (Criteria) this;
        }

        public Criteria andComponentCreateDateGreaterThanOrEqualTo(String value) {
            addCriterion("component_create_date >=", value, "componentCreateDate");
            return (Criteria) this;
        }

        public Criteria andComponentCreateDateLessThan(String value) {
            addCriterion("component_create_date <", value, "componentCreateDate");
            return (Criteria) this;
        }

        public Criteria andComponentCreateDateLessThanOrEqualTo(String value) {
            addCriterion("component_create_date <=", value, "componentCreateDate");
            return (Criteria) this;
        }

        public Criteria andComponentCreateDateLike(String value) {
            addCriterion("component_create_date like", value, "componentCreateDate");
            return (Criteria) this;
        }

        public Criteria andComponentCreateDateNotLike(String value) {
            addCriterion("component_create_date not like", value, "componentCreateDate");
            return (Criteria) this;
        }

        public Criteria andComponentCreateDateIn(List<String> values) {
            addCriterion("component_create_date in", values, "componentCreateDate");
            return (Criteria) this;
        }

        public Criteria andComponentCreateDateNotIn(List<String> values) {
            addCriterion("component_create_date not in", values, "componentCreateDate");
            return (Criteria) this;
        }

        public Criteria andComponentCreateDateBetween(String value1, String value2) {
            addCriterion("component_create_date between", value1, value2, "componentCreateDate");
            return (Criteria) this;
        }

        public Criteria andComponentCreateDateNotBetween(String value1, String value2) {
            addCriterion("component_create_date not between", value1, value2, "componentCreateDate");
            return (Criteria) this;
        }

        public Criteria andComponentModifyIsNull() {
            addCriterion("component_modify is null");
            return (Criteria) this;
        }

        public Criteria andComponentModifyIsNotNull() {
            addCriterion("component_modify is not null");
            return (Criteria) this;
        }

        public Criteria andComponentModifyEqualTo(Integer value) {
            addCriterion("component_modify =", value, "componentModify");
            return (Criteria) this;
        }

        public Criteria andComponentModifyNotEqualTo(Integer value) {
            addCriterion("component_modify <>", value, "componentModify");
            return (Criteria) this;
        }

        public Criteria andComponentModifyGreaterThan(Integer value) {
            addCriterion("component_modify >", value, "componentModify");
            return (Criteria) this;
        }

        public Criteria andComponentModifyGreaterThanOrEqualTo(Integer value) {
            addCriterion("component_modify >=", value, "componentModify");
            return (Criteria) this;
        }

        public Criteria andComponentModifyLessThan(Integer value) {
            addCriterion("component_modify <", value, "componentModify");
            return (Criteria) this;
        }

        public Criteria andComponentModifyLessThanOrEqualTo(Integer value) {
            addCriterion("component_modify <=", value, "componentModify");
            return (Criteria) this;
        }

        public Criteria andComponentModifyIn(List<Integer> values) {
            addCriterion("component_modify in", values, "componentModify");
            return (Criteria) this;
        }

        public Criteria andComponentModifyNotIn(List<Integer> values) {
            addCriterion("component_modify not in", values, "componentModify");
            return (Criteria) this;
        }

        public Criteria andComponentModifyBetween(Integer value1, Integer value2) {
            addCriterion("component_modify between", value1, value2, "componentModify");
            return (Criteria) this;
        }

        public Criteria andComponentModifyNotBetween(Integer value1, Integer value2) {
            addCriterion("component_modify not between", value1, value2, "componentModify");
            return (Criteria) this;
        }

        public Criteria andComponentModifyDateIsNull() {
            addCriterion("component_modify_date is null");
            return (Criteria) this;
        }

        public Criteria andComponentModifyDateIsNotNull() {
            addCriterion("component_modify_date is not null");
            return (Criteria) this;
        }

        public Criteria andComponentModifyDateEqualTo(String value) {
            addCriterion("component_modify_date =", value, "componentModifyDate");
            return (Criteria) this;
        }

        public Criteria andComponentModifyDateNotEqualTo(String value) {
            addCriterion("component_modify_date <>", value, "componentModifyDate");
            return (Criteria) this;
        }

        public Criteria andComponentModifyDateGreaterThan(String value) {
            addCriterion("component_modify_date >", value, "componentModifyDate");
            return (Criteria) this;
        }

        public Criteria andComponentModifyDateGreaterThanOrEqualTo(String value) {
            addCriterion("component_modify_date >=", value, "componentModifyDate");
            return (Criteria) this;
        }

        public Criteria andComponentModifyDateLessThan(String value) {
            addCriterion("component_modify_date <", value, "componentModifyDate");
            return (Criteria) this;
        }

        public Criteria andComponentModifyDateLessThanOrEqualTo(String value) {
            addCriterion("component_modify_date <=", value, "componentModifyDate");
            return (Criteria) this;
        }

        public Criteria andComponentModifyDateLike(String value) {
            addCriterion("component_modify_date like", value, "componentModifyDate");
            return (Criteria) this;
        }

        public Criteria andComponentModifyDateNotLike(String value) {
            addCriterion("component_modify_date not like", value, "componentModifyDate");
            return (Criteria) this;
        }

        public Criteria andComponentModifyDateIn(List<String> values) {
            addCriterion("component_modify_date in", values, "componentModifyDate");
            return (Criteria) this;
        }

        public Criteria andComponentModifyDateNotIn(List<String> values) {
            addCriterion("component_modify_date not in", values, "componentModifyDate");
            return (Criteria) this;
        }

        public Criteria andComponentModifyDateBetween(String value1, String value2) {
            addCriterion("component_modify_date between", value1, value2, "componentModifyDate");
            return (Criteria) this;
        }

        public Criteria andComponentModifyDateNotBetween(String value1, String value2) {
            addCriterion("component_modify_date not between", value1, value2, "componentModifyDate");
            return (Criteria) this;
        }

        public Criteria andComponentEnableIsNull() {
            addCriterion("component_enable is null");
            return (Criteria) this;
        }

        public Criteria andComponentEnableIsNotNull() {
            addCriterion("component_enable is not null");
            return (Criteria) this;
        }

        public Criteria andComponentEnableEqualTo(Boolean value) {
            addCriterion("component_enable =", value, "componentEnable");
            return (Criteria) this;
        }

        public Criteria andComponentEnableNotEqualTo(Boolean value) {
            addCriterion("component_enable <>", value, "componentEnable");
            return (Criteria) this;
        }

        public Criteria andComponentEnableGreaterThan(Boolean value) {
            addCriterion("component_enable >", value, "componentEnable");
            return (Criteria) this;
        }

        public Criteria andComponentEnableGreaterThanOrEqualTo(Boolean value) {
            addCriterion("component_enable >=", value, "componentEnable");
            return (Criteria) this;
        }

        public Criteria andComponentEnableLessThan(Boolean value) {
            addCriterion("component_enable <", value, "componentEnable");
            return (Criteria) this;
        }

        public Criteria andComponentEnableLessThanOrEqualTo(Boolean value) {
            addCriterion("component_enable <=", value, "componentEnable");
            return (Criteria) this;
        }

        public Criteria andComponentEnableIn(List<Boolean> values) {
            addCriterion("component_enable in", values, "componentEnable");
            return (Criteria) this;
        }

        public Criteria andComponentEnableNotIn(List<Boolean> values) {
            addCriterion("component_enable not in", values, "componentEnable");
            return (Criteria) this;
        }

        public Criteria andComponentEnableBetween(Boolean value1, Boolean value2) {
            addCriterion("component_enable between", value1, value2, "componentEnable");
            return (Criteria) this;
        }

        public Criteria andComponentEnableNotBetween(Boolean value1, Boolean value2) {
            addCriterion("component_enable not between", value1, value2, "componentEnable");
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