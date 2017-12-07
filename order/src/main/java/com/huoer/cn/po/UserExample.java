package com.huoer.cn.po;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andTrueNameIsNull() {
            addCriterion("true_name is null");
            return (Criteria) this;
        }

        public Criteria andTrueNameIsNotNull() {
            addCriterion("true_name is not null");
            return (Criteria) this;
        }

        public Criteria andTrueNameEqualTo(String value) {
            addCriterion("true_name =", value, "trueName");
            return (Criteria) this;
        }

        public Criteria andTrueNameNotEqualTo(String value) {
            addCriterion("true_name <>", value, "trueName");
            return (Criteria) this;
        }

        public Criteria andTrueNameGreaterThan(String value) {
            addCriterion("true_name >", value, "trueName");
            return (Criteria) this;
        }

        public Criteria andTrueNameGreaterThanOrEqualTo(String value) {
            addCriterion("true_name >=", value, "trueName");
            return (Criteria) this;
        }

        public Criteria andTrueNameLessThan(String value) {
            addCriterion("true_name <", value, "trueName");
            return (Criteria) this;
        }

        public Criteria andTrueNameLessThanOrEqualTo(String value) {
            addCriterion("true_name <=", value, "trueName");
            return (Criteria) this;
        }

        public Criteria andTrueNameLike(String value) {
            addCriterion("true_name like", value, "trueName");
            return (Criteria) this;
        }

        public Criteria andTrueNameNotLike(String value) {
            addCriterion("true_name not like", value, "trueName");
            return (Criteria) this;
        }

        public Criteria andTrueNameIn(List<String> values) {
            addCriterion("true_name in", values, "trueName");
            return (Criteria) this;
        }

        public Criteria andTrueNameNotIn(List<String> values) {
            addCriterion("true_name not in", values, "trueName");
            return (Criteria) this;
        }

        public Criteria andTrueNameBetween(String value1, String value2) {
            addCriterion("true_name between", value1, value2, "trueName");
            return (Criteria) this;
        }

        public Criteria andTrueNameNotBetween(String value1, String value2) {
            addCriterion("true_name not between", value1, value2, "trueName");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNull() {
            addCriterion("user_name is null");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNotNull() {
            addCriterion("user_name is not null");
            return (Criteria) this;
        }

        public Criteria andUserNameEqualTo(String value) {
            addCriterion("user_name =", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotEqualTo(String value) {
            addCriterion("user_name <>", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThan(String value) {
            addCriterion("user_name >", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("user_name >=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThan(String value) {
            addCriterion("user_name <", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThanOrEqualTo(String value) {
            addCriterion("user_name <=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLike(String value) {
            addCriterion("user_name like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotLike(String value) {
            addCriterion("user_name not like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameIn(List<String> values) {
            addCriterion("user_name in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotIn(List<String> values) {
            addCriterion("user_name not in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameBetween(String value1, String value2) {
            addCriterion("user_name between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotBetween(String value1, String value2) {
            addCriterion("user_name not between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserYearIsNull() {
            addCriterion("user_year is null");
            return (Criteria) this;
        }

        public Criteria andUserYearIsNotNull() {
            addCriterion("user_year is not null");
            return (Criteria) this;
        }

        public Criteria andUserYearEqualTo(Integer value) {
            addCriterion("user_year =", value, "userYear");
            return (Criteria) this;
        }

        public Criteria andUserYearNotEqualTo(Integer value) {
            addCriterion("user_year <>", value, "userYear");
            return (Criteria) this;
        }

        public Criteria andUserYearGreaterThan(Integer value) {
            addCriterion("user_year >", value, "userYear");
            return (Criteria) this;
        }

        public Criteria andUserYearGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_year >=", value, "userYear");
            return (Criteria) this;
        }

        public Criteria andUserYearLessThan(Integer value) {
            addCriterion("user_year <", value, "userYear");
            return (Criteria) this;
        }

        public Criteria andUserYearLessThanOrEqualTo(Integer value) {
            addCriterion("user_year <=", value, "userYear");
            return (Criteria) this;
        }

        public Criteria andUserYearIn(List<Integer> values) {
            addCriterion("user_year in", values, "userYear");
            return (Criteria) this;
        }

        public Criteria andUserYearNotIn(List<Integer> values) {
            addCriterion("user_year not in", values, "userYear");
            return (Criteria) this;
        }

        public Criteria andUserYearBetween(Integer value1, Integer value2) {
            addCriterion("user_year between", value1, value2, "userYear");
            return (Criteria) this;
        }

        public Criteria andUserYearNotBetween(Integer value1, Integer value2) {
            addCriterion("user_year not between", value1, value2, "userYear");
            return (Criteria) this;
        }

        public Criteria andUserMobileIsNull() {
            addCriterion("user_mobile is null");
            return (Criteria) this;
        }

        public Criteria andUserMobileIsNotNull() {
            addCriterion("user_mobile is not null");
            return (Criteria) this;
        }

        public Criteria andUserMobileEqualTo(String value) {
            addCriterion("user_mobile =", value, "userMobile");
            return (Criteria) this;
        }

        public Criteria andUserMobileNotEqualTo(String value) {
            addCriterion("user_mobile <>", value, "userMobile");
            return (Criteria) this;
        }

        public Criteria andUserMobileGreaterThan(String value) {
            addCriterion("user_mobile >", value, "userMobile");
            return (Criteria) this;
        }

        public Criteria andUserMobileGreaterThanOrEqualTo(String value) {
            addCriterion("user_mobile >=", value, "userMobile");
            return (Criteria) this;
        }

        public Criteria andUserMobileLessThan(String value) {
            addCriterion("user_mobile <", value, "userMobile");
            return (Criteria) this;
        }

        public Criteria andUserMobileLessThanOrEqualTo(String value) {
            addCriterion("user_mobile <=", value, "userMobile");
            return (Criteria) this;
        }

        public Criteria andUserMobileLike(String value) {
            addCriterion("user_mobile like", value, "userMobile");
            return (Criteria) this;
        }

        public Criteria andUserMobileNotLike(String value) {
            addCriterion("user_mobile not like", value, "userMobile");
            return (Criteria) this;
        }

        public Criteria andUserMobileIn(List<String> values) {
            addCriterion("user_mobile in", values, "userMobile");
            return (Criteria) this;
        }

        public Criteria andUserMobileNotIn(List<String> values) {
            addCriterion("user_mobile not in", values, "userMobile");
            return (Criteria) this;
        }

        public Criteria andUserMobileBetween(String value1, String value2) {
            addCriterion("user_mobile between", value1, value2, "userMobile");
            return (Criteria) this;
        }

        public Criteria andUserMobileNotBetween(String value1, String value2) {
            addCriterion("user_mobile not between", value1, value2, "userMobile");
            return (Criteria) this;
        }

        public Criteria andUserQqIsNull() {
            addCriterion("user_qq is null");
            return (Criteria) this;
        }

        public Criteria andUserQqIsNotNull() {
            addCriterion("user_qq is not null");
            return (Criteria) this;
        }

        public Criteria andUserQqEqualTo(String value) {
            addCriterion("user_qq =", value, "userQq");
            return (Criteria) this;
        }

        public Criteria andUserQqNotEqualTo(String value) {
            addCriterion("user_qq <>", value, "userQq");
            return (Criteria) this;
        }

        public Criteria andUserQqGreaterThan(String value) {
            addCriterion("user_qq >", value, "userQq");
            return (Criteria) this;
        }

        public Criteria andUserQqGreaterThanOrEqualTo(String value) {
            addCriterion("user_qq >=", value, "userQq");
            return (Criteria) this;
        }

        public Criteria andUserQqLessThan(String value) {
            addCriterion("user_qq <", value, "userQq");
            return (Criteria) this;
        }

        public Criteria andUserQqLessThanOrEqualTo(String value) {
            addCriterion("user_qq <=", value, "userQq");
            return (Criteria) this;
        }

        public Criteria andUserQqLike(String value) {
            addCriterion("user_qq like", value, "userQq");
            return (Criteria) this;
        }

        public Criteria andUserQqNotLike(String value) {
            addCriterion("user_qq not like", value, "userQq");
            return (Criteria) this;
        }

        public Criteria andUserQqIn(List<String> values) {
            addCriterion("user_qq in", values, "userQq");
            return (Criteria) this;
        }

        public Criteria andUserQqNotIn(List<String> values) {
            addCriterion("user_qq not in", values, "userQq");
            return (Criteria) this;
        }

        public Criteria andUserQqBetween(String value1, String value2) {
            addCriterion("user_qq between", value1, value2, "userQq");
            return (Criteria) this;
        }

        public Criteria andUserQqNotBetween(String value1, String value2) {
            addCriterion("user_qq not between", value1, value2, "userQq");
            return (Criteria) this;
        }

        public Criteria andUserWwIsNull() {
            addCriterion("user_ww is null");
            return (Criteria) this;
        }

        public Criteria andUserWwIsNotNull() {
            addCriterion("user_ww is not null");
            return (Criteria) this;
        }

        public Criteria andUserWwEqualTo(String value) {
            addCriterion("user_ww =", value, "userWw");
            return (Criteria) this;
        }

        public Criteria andUserWwNotEqualTo(String value) {
            addCriterion("user_ww <>", value, "userWw");
            return (Criteria) this;
        }

        public Criteria andUserWwGreaterThan(String value) {
            addCriterion("user_ww >", value, "userWw");
            return (Criteria) this;
        }

        public Criteria andUserWwGreaterThanOrEqualTo(String value) {
            addCriterion("user_ww >=", value, "userWw");
            return (Criteria) this;
        }

        public Criteria andUserWwLessThan(String value) {
            addCriterion("user_ww <", value, "userWw");
            return (Criteria) this;
        }

        public Criteria andUserWwLessThanOrEqualTo(String value) {
            addCriterion("user_ww <=", value, "userWw");
            return (Criteria) this;
        }

        public Criteria andUserWwLike(String value) {
            addCriterion("user_ww like", value, "userWw");
            return (Criteria) this;
        }

        public Criteria andUserWwNotLike(String value) {
            addCriterion("user_ww not like", value, "userWw");
            return (Criteria) this;
        }

        public Criteria andUserWwIn(List<String> values) {
            addCriterion("user_ww in", values, "userWw");
            return (Criteria) this;
        }

        public Criteria andUserWwNotIn(List<String> values) {
            addCriterion("user_ww not in", values, "userWw");
            return (Criteria) this;
        }

        public Criteria andUserWwBetween(String value1, String value2) {
            addCriterion("user_ww between", value1, value2, "userWw");
            return (Criteria) this;
        }

        public Criteria andUserWwNotBetween(String value1, String value2) {
            addCriterion("user_ww not between", value1, value2, "userWw");
            return (Criteria) this;
        }

        public Criteria andUserTelephoneIsNull() {
            addCriterion("user_telephone is null");
            return (Criteria) this;
        }

        public Criteria andUserTelephoneIsNotNull() {
            addCriterion("user_telephone is not null");
            return (Criteria) this;
        }

        public Criteria andUserTelephoneEqualTo(String value) {
            addCriterion("user_telephone =", value, "userTelephone");
            return (Criteria) this;
        }

        public Criteria andUserTelephoneNotEqualTo(String value) {
            addCriterion("user_telephone <>", value, "userTelephone");
            return (Criteria) this;
        }

        public Criteria andUserTelephoneGreaterThan(String value) {
            addCriterion("user_telephone >", value, "userTelephone");
            return (Criteria) this;
        }

        public Criteria andUserTelephoneGreaterThanOrEqualTo(String value) {
            addCriterion("user_telephone >=", value, "userTelephone");
            return (Criteria) this;
        }

        public Criteria andUserTelephoneLessThan(String value) {
            addCriterion("user_telephone <", value, "userTelephone");
            return (Criteria) this;
        }

        public Criteria andUserTelephoneLessThanOrEqualTo(String value) {
            addCriterion("user_telephone <=", value, "userTelephone");
            return (Criteria) this;
        }

        public Criteria andUserTelephoneLike(String value) {
            addCriterion("user_telephone like", value, "userTelephone");
            return (Criteria) this;
        }

        public Criteria andUserTelephoneNotLike(String value) {
            addCriterion("user_telephone not like", value, "userTelephone");
            return (Criteria) this;
        }

        public Criteria andUserTelephoneIn(List<String> values) {
            addCriterion("user_telephone in", values, "userTelephone");
            return (Criteria) this;
        }

        public Criteria andUserTelephoneNotIn(List<String> values) {
            addCriterion("user_telephone not in", values, "userTelephone");
            return (Criteria) this;
        }

        public Criteria andUserTelephoneBetween(String value1, String value2) {
            addCriterion("user_telephone between", value1, value2, "userTelephone");
            return (Criteria) this;
        }

        public Criteria andUserTelephoneNotBetween(String value1, String value2) {
            addCriterion("user_telephone not between", value1, value2, "userTelephone");
            return (Criteria) this;
        }

        public Criteria andUserAddressIsNull() {
            addCriterion("user_address is null");
            return (Criteria) this;
        }

        public Criteria andUserAddressIsNotNull() {
            addCriterion("user_address is not null");
            return (Criteria) this;
        }

        public Criteria andUserAddressEqualTo(String value) {
            addCriterion("user_address =", value, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressNotEqualTo(String value) {
            addCriterion("user_address <>", value, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressGreaterThan(String value) {
            addCriterion("user_address >", value, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressGreaterThanOrEqualTo(String value) {
            addCriterion("user_address >=", value, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressLessThan(String value) {
            addCriterion("user_address <", value, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressLessThanOrEqualTo(String value) {
            addCriterion("user_address <=", value, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressLike(String value) {
            addCriterion("user_address like", value, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressNotLike(String value) {
            addCriterion("user_address not like", value, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressIn(List<String> values) {
            addCriterion("user_address in", values, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressNotIn(List<String> values) {
            addCriterion("user_address not in", values, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressBetween(String value1, String value2) {
            addCriterion("user_address between", value1, value2, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressNotBetween(String value1, String value2) {
            addCriterion("user_address not between", value1, value2, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserBirthdayIsNull() {
            addCriterion("user_birthday is null");
            return (Criteria) this;
        }

        public Criteria andUserBirthdayIsNotNull() {
            addCriterion("user_birthday is not null");
            return (Criteria) this;
        }

        public Criteria andUserBirthdayEqualTo(Date value) {
            addCriterion("user_birthday =", value, "userBirthday");
            return (Criteria) this;
        }

        public Criteria andUserBirthdayNotEqualTo(Date value) {
            addCriterion("user_birthday <>", value, "userBirthday");
            return (Criteria) this;
        }

        public Criteria andUserBirthdayGreaterThan(Date value) {
            addCriterion("user_birthday >", value, "userBirthday");
            return (Criteria) this;
        }

        public Criteria andUserBirthdayGreaterThanOrEqualTo(Date value) {
            addCriterion("user_birthday >=", value, "userBirthday");
            return (Criteria) this;
        }

        public Criteria andUserBirthdayLessThan(Date value) {
            addCriterion("user_birthday <", value, "userBirthday");
            return (Criteria) this;
        }

        public Criteria andUserBirthdayLessThanOrEqualTo(Date value) {
            addCriterion("user_birthday <=", value, "userBirthday");
            return (Criteria) this;
        }

        public Criteria andUserBirthdayIn(List<Date> values) {
            addCriterion("user_birthday in", values, "userBirthday");
            return (Criteria) this;
        }

        public Criteria andUserBirthdayNotIn(List<Date> values) {
            addCriterion("user_birthday not in", values, "userBirthday");
            return (Criteria) this;
        }

        public Criteria andUserBirthdayBetween(Date value1, Date value2) {
            addCriterion("user_birthday between", value1, value2, "userBirthday");
            return (Criteria) this;
        }

        public Criteria andUserBirthdayNotBetween(Date value1, Date value2) {
            addCriterion("user_birthday not between", value1, value2, "userBirthday");
            return (Criteria) this;
        }

        public Criteria andSecurityMobileIsNull() {
            addCriterion("security_mobile is null");
            return (Criteria) this;
        }

        public Criteria andSecurityMobileIsNotNull() {
            addCriterion("security_mobile is not null");
            return (Criteria) this;
        }

        public Criteria andSecurityMobileEqualTo(String value) {
            addCriterion("security_mobile =", value, "securityMobile");
            return (Criteria) this;
        }

        public Criteria andSecurityMobileNotEqualTo(String value) {
            addCriterion("security_mobile <>", value, "securityMobile");
            return (Criteria) this;
        }

        public Criteria andSecurityMobileGreaterThan(String value) {
            addCriterion("security_mobile >", value, "securityMobile");
            return (Criteria) this;
        }

        public Criteria andSecurityMobileGreaterThanOrEqualTo(String value) {
            addCriterion("security_mobile >=", value, "securityMobile");
            return (Criteria) this;
        }

        public Criteria andSecurityMobileLessThan(String value) {
            addCriterion("security_mobile <", value, "securityMobile");
            return (Criteria) this;
        }

        public Criteria andSecurityMobileLessThanOrEqualTo(String value) {
            addCriterion("security_mobile <=", value, "securityMobile");
            return (Criteria) this;
        }

        public Criteria andSecurityMobileLike(String value) {
            addCriterion("security_mobile like", value, "securityMobile");
            return (Criteria) this;
        }

        public Criteria andSecurityMobileNotLike(String value) {
            addCriterion("security_mobile not like", value, "securityMobile");
            return (Criteria) this;
        }

        public Criteria andSecurityMobileIn(List<String> values) {
            addCriterion("security_mobile in", values, "securityMobile");
            return (Criteria) this;
        }

        public Criteria andSecurityMobileNotIn(List<String> values) {
            addCriterion("security_mobile not in", values, "securityMobile");
            return (Criteria) this;
        }

        public Criteria andSecurityMobileBetween(String value1, String value2) {
            addCriterion("security_mobile between", value1, value2, "securityMobile");
            return (Criteria) this;
        }

        public Criteria andSecurityMobileNotBetween(String value1, String value2) {
            addCriterion("security_mobile not between", value1, value2, "securityMobile");
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

        public Criteria andUserPasswordIsNull() {
            addCriterion("user_password is null");
            return (Criteria) this;
        }

        public Criteria andUserPasswordIsNotNull() {
            addCriterion("user_password is not null");
            return (Criteria) this;
        }

        public Criteria andUserPasswordEqualTo(String value) {
            addCriterion("user_password =", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordNotEqualTo(String value) {
            addCriterion("user_password <>", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordGreaterThan(String value) {
            addCriterion("user_password >", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("user_password >=", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordLessThan(String value) {
            addCriterion("user_password <", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordLessThanOrEqualTo(String value) {
            addCriterion("user_password <=", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordLike(String value) {
            addCriterion("user_password like", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordNotLike(String value) {
            addCriterion("user_password not like", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordIn(List<String> values) {
            addCriterion("user_password in", values, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordNotIn(List<String> values) {
            addCriterion("user_password not in", values, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordBetween(String value1, String value2) {
            addCriterion("user_password between", value1, value2, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordNotBetween(String value1, String value2) {
            addCriterion("user_password not between", value1, value2, "userPassword");
            return (Criteria) this;
        }

        public Criteria andAvailableBalanceIsNull() {
            addCriterion("available_balance is null");
            return (Criteria) this;
        }

        public Criteria andAvailableBalanceIsNotNull() {
            addCriterion("available_balance is not null");
            return (Criteria) this;
        }

        public Criteria andAvailableBalanceEqualTo(BigDecimal value) {
            addCriterion("available_balance =", value, "availableBalance");
            return (Criteria) this;
        }

        public Criteria andAvailableBalanceNotEqualTo(BigDecimal value) {
            addCriterion("available_balance <>", value, "availableBalance");
            return (Criteria) this;
        }

        public Criteria andAvailableBalanceGreaterThan(BigDecimal value) {
            addCriterion("available_balance >", value, "availableBalance");
            return (Criteria) this;
        }

        public Criteria andAvailableBalanceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("available_balance >=", value, "availableBalance");
            return (Criteria) this;
        }

        public Criteria andAvailableBalanceLessThan(BigDecimal value) {
            addCriterion("available_balance <", value, "availableBalance");
            return (Criteria) this;
        }

        public Criteria andAvailableBalanceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("available_balance <=", value, "availableBalance");
            return (Criteria) this;
        }

        public Criteria andAvailableBalanceIn(List<BigDecimal> values) {
            addCriterion("available_balance in", values, "availableBalance");
            return (Criteria) this;
        }

        public Criteria andAvailableBalanceNotIn(List<BigDecimal> values) {
            addCriterion("available_balance not in", values, "availableBalance");
            return (Criteria) this;
        }

        public Criteria andAvailableBalanceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("available_balance between", value1, value2, "availableBalance");
            return (Criteria) this;
        }

        public Criteria andAvailableBalanceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("available_balance not between", value1, value2, "availableBalance");
            return (Criteria) this;
        }

        public Criteria andFreezeBalanceIsNull() {
            addCriterion("freeze_balance is null");
            return (Criteria) this;
        }

        public Criteria andFreezeBalanceIsNotNull() {
            addCriterion("freeze_balance is not null");
            return (Criteria) this;
        }

        public Criteria andFreezeBalanceEqualTo(BigDecimal value) {
            addCriterion("freeze_balance =", value, "freezeBalance");
            return (Criteria) this;
        }

        public Criteria andFreezeBalanceNotEqualTo(BigDecimal value) {
            addCriterion("freeze_balance <>", value, "freezeBalance");
            return (Criteria) this;
        }

        public Criteria andFreezeBalanceGreaterThan(BigDecimal value) {
            addCriterion("freeze_balance >", value, "freezeBalance");
            return (Criteria) this;
        }

        public Criteria andFreezeBalanceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("freeze_balance >=", value, "freezeBalance");
            return (Criteria) this;
        }

        public Criteria andFreezeBalanceLessThan(BigDecimal value) {
            addCriterion("freeze_balance <", value, "freezeBalance");
            return (Criteria) this;
        }

        public Criteria andFreezeBalanceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("freeze_balance <=", value, "freezeBalance");
            return (Criteria) this;
        }

        public Criteria andFreezeBalanceIn(List<BigDecimal> values) {
            addCriterion("freeze_balance in", values, "freezeBalance");
            return (Criteria) this;
        }

        public Criteria andFreezeBalanceNotIn(List<BigDecimal> values) {
            addCriterion("freeze_balance not in", values, "freezeBalance");
            return (Criteria) this;
        }

        public Criteria andFreezeBalanceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("freeze_balance between", value1, value2, "freezeBalance");
            return (Criteria) this;
        }

        public Criteria andFreezeBalanceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("freeze_balance not between", value1, value2, "freezeBalance");
            return (Criteria) this;
        }

        public Criteria andUserGoldIsNull() {
            addCriterion("user_gold is null");
            return (Criteria) this;
        }

        public Criteria andUserGoldIsNotNull() {
            addCriterion("user_gold is not null");
            return (Criteria) this;
        }

        public Criteria andUserGoldEqualTo(Integer value) {
            addCriterion("user_gold =", value, "userGold");
            return (Criteria) this;
        }

        public Criteria andUserGoldNotEqualTo(Integer value) {
            addCriterion("user_gold <>", value, "userGold");
            return (Criteria) this;
        }

        public Criteria andUserGoldGreaterThan(Integer value) {
            addCriterion("user_gold >", value, "userGold");
            return (Criteria) this;
        }

        public Criteria andUserGoldGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_gold >=", value, "userGold");
            return (Criteria) this;
        }

        public Criteria andUserGoldLessThan(Integer value) {
            addCriterion("user_gold <", value, "userGold");
            return (Criteria) this;
        }

        public Criteria andUserGoldLessThanOrEqualTo(Integer value) {
            addCriterion("user_gold <=", value, "userGold");
            return (Criteria) this;
        }

        public Criteria andUserGoldIn(List<Integer> values) {
            addCriterion("user_gold in", values, "userGold");
            return (Criteria) this;
        }

        public Criteria andUserGoldNotIn(List<Integer> values) {
            addCriterion("user_gold not in", values, "userGold");
            return (Criteria) this;
        }

        public Criteria andUserGoldBetween(Integer value1, Integer value2) {
            addCriterion("user_gold between", value1, value2, "userGold");
            return (Criteria) this;
        }

        public Criteria andUserGoldNotBetween(Integer value1, Integer value2) {
            addCriterion("user_gold not between", value1, value2, "userGold");
            return (Criteria) this;
        }

        public Criteria andUserIntegralIsNull() {
            addCriterion("user_integral is null");
            return (Criteria) this;
        }

        public Criteria andUserIntegralIsNotNull() {
            addCriterion("user_integral is not null");
            return (Criteria) this;
        }

        public Criteria andUserIntegralEqualTo(Integer value) {
            addCriterion("user_integral =", value, "userIntegral");
            return (Criteria) this;
        }

        public Criteria andUserIntegralNotEqualTo(Integer value) {
            addCriterion("user_integral <>", value, "userIntegral");
            return (Criteria) this;
        }

        public Criteria andUserIntegralGreaterThan(Integer value) {
            addCriterion("user_integral >", value, "userIntegral");
            return (Criteria) this;
        }

        public Criteria andUserIntegralGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_integral >=", value, "userIntegral");
            return (Criteria) this;
        }

        public Criteria andUserIntegralLessThan(Integer value) {
            addCriterion("user_integral <", value, "userIntegral");
            return (Criteria) this;
        }

        public Criteria andUserIntegralLessThanOrEqualTo(Integer value) {
            addCriterion("user_integral <=", value, "userIntegral");
            return (Criteria) this;
        }

        public Criteria andUserIntegralIn(List<Integer> values) {
            addCriterion("user_integral in", values, "userIntegral");
            return (Criteria) this;
        }

        public Criteria andUserIntegralNotIn(List<Integer> values) {
            addCriterion("user_integral not in", values, "userIntegral");
            return (Criteria) this;
        }

        public Criteria andUserIntegralBetween(Integer value1, Integer value2) {
            addCriterion("user_integral between", value1, value2, "userIntegral");
            return (Criteria) this;
        }

        public Criteria andUserIntegralNotBetween(Integer value1, Integer value2) {
            addCriterion("user_integral not between", value1, value2, "userIntegral");
            return (Criteria) this;
        }

        public Criteria andLastLoginDateIsNull() {
            addCriterion("last_login_date is null");
            return (Criteria) this;
        }

        public Criteria andLastLoginDateIsNotNull() {
            addCriterion("last_login_date is not null");
            return (Criteria) this;
        }

        public Criteria andLastLoginDateEqualTo(Date value) {
            addCriterion("last_login_date =", value, "lastLoginDate");
            return (Criteria) this;
        }

        public Criteria andLastLoginDateNotEqualTo(Date value) {
            addCriterion("last_login_date <>", value, "lastLoginDate");
            return (Criteria) this;
        }

        public Criteria andLastLoginDateGreaterThan(Date value) {
            addCriterion("last_login_date >", value, "lastLoginDate");
            return (Criteria) this;
        }

        public Criteria andLastLoginDateGreaterThanOrEqualTo(Date value) {
            addCriterion("last_login_date >=", value, "lastLoginDate");
            return (Criteria) this;
        }

        public Criteria andLastLoginDateLessThan(Date value) {
            addCriterion("last_login_date <", value, "lastLoginDate");
            return (Criteria) this;
        }

        public Criteria andLastLoginDateLessThanOrEqualTo(Date value) {
            addCriterion("last_login_date <=", value, "lastLoginDate");
            return (Criteria) this;
        }

        public Criteria andLastLoginDateIn(List<Date> values) {
            addCriterion("last_login_date in", values, "lastLoginDate");
            return (Criteria) this;
        }

        public Criteria andLastLoginDateNotIn(List<Date> values) {
            addCriterion("last_login_date not in", values, "lastLoginDate");
            return (Criteria) this;
        }

        public Criteria andLastLoginDateBetween(Date value1, Date value2) {
            addCriterion("last_login_date between", value1, value2, "lastLoginDate");
            return (Criteria) this;
        }

        public Criteria andLastLoginDateNotBetween(Date value1, Date value2) {
            addCriterion("last_login_date not between", value1, value2, "lastLoginDate");
            return (Criteria) this;
        }

        public Criteria andLastLoginIpIsNull() {
            addCriterion("last_login_ip is null");
            return (Criteria) this;
        }

        public Criteria andLastLoginIpIsNotNull() {
            addCriterion("last_login_ip is not null");
            return (Criteria) this;
        }

        public Criteria andLastLoginIpEqualTo(String value) {
            addCriterion("last_login_ip =", value, "lastLoginIp");
            return (Criteria) this;
        }

        public Criteria andLastLoginIpNotEqualTo(String value) {
            addCriterion("last_login_ip <>", value, "lastLoginIp");
            return (Criteria) this;
        }

        public Criteria andLastLoginIpGreaterThan(String value) {
            addCriterion("last_login_ip >", value, "lastLoginIp");
            return (Criteria) this;
        }

        public Criteria andLastLoginIpGreaterThanOrEqualTo(String value) {
            addCriterion("last_login_ip >=", value, "lastLoginIp");
            return (Criteria) this;
        }

        public Criteria andLastLoginIpLessThan(String value) {
            addCriterion("last_login_ip <", value, "lastLoginIp");
            return (Criteria) this;
        }

        public Criteria andLastLoginIpLessThanOrEqualTo(String value) {
            addCriterion("last_login_ip <=", value, "lastLoginIp");
            return (Criteria) this;
        }

        public Criteria andLastLoginIpLike(String value) {
            addCriterion("last_login_ip like", value, "lastLoginIp");
            return (Criteria) this;
        }

        public Criteria andLastLoginIpNotLike(String value) {
            addCriterion("last_login_ip not like", value, "lastLoginIp");
            return (Criteria) this;
        }

        public Criteria andLastLoginIpIn(List<String> values) {
            addCriterion("last_login_ip in", values, "lastLoginIp");
            return (Criteria) this;
        }

        public Criteria andLastLoginIpNotIn(List<String> values) {
            addCriterion("last_login_ip not in", values, "lastLoginIp");
            return (Criteria) this;
        }

        public Criteria andLastLoginIpBetween(String value1, String value2) {
            addCriterion("last_login_ip between", value1, value2, "lastLoginIp");
            return (Criteria) this;
        }

        public Criteria andLastLoginIpNotBetween(String value1, String value2) {
            addCriterion("last_login_ip not between", value1, value2, "lastLoginIp");
            return (Criteria) this;
        }

        public Criteria andLoginCountIsNull() {
            addCriterion("login_count is null");
            return (Criteria) this;
        }

        public Criteria andLoginCountIsNotNull() {
            addCriterion("login_count is not null");
            return (Criteria) this;
        }

        public Criteria andLoginCountEqualTo(Integer value) {
            addCriterion("login_count =", value, "loginCount");
            return (Criteria) this;
        }

        public Criteria andLoginCountNotEqualTo(Integer value) {
            addCriterion("login_count <>", value, "loginCount");
            return (Criteria) this;
        }

        public Criteria andLoginCountGreaterThan(Integer value) {
            addCriterion("login_count >", value, "loginCount");
            return (Criteria) this;
        }

        public Criteria andLoginCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("login_count >=", value, "loginCount");
            return (Criteria) this;
        }

        public Criteria andLoginCountLessThan(Integer value) {
            addCriterion("login_count <", value, "loginCount");
            return (Criteria) this;
        }

        public Criteria andLoginCountLessThanOrEqualTo(Integer value) {
            addCriterion("login_count <=", value, "loginCount");
            return (Criteria) this;
        }

        public Criteria andLoginCountIn(List<Integer> values) {
            addCriterion("login_count in", values, "loginCount");
            return (Criteria) this;
        }

        public Criteria andLoginCountNotIn(List<Integer> values) {
            addCriterion("login_count not in", values, "loginCount");
            return (Criteria) this;
        }

        public Criteria andLoginCountBetween(Integer value1, Integer value2) {
            addCriterion("login_count between", value1, value2, "loginCount");
            return (Criteria) this;
        }

        public Criteria andLoginCountNotBetween(Integer value1, Integer value2) {
            addCriterion("login_count not between", value1, value2, "loginCount");
            return (Criteria) this;
        }

        public Criteria andLoginDateIsNull() {
            addCriterion("login_date is null");
            return (Criteria) this;
        }

        public Criteria andLoginDateIsNotNull() {
            addCriterion("login_date is not null");
            return (Criteria) this;
        }

        public Criteria andLoginDateEqualTo(Date value) {
            addCriterion("login_date =", value, "loginDate");
            return (Criteria) this;
        }

        public Criteria andLoginDateNotEqualTo(Date value) {
            addCriterion("login_date <>", value, "loginDate");
            return (Criteria) this;
        }

        public Criteria andLoginDateGreaterThan(Date value) {
            addCriterion("login_date >", value, "loginDate");
            return (Criteria) this;
        }

        public Criteria andLoginDateGreaterThanOrEqualTo(Date value) {
            addCriterion("login_date >=", value, "loginDate");
            return (Criteria) this;
        }

        public Criteria andLoginDateLessThan(Date value) {
            addCriterion("login_date <", value, "loginDate");
            return (Criteria) this;
        }

        public Criteria andLoginDateLessThanOrEqualTo(Date value) {
            addCriterion("login_date <=", value, "loginDate");
            return (Criteria) this;
        }

        public Criteria andLoginDateIn(List<Date> values) {
            addCriterion("login_date in", values, "loginDate");
            return (Criteria) this;
        }

        public Criteria andLoginDateNotIn(List<Date> values) {
            addCriterion("login_date not in", values, "loginDate");
            return (Criteria) this;
        }

        public Criteria andLoginDateBetween(Date value1, Date value2) {
            addCriterion("login_date between", value1, value2, "loginDate");
            return (Criteria) this;
        }

        public Criteria andLoginDateNotBetween(Date value1, Date value2) {
            addCriterion("login_date not between", value1, value2, "loginDate");
            return (Criteria) this;
        }

        public Criteria andLoginIpIsNull() {
            addCriterion("login_ip is null");
            return (Criteria) this;
        }

        public Criteria andLoginIpIsNotNull() {
            addCriterion("login_ip is not null");
            return (Criteria) this;
        }

        public Criteria andLoginIpEqualTo(String value) {
            addCriterion("login_ip =", value, "loginIp");
            return (Criteria) this;
        }

        public Criteria andLoginIpNotEqualTo(String value) {
            addCriterion("login_ip <>", value, "loginIp");
            return (Criteria) this;
        }

        public Criteria andLoginIpGreaterThan(String value) {
            addCriterion("login_ip >", value, "loginIp");
            return (Criteria) this;
        }

        public Criteria andLoginIpGreaterThanOrEqualTo(String value) {
            addCriterion("login_ip >=", value, "loginIp");
            return (Criteria) this;
        }

        public Criteria andLoginIpLessThan(String value) {
            addCriterion("login_ip <", value, "loginIp");
            return (Criteria) this;
        }

        public Criteria andLoginIpLessThanOrEqualTo(String value) {
            addCriterion("login_ip <=", value, "loginIp");
            return (Criteria) this;
        }

        public Criteria andLoginIpLike(String value) {
            addCriterion("login_ip like", value, "loginIp");
            return (Criteria) this;
        }

        public Criteria andLoginIpNotLike(String value) {
            addCriterion("login_ip not like", value, "loginIp");
            return (Criteria) this;
        }

        public Criteria andLoginIpIn(List<String> values) {
            addCriterion("login_ip in", values, "loginIp");
            return (Criteria) this;
        }

        public Criteria andLoginIpNotIn(List<String> values) {
            addCriterion("login_ip not in", values, "loginIp");
            return (Criteria) this;
        }

        public Criteria andLoginIpBetween(String value1, String value2) {
            addCriterion("login_ip between", value1, value2, "loginIp");
            return (Criteria) this;
        }

        public Criteria andLoginIpNotBetween(String value1, String value2) {
            addCriterion("login_ip not between", value1, value2, "loginIp");
            return (Criteria) this;
        }

        public Criteria andReportIsNull() {
            addCriterion("report is null");
            return (Criteria) this;
        }

        public Criteria andReportIsNotNull() {
            addCriterion("report is not null");
            return (Criteria) this;
        }

        public Criteria andReportEqualTo(Integer value) {
            addCriterion("report =", value, "report");
            return (Criteria) this;
        }

        public Criteria andReportNotEqualTo(Integer value) {
            addCriterion("report <>", value, "report");
            return (Criteria) this;
        }

        public Criteria andReportGreaterThan(Integer value) {
            addCriterion("report >", value, "report");
            return (Criteria) this;
        }

        public Criteria andReportGreaterThanOrEqualTo(Integer value) {
            addCriterion("report >=", value, "report");
            return (Criteria) this;
        }

        public Criteria andReportLessThan(Integer value) {
            addCriterion("report <", value, "report");
            return (Criteria) this;
        }

        public Criteria andReportLessThanOrEqualTo(Integer value) {
            addCriterion("report <=", value, "report");
            return (Criteria) this;
        }

        public Criteria andReportIn(List<Integer> values) {
            addCriterion("report in", values, "report");
            return (Criteria) this;
        }

        public Criteria andReportNotIn(List<Integer> values) {
            addCriterion("report not in", values, "report");
            return (Criteria) this;
        }

        public Criteria andReportBetween(Integer value1, Integer value2) {
            addCriterion("report between", value1, value2, "report");
            return (Criteria) this;
        }

        public Criteria andReportNotBetween(Integer value1, Integer value2) {
            addCriterion("report not between", value1, value2, "report");
            return (Criteria) this;
        }

        public Criteria andUserSexIsNull() {
            addCriterion("user_sex is null");
            return (Criteria) this;
        }

        public Criteria andUserSexIsNotNull() {
            addCriterion("user_sex is not null");
            return (Criteria) this;
        }

        public Criteria andUserSexEqualTo(String value) {
            addCriterion("user_sex =", value, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexNotEqualTo(String value) {
            addCriterion("user_sex <>", value, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexGreaterThan(String value) {
            addCriterion("user_sex >", value, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexGreaterThanOrEqualTo(String value) {
            addCriterion("user_sex >=", value, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexLessThan(String value) {
            addCriterion("user_sex <", value, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexLessThanOrEqualTo(String value) {
            addCriterion("user_sex <=", value, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexLike(String value) {
            addCriterion("user_sex like", value, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexNotLike(String value) {
            addCriterion("user_sex not like", value, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexIn(List<String> values) {
            addCriterion("user_sex in", values, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexNotIn(List<String> values) {
            addCriterion("user_sex not in", values, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexBetween(String value1, String value2) {
            addCriterion("user_sex between", value1, value2, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexNotBetween(String value1, String value2) {
            addCriterion("user_sex not between", value1, value2, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserStatusIsNull() {
            addCriterion("user_status is null");
            return (Criteria) this;
        }

        public Criteria andUserStatusIsNotNull() {
            addCriterion("user_status is not null");
            return (Criteria) this;
        }

        public Criteria andUserStatusEqualTo(Integer value) {
            addCriterion("user_status =", value, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusNotEqualTo(Integer value) {
            addCriterion("user_status <>", value, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusGreaterThan(Integer value) {
            addCriterion("user_status >", value, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_status >=", value, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusLessThan(Integer value) {
            addCriterion("user_status <", value, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusLessThanOrEqualTo(Integer value) {
            addCriterion("user_status <=", value, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusIn(List<Integer> values) {
            addCriterion("user_status in", values, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusNotIn(List<Integer> values) {
            addCriterion("user_status not in", values, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusBetween(Integer value1, Integer value2) {
            addCriterion("user_status between", value1, value2, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("user_status not between", value1, value2, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserCreditIsNull() {
            addCriterion("user_credit is null");
            return (Criteria) this;
        }

        public Criteria andUserCreditIsNotNull() {
            addCriterion("user_credit is not null");
            return (Criteria) this;
        }

        public Criteria andUserCreditEqualTo(Integer value) {
            addCriterion("user_credit =", value, "userCredit");
            return (Criteria) this;
        }

        public Criteria andUserCreditNotEqualTo(Integer value) {
            addCriterion("user_credit <>", value, "userCredit");
            return (Criteria) this;
        }

        public Criteria andUserCreditGreaterThan(Integer value) {
            addCriterion("user_credit >", value, "userCredit");
            return (Criteria) this;
        }

        public Criteria andUserCreditGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_credit >=", value, "userCredit");
            return (Criteria) this;
        }

        public Criteria andUserCreditLessThan(Integer value) {
            addCriterion("user_credit <", value, "userCredit");
            return (Criteria) this;
        }

        public Criteria andUserCreditLessThanOrEqualTo(Integer value) {
            addCriterion("user_credit <=", value, "userCredit");
            return (Criteria) this;
        }

        public Criteria andUserCreditIn(List<Integer> values) {
            addCriterion("user_credit in", values, "userCredit");
            return (Criteria) this;
        }

        public Criteria andUserCreditNotIn(List<Integer> values) {
            addCriterion("user_credit not in", values, "userCredit");
            return (Criteria) this;
        }

        public Criteria andUserCreditBetween(Integer value1, Integer value2) {
            addCriterion("user_credit between", value1, value2, "userCredit");
            return (Criteria) this;
        }

        public Criteria andUserCreditNotBetween(Integer value1, Integer value2) {
            addCriterion("user_credit not between", value1, value2, "userCredit");
            return (Criteria) this;
        }

        public Criteria andQqOpenidIsNull() {
            addCriterion("qq_openid is null");
            return (Criteria) this;
        }

        public Criteria andQqOpenidIsNotNull() {
            addCriterion("qq_openid is not null");
            return (Criteria) this;
        }

        public Criteria andQqOpenidEqualTo(String value) {
            addCriterion("qq_openid =", value, "qqOpenid");
            return (Criteria) this;
        }

        public Criteria andQqOpenidNotEqualTo(String value) {
            addCriterion("qq_openid <>", value, "qqOpenid");
            return (Criteria) this;
        }

        public Criteria andQqOpenidGreaterThan(String value) {
            addCriterion("qq_openid >", value, "qqOpenid");
            return (Criteria) this;
        }

        public Criteria andQqOpenidGreaterThanOrEqualTo(String value) {
            addCriterion("qq_openid >=", value, "qqOpenid");
            return (Criteria) this;
        }

        public Criteria andQqOpenidLessThan(String value) {
            addCriterion("qq_openid <", value, "qqOpenid");
            return (Criteria) this;
        }

        public Criteria andQqOpenidLessThanOrEqualTo(String value) {
            addCriterion("qq_openid <=", value, "qqOpenid");
            return (Criteria) this;
        }

        public Criteria andQqOpenidLike(String value) {
            addCriterion("qq_openid like", value, "qqOpenid");
            return (Criteria) this;
        }

        public Criteria andQqOpenidNotLike(String value) {
            addCriterion("qq_openid not like", value, "qqOpenid");
            return (Criteria) this;
        }

        public Criteria andQqOpenidIn(List<String> values) {
            addCriterion("qq_openid in", values, "qqOpenid");
            return (Criteria) this;
        }

        public Criteria andQqOpenidNotIn(List<String> values) {
            addCriterion("qq_openid not in", values, "qqOpenid");
            return (Criteria) this;
        }

        public Criteria andQqOpenidBetween(String value1, String value2) {
            addCriterion("qq_openid between", value1, value2, "qqOpenid");
            return (Criteria) this;
        }

        public Criteria andQqOpenidNotBetween(String value1, String value2) {
            addCriterion("qq_openid not between", value1, value2, "qqOpenid");
            return (Criteria) this;
        }

        public Criteria andSinaOpenidIsNull() {
            addCriterion("sina_openid is null");
            return (Criteria) this;
        }

        public Criteria andSinaOpenidIsNotNull() {
            addCriterion("sina_openid is not null");
            return (Criteria) this;
        }

        public Criteria andSinaOpenidEqualTo(String value) {
            addCriterion("sina_openid =", value, "sinaOpenid");
            return (Criteria) this;
        }

        public Criteria andSinaOpenidNotEqualTo(String value) {
            addCriterion("sina_openid <>", value, "sinaOpenid");
            return (Criteria) this;
        }

        public Criteria andSinaOpenidGreaterThan(String value) {
            addCriterion("sina_openid >", value, "sinaOpenid");
            return (Criteria) this;
        }

        public Criteria andSinaOpenidGreaterThanOrEqualTo(String value) {
            addCriterion("sina_openid >=", value, "sinaOpenid");
            return (Criteria) this;
        }

        public Criteria andSinaOpenidLessThan(String value) {
            addCriterion("sina_openid <", value, "sinaOpenid");
            return (Criteria) this;
        }

        public Criteria andSinaOpenidLessThanOrEqualTo(String value) {
            addCriterion("sina_openid <=", value, "sinaOpenid");
            return (Criteria) this;
        }

        public Criteria andSinaOpenidLike(String value) {
            addCriterion("sina_openid like", value, "sinaOpenid");
            return (Criteria) this;
        }

        public Criteria andSinaOpenidNotLike(String value) {
            addCriterion("sina_openid not like", value, "sinaOpenid");
            return (Criteria) this;
        }

        public Criteria andSinaOpenidIn(List<String> values) {
            addCriterion("sina_openid in", values, "sinaOpenid");
            return (Criteria) this;
        }

        public Criteria andSinaOpenidNotIn(List<String> values) {
            addCriterion("sina_openid not in", values, "sinaOpenid");
            return (Criteria) this;
        }

        public Criteria andSinaOpenidBetween(String value1, String value2) {
            addCriterion("sina_openid between", value1, value2, "sinaOpenid");
            return (Criteria) this;
        }

        public Criteria andSinaOpenidNotBetween(String value1, String value2) {
            addCriterion("sina_openid not between", value1, value2, "sinaOpenid");
            return (Criteria) this;
        }

        public Criteria andAreaIdIsNull() {
            addCriterion("area_id is null");
            return (Criteria) this;
        }

        public Criteria andAreaIdIsNotNull() {
            addCriterion("area_id is not null");
            return (Criteria) this;
        }

        public Criteria andAreaIdEqualTo(Long value) {
            addCriterion("area_id =", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdNotEqualTo(Long value) {
            addCriterion("area_id <>", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdGreaterThan(Long value) {
            addCriterion("area_id >", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdGreaterThanOrEqualTo(Long value) {
            addCriterion("area_id >=", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdLessThan(Long value) {
            addCriterion("area_id <", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdLessThanOrEqualTo(Long value) {
            addCriterion("area_id <=", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdIn(List<Long> values) {
            addCriterion("area_id in", values, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdNotIn(List<Long> values) {
            addCriterion("area_id not in", values, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdBetween(Long value1, Long value2) {
            addCriterion("area_id between", value1, value2, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdNotBetween(Long value1, Long value2) {
            addCriterion("area_id not between", value1, value2, "areaId");
            return (Criteria) this;
        }

        public Criteria andPhotoIdIsNull() {
            addCriterion("photo_id is null");
            return (Criteria) this;
        }

        public Criteria andPhotoIdIsNotNull() {
            addCriterion("photo_id is not null");
            return (Criteria) this;
        }

        public Criteria andPhotoIdEqualTo(Long value) {
            addCriterion("photo_id =", value, "photoId");
            return (Criteria) this;
        }

        public Criteria andPhotoIdNotEqualTo(Long value) {
            addCriterion("photo_id <>", value, "photoId");
            return (Criteria) this;
        }

        public Criteria andPhotoIdGreaterThan(Long value) {
            addCriterion("photo_id >", value, "photoId");
            return (Criteria) this;
        }

        public Criteria andPhotoIdGreaterThanOrEqualTo(Long value) {
            addCriterion("photo_id >=", value, "photoId");
            return (Criteria) this;
        }

        public Criteria andPhotoIdLessThan(Long value) {
            addCriterion("photo_id <", value, "photoId");
            return (Criteria) this;
        }

        public Criteria andPhotoIdLessThanOrEqualTo(Long value) {
            addCriterion("photo_id <=", value, "photoId");
            return (Criteria) this;
        }

        public Criteria andPhotoIdIn(List<Long> values) {
            addCriterion("photo_id in", values, "photoId");
            return (Criteria) this;
        }

        public Criteria andPhotoIdNotIn(List<Long> values) {
            addCriterion("photo_id not in", values, "photoId");
            return (Criteria) this;
        }

        public Criteria andPhotoIdBetween(Long value1, Long value2) {
            addCriterion("photo_id between", value1, value2, "photoId");
            return (Criteria) this;
        }

        public Criteria andPhotoIdNotBetween(Long value1, Long value2) {
            addCriterion("photo_id not between", value1, value2, "photoId");
            return (Criteria) this;
        }

        public Criteria andSoftDeleteIsNull() {
            addCriterion("soft_delete is null");
            return (Criteria) this;
        }

        public Criteria andSoftDeleteIsNotNull() {
            addCriterion("soft_delete is not null");
            return (Criteria) this;
        }

        public Criteria andSoftDeleteEqualTo(Boolean value) {
            addCriterion("soft_delete =", value, "softDelete");
            return (Criteria) this;
        }

        public Criteria andSoftDeleteNotEqualTo(Boolean value) {
            addCriterion("soft_delete <>", value, "softDelete");
            return (Criteria) this;
        }

        public Criteria andSoftDeleteGreaterThan(Boolean value) {
            addCriterion("soft_delete >", value, "softDelete");
            return (Criteria) this;
        }

        public Criteria andSoftDeleteGreaterThanOrEqualTo(Boolean value) {
            addCriterion("soft_delete >=", value, "softDelete");
            return (Criteria) this;
        }

        public Criteria andSoftDeleteLessThan(Boolean value) {
            addCriterion("soft_delete <", value, "softDelete");
            return (Criteria) this;
        }

        public Criteria andSoftDeleteLessThanOrEqualTo(Boolean value) {
            addCriterion("soft_delete <=", value, "softDelete");
            return (Criteria) this;
        }

        public Criteria andSoftDeleteIn(List<Boolean> values) {
            addCriterion("soft_delete in", values, "softDelete");
            return (Criteria) this;
        }

        public Criteria andSoftDeleteNotIn(List<Boolean> values) {
            addCriterion("soft_delete not in", values, "softDelete");
            return (Criteria) this;
        }

        public Criteria andSoftDeleteBetween(Boolean value1, Boolean value2) {
            addCriterion("soft_delete between", value1, value2, "softDelete");
            return (Criteria) this;
        }

        public Criteria andSoftDeleteNotBetween(Boolean value1, Boolean value2) {
            addCriterion("soft_delete not between", value1, value2, "softDelete");
            return (Criteria) this;
        }

        public Criteria andModifyTimeIsNull() {
            addCriterion("modify_time is null");
            return (Criteria) this;
        }

        public Criteria andModifyTimeIsNotNull() {
            addCriterion("modify_time is not null");
            return (Criteria) this;
        }

        public Criteria andModifyTimeEqualTo(Date value) {
            addCriterion("modify_time =", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeNotEqualTo(Date value) {
            addCriterion("modify_time <>", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeGreaterThan(Date value) {
            addCriterion("modify_time >", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("modify_time >=", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeLessThan(Date value) {
            addCriterion("modify_time <", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeLessThanOrEqualTo(Date value) {
            addCriterion("modify_time <=", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeIn(List<Date> values) {
            addCriterion("modify_time in", values, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeNotIn(List<Date> values) {
            addCriterion("modify_time not in", values, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeBetween(Date value1, Date value2) {
            addCriterion("modify_time between", value1, value2, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeNotBetween(Date value1, Date value2) {
            addCriterion("modify_time not between", value1, value2, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andHeadImgPathIsNull() {
            addCriterion("head_img_path is null");
            return (Criteria) this;
        }

        public Criteria andHeadImgPathIsNotNull() {
            addCriterion("head_img_path is not null");
            return (Criteria) this;
        }

        public Criteria andHeadImgPathEqualTo(String value) {
            addCriterion("head_img_path =", value, "headImgPath");
            return (Criteria) this;
        }

        public Criteria andHeadImgPathNotEqualTo(String value) {
            addCriterion("head_img_path <>", value, "headImgPath");
            return (Criteria) this;
        }

        public Criteria andHeadImgPathGreaterThan(String value) {
            addCriterion("head_img_path >", value, "headImgPath");
            return (Criteria) this;
        }

        public Criteria andHeadImgPathGreaterThanOrEqualTo(String value) {
            addCriterion("head_img_path >=", value, "headImgPath");
            return (Criteria) this;
        }

        public Criteria andHeadImgPathLessThan(String value) {
            addCriterion("head_img_path <", value, "headImgPath");
            return (Criteria) this;
        }

        public Criteria andHeadImgPathLessThanOrEqualTo(String value) {
            addCriterion("head_img_path <=", value, "headImgPath");
            return (Criteria) this;
        }

        public Criteria andHeadImgPathLike(String value) {
            addCriterion("head_img_path like", value, "headImgPath");
            return (Criteria) this;
        }

        public Criteria andHeadImgPathNotLike(String value) {
            addCriterion("head_img_path not like", value, "headImgPath");
            return (Criteria) this;
        }

        public Criteria andHeadImgPathIn(List<String> values) {
            addCriterion("head_img_path in", values, "headImgPath");
            return (Criteria) this;
        }

        public Criteria andHeadImgPathNotIn(List<String> values) {
            addCriterion("head_img_path not in", values, "headImgPath");
            return (Criteria) this;
        }

        public Criteria andHeadImgPathBetween(String value1, String value2) {
            addCriterion("head_img_path between", value1, value2, "headImgPath");
            return (Criteria) this;
        }

        public Criteria andHeadImgPathNotBetween(String value1, String value2) {
            addCriterion("head_img_path not between", value1, value2, "headImgPath");
            return (Criteria) this;
        }

        public Criteria andRemarkOneIsNull() {
            addCriterion("remark_one is null");
            return (Criteria) this;
        }

        public Criteria andRemarkOneIsNotNull() {
            addCriterion("remark_one is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkOneEqualTo(String value) {
            addCriterion("remark_one =", value, "remarkOne");
            return (Criteria) this;
        }

        public Criteria andRemarkOneNotEqualTo(String value) {
            addCriterion("remark_one <>", value, "remarkOne");
            return (Criteria) this;
        }

        public Criteria andRemarkOneGreaterThan(String value) {
            addCriterion("remark_one >", value, "remarkOne");
            return (Criteria) this;
        }

        public Criteria andRemarkOneGreaterThanOrEqualTo(String value) {
            addCriterion("remark_one >=", value, "remarkOne");
            return (Criteria) this;
        }

        public Criteria andRemarkOneLessThan(String value) {
            addCriterion("remark_one <", value, "remarkOne");
            return (Criteria) this;
        }

        public Criteria andRemarkOneLessThanOrEqualTo(String value) {
            addCriterion("remark_one <=", value, "remarkOne");
            return (Criteria) this;
        }

        public Criteria andRemarkOneLike(String value) {
            addCriterion("remark_one like", value, "remarkOne");
            return (Criteria) this;
        }

        public Criteria andRemarkOneNotLike(String value) {
            addCriterion("remark_one not like", value, "remarkOne");
            return (Criteria) this;
        }

        public Criteria andRemarkOneIn(List<String> values) {
            addCriterion("remark_one in", values, "remarkOne");
            return (Criteria) this;
        }

        public Criteria andRemarkOneNotIn(List<String> values) {
            addCriterion("remark_one not in", values, "remarkOne");
            return (Criteria) this;
        }

        public Criteria andRemarkOneBetween(String value1, String value2) {
            addCriterion("remark_one between", value1, value2, "remarkOne");
            return (Criteria) this;
        }

        public Criteria andRemarkOneNotBetween(String value1, String value2) {
            addCriterion("remark_one not between", value1, value2, "remarkOne");
            return (Criteria) this;
        }

        public Criteria andRemarkTwoIsNull() {
            addCriterion("remark_two is null");
            return (Criteria) this;
        }

        public Criteria andRemarkTwoIsNotNull() {
            addCriterion("remark_two is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkTwoEqualTo(String value) {
            addCriterion("remark_two =", value, "remarkTwo");
            return (Criteria) this;
        }

        public Criteria andRemarkTwoNotEqualTo(String value) {
            addCriterion("remark_two <>", value, "remarkTwo");
            return (Criteria) this;
        }

        public Criteria andRemarkTwoGreaterThan(String value) {
            addCriterion("remark_two >", value, "remarkTwo");
            return (Criteria) this;
        }

        public Criteria andRemarkTwoGreaterThanOrEqualTo(String value) {
            addCriterion("remark_two >=", value, "remarkTwo");
            return (Criteria) this;
        }

        public Criteria andRemarkTwoLessThan(String value) {
            addCriterion("remark_two <", value, "remarkTwo");
            return (Criteria) this;
        }

        public Criteria andRemarkTwoLessThanOrEqualTo(String value) {
            addCriterion("remark_two <=", value, "remarkTwo");
            return (Criteria) this;
        }

        public Criteria andRemarkTwoLike(String value) {
            addCriterion("remark_two like", value, "remarkTwo");
            return (Criteria) this;
        }

        public Criteria andRemarkTwoNotLike(String value) {
            addCriterion("remark_two not like", value, "remarkTwo");
            return (Criteria) this;
        }

        public Criteria andRemarkTwoIn(List<String> values) {
            addCriterion("remark_two in", values, "remarkTwo");
            return (Criteria) this;
        }

        public Criteria andRemarkTwoNotIn(List<String> values) {
            addCriterion("remark_two not in", values, "remarkTwo");
            return (Criteria) this;
        }

        public Criteria andRemarkTwoBetween(String value1, String value2) {
            addCriterion("remark_two between", value1, value2, "remarkTwo");
            return (Criteria) this;
        }

        public Criteria andRemarkTwoNotBetween(String value1, String value2) {
            addCriterion("remark_two not between", value1, value2, "remarkTwo");
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