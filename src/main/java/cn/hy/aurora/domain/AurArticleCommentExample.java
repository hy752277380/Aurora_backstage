package cn.hy.aurora.domain;

import java.util.ArrayList;
import java.util.List;

public class AurArticleCommentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AurArticleCommentExample() {
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

        public Criteria andCommentIdIsNull() {
            addCriterion("comment_id is null");
            return (Criteria) this;
        }

        public Criteria andCommentIdIsNotNull() {
            addCriterion("comment_id is not null");
            return (Criteria) this;
        }

        public Criteria andCommentIdEqualTo(Integer value) {
            addCriterion("comment_id =", value, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdNotEqualTo(Integer value) {
            addCriterion("comment_id <>", value, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdGreaterThan(Integer value) {
            addCriterion("comment_id >", value, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("comment_id >=", value, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdLessThan(Integer value) {
            addCriterion("comment_id <", value, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdLessThanOrEqualTo(Integer value) {
            addCriterion("comment_id <=", value, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdIn(List<Integer> values) {
            addCriterion("comment_id in", values, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdNotIn(List<Integer> values) {
            addCriterion("comment_id not in", values, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdBetween(Integer value1, Integer value2) {
            addCriterion("comment_id between", value1, value2, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("comment_id not between", value1, value2, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentNameIsNull() {
            addCriterion("comment_name is null");
            return (Criteria) this;
        }

        public Criteria andCommentNameIsNotNull() {
            addCriterion("comment_name is not null");
            return (Criteria) this;
        }

        public Criteria andCommentNameEqualTo(String value) {
            addCriterion("comment_name =", value, "commentName");
            return (Criteria) this;
        }

        public Criteria andCommentNameNotEqualTo(String value) {
            addCriterion("comment_name <>", value, "commentName");
            return (Criteria) this;
        }

        public Criteria andCommentNameGreaterThan(String value) {
            addCriterion("comment_name >", value, "commentName");
            return (Criteria) this;
        }

        public Criteria andCommentNameGreaterThanOrEqualTo(String value) {
            addCriterion("comment_name >=", value, "commentName");
            return (Criteria) this;
        }

        public Criteria andCommentNameLessThan(String value) {
            addCriterion("comment_name <", value, "commentName");
            return (Criteria) this;
        }

        public Criteria andCommentNameLessThanOrEqualTo(String value) {
            addCriterion("comment_name <=", value, "commentName");
            return (Criteria) this;
        }

        public Criteria andCommentNameLike(String value) {
            addCriterion("comment_name like", value, "commentName");
            return (Criteria) this;
        }

        public Criteria andCommentNameNotLike(String value) {
            addCriterion("comment_name not like", value, "commentName");
            return (Criteria) this;
        }

        public Criteria andCommentNameIn(List<String> values) {
            addCriterion("comment_name in", values, "commentName");
            return (Criteria) this;
        }

        public Criteria andCommentNameNotIn(List<String> values) {
            addCriterion("comment_name not in", values, "commentName");
            return (Criteria) this;
        }

        public Criteria andCommentNameBetween(String value1, String value2) {
            addCriterion("comment_name between", value1, value2, "commentName");
            return (Criteria) this;
        }

        public Criteria andCommentNameNotBetween(String value1, String value2) {
            addCriterion("comment_name not between", value1, value2, "commentName");
            return (Criteria) this;
        }

        public Criteria andCommentEmailIsNull() {
            addCriterion("comment_email is null");
            return (Criteria) this;
        }

        public Criteria andCommentEmailIsNotNull() {
            addCriterion("comment_email is not null");
            return (Criteria) this;
        }

        public Criteria andCommentEmailEqualTo(String value) {
            addCriterion("comment_email =", value, "commentEmail");
            return (Criteria) this;
        }

        public Criteria andCommentEmailNotEqualTo(String value) {
            addCriterion("comment_email <>", value, "commentEmail");
            return (Criteria) this;
        }

        public Criteria andCommentEmailGreaterThan(String value) {
            addCriterion("comment_email >", value, "commentEmail");
            return (Criteria) this;
        }

        public Criteria andCommentEmailGreaterThanOrEqualTo(String value) {
            addCriterion("comment_email >=", value, "commentEmail");
            return (Criteria) this;
        }

        public Criteria andCommentEmailLessThan(String value) {
            addCriterion("comment_email <", value, "commentEmail");
            return (Criteria) this;
        }

        public Criteria andCommentEmailLessThanOrEqualTo(String value) {
            addCriterion("comment_email <=", value, "commentEmail");
            return (Criteria) this;
        }

        public Criteria andCommentEmailLike(String value) {
            addCriterion("comment_email like", value, "commentEmail");
            return (Criteria) this;
        }

        public Criteria andCommentEmailNotLike(String value) {
            addCriterion("comment_email not like", value, "commentEmail");
            return (Criteria) this;
        }

        public Criteria andCommentEmailIn(List<String> values) {
            addCriterion("comment_email in", values, "commentEmail");
            return (Criteria) this;
        }

        public Criteria andCommentEmailNotIn(List<String> values) {
            addCriterion("comment_email not in", values, "commentEmail");
            return (Criteria) this;
        }

        public Criteria andCommentEmailBetween(String value1, String value2) {
            addCriterion("comment_email between", value1, value2, "commentEmail");
            return (Criteria) this;
        }

        public Criteria andCommentEmailNotBetween(String value1, String value2) {
            addCriterion("comment_email not between", value1, value2, "commentEmail");
            return (Criteria) this;
        }

        public Criteria andCommentContentIsNull() {
            addCriterion("comment_content is null");
            return (Criteria) this;
        }

        public Criteria andCommentContentIsNotNull() {
            addCriterion("comment_content is not null");
            return (Criteria) this;
        }

        public Criteria andCommentContentEqualTo(String value) {
            addCriterion("comment_content =", value, "commentContent");
            return (Criteria) this;
        }

        public Criteria andCommentContentNotEqualTo(String value) {
            addCriterion("comment_content <>", value, "commentContent");
            return (Criteria) this;
        }

        public Criteria andCommentContentGreaterThan(String value) {
            addCriterion("comment_content >", value, "commentContent");
            return (Criteria) this;
        }

        public Criteria andCommentContentGreaterThanOrEqualTo(String value) {
            addCriterion("comment_content >=", value, "commentContent");
            return (Criteria) this;
        }

        public Criteria andCommentContentLessThan(String value) {
            addCriterion("comment_content <", value, "commentContent");
            return (Criteria) this;
        }

        public Criteria andCommentContentLessThanOrEqualTo(String value) {
            addCriterion("comment_content <=", value, "commentContent");
            return (Criteria) this;
        }

        public Criteria andCommentContentLike(String value) {
            addCriterion("comment_content like", value, "commentContent");
            return (Criteria) this;
        }

        public Criteria andCommentContentNotLike(String value) {
            addCriterion("comment_content not like", value, "commentContent");
            return (Criteria) this;
        }

        public Criteria andCommentContentIn(List<String> values) {
            addCriterion("comment_content in", values, "commentContent");
            return (Criteria) this;
        }

        public Criteria andCommentContentNotIn(List<String> values) {
            addCriterion("comment_content not in", values, "commentContent");
            return (Criteria) this;
        }

        public Criteria andCommentContentBetween(String value1, String value2) {
            addCriterion("comment_content between", value1, value2, "commentContent");
            return (Criteria) this;
        }

        public Criteria andCommentContentNotBetween(String value1, String value2) {
            addCriterion("comment_content not between", value1, value2, "commentContent");
            return (Criteria) this;
        }

        public Criteria andCommentCreateIsNull() {
            addCriterion("comment_create is null");
            return (Criteria) this;
        }

        public Criteria andCommentCreateIsNotNull() {
            addCriterion("comment_create is not null");
            return (Criteria) this;
        }

        public Criteria andCommentCreateEqualTo(Integer value) {
            addCriterion("comment_create =", value, "commentCreate");
            return (Criteria) this;
        }

        public Criteria andCommentCreateNotEqualTo(Integer value) {
            addCriterion("comment_create <>", value, "commentCreate");
            return (Criteria) this;
        }

        public Criteria andCommentCreateGreaterThan(Integer value) {
            addCriterion("comment_create >", value, "commentCreate");
            return (Criteria) this;
        }

        public Criteria andCommentCreateGreaterThanOrEqualTo(Integer value) {
            addCriterion("comment_create >=", value, "commentCreate");
            return (Criteria) this;
        }

        public Criteria andCommentCreateLessThan(Integer value) {
            addCriterion("comment_create <", value, "commentCreate");
            return (Criteria) this;
        }

        public Criteria andCommentCreateLessThanOrEqualTo(Integer value) {
            addCriterion("comment_create <=", value, "commentCreate");
            return (Criteria) this;
        }

        public Criteria andCommentCreateIn(List<Integer> values) {
            addCriterion("comment_create in", values, "commentCreate");
            return (Criteria) this;
        }

        public Criteria andCommentCreateNotIn(List<Integer> values) {
            addCriterion("comment_create not in", values, "commentCreate");
            return (Criteria) this;
        }

        public Criteria andCommentCreateBetween(Integer value1, Integer value2) {
            addCriterion("comment_create between", value1, value2, "commentCreate");
            return (Criteria) this;
        }

        public Criteria andCommentCreateNotBetween(Integer value1, Integer value2) {
            addCriterion("comment_create not between", value1, value2, "commentCreate");
            return (Criteria) this;
        }

        public Criteria andCommentCreateDateIsNull() {
            addCriterion("comment_create_date is null");
            return (Criteria) this;
        }

        public Criteria andCommentCreateDateIsNotNull() {
            addCriterion("comment_create_date is not null");
            return (Criteria) this;
        }

        public Criteria andCommentCreateDateEqualTo(String value) {
            addCriterion("comment_create_date =", value, "commentCreateDate");
            return (Criteria) this;
        }

        public Criteria andCommentCreateDateNotEqualTo(String value) {
            addCriterion("comment_create_date <>", value, "commentCreateDate");
            return (Criteria) this;
        }

        public Criteria andCommentCreateDateGreaterThan(String value) {
            addCriterion("comment_create_date >", value, "commentCreateDate");
            return (Criteria) this;
        }

        public Criteria andCommentCreateDateGreaterThanOrEqualTo(String value) {
            addCriterion("comment_create_date >=", value, "commentCreateDate");
            return (Criteria) this;
        }

        public Criteria andCommentCreateDateLessThan(String value) {
            addCriterion("comment_create_date <", value, "commentCreateDate");
            return (Criteria) this;
        }

        public Criteria andCommentCreateDateLessThanOrEqualTo(String value) {
            addCriterion("comment_create_date <=", value, "commentCreateDate");
            return (Criteria) this;
        }

        public Criteria andCommentCreateDateLike(String value) {
            addCriterion("comment_create_date like", value, "commentCreateDate");
            return (Criteria) this;
        }

        public Criteria andCommentCreateDateNotLike(String value) {
            addCriterion("comment_create_date not like", value, "commentCreateDate");
            return (Criteria) this;
        }

        public Criteria andCommentCreateDateIn(List<String> values) {
            addCriterion("comment_create_date in", values, "commentCreateDate");
            return (Criteria) this;
        }

        public Criteria andCommentCreateDateNotIn(List<String> values) {
            addCriterion("comment_create_date not in", values, "commentCreateDate");
            return (Criteria) this;
        }

        public Criteria andCommentCreateDateBetween(String value1, String value2) {
            addCriterion("comment_create_date between", value1, value2, "commentCreateDate");
            return (Criteria) this;
        }

        public Criteria andCommentCreateDateNotBetween(String value1, String value2) {
            addCriterion("comment_create_date not between", value1, value2, "commentCreateDate");
            return (Criteria) this;
        }

        public Criteria andCommentTypeIdIsNull() {
            addCriterion("comment_type_id is null");
            return (Criteria) this;
        }

        public Criteria andCommentTypeIdIsNotNull() {
            addCriterion("comment_type_id is not null");
            return (Criteria) this;
        }

        public Criteria andCommentTypeIdEqualTo(Integer value) {
            addCriterion("comment_type_id =", value, "commentTypeId");
            return (Criteria) this;
        }

        public Criteria andCommentTypeIdNotEqualTo(Integer value) {
            addCriterion("comment_type_id <>", value, "commentTypeId");
            return (Criteria) this;
        }

        public Criteria andCommentTypeIdGreaterThan(Integer value) {
            addCriterion("comment_type_id >", value, "commentTypeId");
            return (Criteria) this;
        }

        public Criteria andCommentTypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("comment_type_id >=", value, "commentTypeId");
            return (Criteria) this;
        }

        public Criteria andCommentTypeIdLessThan(Integer value) {
            addCriterion("comment_type_id <", value, "commentTypeId");
            return (Criteria) this;
        }

        public Criteria andCommentTypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("comment_type_id <=", value, "commentTypeId");
            return (Criteria) this;
        }

        public Criteria andCommentTypeIdIn(List<Integer> values) {
            addCriterion("comment_type_id in", values, "commentTypeId");
            return (Criteria) this;
        }

        public Criteria andCommentTypeIdNotIn(List<Integer> values) {
            addCriterion("comment_type_id not in", values, "commentTypeId");
            return (Criteria) this;
        }

        public Criteria andCommentTypeIdBetween(Integer value1, Integer value2) {
            addCriterion("comment_type_id between", value1, value2, "commentTypeId");
            return (Criteria) this;
        }

        public Criteria andCommentTypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("comment_type_id not between", value1, value2, "commentTypeId");
            return (Criteria) this;
        }

        public Criteria andCommentTypeIsNull() {
            addCriterion("comment_type is null");
            return (Criteria) this;
        }

        public Criteria andCommentTypeIsNotNull() {
            addCriterion("comment_type is not null");
            return (Criteria) this;
        }

        public Criteria andCommentTypeEqualTo(Boolean value) {
            addCriterion("comment_type =", value, "commentType");
            return (Criteria) this;
        }

        public Criteria andCommentTypeNotEqualTo(Boolean value) {
            addCriterion("comment_type <>", value, "commentType");
            return (Criteria) this;
        }

        public Criteria andCommentTypeGreaterThan(Boolean value) {
            addCriterion("comment_type >", value, "commentType");
            return (Criteria) this;
        }

        public Criteria andCommentTypeGreaterThanOrEqualTo(Boolean value) {
            addCriterion("comment_type >=", value, "commentType");
            return (Criteria) this;
        }

        public Criteria andCommentTypeLessThan(Boolean value) {
            addCriterion("comment_type <", value, "commentType");
            return (Criteria) this;
        }

        public Criteria andCommentTypeLessThanOrEqualTo(Boolean value) {
            addCriterion("comment_type <=", value, "commentType");
            return (Criteria) this;
        }

        public Criteria andCommentTypeIn(List<Boolean> values) {
            addCriterion("comment_type in", values, "commentType");
            return (Criteria) this;
        }

        public Criteria andCommentTypeNotIn(List<Boolean> values) {
            addCriterion("comment_type not in", values, "commentType");
            return (Criteria) this;
        }

        public Criteria andCommentTypeBetween(Boolean value1, Boolean value2) {
            addCriterion("comment_type between", value1, value2, "commentType");
            return (Criteria) this;
        }

        public Criteria andCommentTypeNotBetween(Boolean value1, Boolean value2) {
            addCriterion("comment_type not between", value1, value2, "commentType");
            return (Criteria) this;
        }

        public Criteria andCommentDeletedIsNull() {
            addCriterion("comment_deleted is null");
            return (Criteria) this;
        }

        public Criteria andCommentDeletedIsNotNull() {
            addCriterion("comment_deleted is not null");
            return (Criteria) this;
        }

        public Criteria andCommentDeletedEqualTo(Boolean value) {
            addCriterion("comment_deleted =", value, "commentDeleted");
            return (Criteria) this;
        }

        public Criteria andCommentDeletedNotEqualTo(Boolean value) {
            addCriterion("comment_deleted <>", value, "commentDeleted");
            return (Criteria) this;
        }

        public Criteria andCommentDeletedGreaterThan(Boolean value) {
            addCriterion("comment_deleted >", value, "commentDeleted");
            return (Criteria) this;
        }

        public Criteria andCommentDeletedGreaterThanOrEqualTo(Boolean value) {
            addCriterion("comment_deleted >=", value, "commentDeleted");
            return (Criteria) this;
        }

        public Criteria andCommentDeletedLessThan(Boolean value) {
            addCriterion("comment_deleted <", value, "commentDeleted");
            return (Criteria) this;
        }

        public Criteria andCommentDeletedLessThanOrEqualTo(Boolean value) {
            addCriterion("comment_deleted <=", value, "commentDeleted");
            return (Criteria) this;
        }

        public Criteria andCommentDeletedIn(List<Boolean> values) {
            addCriterion("comment_deleted in", values, "commentDeleted");
            return (Criteria) this;
        }

        public Criteria andCommentDeletedNotIn(List<Boolean> values) {
            addCriterion("comment_deleted not in", values, "commentDeleted");
            return (Criteria) this;
        }

        public Criteria andCommentDeletedBetween(Boolean value1, Boolean value2) {
            addCriterion("comment_deleted between", value1, value2, "commentDeleted");
            return (Criteria) this;
        }

        public Criteria andCommentDeletedNotBetween(Boolean value1, Boolean value2) {
            addCriterion("comment_deleted not between", value1, value2, "commentDeleted");
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