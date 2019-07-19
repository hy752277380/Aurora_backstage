package cn.hy.aurora.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AurArticleLabelExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AurArticleLabelExample() {
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

        public Criteria andLabelIdIsNull() {
            addCriterion("label_id is null");
            return (Criteria) this;
        }

        public Criteria andLabelIdIsNotNull() {
            addCriterion("label_id is not null");
            return (Criteria) this;
        }

        public Criteria andLabelIdEqualTo(Integer value) {
            addCriterion("label_id =", value, "labelId");
            return (Criteria) this;
        }

        public Criteria andLabelIdNotEqualTo(Integer value) {
            addCriterion("label_id <>", value, "labelId");
            return (Criteria) this;
        }

        public Criteria andLabelIdGreaterThan(Integer value) {
            addCriterion("label_id >", value, "labelId");
            return (Criteria) this;
        }

        public Criteria andLabelIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("label_id >=", value, "labelId");
            return (Criteria) this;
        }

        public Criteria andLabelIdLessThan(Integer value) {
            addCriterion("label_id <", value, "labelId");
            return (Criteria) this;
        }

        public Criteria andLabelIdLessThanOrEqualTo(Integer value) {
            addCriterion("label_id <=", value, "labelId");
            return (Criteria) this;
        }

        public Criteria andLabelIdIn(List<Integer> values) {
            addCriterion("label_id in", values, "labelId");
            return (Criteria) this;
        }

        public Criteria andLabelIdNotIn(List<Integer> values) {
            addCriterion("label_id not in", values, "labelId");
            return (Criteria) this;
        }

        public Criteria andLabelIdBetween(Integer value1, Integer value2) {
            addCriterion("label_id between", value1, value2, "labelId");
            return (Criteria) this;
        }

        public Criteria andLabelIdNotBetween(Integer value1, Integer value2) {
            addCriterion("label_id not between", value1, value2, "labelId");
            return (Criteria) this;
        }

        public Criteria andLabelNameIsNull() {
            addCriterion("label_name is null");
            return (Criteria) this;
        }

        public Criteria andLabelNameIsNotNull() {
            addCriterion("label_name is not null");
            return (Criteria) this;
        }

        public Criteria andLabelNameEqualTo(String value) {
            addCriterion("label_name =", value, "labelName");
            return (Criteria) this;
        }

        public Criteria andLabelNameNotEqualTo(String value) {
            addCriterion("label_name <>", value, "labelName");
            return (Criteria) this;
        }

        public Criteria andLabelNameGreaterThan(String value) {
            addCriterion("label_name >", value, "labelName");
            return (Criteria) this;
        }

        public Criteria andLabelNameGreaterThanOrEqualTo(String value) {
            addCriterion("label_name >=", value, "labelName");
            return (Criteria) this;
        }

        public Criteria andLabelNameLessThan(String value) {
            addCriterion("label_name <", value, "labelName");
            return (Criteria) this;
        }

        public Criteria andLabelNameLessThanOrEqualTo(String value) {
            addCriterion("label_name <=", value, "labelName");
            return (Criteria) this;
        }

        public Criteria andLabelNameLike(String value) {
            addCriterion("label_name like", value, "labelName");
            return (Criteria) this;
        }

        public Criteria andLabelNameNotLike(String value) {
            addCriterion("label_name not like", value, "labelName");
            return (Criteria) this;
        }

        public Criteria andLabelNameIn(List<String> values) {
            addCriterion("label_name in", values, "labelName");
            return (Criteria) this;
        }

        public Criteria andLabelNameNotIn(List<String> values) {
            addCriterion("label_name not in", values, "labelName");
            return (Criteria) this;
        }

        public Criteria andLabelNameBetween(String value1, String value2) {
            addCriterion("label_name between", value1, value2, "labelName");
            return (Criteria) this;
        }

        public Criteria andLabelNameNotBetween(String value1, String value2) {
            addCriterion("label_name not between", value1, value2, "labelName");
            return (Criteria) this;
        }

        public Criteria andLabelDescriptionIsNull() {
            addCriterion("label_description is null");
            return (Criteria) this;
        }

        public Criteria andLabelDescriptionIsNotNull() {
            addCriterion("label_description is not null");
            return (Criteria) this;
        }

        public Criteria andLabelDescriptionEqualTo(String value) {
            addCriterion("label_description =", value, "labelDescription");
            return (Criteria) this;
        }

        public Criteria andLabelDescriptionNotEqualTo(String value) {
            addCriterion("label_description <>", value, "labelDescription");
            return (Criteria) this;
        }

        public Criteria andLabelDescriptionGreaterThan(String value) {
            addCriterion("label_description >", value, "labelDescription");
            return (Criteria) this;
        }

        public Criteria andLabelDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("label_description >=", value, "labelDescription");
            return (Criteria) this;
        }

        public Criteria andLabelDescriptionLessThan(String value) {
            addCriterion("label_description <", value, "labelDescription");
            return (Criteria) this;
        }

        public Criteria andLabelDescriptionLessThanOrEqualTo(String value) {
            addCriterion("label_description <=", value, "labelDescription");
            return (Criteria) this;
        }

        public Criteria andLabelDescriptionLike(String value) {
            addCriterion("label_description like", value, "labelDescription");
            return (Criteria) this;
        }

        public Criteria andLabelDescriptionNotLike(String value) {
            addCriterion("label_description not like", value, "labelDescription");
            return (Criteria) this;
        }

        public Criteria andLabelDescriptionIn(List<String> values) {
            addCriterion("label_description in", values, "labelDescription");
            return (Criteria) this;
        }

        public Criteria andLabelDescriptionNotIn(List<String> values) {
            addCriterion("label_description not in", values, "labelDescription");
            return (Criteria) this;
        }

        public Criteria andLabelDescriptionBetween(String value1, String value2) {
            addCriterion("label_description between", value1, value2, "labelDescription");
            return (Criteria) this;
        }

        public Criteria andLabelDescriptionNotBetween(String value1, String value2) {
            addCriterion("label_description not between", value1, value2, "labelDescription");
            return (Criteria) this;
        }

        public Criteria andLabelCreateIsNull() {
            addCriterion("label_create is null");
            return (Criteria) this;
        }

        public Criteria andLabelCreateIsNotNull() {
            addCriterion("label_create is not null");
            return (Criteria) this;
        }

        public Criteria andLabelCreateEqualTo(Integer value) {
            addCriterion("label_create =", value, "labelCreate");
            return (Criteria) this;
        }

        public Criteria andLabelCreateNotEqualTo(Integer value) {
            addCriterion("label_create <>", value, "labelCreate");
            return (Criteria) this;
        }

        public Criteria andLabelCreateGreaterThan(Integer value) {
            addCriterion("label_create >", value, "labelCreate");
            return (Criteria) this;
        }

        public Criteria andLabelCreateGreaterThanOrEqualTo(Integer value) {
            addCriterion("label_create >=", value, "labelCreate");
            return (Criteria) this;
        }

        public Criteria andLabelCreateLessThan(Integer value) {
            addCriterion("label_create <", value, "labelCreate");
            return (Criteria) this;
        }

        public Criteria andLabelCreateLessThanOrEqualTo(Integer value) {
            addCriterion("label_create <=", value, "labelCreate");
            return (Criteria) this;
        }

        public Criteria andLabelCreateIn(List<Integer> values) {
            addCriterion("label_create in", values, "labelCreate");
            return (Criteria) this;
        }

        public Criteria andLabelCreateNotIn(List<Integer> values) {
            addCriterion("label_create not in", values, "labelCreate");
            return (Criteria) this;
        }

        public Criteria andLabelCreateBetween(Integer value1, Integer value2) {
            addCriterion("label_create between", value1, value2, "labelCreate");
            return (Criteria) this;
        }

        public Criteria andLabelCreateNotBetween(Integer value1, Integer value2) {
            addCriterion("label_create not between", value1, value2, "labelCreate");
            return (Criteria) this;
        }

        public Criteria andLabelCreateTimeIsNull() {
            addCriterion("label_create_time is null");
            return (Criteria) this;
        }

        public Criteria andLabelCreateTimeIsNotNull() {
            addCriterion("label_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andLabelCreateTimeEqualTo(Date value) {
            addCriterion("label_create_time =", value, "labelCreateTime");
            return (Criteria) this;
        }

        public Criteria andLabelCreateTimeNotEqualTo(Date value) {
            addCriterion("label_create_time <>", value, "labelCreateTime");
            return (Criteria) this;
        }

        public Criteria andLabelCreateTimeGreaterThan(Date value) {
            addCriterion("label_create_time >", value, "labelCreateTime");
            return (Criteria) this;
        }

        public Criteria andLabelCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("label_create_time >=", value, "labelCreateTime");
            return (Criteria) this;
        }

        public Criteria andLabelCreateTimeLessThan(Date value) {
            addCriterion("label_create_time <", value, "labelCreateTime");
            return (Criteria) this;
        }

        public Criteria andLabelCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("label_create_time <=", value, "labelCreateTime");
            return (Criteria) this;
        }

        public Criteria andLabelCreateTimeIn(List<Date> values) {
            addCriterion("label_create_time in", values, "labelCreateTime");
            return (Criteria) this;
        }

        public Criteria andLabelCreateTimeNotIn(List<Date> values) {
            addCriterion("label_create_time not in", values, "labelCreateTime");
            return (Criteria) this;
        }

        public Criteria andLabelCreateTimeBetween(Date value1, Date value2) {
            addCriterion("label_create_time between", value1, value2, "labelCreateTime");
            return (Criteria) this;
        }

        public Criteria andLabelCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("label_create_time not between", value1, value2, "labelCreateTime");
            return (Criteria) this;
        }

        public Criteria andLabelUpdateIsNull() {
            addCriterion("label_update is null");
            return (Criteria) this;
        }

        public Criteria andLabelUpdateIsNotNull() {
            addCriterion("label_update is not null");
            return (Criteria) this;
        }

        public Criteria andLabelUpdateEqualTo(Integer value) {
            addCriterion("label_update =", value, "labelUpdate");
            return (Criteria) this;
        }

        public Criteria andLabelUpdateNotEqualTo(Integer value) {
            addCriterion("label_update <>", value, "labelUpdate");
            return (Criteria) this;
        }

        public Criteria andLabelUpdateGreaterThan(Integer value) {
            addCriterion("label_update >", value, "labelUpdate");
            return (Criteria) this;
        }

        public Criteria andLabelUpdateGreaterThanOrEqualTo(Integer value) {
            addCriterion("label_update >=", value, "labelUpdate");
            return (Criteria) this;
        }

        public Criteria andLabelUpdateLessThan(Integer value) {
            addCriterion("label_update <", value, "labelUpdate");
            return (Criteria) this;
        }

        public Criteria andLabelUpdateLessThanOrEqualTo(Integer value) {
            addCriterion("label_update <=", value, "labelUpdate");
            return (Criteria) this;
        }

        public Criteria andLabelUpdateIn(List<Integer> values) {
            addCriterion("label_update in", values, "labelUpdate");
            return (Criteria) this;
        }

        public Criteria andLabelUpdateNotIn(List<Integer> values) {
            addCriterion("label_update not in", values, "labelUpdate");
            return (Criteria) this;
        }

        public Criteria andLabelUpdateBetween(Integer value1, Integer value2) {
            addCriterion("label_update between", value1, value2, "labelUpdate");
            return (Criteria) this;
        }

        public Criteria andLabelUpdateNotBetween(Integer value1, Integer value2) {
            addCriterion("label_update not between", value1, value2, "labelUpdate");
            return (Criteria) this;
        }

        public Criteria andLabelUpdateTmeIsNull() {
            addCriterion("label_update_tme is null");
            return (Criteria) this;
        }

        public Criteria andLabelUpdateTmeIsNotNull() {
            addCriterion("label_update_tme is not null");
            return (Criteria) this;
        }

        public Criteria andLabelUpdateTmeEqualTo(Date value) {
            addCriterion("label_update_tme =", value, "labelUpdateTme");
            return (Criteria) this;
        }

        public Criteria andLabelUpdateTmeNotEqualTo(Date value) {
            addCriterion("label_update_tme <>", value, "labelUpdateTme");
            return (Criteria) this;
        }

        public Criteria andLabelUpdateTmeGreaterThan(Date value) {
            addCriterion("label_update_tme >", value, "labelUpdateTme");
            return (Criteria) this;
        }

        public Criteria andLabelUpdateTmeGreaterThanOrEqualTo(Date value) {
            addCriterion("label_update_tme >=", value, "labelUpdateTme");
            return (Criteria) this;
        }

        public Criteria andLabelUpdateTmeLessThan(Date value) {
            addCriterion("label_update_tme <", value, "labelUpdateTme");
            return (Criteria) this;
        }

        public Criteria andLabelUpdateTmeLessThanOrEqualTo(Date value) {
            addCriterion("label_update_tme <=", value, "labelUpdateTme");
            return (Criteria) this;
        }

        public Criteria andLabelUpdateTmeIn(List<Date> values) {
            addCriterion("label_update_tme in", values, "labelUpdateTme");
            return (Criteria) this;
        }

        public Criteria andLabelUpdateTmeNotIn(List<Date> values) {
            addCriterion("label_update_tme not in", values, "labelUpdateTme");
            return (Criteria) this;
        }

        public Criteria andLabelUpdateTmeBetween(Date value1, Date value2) {
            addCriterion("label_update_tme between", value1, value2, "labelUpdateTme");
            return (Criteria) this;
        }

        public Criteria andLabelUpdateTmeNotBetween(Date value1, Date value2) {
            addCriterion("label_update_tme not between", value1, value2, "labelUpdateTme");
            return (Criteria) this;
        }

        public Criteria andLabelParentIsNull() {
            addCriterion("label_parent is null");
            return (Criteria) this;
        }

        public Criteria andLabelParentIsNotNull() {
            addCriterion("label_parent is not null");
            return (Criteria) this;
        }

        public Criteria andLabelParentEqualTo(Integer value) {
            addCriterion("label_parent =", value, "labelParent");
            return (Criteria) this;
        }

        public Criteria andLabelParentNotEqualTo(Integer value) {
            addCriterion("label_parent <>", value, "labelParent");
            return (Criteria) this;
        }

        public Criteria andLabelParentGreaterThan(Integer value) {
            addCriterion("label_parent >", value, "labelParent");
            return (Criteria) this;
        }

        public Criteria andLabelParentGreaterThanOrEqualTo(Integer value) {
            addCriterion("label_parent >=", value, "labelParent");
            return (Criteria) this;
        }

        public Criteria andLabelParentLessThan(Integer value) {
            addCriterion("label_parent <", value, "labelParent");
            return (Criteria) this;
        }

        public Criteria andLabelParentLessThanOrEqualTo(Integer value) {
            addCriterion("label_parent <=", value, "labelParent");
            return (Criteria) this;
        }

        public Criteria andLabelParentIn(List<Integer> values) {
            addCriterion("label_parent in", values, "labelParent");
            return (Criteria) this;
        }

        public Criteria andLabelParentNotIn(List<Integer> values) {
            addCriterion("label_parent not in", values, "labelParent");
            return (Criteria) this;
        }

        public Criteria andLabelParentBetween(Integer value1, Integer value2) {
            addCriterion("label_parent between", value1, value2, "labelParent");
            return (Criteria) this;
        }

        public Criteria andLabelParentNotBetween(Integer value1, Integer value2) {
            addCriterion("label_parent not between", value1, value2, "labelParent");
            return (Criteria) this;
        }

        public Criteria andLabelDeletedIsNull() {
            addCriterion("label_deleted is null");
            return (Criteria) this;
        }

        public Criteria andLabelDeletedIsNotNull() {
            addCriterion("label_deleted is not null");
            return (Criteria) this;
        }

        public Criteria andLabelDeletedEqualTo(Boolean value) {
            addCriterion("label_deleted =", value, "labelDeleted");
            return (Criteria) this;
        }

        public Criteria andLabelDeletedNotEqualTo(Boolean value) {
            addCriterion("label_deleted <>", value, "labelDeleted");
            return (Criteria) this;
        }

        public Criteria andLabelDeletedGreaterThan(Boolean value) {
            addCriterion("label_deleted >", value, "labelDeleted");
            return (Criteria) this;
        }

        public Criteria andLabelDeletedGreaterThanOrEqualTo(Boolean value) {
            addCriterion("label_deleted >=", value, "labelDeleted");
            return (Criteria) this;
        }

        public Criteria andLabelDeletedLessThan(Boolean value) {
            addCriterion("label_deleted <", value, "labelDeleted");
            return (Criteria) this;
        }

        public Criteria andLabelDeletedLessThanOrEqualTo(Boolean value) {
            addCriterion("label_deleted <=", value, "labelDeleted");
            return (Criteria) this;
        }

        public Criteria andLabelDeletedIn(List<Boolean> values) {
            addCriterion("label_deleted in", values, "labelDeleted");
            return (Criteria) this;
        }

        public Criteria andLabelDeletedNotIn(List<Boolean> values) {
            addCriterion("label_deleted not in", values, "labelDeleted");
            return (Criteria) this;
        }

        public Criteria andLabelDeletedBetween(Boolean value1, Boolean value2) {
            addCriterion("label_deleted between", value1, value2, "labelDeleted");
            return (Criteria) this;
        }

        public Criteria andLabelDeletedNotBetween(Boolean value1, Boolean value2) {
            addCriterion("label_deleted not between", value1, value2, "labelDeleted");
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