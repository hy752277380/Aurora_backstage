package cn.hy.aurora.domain;

import java.util.ArrayList;
import java.util.List;

public class AurTaskCompAttrExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AurTaskCompAttrExample() {
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

        public Criteria andAttributeIdIsNull() {
            addCriterion("attribute_id is null");
            return (Criteria) this;
        }

        public Criteria andAttributeIdIsNotNull() {
            addCriterion("attribute_id is not null");
            return (Criteria) this;
        }

        public Criteria andAttributeIdEqualTo(Integer value) {
            addCriterion("attribute_id =", value, "attributeId");
            return (Criteria) this;
        }

        public Criteria andAttributeIdNotEqualTo(Integer value) {
            addCriterion("attribute_id <>", value, "attributeId");
            return (Criteria) this;
        }

        public Criteria andAttributeIdGreaterThan(Integer value) {
            addCriterion("attribute_id >", value, "attributeId");
            return (Criteria) this;
        }

        public Criteria andAttributeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("attribute_id >=", value, "attributeId");
            return (Criteria) this;
        }

        public Criteria andAttributeIdLessThan(Integer value) {
            addCriterion("attribute_id <", value, "attributeId");
            return (Criteria) this;
        }

        public Criteria andAttributeIdLessThanOrEqualTo(Integer value) {
            addCriterion("attribute_id <=", value, "attributeId");
            return (Criteria) this;
        }

        public Criteria andAttributeIdIn(List<Integer> values) {
            addCriterion("attribute_id in", values, "attributeId");
            return (Criteria) this;
        }

        public Criteria andAttributeIdNotIn(List<Integer> values) {
            addCriterion("attribute_id not in", values, "attributeId");
            return (Criteria) this;
        }

        public Criteria andAttributeIdBetween(Integer value1, Integer value2) {
            addCriterion("attribute_id between", value1, value2, "attributeId");
            return (Criteria) this;
        }

        public Criteria andAttributeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("attribute_id not between", value1, value2, "attributeId");
            return (Criteria) this;
        }

        public Criteria andAttributeNameIsNull() {
            addCriterion("attribute_name is null");
            return (Criteria) this;
        }

        public Criteria andAttributeNameIsNotNull() {
            addCriterion("attribute_name is not null");
            return (Criteria) this;
        }

        public Criteria andAttributeNameEqualTo(String value) {
            addCriterion("attribute_name =", value, "attributeName");
            return (Criteria) this;
        }

        public Criteria andAttributeNameNotEqualTo(String value) {
            addCriterion("attribute_name <>", value, "attributeName");
            return (Criteria) this;
        }

        public Criteria andAttributeNameGreaterThan(String value) {
            addCriterion("attribute_name >", value, "attributeName");
            return (Criteria) this;
        }

        public Criteria andAttributeNameGreaterThanOrEqualTo(String value) {
            addCriterion("attribute_name >=", value, "attributeName");
            return (Criteria) this;
        }

        public Criteria andAttributeNameLessThan(String value) {
            addCriterion("attribute_name <", value, "attributeName");
            return (Criteria) this;
        }

        public Criteria andAttributeNameLessThanOrEqualTo(String value) {
            addCriterion("attribute_name <=", value, "attributeName");
            return (Criteria) this;
        }

        public Criteria andAttributeNameLike(String value) {
            addCriterion("attribute_name like", value, "attributeName");
            return (Criteria) this;
        }

        public Criteria andAttributeNameNotLike(String value) {
            addCriterion("attribute_name not like", value, "attributeName");
            return (Criteria) this;
        }

        public Criteria andAttributeNameIn(List<String> values) {
            addCriterion("attribute_name in", values, "attributeName");
            return (Criteria) this;
        }

        public Criteria andAttributeNameNotIn(List<String> values) {
            addCriterion("attribute_name not in", values, "attributeName");
            return (Criteria) this;
        }

        public Criteria andAttributeNameBetween(String value1, String value2) {
            addCriterion("attribute_name between", value1, value2, "attributeName");
            return (Criteria) this;
        }

        public Criteria andAttributeNameNotBetween(String value1, String value2) {
            addCriterion("attribute_name not between", value1, value2, "attributeName");
            return (Criteria) this;
        }

        public Criteria andAttributeComponentIsNull() {
            addCriterion("attribute_component is null");
            return (Criteria) this;
        }

        public Criteria andAttributeComponentIsNotNull() {
            addCriterion("attribute_component is not null");
            return (Criteria) this;
        }

        public Criteria andAttributeComponentEqualTo(Integer value) {
            addCriterion("attribute_component =", value, "attributeComponent");
            return (Criteria) this;
        }

        public Criteria andAttributeComponentNotEqualTo(Integer value) {
            addCriterion("attribute_component <>", value, "attributeComponent");
            return (Criteria) this;
        }

        public Criteria andAttributeComponentGreaterThan(Integer value) {
            addCriterion("attribute_component >", value, "attributeComponent");
            return (Criteria) this;
        }

        public Criteria andAttributeComponentGreaterThanOrEqualTo(Integer value) {
            addCriterion("attribute_component >=", value, "attributeComponent");
            return (Criteria) this;
        }

        public Criteria andAttributeComponentLessThan(Integer value) {
            addCriterion("attribute_component <", value, "attributeComponent");
            return (Criteria) this;
        }

        public Criteria andAttributeComponentLessThanOrEqualTo(Integer value) {
            addCriterion("attribute_component <=", value, "attributeComponent");
            return (Criteria) this;
        }

        public Criteria andAttributeComponentIn(List<Integer> values) {
            addCriterion("attribute_component in", values, "attributeComponent");
            return (Criteria) this;
        }

        public Criteria andAttributeComponentNotIn(List<Integer> values) {
            addCriterion("attribute_component not in", values, "attributeComponent");
            return (Criteria) this;
        }

        public Criteria andAttributeComponentBetween(Integer value1, Integer value2) {
            addCriterion("attribute_component between", value1, value2, "attributeComponent");
            return (Criteria) this;
        }

        public Criteria andAttributeComponentNotBetween(Integer value1, Integer value2) {
            addCriterion("attribute_component not between", value1, value2, "attributeComponent");
            return (Criteria) this;
        }

        public Criteria andAttributeCreateIsNull() {
            addCriterion("attribute_create is null");
            return (Criteria) this;
        }

        public Criteria andAttributeCreateIsNotNull() {
            addCriterion("attribute_create is not null");
            return (Criteria) this;
        }

        public Criteria andAttributeCreateEqualTo(Integer value) {
            addCriterion("attribute_create =", value, "attributeCreate");
            return (Criteria) this;
        }

        public Criteria andAttributeCreateNotEqualTo(Integer value) {
            addCriterion("attribute_create <>", value, "attributeCreate");
            return (Criteria) this;
        }

        public Criteria andAttributeCreateGreaterThan(Integer value) {
            addCriterion("attribute_create >", value, "attributeCreate");
            return (Criteria) this;
        }

        public Criteria andAttributeCreateGreaterThanOrEqualTo(Integer value) {
            addCriterion("attribute_create >=", value, "attributeCreate");
            return (Criteria) this;
        }

        public Criteria andAttributeCreateLessThan(Integer value) {
            addCriterion("attribute_create <", value, "attributeCreate");
            return (Criteria) this;
        }

        public Criteria andAttributeCreateLessThanOrEqualTo(Integer value) {
            addCriterion("attribute_create <=", value, "attributeCreate");
            return (Criteria) this;
        }

        public Criteria andAttributeCreateIn(List<Integer> values) {
            addCriterion("attribute_create in", values, "attributeCreate");
            return (Criteria) this;
        }

        public Criteria andAttributeCreateNotIn(List<Integer> values) {
            addCriterion("attribute_create not in", values, "attributeCreate");
            return (Criteria) this;
        }

        public Criteria andAttributeCreateBetween(Integer value1, Integer value2) {
            addCriterion("attribute_create between", value1, value2, "attributeCreate");
            return (Criteria) this;
        }

        public Criteria andAttributeCreateNotBetween(Integer value1, Integer value2) {
            addCriterion("attribute_create not between", value1, value2, "attributeCreate");
            return (Criteria) this;
        }

        public Criteria andAttributeCreateDateIsNull() {
            addCriterion("attribute_create_date is null");
            return (Criteria) this;
        }

        public Criteria andAttributeCreateDateIsNotNull() {
            addCriterion("attribute_create_date is not null");
            return (Criteria) this;
        }

        public Criteria andAttributeCreateDateEqualTo(String value) {
            addCriterion("attribute_create_date =", value, "attributeCreateDate");
            return (Criteria) this;
        }

        public Criteria andAttributeCreateDateNotEqualTo(String value) {
            addCriterion("attribute_create_date <>", value, "attributeCreateDate");
            return (Criteria) this;
        }

        public Criteria andAttributeCreateDateGreaterThan(String value) {
            addCriterion("attribute_create_date >", value, "attributeCreateDate");
            return (Criteria) this;
        }

        public Criteria andAttributeCreateDateGreaterThanOrEqualTo(String value) {
            addCriterion("attribute_create_date >=", value, "attributeCreateDate");
            return (Criteria) this;
        }

        public Criteria andAttributeCreateDateLessThan(String value) {
            addCriterion("attribute_create_date <", value, "attributeCreateDate");
            return (Criteria) this;
        }

        public Criteria andAttributeCreateDateLessThanOrEqualTo(String value) {
            addCriterion("attribute_create_date <=", value, "attributeCreateDate");
            return (Criteria) this;
        }

        public Criteria andAttributeCreateDateLike(String value) {
            addCriterion("attribute_create_date like", value, "attributeCreateDate");
            return (Criteria) this;
        }

        public Criteria andAttributeCreateDateNotLike(String value) {
            addCriterion("attribute_create_date not like", value, "attributeCreateDate");
            return (Criteria) this;
        }

        public Criteria andAttributeCreateDateIn(List<String> values) {
            addCriterion("attribute_create_date in", values, "attributeCreateDate");
            return (Criteria) this;
        }

        public Criteria andAttributeCreateDateNotIn(List<String> values) {
            addCriterion("attribute_create_date not in", values, "attributeCreateDate");
            return (Criteria) this;
        }

        public Criteria andAttributeCreateDateBetween(String value1, String value2) {
            addCriterion("attribute_create_date between", value1, value2, "attributeCreateDate");
            return (Criteria) this;
        }

        public Criteria andAttributeCreateDateNotBetween(String value1, String value2) {
            addCriterion("attribute_create_date not between", value1, value2, "attributeCreateDate");
            return (Criteria) this;
        }

        public Criteria andAttributeModifyIsNull() {
            addCriterion("attribute_modify is null");
            return (Criteria) this;
        }

        public Criteria andAttributeModifyIsNotNull() {
            addCriterion("attribute_modify is not null");
            return (Criteria) this;
        }

        public Criteria andAttributeModifyEqualTo(Integer value) {
            addCriterion("attribute_modify =", value, "attributeModify");
            return (Criteria) this;
        }

        public Criteria andAttributeModifyNotEqualTo(Integer value) {
            addCriterion("attribute_modify <>", value, "attributeModify");
            return (Criteria) this;
        }

        public Criteria andAttributeModifyGreaterThan(Integer value) {
            addCriterion("attribute_modify >", value, "attributeModify");
            return (Criteria) this;
        }

        public Criteria andAttributeModifyGreaterThanOrEqualTo(Integer value) {
            addCriterion("attribute_modify >=", value, "attributeModify");
            return (Criteria) this;
        }

        public Criteria andAttributeModifyLessThan(Integer value) {
            addCriterion("attribute_modify <", value, "attributeModify");
            return (Criteria) this;
        }

        public Criteria andAttributeModifyLessThanOrEqualTo(Integer value) {
            addCriterion("attribute_modify <=", value, "attributeModify");
            return (Criteria) this;
        }

        public Criteria andAttributeModifyIn(List<Integer> values) {
            addCriterion("attribute_modify in", values, "attributeModify");
            return (Criteria) this;
        }

        public Criteria andAttributeModifyNotIn(List<Integer> values) {
            addCriterion("attribute_modify not in", values, "attributeModify");
            return (Criteria) this;
        }

        public Criteria andAttributeModifyBetween(Integer value1, Integer value2) {
            addCriterion("attribute_modify between", value1, value2, "attributeModify");
            return (Criteria) this;
        }

        public Criteria andAttributeModifyNotBetween(Integer value1, Integer value2) {
            addCriterion("attribute_modify not between", value1, value2, "attributeModify");
            return (Criteria) this;
        }

        public Criteria andAttributeModifyDateIsNull() {
            addCriterion("attribute_modify_date is null");
            return (Criteria) this;
        }

        public Criteria andAttributeModifyDateIsNotNull() {
            addCriterion("attribute_modify_date is not null");
            return (Criteria) this;
        }

        public Criteria andAttributeModifyDateEqualTo(String value) {
            addCriterion("attribute_modify_date =", value, "attributeModifyDate");
            return (Criteria) this;
        }

        public Criteria andAttributeModifyDateNotEqualTo(String value) {
            addCriterion("attribute_modify_date <>", value, "attributeModifyDate");
            return (Criteria) this;
        }

        public Criteria andAttributeModifyDateGreaterThan(String value) {
            addCriterion("attribute_modify_date >", value, "attributeModifyDate");
            return (Criteria) this;
        }

        public Criteria andAttributeModifyDateGreaterThanOrEqualTo(String value) {
            addCriterion("attribute_modify_date >=", value, "attributeModifyDate");
            return (Criteria) this;
        }

        public Criteria andAttributeModifyDateLessThan(String value) {
            addCriterion("attribute_modify_date <", value, "attributeModifyDate");
            return (Criteria) this;
        }

        public Criteria andAttributeModifyDateLessThanOrEqualTo(String value) {
            addCriterion("attribute_modify_date <=", value, "attributeModifyDate");
            return (Criteria) this;
        }

        public Criteria andAttributeModifyDateLike(String value) {
            addCriterion("attribute_modify_date like", value, "attributeModifyDate");
            return (Criteria) this;
        }

        public Criteria andAttributeModifyDateNotLike(String value) {
            addCriterion("attribute_modify_date not like", value, "attributeModifyDate");
            return (Criteria) this;
        }

        public Criteria andAttributeModifyDateIn(List<String> values) {
            addCriterion("attribute_modify_date in", values, "attributeModifyDate");
            return (Criteria) this;
        }

        public Criteria andAttributeModifyDateNotIn(List<String> values) {
            addCriterion("attribute_modify_date not in", values, "attributeModifyDate");
            return (Criteria) this;
        }

        public Criteria andAttributeModifyDateBetween(String value1, String value2) {
            addCriterion("attribute_modify_date between", value1, value2, "attributeModifyDate");
            return (Criteria) this;
        }

        public Criteria andAttributeModifyDateNotBetween(String value1, String value2) {
            addCriterion("attribute_modify_date not between", value1, value2, "attributeModifyDate");
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