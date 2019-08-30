package cn.hy.aurora.domain;

import java.util.ArrayList;
import java.util.List;

public class AurSysUserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AurSysUserExample() {
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

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserNicknameIsNull() {
            addCriterion("user_nickname is null");
            return (Criteria) this;
        }

        public Criteria andUserNicknameIsNotNull() {
            addCriterion("user_nickname is not null");
            return (Criteria) this;
        }

        public Criteria andUserNicknameEqualTo(String value) {
            addCriterion("user_nickname =", value, "userNickname");
            return (Criteria) this;
        }

        public Criteria andUserNicknameNotEqualTo(String value) {
            addCriterion("user_nickname <>", value, "userNickname");
            return (Criteria) this;
        }

        public Criteria andUserNicknameGreaterThan(String value) {
            addCriterion("user_nickname >", value, "userNickname");
            return (Criteria) this;
        }

        public Criteria andUserNicknameGreaterThanOrEqualTo(String value) {
            addCriterion("user_nickname >=", value, "userNickname");
            return (Criteria) this;
        }

        public Criteria andUserNicknameLessThan(String value) {
            addCriterion("user_nickname <", value, "userNickname");
            return (Criteria) this;
        }

        public Criteria andUserNicknameLessThanOrEqualTo(String value) {
            addCriterion("user_nickname <=", value, "userNickname");
            return (Criteria) this;
        }

        public Criteria andUserNicknameLike(String value) {
            addCriterion("user_nickname like", value, "userNickname");
            return (Criteria) this;
        }

        public Criteria andUserNicknameNotLike(String value) {
            addCriterion("user_nickname not like", value, "userNickname");
            return (Criteria) this;
        }

        public Criteria andUserNicknameIn(List<String> values) {
            addCriterion("user_nickname in", values, "userNickname");
            return (Criteria) this;
        }

        public Criteria andUserNicknameNotIn(List<String> values) {
            addCriterion("user_nickname not in", values, "userNickname");
            return (Criteria) this;
        }

        public Criteria andUserNicknameBetween(String value1, String value2) {
            addCriterion("user_nickname between", value1, value2, "userNickname");
            return (Criteria) this;
        }

        public Criteria andUserNicknameNotBetween(String value1, String value2) {
            addCriterion("user_nickname not between", value1, value2, "userNickname");
            return (Criteria) this;
        }

        public Criteria andUserEmailIsNull() {
            addCriterion("user_email is null");
            return (Criteria) this;
        }

        public Criteria andUserEmailIsNotNull() {
            addCriterion("user_email is not null");
            return (Criteria) this;
        }

        public Criteria andUserEmailEqualTo(String value) {
            addCriterion("user_email =", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailNotEqualTo(String value) {
            addCriterion("user_email <>", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailGreaterThan(String value) {
            addCriterion("user_email >", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailGreaterThanOrEqualTo(String value) {
            addCriterion("user_email >=", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailLessThan(String value) {
            addCriterion("user_email <", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailLessThanOrEqualTo(String value) {
            addCriterion("user_email <=", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailLike(String value) {
            addCriterion("user_email like", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailNotLike(String value) {
            addCriterion("user_email not like", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailIn(List<String> values) {
            addCriterion("user_email in", values, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailNotIn(List<String> values) {
            addCriterion("user_email not in", values, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailBetween(String value1, String value2) {
            addCriterion("user_email between", value1, value2, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailNotBetween(String value1, String value2) {
            addCriterion("user_email not between", value1, value2, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserGithubIsNull() {
            addCriterion("user_github is null");
            return (Criteria) this;
        }

        public Criteria andUserGithubIsNotNull() {
            addCriterion("user_github is not null");
            return (Criteria) this;
        }

        public Criteria andUserGithubEqualTo(String value) {
            addCriterion("user_github =", value, "userGithub");
            return (Criteria) this;
        }

        public Criteria andUserGithubNotEqualTo(String value) {
            addCriterion("user_github <>", value, "userGithub");
            return (Criteria) this;
        }

        public Criteria andUserGithubGreaterThan(String value) {
            addCriterion("user_github >", value, "userGithub");
            return (Criteria) this;
        }

        public Criteria andUserGithubGreaterThanOrEqualTo(String value) {
            addCriterion("user_github >=", value, "userGithub");
            return (Criteria) this;
        }

        public Criteria andUserGithubLessThan(String value) {
            addCriterion("user_github <", value, "userGithub");
            return (Criteria) this;
        }

        public Criteria andUserGithubLessThanOrEqualTo(String value) {
            addCriterion("user_github <=", value, "userGithub");
            return (Criteria) this;
        }

        public Criteria andUserGithubLike(String value) {
            addCriterion("user_github like", value, "userGithub");
            return (Criteria) this;
        }

        public Criteria andUserGithubNotLike(String value) {
            addCriterion("user_github not like", value, "userGithub");
            return (Criteria) this;
        }

        public Criteria andUserGithubIn(List<String> values) {
            addCriterion("user_github in", values, "userGithub");
            return (Criteria) this;
        }

        public Criteria andUserGithubNotIn(List<String> values) {
            addCriterion("user_github not in", values, "userGithub");
            return (Criteria) this;
        }

        public Criteria andUserGithubBetween(String value1, String value2) {
            addCriterion("user_github between", value1, value2, "userGithub");
            return (Criteria) this;
        }

        public Criteria andUserGithubNotBetween(String value1, String value2) {
            addCriterion("user_github not between", value1, value2, "userGithub");
            return (Criteria) this;
        }

        public Criteria andUserAuthCodeIsNull() {
            addCriterion("user_auth_code is null");
            return (Criteria) this;
        }

        public Criteria andUserAuthCodeIsNotNull() {
            addCriterion("user_auth_code is not null");
            return (Criteria) this;
        }

        public Criteria andUserAuthCodeEqualTo(String value) {
            addCriterion("user_auth_code =", value, "userAuthCode");
            return (Criteria) this;
        }

        public Criteria andUserAuthCodeNotEqualTo(String value) {
            addCriterion("user_auth_code <>", value, "userAuthCode");
            return (Criteria) this;
        }

        public Criteria andUserAuthCodeGreaterThan(String value) {
            addCriterion("user_auth_code >", value, "userAuthCode");
            return (Criteria) this;
        }

        public Criteria andUserAuthCodeGreaterThanOrEqualTo(String value) {
            addCriterion("user_auth_code >=", value, "userAuthCode");
            return (Criteria) this;
        }

        public Criteria andUserAuthCodeLessThan(String value) {
            addCriterion("user_auth_code <", value, "userAuthCode");
            return (Criteria) this;
        }

        public Criteria andUserAuthCodeLessThanOrEqualTo(String value) {
            addCriterion("user_auth_code <=", value, "userAuthCode");
            return (Criteria) this;
        }

        public Criteria andUserAuthCodeLike(String value) {
            addCriterion("user_auth_code like", value, "userAuthCode");
            return (Criteria) this;
        }

        public Criteria andUserAuthCodeNotLike(String value) {
            addCriterion("user_auth_code not like", value, "userAuthCode");
            return (Criteria) this;
        }

        public Criteria andUserAuthCodeIn(List<String> values) {
            addCriterion("user_auth_code in", values, "userAuthCode");
            return (Criteria) this;
        }

        public Criteria andUserAuthCodeNotIn(List<String> values) {
            addCriterion("user_auth_code not in", values, "userAuthCode");
            return (Criteria) this;
        }

        public Criteria andUserAuthCodeBetween(String value1, String value2) {
            addCriterion("user_auth_code between", value1, value2, "userAuthCode");
            return (Criteria) this;
        }

        public Criteria andUserAuthCodeNotBetween(String value1, String value2) {
            addCriterion("user_auth_code not between", value1, value2, "userAuthCode");
            return (Criteria) this;
        }

        public Criteria andUserProfilePhotoIsNull() {
            addCriterion("user_profile_photo is null");
            return (Criteria) this;
        }

        public Criteria andUserProfilePhotoIsNotNull() {
            addCriterion("user_profile_photo is not null");
            return (Criteria) this;
        }

        public Criteria andUserProfilePhotoEqualTo(String value) {
            addCriterion("user_profile_photo =", value, "userProfilePhoto");
            return (Criteria) this;
        }

        public Criteria andUserProfilePhotoNotEqualTo(String value) {
            addCriterion("user_profile_photo <>", value, "userProfilePhoto");
            return (Criteria) this;
        }

        public Criteria andUserProfilePhotoGreaterThan(String value) {
            addCriterion("user_profile_photo >", value, "userProfilePhoto");
            return (Criteria) this;
        }

        public Criteria andUserProfilePhotoGreaterThanOrEqualTo(String value) {
            addCriterion("user_profile_photo >=", value, "userProfilePhoto");
            return (Criteria) this;
        }

        public Criteria andUserProfilePhotoLessThan(String value) {
            addCriterion("user_profile_photo <", value, "userProfilePhoto");
            return (Criteria) this;
        }

        public Criteria andUserProfilePhotoLessThanOrEqualTo(String value) {
            addCriterion("user_profile_photo <=", value, "userProfilePhoto");
            return (Criteria) this;
        }

        public Criteria andUserProfilePhotoLike(String value) {
            addCriterion("user_profile_photo like", value, "userProfilePhoto");
            return (Criteria) this;
        }

        public Criteria andUserProfilePhotoNotLike(String value) {
            addCriterion("user_profile_photo not like", value, "userProfilePhoto");
            return (Criteria) this;
        }

        public Criteria andUserProfilePhotoIn(List<String> values) {
            addCriterion("user_profile_photo in", values, "userProfilePhoto");
            return (Criteria) this;
        }

        public Criteria andUserProfilePhotoNotIn(List<String> values) {
            addCriterion("user_profile_photo not in", values, "userProfilePhoto");
            return (Criteria) this;
        }

        public Criteria andUserProfilePhotoBetween(String value1, String value2) {
            addCriterion("user_profile_photo between", value1, value2, "userProfilePhoto");
            return (Criteria) this;
        }

        public Criteria andUserProfilePhotoNotBetween(String value1, String value2) {
            addCriterion("user_profile_photo not between", value1, value2, "userProfilePhoto");
            return (Criteria) this;
        }

        public Criteria andUserRegistrationTimeIsNull() {
            addCriterion("user_registration_time is null");
            return (Criteria) this;
        }

        public Criteria andUserRegistrationTimeIsNotNull() {
            addCriterion("user_registration_time is not null");
            return (Criteria) this;
        }

        public Criteria andUserRegistrationTimeEqualTo(String value) {
            addCriterion("user_registration_time =", value, "userRegistrationTime");
            return (Criteria) this;
        }

        public Criteria andUserRegistrationTimeNotEqualTo(String value) {
            addCriterion("user_registration_time <>", value, "userRegistrationTime");
            return (Criteria) this;
        }

        public Criteria andUserRegistrationTimeGreaterThan(String value) {
            addCriterion("user_registration_time >", value, "userRegistrationTime");
            return (Criteria) this;
        }

        public Criteria andUserRegistrationTimeGreaterThanOrEqualTo(String value) {
            addCriterion("user_registration_time >=", value, "userRegistrationTime");
            return (Criteria) this;
        }

        public Criteria andUserRegistrationTimeLessThan(String value) {
            addCriterion("user_registration_time <", value, "userRegistrationTime");
            return (Criteria) this;
        }

        public Criteria andUserRegistrationTimeLessThanOrEqualTo(String value) {
            addCriterion("user_registration_time <=", value, "userRegistrationTime");
            return (Criteria) this;
        }

        public Criteria andUserRegistrationTimeLike(String value) {
            addCriterion("user_registration_time like", value, "userRegistrationTime");
            return (Criteria) this;
        }

        public Criteria andUserRegistrationTimeNotLike(String value) {
            addCriterion("user_registration_time not like", value, "userRegistrationTime");
            return (Criteria) this;
        }

        public Criteria andUserRegistrationTimeIn(List<String> values) {
            addCriterion("user_registration_time in", values, "userRegistrationTime");
            return (Criteria) this;
        }

        public Criteria andUserRegistrationTimeNotIn(List<String> values) {
            addCriterion("user_registration_time not in", values, "userRegistrationTime");
            return (Criteria) this;
        }

        public Criteria andUserRegistrationTimeBetween(String value1, String value2) {
            addCriterion("user_registration_time between", value1, value2, "userRegistrationTime");
            return (Criteria) this;
        }

        public Criteria andUserRegistrationTimeNotBetween(String value1, String value2) {
            addCriterion("user_registration_time not between", value1, value2, "userRegistrationTime");
            return (Criteria) this;
        }

        public Criteria andUserDeletedIsNull() {
            addCriterion("user_deleted is null");
            return (Criteria) this;
        }

        public Criteria andUserDeletedIsNotNull() {
            addCriterion("user_deleted is not null");
            return (Criteria) this;
        }

        public Criteria andUserDeletedEqualTo(Boolean value) {
            addCriterion("user_deleted =", value, "userDeleted");
            return (Criteria) this;
        }

        public Criteria andUserDeletedNotEqualTo(Boolean value) {
            addCriterion("user_deleted <>", value, "userDeleted");
            return (Criteria) this;
        }

        public Criteria andUserDeletedGreaterThan(Boolean value) {
            addCriterion("user_deleted >", value, "userDeleted");
            return (Criteria) this;
        }

        public Criteria andUserDeletedGreaterThanOrEqualTo(Boolean value) {
            addCriterion("user_deleted >=", value, "userDeleted");
            return (Criteria) this;
        }

        public Criteria andUserDeletedLessThan(Boolean value) {
            addCriterion("user_deleted <", value, "userDeleted");
            return (Criteria) this;
        }

        public Criteria andUserDeletedLessThanOrEqualTo(Boolean value) {
            addCriterion("user_deleted <=", value, "userDeleted");
            return (Criteria) this;
        }

        public Criteria andUserDeletedIn(List<Boolean> values) {
            addCriterion("user_deleted in", values, "userDeleted");
            return (Criteria) this;
        }

        public Criteria andUserDeletedNotIn(List<Boolean> values) {
            addCriterion("user_deleted not in", values, "userDeleted");
            return (Criteria) this;
        }

        public Criteria andUserDeletedBetween(Boolean value1, Boolean value2) {
            addCriterion("user_deleted between", value1, value2, "userDeleted");
            return (Criteria) this;
        }

        public Criteria andUserDeletedNotBetween(Boolean value1, Boolean value2) {
            addCriterion("user_deleted not between", value1, value2, "userDeleted");
            return (Criteria) this;
        }

        public Criteria andUserRoleIsNull() {
            addCriterion("user_role is null");
            return (Criteria) this;
        }

        public Criteria andUserRoleIsNotNull() {
            addCriterion("user_role is not null");
            return (Criteria) this;
        }

        public Criteria andUserRoleEqualTo(String value) {
            addCriterion("user_role =", value, "userRole");
            return (Criteria) this;
        }

        public Criteria andUserRoleNotEqualTo(String value) {
            addCriterion("user_role <>", value, "userRole");
            return (Criteria) this;
        }

        public Criteria andUserRoleGreaterThan(String value) {
            addCriterion("user_role >", value, "userRole");
            return (Criteria) this;
        }

        public Criteria andUserRoleGreaterThanOrEqualTo(String value) {
            addCriterion("user_role >=", value, "userRole");
            return (Criteria) this;
        }

        public Criteria andUserRoleLessThan(String value) {
            addCriterion("user_role <", value, "userRole");
            return (Criteria) this;
        }

        public Criteria andUserRoleLessThanOrEqualTo(String value) {
            addCriterion("user_role <=", value, "userRole");
            return (Criteria) this;
        }

        public Criteria andUserRoleLike(String value) {
            addCriterion("user_role like", value, "userRole");
            return (Criteria) this;
        }

        public Criteria andUserRoleNotLike(String value) {
            addCriterion("user_role not like", value, "userRole");
            return (Criteria) this;
        }

        public Criteria andUserRoleIn(List<String> values) {
            addCriterion("user_role in", values, "userRole");
            return (Criteria) this;
        }

        public Criteria andUserRoleNotIn(List<String> values) {
            addCriterion("user_role not in", values, "userRole");
            return (Criteria) this;
        }

        public Criteria andUserRoleBetween(String value1, String value2) {
            addCriterion("user_role between", value1, value2, "userRole");
            return (Criteria) this;
        }

        public Criteria andUserRoleNotBetween(String value1, String value2) {
            addCriterion("user_role not between", value1, value2, "userRole");
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