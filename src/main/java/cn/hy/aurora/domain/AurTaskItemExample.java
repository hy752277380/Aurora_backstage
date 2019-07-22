package cn.hy.aurora.domain;

import java.util.ArrayList;
import java.util.List;

public class AurTaskItemExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AurTaskItemExample() {
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

        public Criteria andItemIdIsNull() {
            addCriterion("item_id is null");
            return (Criteria) this;
        }

        public Criteria andItemIdIsNotNull() {
            addCriterion("item_id is not null");
            return (Criteria) this;
        }

        public Criteria andItemIdEqualTo(Integer value) {
            addCriterion("item_id =", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdNotEqualTo(Integer value) {
            addCriterion("item_id <>", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdGreaterThan(Integer value) {
            addCriterion("item_id >", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("item_id >=", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdLessThan(Integer value) {
            addCriterion("item_id <", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdLessThanOrEqualTo(Integer value) {
            addCriterion("item_id <=", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdIn(List<Integer> values) {
            addCriterion("item_id in", values, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdNotIn(List<Integer> values) {
            addCriterion("item_id not in", values, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdBetween(Integer value1, Integer value2) {
            addCriterion("item_id between", value1, value2, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdNotBetween(Integer value1, Integer value2) {
            addCriterion("item_id not between", value1, value2, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemNameIsNull() {
            addCriterion("item_name is null");
            return (Criteria) this;
        }

        public Criteria andItemNameIsNotNull() {
            addCriterion("item_name is not null");
            return (Criteria) this;
        }

        public Criteria andItemNameEqualTo(String value) {
            addCriterion("item_name =", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameNotEqualTo(String value) {
            addCriterion("item_name <>", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameGreaterThan(String value) {
            addCriterion("item_name >", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameGreaterThanOrEqualTo(String value) {
            addCriterion("item_name >=", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameLessThan(String value) {
            addCriterion("item_name <", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameLessThanOrEqualTo(String value) {
            addCriterion("item_name <=", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameLike(String value) {
            addCriterion("item_name like", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameNotLike(String value) {
            addCriterion("item_name not like", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameIn(List<String> values) {
            addCriterion("item_name in", values, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameNotIn(List<String> values) {
            addCriterion("item_name not in", values, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameBetween(String value1, String value2) {
            addCriterion("item_name between", value1, value2, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameNotBetween(String value1, String value2) {
            addCriterion("item_name not between", value1, value2, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemCycleIsNull() {
            addCriterion("item_cycle is null");
            return (Criteria) this;
        }

        public Criteria andItemCycleIsNotNull() {
            addCriterion("item_cycle is not null");
            return (Criteria) this;
        }

        public Criteria andItemCycleEqualTo(Integer value) {
            addCriterion("item_cycle =", value, "itemCycle");
            return (Criteria) this;
        }

        public Criteria andItemCycleNotEqualTo(Integer value) {
            addCriterion("item_cycle <>", value, "itemCycle");
            return (Criteria) this;
        }

        public Criteria andItemCycleGreaterThan(Integer value) {
            addCriterion("item_cycle >", value, "itemCycle");
            return (Criteria) this;
        }

        public Criteria andItemCycleGreaterThanOrEqualTo(Integer value) {
            addCriterion("item_cycle >=", value, "itemCycle");
            return (Criteria) this;
        }

        public Criteria andItemCycleLessThan(Integer value) {
            addCriterion("item_cycle <", value, "itemCycle");
            return (Criteria) this;
        }

        public Criteria andItemCycleLessThanOrEqualTo(Integer value) {
            addCriterion("item_cycle <=", value, "itemCycle");
            return (Criteria) this;
        }

        public Criteria andItemCycleIn(List<Integer> values) {
            addCriterion("item_cycle in", values, "itemCycle");
            return (Criteria) this;
        }

        public Criteria andItemCycleNotIn(List<Integer> values) {
            addCriterion("item_cycle not in", values, "itemCycle");
            return (Criteria) this;
        }

        public Criteria andItemCycleBetween(Integer value1, Integer value2) {
            addCriterion("item_cycle between", value1, value2, "itemCycle");
            return (Criteria) this;
        }

        public Criteria andItemCycleNotBetween(Integer value1, Integer value2) {
            addCriterion("item_cycle not between", value1, value2, "itemCycle");
            return (Criteria) this;
        }

        public Criteria andItemComponentIsNull() {
            addCriterion("item_component is null");
            return (Criteria) this;
        }

        public Criteria andItemComponentIsNotNull() {
            addCriterion("item_component is not null");
            return (Criteria) this;
        }

        public Criteria andItemComponentEqualTo(Integer value) {
            addCriterion("item_component =", value, "itemComponent");
            return (Criteria) this;
        }

        public Criteria andItemComponentNotEqualTo(Integer value) {
            addCriterion("item_component <>", value, "itemComponent");
            return (Criteria) this;
        }

        public Criteria andItemComponentGreaterThan(Integer value) {
            addCriterion("item_component >", value, "itemComponent");
            return (Criteria) this;
        }

        public Criteria andItemComponentGreaterThanOrEqualTo(Integer value) {
            addCriterion("item_component >=", value, "itemComponent");
            return (Criteria) this;
        }

        public Criteria andItemComponentLessThan(Integer value) {
            addCriterion("item_component <", value, "itemComponent");
            return (Criteria) this;
        }

        public Criteria andItemComponentLessThanOrEqualTo(Integer value) {
            addCriterion("item_component <=", value, "itemComponent");
            return (Criteria) this;
        }

        public Criteria andItemComponentIn(List<Integer> values) {
            addCriterion("item_component in", values, "itemComponent");
            return (Criteria) this;
        }

        public Criteria andItemComponentNotIn(List<Integer> values) {
            addCriterion("item_component not in", values, "itemComponent");
            return (Criteria) this;
        }

        public Criteria andItemComponentBetween(Integer value1, Integer value2) {
            addCriterion("item_component between", value1, value2, "itemComponent");
            return (Criteria) this;
        }

        public Criteria andItemComponentNotBetween(Integer value1, Integer value2) {
            addCriterion("item_component not between", value1, value2, "itemComponent");
            return (Criteria) this;
        }

        public Criteria andItemScheduleIsNull() {
            addCriterion("item_schedule is null");
            return (Criteria) this;
        }

        public Criteria andItemScheduleIsNotNull() {
            addCriterion("item_schedule is not null");
            return (Criteria) this;
        }

        public Criteria andItemScheduleEqualTo(Integer value) {
            addCriterion("item_schedule =", value, "itemSchedule");
            return (Criteria) this;
        }

        public Criteria andItemScheduleNotEqualTo(Integer value) {
            addCriterion("item_schedule <>", value, "itemSchedule");
            return (Criteria) this;
        }

        public Criteria andItemScheduleGreaterThan(Integer value) {
            addCriterion("item_schedule >", value, "itemSchedule");
            return (Criteria) this;
        }

        public Criteria andItemScheduleGreaterThanOrEqualTo(Integer value) {
            addCriterion("item_schedule >=", value, "itemSchedule");
            return (Criteria) this;
        }

        public Criteria andItemScheduleLessThan(Integer value) {
            addCriterion("item_schedule <", value, "itemSchedule");
            return (Criteria) this;
        }

        public Criteria andItemScheduleLessThanOrEqualTo(Integer value) {
            addCriterion("item_schedule <=", value, "itemSchedule");
            return (Criteria) this;
        }

        public Criteria andItemScheduleIn(List<Integer> values) {
            addCriterion("item_schedule in", values, "itemSchedule");
            return (Criteria) this;
        }

        public Criteria andItemScheduleNotIn(List<Integer> values) {
            addCriterion("item_schedule not in", values, "itemSchedule");
            return (Criteria) this;
        }

        public Criteria andItemScheduleBetween(Integer value1, Integer value2) {
            addCriterion("item_schedule between", value1, value2, "itemSchedule");
            return (Criteria) this;
        }

        public Criteria andItemScheduleNotBetween(Integer value1, Integer value2) {
            addCriterion("item_schedule not between", value1, value2, "itemSchedule");
            return (Criteria) this;
        }

        public Criteria andItemFinishIsNull() {
            addCriterion("item_finish is null");
            return (Criteria) this;
        }

        public Criteria andItemFinishIsNotNull() {
            addCriterion("item_finish is not null");
            return (Criteria) this;
        }

        public Criteria andItemFinishEqualTo(Boolean value) {
            addCriterion("item_finish =", value, "itemFinish");
            return (Criteria) this;
        }

        public Criteria andItemFinishNotEqualTo(Boolean value) {
            addCriterion("item_finish <>", value, "itemFinish");
            return (Criteria) this;
        }

        public Criteria andItemFinishGreaterThan(Boolean value) {
            addCriterion("item_finish >", value, "itemFinish");
            return (Criteria) this;
        }

        public Criteria andItemFinishGreaterThanOrEqualTo(Boolean value) {
            addCriterion("item_finish >=", value, "itemFinish");
            return (Criteria) this;
        }

        public Criteria andItemFinishLessThan(Boolean value) {
            addCriterion("item_finish <", value, "itemFinish");
            return (Criteria) this;
        }

        public Criteria andItemFinishLessThanOrEqualTo(Boolean value) {
            addCriterion("item_finish <=", value, "itemFinish");
            return (Criteria) this;
        }

        public Criteria andItemFinishIn(List<Boolean> values) {
            addCriterion("item_finish in", values, "itemFinish");
            return (Criteria) this;
        }

        public Criteria andItemFinishNotIn(List<Boolean> values) {
            addCriterion("item_finish not in", values, "itemFinish");
            return (Criteria) this;
        }

        public Criteria andItemFinishBetween(Boolean value1, Boolean value2) {
            addCriterion("item_finish between", value1, value2, "itemFinish");
            return (Criteria) this;
        }

        public Criteria andItemFinishNotBetween(Boolean value1, Boolean value2) {
            addCriterion("item_finish not between", value1, value2, "itemFinish");
            return (Criteria) this;
        }

        public Criteria andItemCreateDateIsNull() {
            addCriterion("item_create_date is null");
            return (Criteria) this;
        }

        public Criteria andItemCreateDateIsNotNull() {
            addCriterion("item_create_date is not null");
            return (Criteria) this;
        }

        public Criteria andItemCreateDateEqualTo(String value) {
            addCriterion("item_create_date =", value, "itemCreateDate");
            return (Criteria) this;
        }

        public Criteria andItemCreateDateNotEqualTo(String value) {
            addCriterion("item_create_date <>", value, "itemCreateDate");
            return (Criteria) this;
        }

        public Criteria andItemCreateDateGreaterThan(String value) {
            addCriterion("item_create_date >", value, "itemCreateDate");
            return (Criteria) this;
        }

        public Criteria andItemCreateDateGreaterThanOrEqualTo(String value) {
            addCriterion("item_create_date >=", value, "itemCreateDate");
            return (Criteria) this;
        }

        public Criteria andItemCreateDateLessThan(String value) {
            addCriterion("item_create_date <", value, "itemCreateDate");
            return (Criteria) this;
        }

        public Criteria andItemCreateDateLessThanOrEqualTo(String value) {
            addCriterion("item_create_date <=", value, "itemCreateDate");
            return (Criteria) this;
        }

        public Criteria andItemCreateDateLike(String value) {
            addCriterion("item_create_date like", value, "itemCreateDate");
            return (Criteria) this;
        }

        public Criteria andItemCreateDateNotLike(String value) {
            addCriterion("item_create_date not like", value, "itemCreateDate");
            return (Criteria) this;
        }

        public Criteria andItemCreateDateIn(List<String> values) {
            addCriterion("item_create_date in", values, "itemCreateDate");
            return (Criteria) this;
        }

        public Criteria andItemCreateDateNotIn(List<String> values) {
            addCriterion("item_create_date not in", values, "itemCreateDate");
            return (Criteria) this;
        }

        public Criteria andItemCreateDateBetween(String value1, String value2) {
            addCriterion("item_create_date between", value1, value2, "itemCreateDate");
            return (Criteria) this;
        }

        public Criteria andItemCreateDateNotBetween(String value1, String value2) {
            addCriterion("item_create_date not between", value1, value2, "itemCreateDate");
            return (Criteria) this;
        }

        public Criteria andItemFinishDateIsNull() {
            addCriterion("item_finish_date is null");
            return (Criteria) this;
        }

        public Criteria andItemFinishDateIsNotNull() {
            addCriterion("item_finish_date is not null");
            return (Criteria) this;
        }

        public Criteria andItemFinishDateEqualTo(String value) {
            addCriterion("item_finish_date =", value, "itemFinishDate");
            return (Criteria) this;
        }

        public Criteria andItemFinishDateNotEqualTo(String value) {
            addCriterion("item_finish_date <>", value, "itemFinishDate");
            return (Criteria) this;
        }

        public Criteria andItemFinishDateGreaterThan(String value) {
            addCriterion("item_finish_date >", value, "itemFinishDate");
            return (Criteria) this;
        }

        public Criteria andItemFinishDateGreaterThanOrEqualTo(String value) {
            addCriterion("item_finish_date >=", value, "itemFinishDate");
            return (Criteria) this;
        }

        public Criteria andItemFinishDateLessThan(String value) {
            addCriterion("item_finish_date <", value, "itemFinishDate");
            return (Criteria) this;
        }

        public Criteria andItemFinishDateLessThanOrEqualTo(String value) {
            addCriterion("item_finish_date <=", value, "itemFinishDate");
            return (Criteria) this;
        }

        public Criteria andItemFinishDateLike(String value) {
            addCriterion("item_finish_date like", value, "itemFinishDate");
            return (Criteria) this;
        }

        public Criteria andItemFinishDateNotLike(String value) {
            addCriterion("item_finish_date not like", value, "itemFinishDate");
            return (Criteria) this;
        }

        public Criteria andItemFinishDateIn(List<String> values) {
            addCriterion("item_finish_date in", values, "itemFinishDate");
            return (Criteria) this;
        }

        public Criteria andItemFinishDateNotIn(List<String> values) {
            addCriterion("item_finish_date not in", values, "itemFinishDate");
            return (Criteria) this;
        }

        public Criteria andItemFinishDateBetween(String value1, String value2) {
            addCriterion("item_finish_date between", value1, value2, "itemFinishDate");
            return (Criteria) this;
        }

        public Criteria andItemFinishDateNotBetween(String value1, String value2) {
            addCriterion("item_finish_date not between", value1, value2, "itemFinishDate");
            return (Criteria) this;
        }

        public Criteria andItemEnableIsNull() {
            addCriterion("item_enable is null");
            return (Criteria) this;
        }

        public Criteria andItemEnableIsNotNull() {
            addCriterion("item_enable is not null");
            return (Criteria) this;
        }

        public Criteria andItemEnableEqualTo(Boolean value) {
            addCriterion("item_enable =", value, "itemEnable");
            return (Criteria) this;
        }

        public Criteria andItemEnableNotEqualTo(Boolean value) {
            addCriterion("item_enable <>", value, "itemEnable");
            return (Criteria) this;
        }

        public Criteria andItemEnableGreaterThan(Boolean value) {
            addCriterion("item_enable >", value, "itemEnable");
            return (Criteria) this;
        }

        public Criteria andItemEnableGreaterThanOrEqualTo(Boolean value) {
            addCriterion("item_enable >=", value, "itemEnable");
            return (Criteria) this;
        }

        public Criteria andItemEnableLessThan(Boolean value) {
            addCriterion("item_enable <", value, "itemEnable");
            return (Criteria) this;
        }

        public Criteria andItemEnableLessThanOrEqualTo(Boolean value) {
            addCriterion("item_enable <=", value, "itemEnable");
            return (Criteria) this;
        }

        public Criteria andItemEnableIn(List<Boolean> values) {
            addCriterion("item_enable in", values, "itemEnable");
            return (Criteria) this;
        }

        public Criteria andItemEnableNotIn(List<Boolean> values) {
            addCriterion("item_enable not in", values, "itemEnable");
            return (Criteria) this;
        }

        public Criteria andItemEnableBetween(Boolean value1, Boolean value2) {
            addCriterion("item_enable between", value1, value2, "itemEnable");
            return (Criteria) this;
        }

        public Criteria andItemEnableNotBetween(Boolean value1, Boolean value2) {
            addCriterion("item_enable not between", value1, value2, "itemEnable");
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