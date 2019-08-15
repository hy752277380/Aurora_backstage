package cn.hy.aurora.domain;

import java.util.ArrayList;
import java.util.List;

public class AurSysPictureExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AurSysPictureExample() {
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

        public Criteria andPictureIdIsNull() {
            addCriterion("picture_id is null");
            return (Criteria) this;
        }

        public Criteria andPictureIdIsNotNull() {
            addCriterion("picture_id is not null");
            return (Criteria) this;
        }

        public Criteria andPictureIdEqualTo(Integer value) {
            addCriterion("picture_id =", value, "pictureId");
            return (Criteria) this;
        }

        public Criteria andPictureIdNotEqualTo(Integer value) {
            addCriterion("picture_id <>", value, "pictureId");
            return (Criteria) this;
        }

        public Criteria andPictureIdGreaterThan(Integer value) {
            addCriterion("picture_id >", value, "pictureId");
            return (Criteria) this;
        }

        public Criteria andPictureIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("picture_id >=", value, "pictureId");
            return (Criteria) this;
        }

        public Criteria andPictureIdLessThan(Integer value) {
            addCriterion("picture_id <", value, "pictureId");
            return (Criteria) this;
        }

        public Criteria andPictureIdLessThanOrEqualTo(Integer value) {
            addCriterion("picture_id <=", value, "pictureId");
            return (Criteria) this;
        }

        public Criteria andPictureIdIn(List<Integer> values) {
            addCriterion("picture_id in", values, "pictureId");
            return (Criteria) this;
        }

        public Criteria andPictureIdNotIn(List<Integer> values) {
            addCriterion("picture_id not in", values, "pictureId");
            return (Criteria) this;
        }

        public Criteria andPictureIdBetween(Integer value1, Integer value2) {
            addCriterion("picture_id between", value1, value2, "pictureId");
            return (Criteria) this;
        }

        public Criteria andPictureIdNotBetween(Integer value1, Integer value2) {
            addCriterion("picture_id not between", value1, value2, "pictureId");
            return (Criteria) this;
        }

        public Criteria andPictureNameIsNull() {
            addCriterion("picture_name is null");
            return (Criteria) this;
        }

        public Criteria andPictureNameIsNotNull() {
            addCriterion("picture_name is not null");
            return (Criteria) this;
        }

        public Criteria andPictureNameEqualTo(String value) {
            addCriterion("picture_name =", value, "pictureName");
            return (Criteria) this;
        }

        public Criteria andPictureNameNotEqualTo(String value) {
            addCriterion("picture_name <>", value, "pictureName");
            return (Criteria) this;
        }

        public Criteria andPictureNameGreaterThan(String value) {
            addCriterion("picture_name >", value, "pictureName");
            return (Criteria) this;
        }

        public Criteria andPictureNameGreaterThanOrEqualTo(String value) {
            addCriterion("picture_name >=", value, "pictureName");
            return (Criteria) this;
        }

        public Criteria andPictureNameLessThan(String value) {
            addCriterion("picture_name <", value, "pictureName");
            return (Criteria) this;
        }

        public Criteria andPictureNameLessThanOrEqualTo(String value) {
            addCriterion("picture_name <=", value, "pictureName");
            return (Criteria) this;
        }

        public Criteria andPictureNameLike(String value) {
            addCriterion("picture_name like", value, "pictureName");
            return (Criteria) this;
        }

        public Criteria andPictureNameNotLike(String value) {
            addCriterion("picture_name not like", value, "pictureName");
            return (Criteria) this;
        }

        public Criteria andPictureNameIn(List<String> values) {
            addCriterion("picture_name in", values, "pictureName");
            return (Criteria) this;
        }

        public Criteria andPictureNameNotIn(List<String> values) {
            addCriterion("picture_name not in", values, "pictureName");
            return (Criteria) this;
        }

        public Criteria andPictureNameBetween(String value1, String value2) {
            addCriterion("picture_name between", value1, value2, "pictureName");
            return (Criteria) this;
        }

        public Criteria andPictureNameNotBetween(String value1, String value2) {
            addCriterion("picture_name not between", value1, value2, "pictureName");
            return (Criteria) this;
        }

        public Criteria andPictureUrlIsNull() {
            addCriterion("picture_url is null");
            return (Criteria) this;
        }

        public Criteria andPictureUrlIsNotNull() {
            addCriterion("picture_url is not null");
            return (Criteria) this;
        }

        public Criteria andPictureUrlEqualTo(String value) {
            addCriterion("picture_url =", value, "pictureUrl");
            return (Criteria) this;
        }

        public Criteria andPictureUrlNotEqualTo(String value) {
            addCriterion("picture_url <>", value, "pictureUrl");
            return (Criteria) this;
        }

        public Criteria andPictureUrlGreaterThan(String value) {
            addCriterion("picture_url >", value, "pictureUrl");
            return (Criteria) this;
        }

        public Criteria andPictureUrlGreaterThanOrEqualTo(String value) {
            addCriterion("picture_url >=", value, "pictureUrl");
            return (Criteria) this;
        }

        public Criteria andPictureUrlLessThan(String value) {
            addCriterion("picture_url <", value, "pictureUrl");
            return (Criteria) this;
        }

        public Criteria andPictureUrlLessThanOrEqualTo(String value) {
            addCriterion("picture_url <=", value, "pictureUrl");
            return (Criteria) this;
        }

        public Criteria andPictureUrlLike(String value) {
            addCriterion("picture_url like", value, "pictureUrl");
            return (Criteria) this;
        }

        public Criteria andPictureUrlNotLike(String value) {
            addCriterion("picture_url not like", value, "pictureUrl");
            return (Criteria) this;
        }

        public Criteria andPictureUrlIn(List<String> values) {
            addCriterion("picture_url in", values, "pictureUrl");
            return (Criteria) this;
        }

        public Criteria andPictureUrlNotIn(List<String> values) {
            addCriterion("picture_url not in", values, "pictureUrl");
            return (Criteria) this;
        }

        public Criteria andPictureUrlBetween(String value1, String value2) {
            addCriterion("picture_url between", value1, value2, "pictureUrl");
            return (Criteria) this;
        }

        public Criteria andPictureUrlNotBetween(String value1, String value2) {
            addCriterion("picture_url not between", value1, value2, "pictureUrl");
            return (Criteria) this;
        }

        public Criteria andPictureCreateIsNull() {
            addCriterion("picture_create is null");
            return (Criteria) this;
        }

        public Criteria andPictureCreateIsNotNull() {
            addCriterion("picture_create is not null");
            return (Criteria) this;
        }

        public Criteria andPictureCreateEqualTo(Integer value) {
            addCriterion("picture_create =", value, "pictureCreate");
            return (Criteria) this;
        }

        public Criteria andPictureCreateNotEqualTo(Integer value) {
            addCriterion("picture_create <>", value, "pictureCreate");
            return (Criteria) this;
        }

        public Criteria andPictureCreateGreaterThan(Integer value) {
            addCriterion("picture_create >", value, "pictureCreate");
            return (Criteria) this;
        }

        public Criteria andPictureCreateGreaterThanOrEqualTo(Integer value) {
            addCriterion("picture_create >=", value, "pictureCreate");
            return (Criteria) this;
        }

        public Criteria andPictureCreateLessThan(Integer value) {
            addCriterion("picture_create <", value, "pictureCreate");
            return (Criteria) this;
        }

        public Criteria andPictureCreateLessThanOrEqualTo(Integer value) {
            addCriterion("picture_create <=", value, "pictureCreate");
            return (Criteria) this;
        }

        public Criteria andPictureCreateIn(List<Integer> values) {
            addCriterion("picture_create in", values, "pictureCreate");
            return (Criteria) this;
        }

        public Criteria andPictureCreateNotIn(List<Integer> values) {
            addCriterion("picture_create not in", values, "pictureCreate");
            return (Criteria) this;
        }

        public Criteria andPictureCreateBetween(Integer value1, Integer value2) {
            addCriterion("picture_create between", value1, value2, "pictureCreate");
            return (Criteria) this;
        }

        public Criteria andPictureCreateNotBetween(Integer value1, Integer value2) {
            addCriterion("picture_create not between", value1, value2, "pictureCreate");
            return (Criteria) this;
        }

        public Criteria andPictureCreateDateIsNull() {
            addCriterion("picture_create_date is null");
            return (Criteria) this;
        }

        public Criteria andPictureCreateDateIsNotNull() {
            addCriterion("picture_create_date is not null");
            return (Criteria) this;
        }

        public Criteria andPictureCreateDateEqualTo(String value) {
            addCriterion("picture_create_date =", value, "pictureCreateDate");
            return (Criteria) this;
        }

        public Criteria andPictureCreateDateNotEqualTo(String value) {
            addCriterion("picture_create_date <>", value, "pictureCreateDate");
            return (Criteria) this;
        }

        public Criteria andPictureCreateDateGreaterThan(String value) {
            addCriterion("picture_create_date >", value, "pictureCreateDate");
            return (Criteria) this;
        }

        public Criteria andPictureCreateDateGreaterThanOrEqualTo(String value) {
            addCriterion("picture_create_date >=", value, "pictureCreateDate");
            return (Criteria) this;
        }

        public Criteria andPictureCreateDateLessThan(String value) {
            addCriterion("picture_create_date <", value, "pictureCreateDate");
            return (Criteria) this;
        }

        public Criteria andPictureCreateDateLessThanOrEqualTo(String value) {
            addCriterion("picture_create_date <=", value, "pictureCreateDate");
            return (Criteria) this;
        }

        public Criteria andPictureCreateDateLike(String value) {
            addCriterion("picture_create_date like", value, "pictureCreateDate");
            return (Criteria) this;
        }

        public Criteria andPictureCreateDateNotLike(String value) {
            addCriterion("picture_create_date not like", value, "pictureCreateDate");
            return (Criteria) this;
        }

        public Criteria andPictureCreateDateIn(List<String> values) {
            addCriterion("picture_create_date in", values, "pictureCreateDate");
            return (Criteria) this;
        }

        public Criteria andPictureCreateDateNotIn(List<String> values) {
            addCriterion("picture_create_date not in", values, "pictureCreateDate");
            return (Criteria) this;
        }

        public Criteria andPictureCreateDateBetween(String value1, String value2) {
            addCriterion("picture_create_date between", value1, value2, "pictureCreateDate");
            return (Criteria) this;
        }

        public Criteria andPictureCreateDateNotBetween(String value1, String value2) {
            addCriterion("picture_create_date not between", value1, value2, "pictureCreateDate");
            return (Criteria) this;
        }

        public Criteria andPictureDeletedIsNull() {
            addCriterion("picture_deleted is null");
            return (Criteria) this;
        }

        public Criteria andPictureDeletedIsNotNull() {
            addCriterion("picture_deleted is not null");
            return (Criteria) this;
        }

        public Criteria andPictureDeletedEqualTo(Boolean value) {
            addCriterion("picture_deleted =", value, "pictureDeleted");
            return (Criteria) this;
        }

        public Criteria andPictureDeletedNotEqualTo(Boolean value) {
            addCriterion("picture_deleted <>", value, "pictureDeleted");
            return (Criteria) this;
        }

        public Criteria andPictureDeletedGreaterThan(Boolean value) {
            addCriterion("picture_deleted >", value, "pictureDeleted");
            return (Criteria) this;
        }

        public Criteria andPictureDeletedGreaterThanOrEqualTo(Boolean value) {
            addCriterion("picture_deleted >=", value, "pictureDeleted");
            return (Criteria) this;
        }

        public Criteria andPictureDeletedLessThan(Boolean value) {
            addCriterion("picture_deleted <", value, "pictureDeleted");
            return (Criteria) this;
        }

        public Criteria andPictureDeletedLessThanOrEqualTo(Boolean value) {
            addCriterion("picture_deleted <=", value, "pictureDeleted");
            return (Criteria) this;
        }

        public Criteria andPictureDeletedIn(List<Boolean> values) {
            addCriterion("picture_deleted in", values, "pictureDeleted");
            return (Criteria) this;
        }

        public Criteria andPictureDeletedNotIn(List<Boolean> values) {
            addCriterion("picture_deleted not in", values, "pictureDeleted");
            return (Criteria) this;
        }

        public Criteria andPictureDeletedBetween(Boolean value1, Boolean value2) {
            addCriterion("picture_deleted between", value1, value2, "pictureDeleted");
            return (Criteria) this;
        }

        public Criteria andPictureDeletedNotBetween(Boolean value1, Boolean value2) {
            addCriterion("picture_deleted not between", value1, value2, "pictureDeleted");
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