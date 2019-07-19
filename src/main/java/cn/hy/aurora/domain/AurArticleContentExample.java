package cn.hy.aurora.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AurArticleContentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AurArticleContentExample() {
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

        public Criteria andContentIdIsNull() {
            addCriterion("content_id is null");
            return (Criteria) this;
        }

        public Criteria andContentIdIsNotNull() {
            addCriterion("content_id is not null");
            return (Criteria) this;
        }

        public Criteria andContentIdEqualTo(Integer value) {
            addCriterion("content_id =", value, "contentId");
            return (Criteria) this;
        }

        public Criteria andContentIdNotEqualTo(Integer value) {
            addCriterion("content_id <>", value, "contentId");
            return (Criteria) this;
        }

        public Criteria andContentIdGreaterThan(Integer value) {
            addCriterion("content_id >", value, "contentId");
            return (Criteria) this;
        }

        public Criteria andContentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("content_id >=", value, "contentId");
            return (Criteria) this;
        }

        public Criteria andContentIdLessThan(Integer value) {
            addCriterion("content_id <", value, "contentId");
            return (Criteria) this;
        }

        public Criteria andContentIdLessThanOrEqualTo(Integer value) {
            addCriterion("content_id <=", value, "contentId");
            return (Criteria) this;
        }

        public Criteria andContentIdIn(List<Integer> values) {
            addCriterion("content_id in", values, "contentId");
            return (Criteria) this;
        }

        public Criteria andContentIdNotIn(List<Integer> values) {
            addCriterion("content_id not in", values, "contentId");
            return (Criteria) this;
        }

        public Criteria andContentIdBetween(Integer value1, Integer value2) {
            addCriterion("content_id between", value1, value2, "contentId");
            return (Criteria) this;
        }

        public Criteria andContentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("content_id not between", value1, value2, "contentId");
            return (Criteria) this;
        }

        public Criteria andArticleIdIsNull() {
            addCriterion("article_id is null");
            return (Criteria) this;
        }

        public Criteria andArticleIdIsNotNull() {
            addCriterion("article_id is not null");
            return (Criteria) this;
        }

        public Criteria andArticleIdEqualTo(Integer value) {
            addCriterion("article_id =", value, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleIdNotEqualTo(Integer value) {
            addCriterion("article_id <>", value, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleIdGreaterThan(Integer value) {
            addCriterion("article_id >", value, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("article_id >=", value, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleIdLessThan(Integer value) {
            addCriterion("article_id <", value, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleIdLessThanOrEqualTo(Integer value) {
            addCriterion("article_id <=", value, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleIdIn(List<Integer> values) {
            addCriterion("article_id in", values, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleIdNotIn(List<Integer> values) {
            addCriterion("article_id not in", values, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleIdBetween(Integer value1, Integer value2) {
            addCriterion("article_id between", value1, value2, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleIdNotBetween(Integer value1, Integer value2) {
            addCriterion("article_id not between", value1, value2, "articleId");
            return (Criteria) this;
        }

        public Criteria andContentCreatorIsNull() {
            addCriterion("content_creator is null");
            return (Criteria) this;
        }

        public Criteria andContentCreatorIsNotNull() {
            addCriterion("content_creator is not null");
            return (Criteria) this;
        }

        public Criteria andContentCreatorEqualTo(Integer value) {
            addCriterion("content_creator =", value, "contentCreator");
            return (Criteria) this;
        }

        public Criteria andContentCreatorNotEqualTo(Integer value) {
            addCriterion("content_creator <>", value, "contentCreator");
            return (Criteria) this;
        }

        public Criteria andContentCreatorGreaterThan(Integer value) {
            addCriterion("content_creator >", value, "contentCreator");
            return (Criteria) this;
        }

        public Criteria andContentCreatorGreaterThanOrEqualTo(Integer value) {
            addCriterion("content_creator >=", value, "contentCreator");
            return (Criteria) this;
        }

        public Criteria andContentCreatorLessThan(Integer value) {
            addCriterion("content_creator <", value, "contentCreator");
            return (Criteria) this;
        }

        public Criteria andContentCreatorLessThanOrEqualTo(Integer value) {
            addCriterion("content_creator <=", value, "contentCreator");
            return (Criteria) this;
        }

        public Criteria andContentCreatorIn(List<Integer> values) {
            addCriterion("content_creator in", values, "contentCreator");
            return (Criteria) this;
        }

        public Criteria andContentCreatorNotIn(List<Integer> values) {
            addCriterion("content_creator not in", values, "contentCreator");
            return (Criteria) this;
        }

        public Criteria andContentCreatorBetween(Integer value1, Integer value2) {
            addCriterion("content_creator between", value1, value2, "contentCreator");
            return (Criteria) this;
        }

        public Criteria andContentCreatorNotBetween(Integer value1, Integer value2) {
            addCriterion("content_creator not between", value1, value2, "contentCreator");
            return (Criteria) this;
        }

        public Criteria andContentCreateDateIsNull() {
            addCriterion("content_create_date is null");
            return (Criteria) this;
        }

        public Criteria andContentCreateDateIsNotNull() {
            addCriterion("content_create_date is not null");
            return (Criteria) this;
        }

        public Criteria andContentCreateDateEqualTo(Date value) {
            addCriterion("content_create_date =", value, "contentCreateDate");
            return (Criteria) this;
        }

        public Criteria andContentCreateDateNotEqualTo(Date value) {
            addCriterion("content_create_date <>", value, "contentCreateDate");
            return (Criteria) this;
        }

        public Criteria andContentCreateDateGreaterThan(Date value) {
            addCriterion("content_create_date >", value, "contentCreateDate");
            return (Criteria) this;
        }

        public Criteria andContentCreateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("content_create_date >=", value, "contentCreateDate");
            return (Criteria) this;
        }

        public Criteria andContentCreateDateLessThan(Date value) {
            addCriterion("content_create_date <", value, "contentCreateDate");
            return (Criteria) this;
        }

        public Criteria andContentCreateDateLessThanOrEqualTo(Date value) {
            addCriterion("content_create_date <=", value, "contentCreateDate");
            return (Criteria) this;
        }

        public Criteria andContentCreateDateIn(List<Date> values) {
            addCriterion("content_create_date in", values, "contentCreateDate");
            return (Criteria) this;
        }

        public Criteria andContentCreateDateNotIn(List<Date> values) {
            addCriterion("content_create_date not in", values, "contentCreateDate");
            return (Criteria) this;
        }

        public Criteria andContentCreateDateBetween(Date value1, Date value2) {
            addCriterion("content_create_date between", value1, value2, "contentCreateDate");
            return (Criteria) this;
        }

        public Criteria andContentCreateDateNotBetween(Date value1, Date value2) {
            addCriterion("content_create_date not between", value1, value2, "contentCreateDate");
            return (Criteria) this;
        }

        public Criteria andContentUpdateIsNull() {
            addCriterion("content_update is null");
            return (Criteria) this;
        }

        public Criteria andContentUpdateIsNotNull() {
            addCriterion("content_update is not null");
            return (Criteria) this;
        }

        public Criteria andContentUpdateEqualTo(Integer value) {
            addCriterion("content_update =", value, "contentUpdate");
            return (Criteria) this;
        }

        public Criteria andContentUpdateNotEqualTo(Integer value) {
            addCriterion("content_update <>", value, "contentUpdate");
            return (Criteria) this;
        }

        public Criteria andContentUpdateGreaterThan(Integer value) {
            addCriterion("content_update >", value, "contentUpdate");
            return (Criteria) this;
        }

        public Criteria andContentUpdateGreaterThanOrEqualTo(Integer value) {
            addCriterion("content_update >=", value, "contentUpdate");
            return (Criteria) this;
        }

        public Criteria andContentUpdateLessThan(Integer value) {
            addCriterion("content_update <", value, "contentUpdate");
            return (Criteria) this;
        }

        public Criteria andContentUpdateLessThanOrEqualTo(Integer value) {
            addCriterion("content_update <=", value, "contentUpdate");
            return (Criteria) this;
        }

        public Criteria andContentUpdateIn(List<Integer> values) {
            addCriterion("content_update in", values, "contentUpdate");
            return (Criteria) this;
        }

        public Criteria andContentUpdateNotIn(List<Integer> values) {
            addCriterion("content_update not in", values, "contentUpdate");
            return (Criteria) this;
        }

        public Criteria andContentUpdateBetween(Integer value1, Integer value2) {
            addCriterion("content_update between", value1, value2, "contentUpdate");
            return (Criteria) this;
        }

        public Criteria andContentUpdateNotBetween(Integer value1, Integer value2) {
            addCriterion("content_update not between", value1, value2, "contentUpdate");
            return (Criteria) this;
        }

        public Criteria andContentUpdateDateIsNull() {
            addCriterion("content_update_date is null");
            return (Criteria) this;
        }

        public Criteria andContentUpdateDateIsNotNull() {
            addCriterion("content_update_date is not null");
            return (Criteria) this;
        }

        public Criteria andContentUpdateDateEqualTo(Date value) {
            addCriterion("content_update_date =", value, "contentUpdateDate");
            return (Criteria) this;
        }

        public Criteria andContentUpdateDateNotEqualTo(Date value) {
            addCriterion("content_update_date <>", value, "contentUpdateDate");
            return (Criteria) this;
        }

        public Criteria andContentUpdateDateGreaterThan(Date value) {
            addCriterion("content_update_date >", value, "contentUpdateDate");
            return (Criteria) this;
        }

        public Criteria andContentUpdateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("content_update_date >=", value, "contentUpdateDate");
            return (Criteria) this;
        }

        public Criteria andContentUpdateDateLessThan(Date value) {
            addCriterion("content_update_date <", value, "contentUpdateDate");
            return (Criteria) this;
        }

        public Criteria andContentUpdateDateLessThanOrEqualTo(Date value) {
            addCriterion("content_update_date <=", value, "contentUpdateDate");
            return (Criteria) this;
        }

        public Criteria andContentUpdateDateIn(List<Date> values) {
            addCriterion("content_update_date in", values, "contentUpdateDate");
            return (Criteria) this;
        }

        public Criteria andContentUpdateDateNotIn(List<Date> values) {
            addCriterion("content_update_date not in", values, "contentUpdateDate");
            return (Criteria) this;
        }

        public Criteria andContentUpdateDateBetween(Date value1, Date value2) {
            addCriterion("content_update_date between", value1, value2, "contentUpdateDate");
            return (Criteria) this;
        }

        public Criteria andContentUpdateDateNotBetween(Date value1, Date value2) {
            addCriterion("content_update_date not between", value1, value2, "contentUpdateDate");
            return (Criteria) this;
        }

        public Criteria andContentVersionIsNull() {
            addCriterion("content_version is null");
            return (Criteria) this;
        }

        public Criteria andContentVersionIsNotNull() {
            addCriterion("content_version is not null");
            return (Criteria) this;
        }

        public Criteria andContentVersionEqualTo(Float value) {
            addCriterion("content_version =", value, "contentVersion");
            return (Criteria) this;
        }

        public Criteria andContentVersionNotEqualTo(Float value) {
            addCriterion("content_version <>", value, "contentVersion");
            return (Criteria) this;
        }

        public Criteria andContentVersionGreaterThan(Float value) {
            addCriterion("content_version >", value, "contentVersion");
            return (Criteria) this;
        }

        public Criteria andContentVersionGreaterThanOrEqualTo(Float value) {
            addCriterion("content_version >=", value, "contentVersion");
            return (Criteria) this;
        }

        public Criteria andContentVersionLessThan(Float value) {
            addCriterion("content_version <", value, "contentVersion");
            return (Criteria) this;
        }

        public Criteria andContentVersionLessThanOrEqualTo(Float value) {
            addCriterion("content_version <=", value, "contentVersion");
            return (Criteria) this;
        }

        public Criteria andContentVersionIn(List<Float> values) {
            addCriterion("content_version in", values, "contentVersion");
            return (Criteria) this;
        }

        public Criteria andContentVersionNotIn(List<Float> values) {
            addCriterion("content_version not in", values, "contentVersion");
            return (Criteria) this;
        }

        public Criteria andContentVersionBetween(Float value1, Float value2) {
            addCriterion("content_version between", value1, value2, "contentVersion");
            return (Criteria) this;
        }

        public Criteria andContentVersionNotBetween(Float value1, Float value2) {
            addCriterion("content_version not between", value1, value2, "contentVersion");
            return (Criteria) this;
        }

        public Criteria andContentMdUrlIsNull() {
            addCriterion("content_md_url is null");
            return (Criteria) this;
        }

        public Criteria andContentMdUrlIsNotNull() {
            addCriterion("content_md_url is not null");
            return (Criteria) this;
        }

        public Criteria andContentMdUrlEqualTo(String value) {
            addCriterion("content_md_url =", value, "contentMdUrl");
            return (Criteria) this;
        }

        public Criteria andContentMdUrlNotEqualTo(String value) {
            addCriterion("content_md_url <>", value, "contentMdUrl");
            return (Criteria) this;
        }

        public Criteria andContentMdUrlGreaterThan(String value) {
            addCriterion("content_md_url >", value, "contentMdUrl");
            return (Criteria) this;
        }

        public Criteria andContentMdUrlGreaterThanOrEqualTo(String value) {
            addCriterion("content_md_url >=", value, "contentMdUrl");
            return (Criteria) this;
        }

        public Criteria andContentMdUrlLessThan(String value) {
            addCriterion("content_md_url <", value, "contentMdUrl");
            return (Criteria) this;
        }

        public Criteria andContentMdUrlLessThanOrEqualTo(String value) {
            addCriterion("content_md_url <=", value, "contentMdUrl");
            return (Criteria) this;
        }

        public Criteria andContentMdUrlLike(String value) {
            addCriterion("content_md_url like", value, "contentMdUrl");
            return (Criteria) this;
        }

        public Criteria andContentMdUrlNotLike(String value) {
            addCriterion("content_md_url not like", value, "contentMdUrl");
            return (Criteria) this;
        }

        public Criteria andContentMdUrlIn(List<String> values) {
            addCriterion("content_md_url in", values, "contentMdUrl");
            return (Criteria) this;
        }

        public Criteria andContentMdUrlNotIn(List<String> values) {
            addCriterion("content_md_url not in", values, "contentMdUrl");
            return (Criteria) this;
        }

        public Criteria andContentMdUrlBetween(String value1, String value2) {
            addCriterion("content_md_url between", value1, value2, "contentMdUrl");
            return (Criteria) this;
        }

        public Criteria andContentMdUrlNotBetween(String value1, String value2) {
            addCriterion("content_md_url not between", value1, value2, "contentMdUrl");
            return (Criteria) this;
        }

        public Criteria andContentDeleteIsNull() {
            addCriterion("content_delete is null");
            return (Criteria) this;
        }

        public Criteria andContentDeleteIsNotNull() {
            addCriterion("content_delete is not null");
            return (Criteria) this;
        }

        public Criteria andContentDeleteEqualTo(Boolean value) {
            addCriterion("content_delete =", value, "contentDelete");
            return (Criteria) this;
        }

        public Criteria andContentDeleteNotEqualTo(Boolean value) {
            addCriterion("content_delete <>", value, "contentDelete");
            return (Criteria) this;
        }

        public Criteria andContentDeleteGreaterThan(Boolean value) {
            addCriterion("content_delete >", value, "contentDelete");
            return (Criteria) this;
        }

        public Criteria andContentDeleteGreaterThanOrEqualTo(Boolean value) {
            addCriterion("content_delete >=", value, "contentDelete");
            return (Criteria) this;
        }

        public Criteria andContentDeleteLessThan(Boolean value) {
            addCriterion("content_delete <", value, "contentDelete");
            return (Criteria) this;
        }

        public Criteria andContentDeleteLessThanOrEqualTo(Boolean value) {
            addCriterion("content_delete <=", value, "contentDelete");
            return (Criteria) this;
        }

        public Criteria andContentDeleteIn(List<Boolean> values) {
            addCriterion("content_delete in", values, "contentDelete");
            return (Criteria) this;
        }

        public Criteria andContentDeleteNotIn(List<Boolean> values) {
            addCriterion("content_delete not in", values, "contentDelete");
            return (Criteria) this;
        }

        public Criteria andContentDeleteBetween(Boolean value1, Boolean value2) {
            addCriterion("content_delete between", value1, value2, "contentDelete");
            return (Criteria) this;
        }

        public Criteria andContentDeleteNotBetween(Boolean value1, Boolean value2) {
            addCriterion("content_delete not between", value1, value2, "contentDelete");
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