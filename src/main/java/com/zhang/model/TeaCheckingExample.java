package com.zhang.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TeaCheckingExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TeaCheckingExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    protected TeaCheckingExample(TeaCheckingExample example) {
        this.orderByClause = example.orderByClause;
        this.oredCriteria = example.oredCriteria;
        this.distinct = example.distinct;
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
        protected List<String> criteriaWithoutValue;

        protected List<Map<String, Object>> criteriaWithSingleValue;

        protected List<Map<String, Object>> criteriaWithListValue;

        protected List<Map<String, Object>> criteriaWithBetweenValue;

        protected GeneratedCriteria() {
            super();
            criteriaWithoutValue = new ArrayList<String>();
            criteriaWithSingleValue = new ArrayList<Map<String, Object>>();
            criteriaWithListValue = new ArrayList<Map<String, Object>>();
            criteriaWithBetweenValue = new ArrayList<Map<String, Object>>();
        }

        public boolean isValid() {
            return criteriaWithoutValue.size() > 0
                || criteriaWithSingleValue.size() > 0
                || criteriaWithListValue.size() > 0
                || criteriaWithBetweenValue.size() > 0;
        }

        public List<String> getCriteriaWithoutValue() {
            return criteriaWithoutValue;
        }

        public List<Map<String, Object>> getCriteriaWithSingleValue() {
            return criteriaWithSingleValue;
        }

        public List<Map<String, Object>> getCriteriaWithListValue() {
            return criteriaWithListValue;
        }

        public List<Map<String, Object>> getCriteriaWithBetweenValue() {
            return criteriaWithBetweenValue;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteriaWithoutValue.add(condition);
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("condition", condition);
            map.put("value", value);
            criteriaWithSingleValue.add(map);
        }

        protected void addCriterion(String condition, List<? extends Object> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("condition", condition);
            map.put("values", values);
            criteriaWithListValue.add(map);
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            List<Object> list = new ArrayList<Object>();
            list.add(value1);
            list.add(value2);
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("condition", condition);
            map.put("values", list);
            criteriaWithBetweenValue.add(map);
        }

        public Criteria andTopicIdIsNull() {
            addCriterion("topic_id is null");
            return (Criteria) this;
        }

        public Criteria andTopicIdIsNotNull() {
            addCriterion("topic_id is not null");
            return (Criteria) this;
        }

        public Criteria andTopicIdEqualTo(String value) {
            addCriterion("topic_id =", value, "topicId");
            return (Criteria) this;
        }

        public Criteria andTopicIdNotEqualTo(String value) {
            addCriterion("topic_id <>", value, "topicId");
            return (Criteria) this;
        }

        public Criteria andTopicIdGreaterThan(String value) {
            addCriterion("topic_id >", value, "topicId");
            return (Criteria) this;
        }

        public Criteria andTopicIdGreaterThanOrEqualTo(String value) {
            addCriterion("topic_id >=", value, "topicId");
            return (Criteria) this;
        }

        public Criteria andTopicIdLessThan(String value) {
            addCriterion("topic_id <", value, "topicId");
            return (Criteria) this;
        }

        public Criteria andTopicIdLessThanOrEqualTo(String value) {
            addCriterion("topic_id <=", value, "topicId");
            return (Criteria) this;
        }

        public Criteria andTopicIdLike(String value) {
            addCriterion("topic_id like", value, "topicId");
            return (Criteria) this;
        }

        public Criteria andTopicIdNotLike(String value) {
            addCriterion("topic_id not like", value, "topicId");
            return (Criteria) this;
        }

        public Criteria andTopicIdIn(List<String> values) {
            addCriterion("topic_id in", values, "topicId");
            return (Criteria) this;
        }

        public Criteria andTopicIdNotIn(List<String> values) {
            addCriterion("topic_id not in", values, "topicId");
            return (Criteria) this;
        }

        public Criteria andTopicIdBetween(String value1, String value2) {
            addCriterion("topic_id between", value1, value2, "topicId");
            return (Criteria) this;
        }

        public Criteria andTopicIdNotBetween(String value1, String value2) {
            addCriterion("topic_id not between", value1, value2, "topicId");
            return (Criteria) this;
        }

        public Criteria andTeaIdIsNull() {
            addCriterion("tea_id is null");
            return (Criteria) this;
        }

        public Criteria andTeaIdIsNotNull() {
            addCriterion("tea_id is not null");
            return (Criteria) this;
        }

        public Criteria andTeaIdEqualTo(String value) {
            addCriterion("tea_id =", value, "teaId");
            return (Criteria) this;
        }

        public Criteria andTeaIdNotEqualTo(String value) {
            addCriterion("tea_id <>", value, "teaId");
            return (Criteria) this;
        }

        public Criteria andTeaIdGreaterThan(String value) {
            addCriterion("tea_id >", value, "teaId");
            return (Criteria) this;
        }

        public Criteria andTeaIdGreaterThanOrEqualTo(String value) {
            addCriterion("tea_id >=", value, "teaId");
            return (Criteria) this;
        }

        public Criteria andTeaIdLessThan(String value) {
            addCriterion("tea_id <", value, "teaId");
            return (Criteria) this;
        }

        public Criteria andTeaIdLessThanOrEqualTo(String value) {
            addCriterion("tea_id <=", value, "teaId");
            return (Criteria) this;
        }

        public Criteria andTeaIdLike(String value) {
            addCriterion("tea_id like", value, "teaId");
            return (Criteria) this;
        }

        public Criteria andTeaIdNotLike(String value) {
            addCriterion("tea_id not like", value, "teaId");
            return (Criteria) this;
        }

        public Criteria andTeaIdIn(List<String> values) {
            addCriterion("tea_id in", values, "teaId");
            return (Criteria) this;
        }

        public Criteria andTeaIdNotIn(List<String> values) {
            addCriterion("tea_id not in", values, "teaId");
            return (Criteria) this;
        }

        public Criteria andTeaIdBetween(String value1, String value2) {
            addCriterion("tea_id between", value1, value2, "teaId");
            return (Criteria) this;
        }

        public Criteria andTeaIdNotBetween(String value1, String value2) {
            addCriterion("tea_id not between", value1, value2, "teaId");
            return (Criteria) this;
        }

        public Criteria andCheckingIsNull() {
            addCriterion("checking is null");
            return (Criteria) this;
        }

        public Criteria andCheckingIsNotNull() {
            addCriterion("checking is not null");
            return (Criteria) this;
        }

        public Criteria andCheckingEqualTo(String value) {
            addCriterion("checking =", value, "checking");
            return (Criteria) this;
        }

        public Criteria andCheckingNotEqualTo(String value) {
            addCriterion("checking <>", value, "checking");
            return (Criteria) this;
        }

        public Criteria andCheckingGreaterThan(String value) {
            addCriterion("checking >", value, "checking");
            return (Criteria) this;
        }

        public Criteria andCheckingGreaterThanOrEqualTo(String value) {
            addCriterion("checking >=", value, "checking");
            return (Criteria) this;
        }

        public Criteria andCheckingLessThan(String value) {
            addCriterion("checking <", value, "checking");
            return (Criteria) this;
        }

        public Criteria andCheckingLessThanOrEqualTo(String value) {
            addCriterion("checking <=", value, "checking");
            return (Criteria) this;
        }

        public Criteria andCheckingLike(String value) {
            addCriterion("checking like", value, "checking");
            return (Criteria) this;
        }

        public Criteria andCheckingNotLike(String value) {
            addCriterion("checking not like", value, "checking");
            return (Criteria) this;
        }

        public Criteria andCheckingIn(List<String> values) {
            addCriterion("checking in", values, "checking");
            return (Criteria) this;
        }

        public Criteria andCheckingNotIn(List<String> values) {
            addCriterion("checking not in", values, "checking");
            return (Criteria) this;
        }

        public Criteria andCheckingBetween(String value1, String value2) {
            addCriterion("checking between", value1, value2, "checking");
            return (Criteria) this;
        }

        public Criteria andCheckingNotBetween(String value1, String value2) {
            addCriterion("checking not between", value1, value2, "checking");
            return (Criteria) this;
        }

        public Criteria andCheckingTimeIsNull() {
            addCriterion("checking_time is null");
            return (Criteria) this;
        }

        public Criteria andCheckingTimeIsNotNull() {
            addCriterion("checking_time is not null");
            return (Criteria) this;
        }

        public Criteria andCheckingTimeEqualTo(Date value) {
            addCriterion("checking_time =", value, "checkingTime");
            return (Criteria) this;
        }

        public Criteria andCheckingTimeNotEqualTo(Date value) {
            addCriterion("checking_time <>", value, "checkingTime");
            return (Criteria) this;
        }

        public Criteria andCheckingTimeGreaterThan(Date value) {
            addCriterion("checking_time >", value, "checkingTime");
            return (Criteria) this;
        }

        public Criteria andCheckingTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("checking_time >=", value, "checkingTime");
            return (Criteria) this;
        }

        public Criteria andCheckingTimeLessThan(Date value) {
            addCriterion("checking_time <", value, "checkingTime");
            return (Criteria) this;
        }

        public Criteria andCheckingTimeLessThanOrEqualTo(Date value) {
            addCriterion("checking_time <=", value, "checkingTime");
            return (Criteria) this;
        }

        public Criteria andCheckingTimeIn(List<Date> values) {
            addCriterion("checking_time in", values, "checkingTime");
            return (Criteria) this;
        }

        public Criteria andCheckingTimeNotIn(List<Date> values) {
            addCriterion("checking_time not in", values, "checkingTime");
            return (Criteria) this;
        }

        public Criteria andCheckingTimeBetween(Date value1, Date value2) {
            addCriterion("checking_time between", value1, value2, "checkingTime");
            return (Criteria) this;
        }

        public Criteria andCheckingTimeNotBetween(Date value1, Date value2) {
            addCriterion("checking_time not between", value1, value2, "checkingTime");
            return (Criteria) this;
        }

        public Criteria andCheckingIsPassIsNull() {
            addCriterion("checking_is_pass is null");
            return (Criteria) this;
        }

        public Criteria andCheckingIsPassIsNotNull() {
            addCriterion("checking_is_pass is not null");
            return (Criteria) this;
        }

        public Criteria andCheckingIsPassEqualTo(Integer value) {
            addCriterion("checking_is_pass =", value, "checkingIsPass");
            return (Criteria) this;
        }

        public Criteria andCheckingIsPassNotEqualTo(Integer value) {
            addCriterion("checking_is_pass <>", value, "checkingIsPass");
            return (Criteria) this;
        }

        public Criteria andCheckingIsPassGreaterThan(Integer value) {
            addCriterion("checking_is_pass >", value, "checkingIsPass");
            return (Criteria) this;
        }

        public Criteria andCheckingIsPassGreaterThanOrEqualTo(Integer value) {
            addCriterion("checking_is_pass >=", value, "checkingIsPass");
            return (Criteria) this;
        }

        public Criteria andCheckingIsPassLessThan(Integer value) {
            addCriterion("checking_is_pass <", value, "checkingIsPass");
            return (Criteria) this;
        }

        public Criteria andCheckingIsPassLessThanOrEqualTo(Integer value) {
            addCriterion("checking_is_pass <=", value, "checkingIsPass");
            return (Criteria) this;
        }

        public Criteria andCheckingIsPassIn(List<Integer> values) {
            addCriterion("checking_is_pass in", values, "checkingIsPass");
            return (Criteria) this;
        }

        public Criteria andCheckingIsPassNotIn(List<Integer> values) {
            addCriterion("checking_is_pass not in", values, "checkingIsPass");
            return (Criteria) this;
        }

        public Criteria andCheckingIsPassBetween(Integer value1, Integer value2) {
            addCriterion("checking_is_pass between", value1, value2, "checkingIsPass");
            return (Criteria) this;
        }

        public Criteria andCheckingIsPassNotBetween(Integer value1, Integer value2) {
            addCriterion("checking_is_pass not between", value1, value2, "checkingIsPass");
            return (Criteria) this;
        }

        public Criteria andCheckingReasonIsNull() {
            addCriterion("checking_reason is null");
            return (Criteria) this;
        }

        public Criteria andCheckingReasonIsNotNull() {
            addCriterion("checking_reason is not null");
            return (Criteria) this;
        }

        public Criteria andCheckingReasonEqualTo(String value) {
            addCriterion("checking_reason =", value, "checkingReason");
            return (Criteria) this;
        }

        public Criteria andCheckingReasonNotEqualTo(String value) {
            addCriterion("checking_reason <>", value, "checkingReason");
            return (Criteria) this;
        }

        public Criteria andCheckingReasonGreaterThan(String value) {
            addCriterion("checking_reason >", value, "checkingReason");
            return (Criteria) this;
        }

        public Criteria andCheckingReasonGreaterThanOrEqualTo(String value) {
            addCriterion("checking_reason >=", value, "checkingReason");
            return (Criteria) this;
        }

        public Criteria andCheckingReasonLessThan(String value) {
            addCriterion("checking_reason <", value, "checkingReason");
            return (Criteria) this;
        }

        public Criteria andCheckingReasonLessThanOrEqualTo(String value) {
            addCriterion("checking_reason <=", value, "checkingReason");
            return (Criteria) this;
        }

        public Criteria andCheckingReasonLike(String value) {
            addCriterion("checking_reason like", value, "checkingReason");
            return (Criteria) this;
        }

        public Criteria andCheckingReasonNotLike(String value) {
            addCriterion("checking_reason not like", value, "checkingReason");
            return (Criteria) this;
        }

        public Criteria andCheckingReasonIn(List<String> values) {
            addCriterion("checking_reason in", values, "checkingReason");
            return (Criteria) this;
        }

        public Criteria andCheckingReasonNotIn(List<String> values) {
            addCriterion("checking_reason not in", values, "checkingReason");
            return (Criteria) this;
        }

        public Criteria andCheckingReasonBetween(String value1, String value2) {
            addCriterion("checking_reason between", value1, value2, "checkingReason");
            return (Criteria) this;
        }

        public Criteria andCheckingReasonNotBetween(String value1, String value2) {
            addCriterion("checking_reason not between", value1, value2, "checkingReason");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}