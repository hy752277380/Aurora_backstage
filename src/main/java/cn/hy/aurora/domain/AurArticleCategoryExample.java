package cn.hy.aurora.domain;

import java.util.ArrayList;
import java.util.List;

public class AurArticleCategoryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AurArticleCategoryExample() {
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

        public Criteria andCategoryIdIsNull() {
            addCriterion("category_id is null");
            return (Criteria) this;
        }

        public Criteria andCategoryIdIsNotNull() {
            addCriterion("category_id is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryIdEqualTo(Integer value) {
            addCriterion("category_id =", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdNotEqualTo(Integer value) {
            addCriterion("category_id <>", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdGreaterThan(Integer value) {
            addCriterion("category_id >", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("category_id >=", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdLessThan(Integer value) {
            addCriterion("category_id <", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdLessThanOrEqualTo(Integer value) {
            addCriterion("category_id <=", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdIn(List<Integer> values) {
            addCriterion("category_id in", values, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdNotIn(List<Integer> values) {
            addCriterion("category_id not in", values, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdBetween(Integer value1, Integer value2) {
            addCriterion("category_id between", value1, value2, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdNotBetween(Integer value1, Integer value2) {
            addCriterion("category_id not between", value1, value2, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryParentIsNull() {
            addCriterion("category_parent is null");
            return (Criteria) this;
        }

        public Criteria andCategoryParentIsNotNull() {
            addCriterion("category_parent is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryParentEqualTo(Integer value) {
            addCriterion("category_parent =", value, "categoryParent");
            return (Criteria) this;
        }

        public Criteria andCategoryParentNotEqualTo(Integer value) {
            addCriterion("category_parent <>", value, "categoryParent");
            return (Criteria) this;
        }

        public Criteria andCategoryParentGreaterThan(Integer value) {
            addCriterion("category_parent >", value, "categoryParent");
            return (Criteria) this;
        }

        public Criteria andCategoryParentGreaterThanOrEqualTo(Integer value) {
            addCriterion("category_parent >=", value, "categoryParent");
            return (Criteria) this;
        }

        public Criteria andCategoryParentLessThan(Integer value) {
            addCriterion("category_parent <", value, "categoryParent");
            return (Criteria) this;
        }

        public Criteria andCategoryParentLessThanOrEqualTo(Integer value) {
            addCriterion("category_parent <=", value, "categoryParent");
            return (Criteria) this;
        }

        public Criteria andCategoryParentIn(List<Integer> values) {
            addCriterion("category_parent in", values, "categoryParent");
            return (Criteria) this;
        }

        public Criteria andCategoryParentNotIn(List<Integer> values) {
            addCriterion("category_parent not in", values, "categoryParent");
            return (Criteria) this;
        }

        public Criteria andCategoryParentBetween(Integer value1, Integer value2) {
            addCriterion("category_parent between", value1, value2, "categoryParent");
            return (Criteria) this;
        }

        public Criteria andCategoryParentNotBetween(Integer value1, Integer value2) {
            addCriterion("category_parent not between", value1, value2, "categoryParent");
            return (Criteria) this;
        }

        public Criteria andCategoryNameIsNull() {
            addCriterion("category_name is null");
            return (Criteria) this;
        }

        public Criteria andCategoryNameIsNotNull() {
            addCriterion("category_name is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryNameEqualTo(String value) {
            addCriterion("category_name =", value, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryNameNotEqualTo(String value) {
            addCriterion("category_name <>", value, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryNameGreaterThan(String value) {
            addCriterion("category_name >", value, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryNameGreaterThanOrEqualTo(String value) {
            addCriterion("category_name >=", value, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryNameLessThan(String value) {
            addCriterion("category_name <", value, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryNameLessThanOrEqualTo(String value) {
            addCriterion("category_name <=", value, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryNameLike(String value) {
            addCriterion("category_name like", value, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryNameNotLike(String value) {
            addCriterion("category_name not like", value, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryNameIn(List<String> values) {
            addCriterion("category_name in", values, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryNameNotIn(List<String> values) {
            addCriterion("category_name not in", values, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryNameBetween(String value1, String value2) {
            addCriterion("category_name between", value1, value2, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryNameNotBetween(String value1, String value2) {
            addCriterion("category_name not between", value1, value2, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryCreateIsNull() {
            addCriterion("category_create is null");
            return (Criteria) this;
        }

        public Criteria andCategoryCreateIsNotNull() {
            addCriterion("category_create is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryCreateEqualTo(Integer value) {
            addCriterion("category_create =", value, "categoryCreate");
            return (Criteria) this;
        }

        public Criteria andCategoryCreateNotEqualTo(Integer value) {
            addCriterion("category_create <>", value, "categoryCreate");
            return (Criteria) this;
        }

        public Criteria andCategoryCreateGreaterThan(Integer value) {
            addCriterion("category_create >", value, "categoryCreate");
            return (Criteria) this;
        }

        public Criteria andCategoryCreateGreaterThanOrEqualTo(Integer value) {
            addCriterion("category_create >=", value, "categoryCreate");
            return (Criteria) this;
        }

        public Criteria andCategoryCreateLessThan(Integer value) {
            addCriterion("category_create <", value, "categoryCreate");
            return (Criteria) this;
        }

        public Criteria andCategoryCreateLessThanOrEqualTo(Integer value) {
            addCriterion("category_create <=", value, "categoryCreate");
            return (Criteria) this;
        }

        public Criteria andCategoryCreateIn(List<Integer> values) {
            addCriterion("category_create in", values, "categoryCreate");
            return (Criteria) this;
        }

        public Criteria andCategoryCreateNotIn(List<Integer> values) {
            addCriterion("category_create not in", values, "categoryCreate");
            return (Criteria) this;
        }

        public Criteria andCategoryCreateBetween(Integer value1, Integer value2) {
            addCriterion("category_create between", value1, value2, "categoryCreate");
            return (Criteria) this;
        }

        public Criteria andCategoryCreateNotBetween(Integer value1, Integer value2) {
            addCriterion("category_create not between", value1, value2, "categoryCreate");
            return (Criteria) this;
        }

        public Criteria andCategoryCreateDateIsNull() {
            addCriterion("category_create_date is null");
            return (Criteria) this;
        }

        public Criteria andCategoryCreateDateIsNotNull() {
            addCriterion("category_create_date is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryCreateDateEqualTo(String value) {
            addCriterion("category_create_date =", value, "categoryCreateDate");
            return (Criteria) this;
        }

        public Criteria andCategoryCreateDateNotEqualTo(String value) {
            addCriterion("category_create_date <>", value, "categoryCreateDate");
            return (Criteria) this;
        }

        public Criteria andCategoryCreateDateGreaterThan(String value) {
            addCriterion("category_create_date >", value, "categoryCreateDate");
            return (Criteria) this;
        }

        public Criteria andCategoryCreateDateGreaterThanOrEqualTo(String value) {
            addCriterion("category_create_date >=", value, "categoryCreateDate");
            return (Criteria) this;
        }

        public Criteria andCategoryCreateDateLessThan(String value) {
            addCriterion("category_create_date <", value, "categoryCreateDate");
            return (Criteria) this;
        }

        public Criteria andCategoryCreateDateLessThanOrEqualTo(String value) {
            addCriterion("category_create_date <=", value, "categoryCreateDate");
            return (Criteria) this;
        }

        public Criteria andCategoryCreateDateLike(String value) {
            addCriterion("category_create_date like", value, "categoryCreateDate");
            return (Criteria) this;
        }

        public Criteria andCategoryCreateDateNotLike(String value) {
            addCriterion("category_create_date not like", value, "categoryCreateDate");
            return (Criteria) this;
        }

        public Criteria andCategoryCreateDateIn(List<String> values) {
            addCriterion("category_create_date in", values, "categoryCreateDate");
            return (Criteria) this;
        }

        public Criteria andCategoryCreateDateNotIn(List<String> values) {
            addCriterion("category_create_date not in", values, "categoryCreateDate");
            return (Criteria) this;
        }

        public Criteria andCategoryCreateDateBetween(String value1, String value2) {
            addCriterion("category_create_date between", value1, value2, "categoryCreateDate");
            return (Criteria) this;
        }

        public Criteria andCategoryCreateDateNotBetween(String value1, String value2) {
            addCriterion("category_create_date not between", value1, value2, "categoryCreateDate");
            return (Criteria) this;
        }

        public Criteria andCategoryDeletedIsNull() {
            addCriterion("category_deleted is null");
            return (Criteria) this;
        }

        public Criteria andCategoryDeletedIsNotNull() {
            addCriterion("category_deleted is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryDeletedEqualTo(Boolean value) {
            addCriterion("category_deleted =", value, "categoryDeleted");
            return (Criteria) this;
        }

        public Criteria andCategoryDeletedNotEqualTo(Boolean value) {
            addCriterion("category_deleted <>", value, "categoryDeleted");
            return (Criteria) this;
        }

        public Criteria andCategoryDeletedGreaterThan(Boolean value) {
            addCriterion("category_deleted >", value, "categoryDeleted");
            return (Criteria) this;
        }

        public Criteria andCategoryDeletedGreaterThanOrEqualTo(Boolean value) {
            addCriterion("category_deleted >=", value, "categoryDeleted");
            return (Criteria) this;
        }

        public Criteria andCategoryDeletedLessThan(Boolean value) {
            addCriterion("category_deleted <", value, "categoryDeleted");
            return (Criteria) this;
        }

        public Criteria andCategoryDeletedLessThanOrEqualTo(Boolean value) {
            addCriterion("category_deleted <=", value, "categoryDeleted");
            return (Criteria) this;
        }

        public Criteria andCategoryDeletedIn(List<Boolean> values) {
            addCriterion("category_deleted in", values, "categoryDeleted");
            return (Criteria) this;
        }

        public Criteria andCategoryDeletedNotIn(List<Boolean> values) {
            addCriterion("category_deleted not in", values, "categoryDeleted");
            return (Criteria) this;
        }

        public Criteria andCategoryDeletedBetween(Boolean value1, Boolean value2) {
            addCriterion("category_deleted between", value1, value2, "categoryDeleted");
            return (Criteria) this;
        }

        public Criteria andCategoryDeletedNotBetween(Boolean value1, Boolean value2) {
            addCriterion("category_deleted not between", value1, value2, "categoryDeleted");
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