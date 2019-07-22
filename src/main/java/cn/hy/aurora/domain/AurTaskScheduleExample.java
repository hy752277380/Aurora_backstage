package cn.hy.aurora.domain;

import java.util.ArrayList;
import java.util.List;

public class AurTaskScheduleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AurTaskScheduleExample() {
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

        public Criteria andScheduleIdIsNull() {
            addCriterion("schedule_id is null");
            return (Criteria) this;
        }

        public Criteria andScheduleIdIsNotNull() {
            addCriterion("schedule_id is not null");
            return (Criteria) this;
        }

        public Criteria andScheduleIdEqualTo(Integer value) {
            addCriterion("schedule_id =", value, "scheduleId");
            return (Criteria) this;
        }

        public Criteria andScheduleIdNotEqualTo(Integer value) {
            addCriterion("schedule_id <>", value, "scheduleId");
            return (Criteria) this;
        }

        public Criteria andScheduleIdGreaterThan(Integer value) {
            addCriterion("schedule_id >", value, "scheduleId");
            return (Criteria) this;
        }

        public Criteria andScheduleIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("schedule_id >=", value, "scheduleId");
            return (Criteria) this;
        }

        public Criteria andScheduleIdLessThan(Integer value) {
            addCriterion("schedule_id <", value, "scheduleId");
            return (Criteria) this;
        }

        public Criteria andScheduleIdLessThanOrEqualTo(Integer value) {
            addCriterion("schedule_id <=", value, "scheduleId");
            return (Criteria) this;
        }

        public Criteria andScheduleIdIn(List<Integer> values) {
            addCriterion("schedule_id in", values, "scheduleId");
            return (Criteria) this;
        }

        public Criteria andScheduleIdNotIn(List<Integer> values) {
            addCriterion("schedule_id not in", values, "scheduleId");
            return (Criteria) this;
        }

        public Criteria andScheduleIdBetween(Integer value1, Integer value2) {
            addCriterion("schedule_id between", value1, value2, "scheduleId");
            return (Criteria) this;
        }

        public Criteria andScheduleIdNotBetween(Integer value1, Integer value2) {
            addCriterion("schedule_id not between", value1, value2, "scheduleId");
            return (Criteria) this;
        }

        public Criteria andScheduleBelongIsNull() {
            addCriterion("schedule_belong is null");
            return (Criteria) this;
        }

        public Criteria andScheduleBelongIsNotNull() {
            addCriterion("schedule_belong is not null");
            return (Criteria) this;
        }

        public Criteria andScheduleBelongEqualTo(Integer value) {
            addCriterion("schedule_belong =", value, "scheduleBelong");
            return (Criteria) this;
        }

        public Criteria andScheduleBelongNotEqualTo(Integer value) {
            addCriterion("schedule_belong <>", value, "scheduleBelong");
            return (Criteria) this;
        }

        public Criteria andScheduleBelongGreaterThan(Integer value) {
            addCriterion("schedule_belong >", value, "scheduleBelong");
            return (Criteria) this;
        }

        public Criteria andScheduleBelongGreaterThanOrEqualTo(Integer value) {
            addCriterion("schedule_belong >=", value, "scheduleBelong");
            return (Criteria) this;
        }

        public Criteria andScheduleBelongLessThan(Integer value) {
            addCriterion("schedule_belong <", value, "scheduleBelong");
            return (Criteria) this;
        }

        public Criteria andScheduleBelongLessThanOrEqualTo(Integer value) {
            addCriterion("schedule_belong <=", value, "scheduleBelong");
            return (Criteria) this;
        }

        public Criteria andScheduleBelongIn(List<Integer> values) {
            addCriterion("schedule_belong in", values, "scheduleBelong");
            return (Criteria) this;
        }

        public Criteria andScheduleBelongNotIn(List<Integer> values) {
            addCriterion("schedule_belong not in", values, "scheduleBelong");
            return (Criteria) this;
        }

        public Criteria andScheduleBelongBetween(Integer value1, Integer value2) {
            addCriterion("schedule_belong between", value1, value2, "scheduleBelong");
            return (Criteria) this;
        }

        public Criteria andScheduleBelongNotBetween(Integer value1, Integer value2) {
            addCriterion("schedule_belong not between", value1, value2, "scheduleBelong");
            return (Criteria) this;
        }

        public Criteria andScheduleNameIsNull() {
            addCriterion("schedule_name is null");
            return (Criteria) this;
        }

        public Criteria andScheduleNameIsNotNull() {
            addCriterion("schedule_name is not null");
            return (Criteria) this;
        }

        public Criteria andScheduleNameEqualTo(String value) {
            addCriterion("schedule_name =", value, "scheduleName");
            return (Criteria) this;
        }

        public Criteria andScheduleNameNotEqualTo(String value) {
            addCriterion("schedule_name <>", value, "scheduleName");
            return (Criteria) this;
        }

        public Criteria andScheduleNameGreaterThan(String value) {
            addCriterion("schedule_name >", value, "scheduleName");
            return (Criteria) this;
        }

        public Criteria andScheduleNameGreaterThanOrEqualTo(String value) {
            addCriterion("schedule_name >=", value, "scheduleName");
            return (Criteria) this;
        }

        public Criteria andScheduleNameLessThan(String value) {
            addCriterion("schedule_name <", value, "scheduleName");
            return (Criteria) this;
        }

        public Criteria andScheduleNameLessThanOrEqualTo(String value) {
            addCriterion("schedule_name <=", value, "scheduleName");
            return (Criteria) this;
        }

        public Criteria andScheduleNameLike(String value) {
            addCriterion("schedule_name like", value, "scheduleName");
            return (Criteria) this;
        }

        public Criteria andScheduleNameNotLike(String value) {
            addCriterion("schedule_name not like", value, "scheduleName");
            return (Criteria) this;
        }

        public Criteria andScheduleNameIn(List<String> values) {
            addCriterion("schedule_name in", values, "scheduleName");
            return (Criteria) this;
        }

        public Criteria andScheduleNameNotIn(List<String> values) {
            addCriterion("schedule_name not in", values, "scheduleName");
            return (Criteria) this;
        }

        public Criteria andScheduleNameBetween(String value1, String value2) {
            addCriterion("schedule_name between", value1, value2, "scheduleName");
            return (Criteria) this;
        }

        public Criteria andScheduleNameNotBetween(String value1, String value2) {
            addCriterion("schedule_name not between", value1, value2, "scheduleName");
            return (Criteria) this;
        }

        public Criteria andScheduleCompleteIsNull() {
            addCriterion("schedule_complete is null");
            return (Criteria) this;
        }

        public Criteria andScheduleCompleteIsNotNull() {
            addCriterion("schedule_complete is not null");
            return (Criteria) this;
        }

        public Criteria andScheduleCompleteEqualTo(Boolean value) {
            addCriterion("schedule_complete =", value, "scheduleComplete");
            return (Criteria) this;
        }

        public Criteria andScheduleCompleteNotEqualTo(Boolean value) {
            addCriterion("schedule_complete <>", value, "scheduleComplete");
            return (Criteria) this;
        }

        public Criteria andScheduleCompleteGreaterThan(Boolean value) {
            addCriterion("schedule_complete >", value, "scheduleComplete");
            return (Criteria) this;
        }

        public Criteria andScheduleCompleteGreaterThanOrEqualTo(Boolean value) {
            addCriterion("schedule_complete >=", value, "scheduleComplete");
            return (Criteria) this;
        }

        public Criteria andScheduleCompleteLessThan(Boolean value) {
            addCriterion("schedule_complete <", value, "scheduleComplete");
            return (Criteria) this;
        }

        public Criteria andScheduleCompleteLessThanOrEqualTo(Boolean value) {
            addCriterion("schedule_complete <=", value, "scheduleComplete");
            return (Criteria) this;
        }

        public Criteria andScheduleCompleteIn(List<Boolean> values) {
            addCriterion("schedule_complete in", values, "scheduleComplete");
            return (Criteria) this;
        }

        public Criteria andScheduleCompleteNotIn(List<Boolean> values) {
            addCriterion("schedule_complete not in", values, "scheduleComplete");
            return (Criteria) this;
        }

        public Criteria andScheduleCompleteBetween(Boolean value1, Boolean value2) {
            addCriterion("schedule_complete between", value1, value2, "scheduleComplete");
            return (Criteria) this;
        }

        public Criteria andScheduleCompleteNotBetween(Boolean value1, Boolean value2) {
            addCriterion("schedule_complete not between", value1, value2, "scheduleComplete");
            return (Criteria) this;
        }

        public Criteria andScheduleCreateIsNull() {
            addCriterion("schedule_create is null");
            return (Criteria) this;
        }

        public Criteria andScheduleCreateIsNotNull() {
            addCriterion("schedule_create is not null");
            return (Criteria) this;
        }

        public Criteria andScheduleCreateEqualTo(Integer value) {
            addCriterion("schedule_create =", value, "scheduleCreate");
            return (Criteria) this;
        }

        public Criteria andScheduleCreateNotEqualTo(Integer value) {
            addCriterion("schedule_create <>", value, "scheduleCreate");
            return (Criteria) this;
        }

        public Criteria andScheduleCreateGreaterThan(Integer value) {
            addCriterion("schedule_create >", value, "scheduleCreate");
            return (Criteria) this;
        }

        public Criteria andScheduleCreateGreaterThanOrEqualTo(Integer value) {
            addCriterion("schedule_create >=", value, "scheduleCreate");
            return (Criteria) this;
        }

        public Criteria andScheduleCreateLessThan(Integer value) {
            addCriterion("schedule_create <", value, "scheduleCreate");
            return (Criteria) this;
        }

        public Criteria andScheduleCreateLessThanOrEqualTo(Integer value) {
            addCriterion("schedule_create <=", value, "scheduleCreate");
            return (Criteria) this;
        }

        public Criteria andScheduleCreateIn(List<Integer> values) {
            addCriterion("schedule_create in", values, "scheduleCreate");
            return (Criteria) this;
        }

        public Criteria andScheduleCreateNotIn(List<Integer> values) {
            addCriterion("schedule_create not in", values, "scheduleCreate");
            return (Criteria) this;
        }

        public Criteria andScheduleCreateBetween(Integer value1, Integer value2) {
            addCriterion("schedule_create between", value1, value2, "scheduleCreate");
            return (Criteria) this;
        }

        public Criteria andScheduleCreateNotBetween(Integer value1, Integer value2) {
            addCriterion("schedule_create not between", value1, value2, "scheduleCreate");
            return (Criteria) this;
        }

        public Criteria andScheduleCreateDateIsNull() {
            addCriterion("schedule_create_date is null");
            return (Criteria) this;
        }

        public Criteria andScheduleCreateDateIsNotNull() {
            addCriterion("schedule_create_date is not null");
            return (Criteria) this;
        }

        public Criteria andScheduleCreateDateEqualTo(String value) {
            addCriterion("schedule_create_date =", value, "scheduleCreateDate");
            return (Criteria) this;
        }

        public Criteria andScheduleCreateDateNotEqualTo(String value) {
            addCriterion("schedule_create_date <>", value, "scheduleCreateDate");
            return (Criteria) this;
        }

        public Criteria andScheduleCreateDateGreaterThan(String value) {
            addCriterion("schedule_create_date >", value, "scheduleCreateDate");
            return (Criteria) this;
        }

        public Criteria andScheduleCreateDateGreaterThanOrEqualTo(String value) {
            addCriterion("schedule_create_date >=", value, "scheduleCreateDate");
            return (Criteria) this;
        }

        public Criteria andScheduleCreateDateLessThan(String value) {
            addCriterion("schedule_create_date <", value, "scheduleCreateDate");
            return (Criteria) this;
        }

        public Criteria andScheduleCreateDateLessThanOrEqualTo(String value) {
            addCriterion("schedule_create_date <=", value, "scheduleCreateDate");
            return (Criteria) this;
        }

        public Criteria andScheduleCreateDateLike(String value) {
            addCriterion("schedule_create_date like", value, "scheduleCreateDate");
            return (Criteria) this;
        }

        public Criteria andScheduleCreateDateNotLike(String value) {
            addCriterion("schedule_create_date not like", value, "scheduleCreateDate");
            return (Criteria) this;
        }

        public Criteria andScheduleCreateDateIn(List<String> values) {
            addCriterion("schedule_create_date in", values, "scheduleCreateDate");
            return (Criteria) this;
        }

        public Criteria andScheduleCreateDateNotIn(List<String> values) {
            addCriterion("schedule_create_date not in", values, "scheduleCreateDate");
            return (Criteria) this;
        }

        public Criteria andScheduleCreateDateBetween(String value1, String value2) {
            addCriterion("schedule_create_date between", value1, value2, "scheduleCreateDate");
            return (Criteria) this;
        }

        public Criteria andScheduleCreateDateNotBetween(String value1, String value2) {
            addCriterion("schedule_create_date not between", value1, value2, "scheduleCreateDate");
            return (Criteria) this;
        }

        public Criteria andScheduleModifyIsNull() {
            addCriterion("schedule_modify is null");
            return (Criteria) this;
        }

        public Criteria andScheduleModifyIsNotNull() {
            addCriterion("schedule_modify is not null");
            return (Criteria) this;
        }

        public Criteria andScheduleModifyEqualTo(Integer value) {
            addCriterion("schedule_modify =", value, "scheduleModify");
            return (Criteria) this;
        }

        public Criteria andScheduleModifyNotEqualTo(Integer value) {
            addCriterion("schedule_modify <>", value, "scheduleModify");
            return (Criteria) this;
        }

        public Criteria andScheduleModifyGreaterThan(Integer value) {
            addCriterion("schedule_modify >", value, "scheduleModify");
            return (Criteria) this;
        }

        public Criteria andScheduleModifyGreaterThanOrEqualTo(Integer value) {
            addCriterion("schedule_modify >=", value, "scheduleModify");
            return (Criteria) this;
        }

        public Criteria andScheduleModifyLessThan(Integer value) {
            addCriterion("schedule_modify <", value, "scheduleModify");
            return (Criteria) this;
        }

        public Criteria andScheduleModifyLessThanOrEqualTo(Integer value) {
            addCriterion("schedule_modify <=", value, "scheduleModify");
            return (Criteria) this;
        }

        public Criteria andScheduleModifyIn(List<Integer> values) {
            addCriterion("schedule_modify in", values, "scheduleModify");
            return (Criteria) this;
        }

        public Criteria andScheduleModifyNotIn(List<Integer> values) {
            addCriterion("schedule_modify not in", values, "scheduleModify");
            return (Criteria) this;
        }

        public Criteria andScheduleModifyBetween(Integer value1, Integer value2) {
            addCriterion("schedule_modify between", value1, value2, "scheduleModify");
            return (Criteria) this;
        }

        public Criteria andScheduleModifyNotBetween(Integer value1, Integer value2) {
            addCriterion("schedule_modify not between", value1, value2, "scheduleModify");
            return (Criteria) this;
        }

        public Criteria andScheduleModifyDateIsNull() {
            addCriterion("schedule_modify_date is null");
            return (Criteria) this;
        }

        public Criteria andScheduleModifyDateIsNotNull() {
            addCriterion("schedule_modify_date is not null");
            return (Criteria) this;
        }

        public Criteria andScheduleModifyDateEqualTo(String value) {
            addCriterion("schedule_modify_date =", value, "scheduleModifyDate");
            return (Criteria) this;
        }

        public Criteria andScheduleModifyDateNotEqualTo(String value) {
            addCriterion("schedule_modify_date <>", value, "scheduleModifyDate");
            return (Criteria) this;
        }

        public Criteria andScheduleModifyDateGreaterThan(String value) {
            addCriterion("schedule_modify_date >", value, "scheduleModifyDate");
            return (Criteria) this;
        }

        public Criteria andScheduleModifyDateGreaterThanOrEqualTo(String value) {
            addCriterion("schedule_modify_date >=", value, "scheduleModifyDate");
            return (Criteria) this;
        }

        public Criteria andScheduleModifyDateLessThan(String value) {
            addCriterion("schedule_modify_date <", value, "scheduleModifyDate");
            return (Criteria) this;
        }

        public Criteria andScheduleModifyDateLessThanOrEqualTo(String value) {
            addCriterion("schedule_modify_date <=", value, "scheduleModifyDate");
            return (Criteria) this;
        }

        public Criteria andScheduleModifyDateLike(String value) {
            addCriterion("schedule_modify_date like", value, "scheduleModifyDate");
            return (Criteria) this;
        }

        public Criteria andScheduleModifyDateNotLike(String value) {
            addCriterion("schedule_modify_date not like", value, "scheduleModifyDate");
            return (Criteria) this;
        }

        public Criteria andScheduleModifyDateIn(List<String> values) {
            addCriterion("schedule_modify_date in", values, "scheduleModifyDate");
            return (Criteria) this;
        }

        public Criteria andScheduleModifyDateNotIn(List<String> values) {
            addCriterion("schedule_modify_date not in", values, "scheduleModifyDate");
            return (Criteria) this;
        }

        public Criteria andScheduleModifyDateBetween(String value1, String value2) {
            addCriterion("schedule_modify_date between", value1, value2, "scheduleModifyDate");
            return (Criteria) this;
        }

        public Criteria andScheduleModifyDateNotBetween(String value1, String value2) {
            addCriterion("schedule_modify_date not between", value1, value2, "scheduleModifyDate");
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