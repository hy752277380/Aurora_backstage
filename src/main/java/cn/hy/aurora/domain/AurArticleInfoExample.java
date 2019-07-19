package cn.hy.aurora.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AurArticleInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AurArticleInfoExample() {
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

        public Criteria andArticleTitleIsNull() {
            addCriterion("article_title is null");
            return (Criteria) this;
        }

        public Criteria andArticleTitleIsNotNull() {
            addCriterion("article_title is not null");
            return (Criteria) this;
        }

        public Criteria andArticleTitleEqualTo(String value) {
            addCriterion("article_title =", value, "articleTitle");
            return (Criteria) this;
        }

        public Criteria andArticleTitleNotEqualTo(String value) {
            addCriterion("article_title <>", value, "articleTitle");
            return (Criteria) this;
        }

        public Criteria andArticleTitleGreaterThan(String value) {
            addCriterion("article_title >", value, "articleTitle");
            return (Criteria) this;
        }

        public Criteria andArticleTitleGreaterThanOrEqualTo(String value) {
            addCriterion("article_title >=", value, "articleTitle");
            return (Criteria) this;
        }

        public Criteria andArticleTitleLessThan(String value) {
            addCriterion("article_title <", value, "articleTitle");
            return (Criteria) this;
        }

        public Criteria andArticleTitleLessThanOrEqualTo(String value) {
            addCriterion("article_title <=", value, "articleTitle");
            return (Criteria) this;
        }

        public Criteria andArticleTitleLike(String value) {
            addCriterion("article_title like", value, "articleTitle");
            return (Criteria) this;
        }

        public Criteria andArticleTitleNotLike(String value) {
            addCriterion("article_title not like", value, "articleTitle");
            return (Criteria) this;
        }

        public Criteria andArticleTitleIn(List<String> values) {
            addCriterion("article_title in", values, "articleTitle");
            return (Criteria) this;
        }

        public Criteria andArticleTitleNotIn(List<String> values) {
            addCriterion("article_title not in", values, "articleTitle");
            return (Criteria) this;
        }

        public Criteria andArticleTitleBetween(String value1, String value2) {
            addCriterion("article_title between", value1, value2, "articleTitle");
            return (Criteria) this;
        }

        public Criteria andArticleTitleNotBetween(String value1, String value2) {
            addCriterion("article_title not between", value1, value2, "articleTitle");
            return (Criteria) this;
        }

        public Criteria andArticleAuthorIsNull() {
            addCriterion("article_author is null");
            return (Criteria) this;
        }

        public Criteria andArticleAuthorIsNotNull() {
            addCriterion("article_author is not null");
            return (Criteria) this;
        }

        public Criteria andArticleAuthorEqualTo(Integer value) {
            addCriterion("article_author =", value, "articleAuthor");
            return (Criteria) this;
        }

        public Criteria andArticleAuthorNotEqualTo(Integer value) {
            addCriterion("article_author <>", value, "articleAuthor");
            return (Criteria) this;
        }

        public Criteria andArticleAuthorGreaterThan(Integer value) {
            addCriterion("article_author >", value, "articleAuthor");
            return (Criteria) this;
        }

        public Criteria andArticleAuthorGreaterThanOrEqualTo(Integer value) {
            addCriterion("article_author >=", value, "articleAuthor");
            return (Criteria) this;
        }

        public Criteria andArticleAuthorLessThan(Integer value) {
            addCriterion("article_author <", value, "articleAuthor");
            return (Criteria) this;
        }

        public Criteria andArticleAuthorLessThanOrEqualTo(Integer value) {
            addCriterion("article_author <=", value, "articleAuthor");
            return (Criteria) this;
        }

        public Criteria andArticleAuthorIn(List<Integer> values) {
            addCriterion("article_author in", values, "articleAuthor");
            return (Criteria) this;
        }

        public Criteria andArticleAuthorNotIn(List<Integer> values) {
            addCriterion("article_author not in", values, "articleAuthor");
            return (Criteria) this;
        }

        public Criteria andArticleAuthorBetween(Integer value1, Integer value2) {
            addCriterion("article_author between", value1, value2, "articleAuthor");
            return (Criteria) this;
        }

        public Criteria andArticleAuthorNotBetween(Integer value1, Integer value2) {
            addCriterion("article_author not between", value1, value2, "articleAuthor");
            return (Criteria) this;
        }

        public Criteria andArticleLabelIsNull() {
            addCriterion("article_label is null");
            return (Criteria) this;
        }

        public Criteria andArticleLabelIsNotNull() {
            addCriterion("article_label is not null");
            return (Criteria) this;
        }

        public Criteria andArticleLabelEqualTo(Integer value) {
            addCriterion("article_label =", value, "articleLabel");
            return (Criteria) this;
        }

        public Criteria andArticleLabelNotEqualTo(Integer value) {
            addCriterion("article_label <>", value, "articleLabel");
            return (Criteria) this;
        }

        public Criteria andArticleLabelGreaterThan(Integer value) {
            addCriterion("article_label >", value, "articleLabel");
            return (Criteria) this;
        }

        public Criteria andArticleLabelGreaterThanOrEqualTo(Integer value) {
            addCriterion("article_label >=", value, "articleLabel");
            return (Criteria) this;
        }

        public Criteria andArticleLabelLessThan(Integer value) {
            addCriterion("article_label <", value, "articleLabel");
            return (Criteria) this;
        }

        public Criteria andArticleLabelLessThanOrEqualTo(Integer value) {
            addCriterion("article_label <=", value, "articleLabel");
            return (Criteria) this;
        }

        public Criteria andArticleLabelIn(List<Integer> values) {
            addCriterion("article_label in", values, "articleLabel");
            return (Criteria) this;
        }

        public Criteria andArticleLabelNotIn(List<Integer> values) {
            addCriterion("article_label not in", values, "articleLabel");
            return (Criteria) this;
        }

        public Criteria andArticleLabelBetween(Integer value1, Integer value2) {
            addCriterion("article_label between", value1, value2, "articleLabel");
            return (Criteria) this;
        }

        public Criteria andArticleLabelNotBetween(Integer value1, Integer value2) {
            addCriterion("article_label not between", value1, value2, "articleLabel");
            return (Criteria) this;
        }

        public Criteria andArticleCreatorIsNull() {
            addCriterion("article_creator is null");
            return (Criteria) this;
        }

        public Criteria andArticleCreatorIsNotNull() {
            addCriterion("article_creator is not null");
            return (Criteria) this;
        }

        public Criteria andArticleCreatorEqualTo(Integer value) {
            addCriterion("article_creator =", value, "articleCreator");
            return (Criteria) this;
        }

        public Criteria andArticleCreatorNotEqualTo(Integer value) {
            addCriterion("article_creator <>", value, "articleCreator");
            return (Criteria) this;
        }

        public Criteria andArticleCreatorGreaterThan(Integer value) {
            addCriterion("article_creator >", value, "articleCreator");
            return (Criteria) this;
        }

        public Criteria andArticleCreatorGreaterThanOrEqualTo(Integer value) {
            addCriterion("article_creator >=", value, "articleCreator");
            return (Criteria) this;
        }

        public Criteria andArticleCreatorLessThan(Integer value) {
            addCriterion("article_creator <", value, "articleCreator");
            return (Criteria) this;
        }

        public Criteria andArticleCreatorLessThanOrEqualTo(Integer value) {
            addCriterion("article_creator <=", value, "articleCreator");
            return (Criteria) this;
        }

        public Criteria andArticleCreatorIn(List<Integer> values) {
            addCriterion("article_creator in", values, "articleCreator");
            return (Criteria) this;
        }

        public Criteria andArticleCreatorNotIn(List<Integer> values) {
            addCriterion("article_creator not in", values, "articleCreator");
            return (Criteria) this;
        }

        public Criteria andArticleCreatorBetween(Integer value1, Integer value2) {
            addCriterion("article_creator between", value1, value2, "articleCreator");
            return (Criteria) this;
        }

        public Criteria andArticleCreatorNotBetween(Integer value1, Integer value2) {
            addCriterion("article_creator not between", value1, value2, "articleCreator");
            return (Criteria) this;
        }

        public Criteria andArticleCreateDateIsNull() {
            addCriterion("article_create_date is null");
            return (Criteria) this;
        }

        public Criteria andArticleCreateDateIsNotNull() {
            addCriterion("article_create_date is not null");
            return (Criteria) this;
        }

        public Criteria andArticleCreateDateEqualTo(Date value) {
            addCriterion("article_create_date =", value, "articleCreateDate");
            return (Criteria) this;
        }

        public Criteria andArticleCreateDateNotEqualTo(Date value) {
            addCriterion("article_create_date <>", value, "articleCreateDate");
            return (Criteria) this;
        }

        public Criteria andArticleCreateDateGreaterThan(Date value) {
            addCriterion("article_create_date >", value, "articleCreateDate");
            return (Criteria) this;
        }

        public Criteria andArticleCreateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("article_create_date >=", value, "articleCreateDate");
            return (Criteria) this;
        }

        public Criteria andArticleCreateDateLessThan(Date value) {
            addCriterion("article_create_date <", value, "articleCreateDate");
            return (Criteria) this;
        }

        public Criteria andArticleCreateDateLessThanOrEqualTo(Date value) {
            addCriterion("article_create_date <=", value, "articleCreateDate");
            return (Criteria) this;
        }

        public Criteria andArticleCreateDateIn(List<Date> values) {
            addCriterion("article_create_date in", values, "articleCreateDate");
            return (Criteria) this;
        }

        public Criteria andArticleCreateDateNotIn(List<Date> values) {
            addCriterion("article_create_date not in", values, "articleCreateDate");
            return (Criteria) this;
        }

        public Criteria andArticleCreateDateBetween(Date value1, Date value2) {
            addCriterion("article_create_date between", value1, value2, "articleCreateDate");
            return (Criteria) this;
        }

        public Criteria andArticleCreateDateNotBetween(Date value1, Date value2) {
            addCriterion("article_create_date not between", value1, value2, "articleCreateDate");
            return (Criteria) this;
        }

        public Criteria andArticleUpdateByIsNull() {
            addCriterion("article_update_by is null");
            return (Criteria) this;
        }

        public Criteria andArticleUpdateByIsNotNull() {
            addCriterion("article_update_by is not null");
            return (Criteria) this;
        }

        public Criteria andArticleUpdateByEqualTo(Integer value) {
            addCriterion("article_update_by =", value, "articleUpdateBy");
            return (Criteria) this;
        }

        public Criteria andArticleUpdateByNotEqualTo(Integer value) {
            addCriterion("article_update_by <>", value, "articleUpdateBy");
            return (Criteria) this;
        }

        public Criteria andArticleUpdateByGreaterThan(Integer value) {
            addCriterion("article_update_by >", value, "articleUpdateBy");
            return (Criteria) this;
        }

        public Criteria andArticleUpdateByGreaterThanOrEqualTo(Integer value) {
            addCriterion("article_update_by >=", value, "articleUpdateBy");
            return (Criteria) this;
        }

        public Criteria andArticleUpdateByLessThan(Integer value) {
            addCriterion("article_update_by <", value, "articleUpdateBy");
            return (Criteria) this;
        }

        public Criteria andArticleUpdateByLessThanOrEqualTo(Integer value) {
            addCriterion("article_update_by <=", value, "articleUpdateBy");
            return (Criteria) this;
        }

        public Criteria andArticleUpdateByIn(List<Integer> values) {
            addCriterion("article_update_by in", values, "articleUpdateBy");
            return (Criteria) this;
        }

        public Criteria andArticleUpdateByNotIn(List<Integer> values) {
            addCriterion("article_update_by not in", values, "articleUpdateBy");
            return (Criteria) this;
        }

        public Criteria andArticleUpdateByBetween(Integer value1, Integer value2) {
            addCriterion("article_update_by between", value1, value2, "articleUpdateBy");
            return (Criteria) this;
        }

        public Criteria andArticleUpdateByNotBetween(Integer value1, Integer value2) {
            addCriterion("article_update_by not between", value1, value2, "articleUpdateBy");
            return (Criteria) this;
        }

        public Criteria andArticleUpdateDateIsNull() {
            addCriterion("article_update_date is null");
            return (Criteria) this;
        }

        public Criteria andArticleUpdateDateIsNotNull() {
            addCriterion("article_update_date is not null");
            return (Criteria) this;
        }

        public Criteria andArticleUpdateDateEqualTo(Date value) {
            addCriterion("article_update_date =", value, "articleUpdateDate");
            return (Criteria) this;
        }

        public Criteria andArticleUpdateDateNotEqualTo(Date value) {
            addCriterion("article_update_date <>", value, "articleUpdateDate");
            return (Criteria) this;
        }

        public Criteria andArticleUpdateDateGreaterThan(Date value) {
            addCriterion("article_update_date >", value, "articleUpdateDate");
            return (Criteria) this;
        }

        public Criteria andArticleUpdateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("article_update_date >=", value, "articleUpdateDate");
            return (Criteria) this;
        }

        public Criteria andArticleUpdateDateLessThan(Date value) {
            addCriterion("article_update_date <", value, "articleUpdateDate");
            return (Criteria) this;
        }

        public Criteria andArticleUpdateDateLessThanOrEqualTo(Date value) {
            addCriterion("article_update_date <=", value, "articleUpdateDate");
            return (Criteria) this;
        }

        public Criteria andArticleUpdateDateIn(List<Date> values) {
            addCriterion("article_update_date in", values, "articleUpdateDate");
            return (Criteria) this;
        }

        public Criteria andArticleUpdateDateNotIn(List<Date> values) {
            addCriterion("article_update_date not in", values, "articleUpdateDate");
            return (Criteria) this;
        }

        public Criteria andArticleUpdateDateBetween(Date value1, Date value2) {
            addCriterion("article_update_date between", value1, value2, "articleUpdateDate");
            return (Criteria) this;
        }

        public Criteria andArticleUpdateDateNotBetween(Date value1, Date value2) {
            addCriterion("article_update_date not between", value1, value2, "articleUpdateDate");
            return (Criteria) this;
        }

        public Criteria andArticleVersionIsNull() {
            addCriterion("article_version is null");
            return (Criteria) this;
        }

        public Criteria andArticleVersionIsNotNull() {
            addCriterion("article_version is not null");
            return (Criteria) this;
        }

        public Criteria andArticleVersionEqualTo(Float value) {
            addCriterion("article_version =", value, "articleVersion");
            return (Criteria) this;
        }

        public Criteria andArticleVersionNotEqualTo(Float value) {
            addCriterion("article_version <>", value, "articleVersion");
            return (Criteria) this;
        }

        public Criteria andArticleVersionGreaterThan(Float value) {
            addCriterion("article_version >", value, "articleVersion");
            return (Criteria) this;
        }

        public Criteria andArticleVersionGreaterThanOrEqualTo(Float value) {
            addCriterion("article_version >=", value, "articleVersion");
            return (Criteria) this;
        }

        public Criteria andArticleVersionLessThan(Float value) {
            addCriterion("article_version <", value, "articleVersion");
            return (Criteria) this;
        }

        public Criteria andArticleVersionLessThanOrEqualTo(Float value) {
            addCriterion("article_version <=", value, "articleVersion");
            return (Criteria) this;
        }

        public Criteria andArticleVersionIn(List<Float> values) {
            addCriterion("article_version in", values, "articleVersion");
            return (Criteria) this;
        }

        public Criteria andArticleVersionNotIn(List<Float> values) {
            addCriterion("article_version not in", values, "articleVersion");
            return (Criteria) this;
        }

        public Criteria andArticleVersionBetween(Float value1, Float value2) {
            addCriterion("article_version between", value1, value2, "articleVersion");
            return (Criteria) this;
        }

        public Criteria andArticleVersionNotBetween(Float value1, Float value2) {
            addCriterion("article_version not between", value1, value2, "articleVersion");
            return (Criteria) this;
        }

        public Criteria andArticleOriginalIsNull() {
            addCriterion("article_original is null");
            return (Criteria) this;
        }

        public Criteria andArticleOriginalIsNotNull() {
            addCriterion("article_original is not null");
            return (Criteria) this;
        }

        public Criteria andArticleOriginalEqualTo(Boolean value) {
            addCriterion("article_original =", value, "articleOriginal");
            return (Criteria) this;
        }

        public Criteria andArticleOriginalNotEqualTo(Boolean value) {
            addCriterion("article_original <>", value, "articleOriginal");
            return (Criteria) this;
        }

        public Criteria andArticleOriginalGreaterThan(Boolean value) {
            addCriterion("article_original >", value, "articleOriginal");
            return (Criteria) this;
        }

        public Criteria andArticleOriginalGreaterThanOrEqualTo(Boolean value) {
            addCriterion("article_original >=", value, "articleOriginal");
            return (Criteria) this;
        }

        public Criteria andArticleOriginalLessThan(Boolean value) {
            addCriterion("article_original <", value, "articleOriginal");
            return (Criteria) this;
        }

        public Criteria andArticleOriginalLessThanOrEqualTo(Boolean value) {
            addCriterion("article_original <=", value, "articleOriginal");
            return (Criteria) this;
        }

        public Criteria andArticleOriginalIn(List<Boolean> values) {
            addCriterion("article_original in", values, "articleOriginal");
            return (Criteria) this;
        }

        public Criteria andArticleOriginalNotIn(List<Boolean> values) {
            addCriterion("article_original not in", values, "articleOriginal");
            return (Criteria) this;
        }

        public Criteria andArticleOriginalBetween(Boolean value1, Boolean value2) {
            addCriterion("article_original between", value1, value2, "articleOriginal");
            return (Criteria) this;
        }

        public Criteria andArticleOriginalNotBetween(Boolean value1, Boolean value2) {
            addCriterion("article_original not between", value1, value2, "articleOriginal");
            return (Criteria) this;
        }

        public Criteria andArticleOriginalLinkIsNull() {
            addCriterion("article_original_link is null");
            return (Criteria) this;
        }

        public Criteria andArticleOriginalLinkIsNotNull() {
            addCriterion("article_original_link is not null");
            return (Criteria) this;
        }

        public Criteria andArticleOriginalLinkEqualTo(String value) {
            addCriterion("article_original_link =", value, "articleOriginalLink");
            return (Criteria) this;
        }

        public Criteria andArticleOriginalLinkNotEqualTo(String value) {
            addCriterion("article_original_link <>", value, "articleOriginalLink");
            return (Criteria) this;
        }

        public Criteria andArticleOriginalLinkGreaterThan(String value) {
            addCriterion("article_original_link >", value, "articleOriginalLink");
            return (Criteria) this;
        }

        public Criteria andArticleOriginalLinkGreaterThanOrEqualTo(String value) {
            addCriterion("article_original_link >=", value, "articleOriginalLink");
            return (Criteria) this;
        }

        public Criteria andArticleOriginalLinkLessThan(String value) {
            addCriterion("article_original_link <", value, "articleOriginalLink");
            return (Criteria) this;
        }

        public Criteria andArticleOriginalLinkLessThanOrEqualTo(String value) {
            addCriterion("article_original_link <=", value, "articleOriginalLink");
            return (Criteria) this;
        }

        public Criteria andArticleOriginalLinkLike(String value) {
            addCriterion("article_original_link like", value, "articleOriginalLink");
            return (Criteria) this;
        }

        public Criteria andArticleOriginalLinkNotLike(String value) {
            addCriterion("article_original_link not like", value, "articleOriginalLink");
            return (Criteria) this;
        }

        public Criteria andArticleOriginalLinkIn(List<String> values) {
            addCriterion("article_original_link in", values, "articleOriginalLink");
            return (Criteria) this;
        }

        public Criteria andArticleOriginalLinkNotIn(List<String> values) {
            addCriterion("article_original_link not in", values, "articleOriginalLink");
            return (Criteria) this;
        }

        public Criteria andArticleOriginalLinkBetween(String value1, String value2) {
            addCriterion("article_original_link between", value1, value2, "articleOriginalLink");
            return (Criteria) this;
        }

        public Criteria andArticleOriginalLinkNotBetween(String value1, String value2) {
            addCriterion("article_original_link not between", value1, value2, "articleOriginalLink");
            return (Criteria) this;
        }

        public Criteria andArticleSecretIsNull() {
            addCriterion("article_secret is null");
            return (Criteria) this;
        }

        public Criteria andArticleSecretIsNotNull() {
            addCriterion("article_secret is not null");
            return (Criteria) this;
        }

        public Criteria andArticleSecretEqualTo(Boolean value) {
            addCriterion("article_secret =", value, "articleSecret");
            return (Criteria) this;
        }

        public Criteria andArticleSecretNotEqualTo(Boolean value) {
            addCriterion("article_secret <>", value, "articleSecret");
            return (Criteria) this;
        }

        public Criteria andArticleSecretGreaterThan(Boolean value) {
            addCriterion("article_secret >", value, "articleSecret");
            return (Criteria) this;
        }

        public Criteria andArticleSecretGreaterThanOrEqualTo(Boolean value) {
            addCriterion("article_secret >=", value, "articleSecret");
            return (Criteria) this;
        }

        public Criteria andArticleSecretLessThan(Boolean value) {
            addCriterion("article_secret <", value, "articleSecret");
            return (Criteria) this;
        }

        public Criteria andArticleSecretLessThanOrEqualTo(Boolean value) {
            addCriterion("article_secret <=", value, "articleSecret");
            return (Criteria) this;
        }

        public Criteria andArticleSecretIn(List<Boolean> values) {
            addCriterion("article_secret in", values, "articleSecret");
            return (Criteria) this;
        }

        public Criteria andArticleSecretNotIn(List<Boolean> values) {
            addCriterion("article_secret not in", values, "articleSecret");
            return (Criteria) this;
        }

        public Criteria andArticleSecretBetween(Boolean value1, Boolean value2) {
            addCriterion("article_secret between", value1, value2, "articleSecret");
            return (Criteria) this;
        }

        public Criteria andArticleSecretNotBetween(Boolean value1, Boolean value2) {
            addCriterion("article_secret not between", value1, value2, "articleSecret");
            return (Criteria) this;
        }

        public Criteria andArticleTopIsNull() {
            addCriterion("article_top is null");
            return (Criteria) this;
        }

        public Criteria andArticleTopIsNotNull() {
            addCriterion("article_top is not null");
            return (Criteria) this;
        }

        public Criteria andArticleTopEqualTo(Boolean value) {
            addCriterion("article_top =", value, "articleTop");
            return (Criteria) this;
        }

        public Criteria andArticleTopNotEqualTo(Boolean value) {
            addCriterion("article_top <>", value, "articleTop");
            return (Criteria) this;
        }

        public Criteria andArticleTopGreaterThan(Boolean value) {
            addCriterion("article_top >", value, "articleTop");
            return (Criteria) this;
        }

        public Criteria andArticleTopGreaterThanOrEqualTo(Boolean value) {
            addCriterion("article_top >=", value, "articleTop");
            return (Criteria) this;
        }

        public Criteria andArticleTopLessThan(Boolean value) {
            addCriterion("article_top <", value, "articleTop");
            return (Criteria) this;
        }

        public Criteria andArticleTopLessThanOrEqualTo(Boolean value) {
            addCriterion("article_top <=", value, "articleTop");
            return (Criteria) this;
        }

        public Criteria andArticleTopIn(List<Boolean> values) {
            addCriterion("article_top in", values, "articleTop");
            return (Criteria) this;
        }

        public Criteria andArticleTopNotIn(List<Boolean> values) {
            addCriterion("article_top not in", values, "articleTop");
            return (Criteria) this;
        }

        public Criteria andArticleTopBetween(Boolean value1, Boolean value2) {
            addCriterion("article_top between", value1, value2, "articleTop");
            return (Criteria) this;
        }

        public Criteria andArticleTopNotBetween(Boolean value1, Boolean value2) {
            addCriterion("article_top not between", value1, value2, "articleTop");
            return (Criteria) this;
        }

        public Criteria andArticleDeletedIsNull() {
            addCriterion("article_deleted is null");
            return (Criteria) this;
        }

        public Criteria andArticleDeletedIsNotNull() {
            addCriterion("article_deleted is not null");
            return (Criteria) this;
        }

        public Criteria andArticleDeletedEqualTo(Boolean value) {
            addCriterion("article_deleted =", value, "articleDeleted");
            return (Criteria) this;
        }

        public Criteria andArticleDeletedNotEqualTo(Boolean value) {
            addCriterion("article_deleted <>", value, "articleDeleted");
            return (Criteria) this;
        }

        public Criteria andArticleDeletedGreaterThan(Boolean value) {
            addCriterion("article_deleted >", value, "articleDeleted");
            return (Criteria) this;
        }

        public Criteria andArticleDeletedGreaterThanOrEqualTo(Boolean value) {
            addCriterion("article_deleted >=", value, "articleDeleted");
            return (Criteria) this;
        }

        public Criteria andArticleDeletedLessThan(Boolean value) {
            addCriterion("article_deleted <", value, "articleDeleted");
            return (Criteria) this;
        }

        public Criteria andArticleDeletedLessThanOrEqualTo(Boolean value) {
            addCriterion("article_deleted <=", value, "articleDeleted");
            return (Criteria) this;
        }

        public Criteria andArticleDeletedIn(List<Boolean> values) {
            addCriterion("article_deleted in", values, "articleDeleted");
            return (Criteria) this;
        }

        public Criteria andArticleDeletedNotIn(List<Boolean> values) {
            addCriterion("article_deleted not in", values, "articleDeleted");
            return (Criteria) this;
        }

        public Criteria andArticleDeletedBetween(Boolean value1, Boolean value2) {
            addCriterion("article_deleted between", value1, value2, "articleDeleted");
            return (Criteria) this;
        }

        public Criteria andArticleDeletedNotBetween(Boolean value1, Boolean value2) {
            addCriterion("article_deleted not between", value1, value2, "articleDeleted");
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