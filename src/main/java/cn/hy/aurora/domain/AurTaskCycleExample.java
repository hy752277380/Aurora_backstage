package cn.hy.aurora.domain;

import java.util.ArrayList;
import java.util.List;

public class AurTaskCycleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AurTaskCycleExample() {
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

        public Criteria andCycleIdIsNull() {
            addCriterion("cycle_id is null");
            return (Criteria) this;
        }

        public Criteria andCycleIdIsNotNull() {
            addCriterion("cycle_id is not null");
            return (Criteria) this;
        }

        public Criteria andCycleIdEqualTo(Integer value) {
            addCriterion("cycle_id =", value, "cycleId");
            return (Criteria) this;
        }

        public Criteria andCycleIdNotEqualTo(Integer value) {
            addCriterion("cycle_id <>", value, "cycleId");
            return (Criteria) this;
        }

        public Criteria andCycleIdGreaterThan(Integer value) {
            addCriterion("cycle_id >", value, "cycleId");
            return (Criteria) this;
        }

        public Criteria andCycleIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("cycle_id >=", value, "cycleId");
            return (Criteria) this;
        }

        public Criteria andCycleIdLessThan(Integer value) {
            addCriterion("cycle_id <", value, "cycleId");
            return (Criteria) this;
        }

        public Criteria andCycleIdLessThanOrEqualTo(Integer value) {
            addCriterion("cycle_id <=", value, "cycleId");
            return (Criteria) this;
        }

        public Criteria andCycleIdIn(List<Integer> values) {
            addCriterion("cycle_id in", values, "cycleId");
            return (Criteria) this;
        }

        public Criteria andCycleIdNotIn(List<Integer> values) {
            addCriterion("cycle_id not in", values, "cycleId");
            return (Criteria) this;
        }

        public Criteria andCycleIdBetween(Integer value1, Integer value2) {
            addCriterion("cycle_id between", value1, value2, "cycleId");
            return (Criteria) this;
        }

        public Criteria andCycleIdNotBetween(Integer value1, Integer value2) {
            addCriterion("cycle_id not between", value1, value2, "cycleId");
            return (Criteria) this;
        }

        public Criteria andCycleNameIsNull() {
            addCriterion("cycle_name is null");
            return (Criteria) this;
        }

        public Criteria andCycleNameIsNotNull() {
            addCriterion("cycle_name is not null");
            return (Criteria) this;
        }

        public Criteria andCycleNameEqualTo(String value) {
            addCriterion("cycle_name =", value, "cycleName");
            return (Criteria) this;
        }

        public Criteria andCycleNameNotEqualTo(String value) {
            addCriterion("cycle_name <>", value, "cycleName");
            return (Criteria) this;
        }

        public Criteria andCycleNameGreaterThan(String value) {
            addCriterion("cycle_name >", value, "cycleName");
            return (Criteria) this;
        }

        public Criteria andCycleNameGreaterThanOrEqualTo(String value) {
            addCriterion("cycle_name >=", value, "cycleName");
            return (Criteria) this;
        }

        public Criteria andCycleNameLessThan(String value) {
            addCriterion("cycle_name <", value, "cycleName");
            return (Criteria) this;
        }

        public Criteria andCycleNameLessThanOrEqualTo(String value) {
            addCriterion("cycle_name <=", value, "cycleName");
            return (Criteria) this;
        }

        public Criteria andCycleNameLike(String value) {
            addCriterion("cycle_name like", value, "cycleName");
            return (Criteria) this;
        }

        public Criteria andCycleNameNotLike(String value) {
            addCriterion("cycle_name not like", value, "cycleName");
            return (Criteria) this;
        }

        public Criteria andCycleNameIn(List<String> values) {
            addCriterion("cycle_name in", values, "cycleName");
            return (Criteria) this;
        }

        public Criteria andCycleNameNotIn(List<String> values) {
            addCriterion("cycle_name not in", values, "cycleName");
            return (Criteria) this;
        }

        public Criteria andCycleNameBetween(String value1, String value2) {
            addCriterion("cycle_name between", value1, value2, "cycleName");
            return (Criteria) this;
        }

        public Criteria andCycleNameNotBetween(String value1, String value2) {
            addCriterion("cycle_name not between", value1, value2, "cycleName");
            return (Criteria) this;
        }

        public Criteria andCycleCronIsNull() {
            addCriterion("cycle_cron is null");
            return (Criteria) this;
        }

        public Criteria andCycleCronIsNotNull() {
            addCriterion("cycle_cron is not null");
            return (Criteria) this;
        }

        public Criteria andCycleCronEqualTo(String value) {
            addCriterion("cycle_cron =", value, "cycleCron");
            return (Criteria) this;
        }

        public Criteria andCycleCronNotEqualTo(String value) {
            addCriterion("cycle_cron <>", value, "cycleCron");
            return (Criteria) this;
        }

        public Criteria andCycleCronGreaterThan(String value) {
            addCriterion("cycle_cron >", value, "cycleCron");
            return (Criteria) this;
        }

        public Criteria andCycleCronGreaterThanOrEqualTo(String value) {
            addCriterion("cycle_cron >=", value, "cycleCron");
            return (Criteria) this;
        }

        public Criteria andCycleCronLessThan(String value) {
            addCriterion("cycle_cron <", value, "cycleCron");
            return (Criteria) this;
        }

        public Criteria andCycleCronLessThanOrEqualTo(String value) {
            addCriterion("cycle_cron <=", value, "cycleCron");
            return (Criteria) this;
        }

        public Criteria andCycleCronLike(String value) {
            addCriterion("cycle_cron like", value, "cycleCron");
            return (Criteria) this;
        }

        public Criteria andCycleCronNotLike(String value) {
            addCriterion("cycle_cron not like", value, "cycleCron");
            return (Criteria) this;
        }

        public Criteria andCycleCronIn(List<String> values) {
            addCriterion("cycle_cron in", values, "cycleCron");
            return (Criteria) this;
        }

        public Criteria andCycleCronNotIn(List<String> values) {
            addCriterion("cycle_cron not in", values, "cycleCron");
            return (Criteria) this;
        }

        public Criteria andCycleCronBetween(String value1, String value2) {
            addCriterion("cycle_cron between", value1, value2, "cycleCron");
            return (Criteria) this;
        }

        public Criteria andCycleCronNotBetween(String value1, String value2) {
            addCriterion("cycle_cron not between", value1, value2, "cycleCron");
            return (Criteria) this;
        }

        public Criteria andCycleCreateIsNull() {
            addCriterion("cycle_create is null");
            return (Criteria) this;
        }

        public Criteria andCycleCreateIsNotNull() {
            addCriterion("cycle_create is not null");
            return (Criteria) this;
        }

        public Criteria andCycleCreateEqualTo(Integer value) {
            addCriterion("cycle_create =", value, "cycleCreate");
            return (Criteria) this;
        }

        public Criteria andCycleCreateNotEqualTo(Integer value) {
            addCriterion("cycle_create <>", value, "cycleCreate");
            return (Criteria) this;
        }

        public Criteria andCycleCreateGreaterThan(Integer value) {
            addCriterion("cycle_create >", value, "cycleCreate");
            return (Criteria) this;
        }

        public Criteria andCycleCreateGreaterThanOrEqualTo(Integer value) {
            addCriterion("cycle_create >=", value, "cycleCreate");
            return (Criteria) this;
        }

        public Criteria andCycleCreateLessThan(Integer value) {
            addCriterion("cycle_create <", value, "cycleCreate");
            return (Criteria) this;
        }

        public Criteria andCycleCreateLessThanOrEqualTo(Integer value) {
            addCriterion("cycle_create <=", value, "cycleCreate");
            return (Criteria) this;
        }

        public Criteria andCycleCreateIn(List<Integer> values) {
            addCriterion("cycle_create in", values, "cycleCreate");
            return (Criteria) this;
        }

        public Criteria andCycleCreateNotIn(List<Integer> values) {
            addCriterion("cycle_create not in", values, "cycleCreate");
            return (Criteria) this;
        }

        public Criteria andCycleCreateBetween(Integer value1, Integer value2) {
            addCriterion("cycle_create between", value1, value2, "cycleCreate");
            return (Criteria) this;
        }

        public Criteria andCycleCreateNotBetween(Integer value1, Integer value2) {
            addCriterion("cycle_create not between", value1, value2, "cycleCreate");
            return (Criteria) this;
        }

        public Criteria andCycleCreateDateIsNull() {
            addCriterion("cycle_create_date is null");
            return (Criteria) this;
        }

        public Criteria andCycleCreateDateIsNotNull() {
            addCriterion("cycle_create_date is not null");
            return (Criteria) this;
        }

        public Criteria andCycleCreateDateEqualTo(String value) {
            addCriterion("cycle_create_date =", value, "cycleCreateDate");
            return (Criteria) this;
        }

        public Criteria andCycleCreateDateNotEqualTo(String value) {
            addCriterion("cycle_create_date <>", value, "cycleCreateDate");
            return (Criteria) this;
        }

        public Criteria andCycleCreateDateGreaterThan(String value) {
            addCriterion("cycle_create_date >", value, "cycleCreateDate");
            return (Criteria) this;
        }

        public Criteria andCycleCreateDateGreaterThanOrEqualTo(String value) {
            addCriterion("cycle_create_date >=", value, "cycleCreateDate");
            return (Criteria) this;
        }

        public Criteria andCycleCreateDateLessThan(String value) {
            addCriterion("cycle_create_date <", value, "cycleCreateDate");
            return (Criteria) this;
        }

        public Criteria andCycleCreateDateLessThanOrEqualTo(String value) {
            addCriterion("cycle_create_date <=", value, "cycleCreateDate");
            return (Criteria) this;
        }

        public Criteria andCycleCreateDateLike(String value) {
            addCriterion("cycle_create_date like", value, "cycleCreateDate");
            return (Criteria) this;
        }

        public Criteria andCycleCreateDateNotLike(String value) {
            addCriterion("cycle_create_date not like", value, "cycleCreateDate");
            return (Criteria) this;
        }

        public Criteria andCycleCreateDateIn(List<String> values) {
            addCriterion("cycle_create_date in", values, "cycleCreateDate");
            return (Criteria) this;
        }

        public Criteria andCycleCreateDateNotIn(List<String> values) {
            addCriterion("cycle_create_date not in", values, "cycleCreateDate");
            return (Criteria) this;
        }

        public Criteria andCycleCreateDateBetween(String value1, String value2) {
            addCriterion("cycle_create_date between", value1, value2, "cycleCreateDate");
            return (Criteria) this;
        }

        public Criteria andCycleCreateDateNotBetween(String value1, String value2) {
            addCriterion("cycle_create_date not between", value1, value2, "cycleCreateDate");
            return (Criteria) this;
        }

        public Criteria andCycleModifyIsNull() {
            addCriterion("cycle_modify is null");
            return (Criteria) this;
        }

        public Criteria andCycleModifyIsNotNull() {
            addCriterion("cycle_modify is not null");
            return (Criteria) this;
        }

        public Criteria andCycleModifyEqualTo(Integer value) {
            addCriterion("cycle_modify =", value, "cycleModify");
            return (Criteria) this;
        }

        public Criteria andCycleModifyNotEqualTo(Integer value) {
            addCriterion("cycle_modify <>", value, "cycleModify");
            return (Criteria) this;
        }

        public Criteria andCycleModifyGreaterThan(Integer value) {
            addCriterion("cycle_modify >", value, "cycleModify");
            return (Criteria) this;
        }

        public Criteria andCycleModifyGreaterThanOrEqualTo(Integer value) {
            addCriterion("cycle_modify >=", value, "cycleModify");
            return (Criteria) this;
        }

        public Criteria andCycleModifyLessThan(Integer value) {
            addCriterion("cycle_modify <", value, "cycleModify");
            return (Criteria) this;
        }

        public Criteria andCycleModifyLessThanOrEqualTo(Integer value) {
            addCriterion("cycle_modify <=", value, "cycleModify");
            return (Criteria) this;
        }

        public Criteria andCycleModifyIn(List<Integer> values) {
            addCriterion("cycle_modify in", values, "cycleModify");
            return (Criteria) this;
        }

        public Criteria andCycleModifyNotIn(List<Integer> values) {
            addCriterion("cycle_modify not in", values, "cycleModify");
            return (Criteria) this;
        }

        public Criteria andCycleModifyBetween(Integer value1, Integer value2) {
            addCriterion("cycle_modify between", value1, value2, "cycleModify");
            return (Criteria) this;
        }

        public Criteria andCycleModifyNotBetween(Integer value1, Integer value2) {
            addCriterion("cycle_modify not between", value1, value2, "cycleModify");
            return (Criteria) this;
        }

        public Criteria andCycleModifyDateIsNull() {
            addCriterion("cycle_modify_date is null");
            return (Criteria) this;
        }

        public Criteria andCycleModifyDateIsNotNull() {
            addCriterion("cycle_modify_date is not null");
            return (Criteria) this;
        }

        public Criteria andCycleModifyDateEqualTo(String value) {
            addCriterion("cycle_modify_date =", value, "cycleModifyDate");
            return (Criteria) this;
        }

        public Criteria andCycleModifyDateNotEqualTo(String value) {
            addCriterion("cycle_modify_date <>", value, "cycleModifyDate");
            return (Criteria) this;
        }

        public Criteria andCycleModifyDateGreaterThan(String value) {
            addCriterion("cycle_modify_date >", value, "cycleModifyDate");
            return (Criteria) this;
        }

        public Criteria andCycleModifyDateGreaterThanOrEqualTo(String value) {
            addCriterion("cycle_modify_date >=", value, "cycleModifyDate");
            return (Criteria) this;
        }

        public Criteria andCycleModifyDateLessThan(String value) {
            addCriterion("cycle_modify_date <", value, "cycleModifyDate");
            return (Criteria) this;
        }

        public Criteria andCycleModifyDateLessThanOrEqualTo(String value) {
            addCriterion("cycle_modify_date <=", value, "cycleModifyDate");
            return (Criteria) this;
        }

        public Criteria andCycleModifyDateLike(String value) {
            addCriterion("cycle_modify_date like", value, "cycleModifyDate");
            return (Criteria) this;
        }

        public Criteria andCycleModifyDateNotLike(String value) {
            addCriterion("cycle_modify_date not like", value, "cycleModifyDate");
            return (Criteria) this;
        }

        public Criteria andCycleModifyDateIn(List<String> values) {
            addCriterion("cycle_modify_date in", values, "cycleModifyDate");
            return (Criteria) this;
        }

        public Criteria andCycleModifyDateNotIn(List<String> values) {
            addCriterion("cycle_modify_date not in", values, "cycleModifyDate");
            return (Criteria) this;
        }

        public Criteria andCycleModifyDateBetween(String value1, String value2) {
            addCriterion("cycle_modify_date between", value1, value2, "cycleModifyDate");
            return (Criteria) this;
        }

        public Criteria andCycleModifyDateNotBetween(String value1, String value2) {
            addCriterion("cycle_modify_date not between", value1, value2, "cycleModifyDate");
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