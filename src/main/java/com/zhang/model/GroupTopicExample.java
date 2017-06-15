package com.zhang.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupTopicExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GroupTopicExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    protected GroupTopicExample(GroupTopicExample example) {
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

        public Criteria andGroupTopicIdIsNull() {
            addCriterion("group_topic_id is null");
            return (Criteria) this;
        }

        public Criteria andGroupTopicIdIsNotNull() {
            addCriterion("group_topic_id is not null");
            return (Criteria) this;
        }

        public Criteria andGroupTopicIdEqualTo(String value) {
            addCriterion("group_topic_id =", value, "groupTopicId");
            return (Criteria) this;
        }

        public Criteria andGroupTopicIdNotEqualTo(String value) {
            addCriterion("group_topic_id <>", value, "groupTopicId");
            return (Criteria) this;
        }

        public Criteria andGroupTopicIdGreaterThan(String value) {
            addCriterion("group_topic_id >", value, "groupTopicId");
            return (Criteria) this;
        }

        public Criteria andGroupTopicIdGreaterThanOrEqualTo(String value) {
            addCriterion("group_topic_id >=", value, "groupTopicId");
            return (Criteria) this;
        }

        public Criteria andGroupTopicIdLessThan(String value) {
            addCriterion("group_topic_id <", value, "groupTopicId");
            return (Criteria) this;
        }

        public Criteria andGroupTopicIdLessThanOrEqualTo(String value) {
            addCriterion("group_topic_id <=", value, "groupTopicId");
            return (Criteria) this;
        }

        public Criteria andGroupTopicIdLike(String value) {
            addCriterion("group_topic_id like", value, "groupTopicId");
            return (Criteria) this;
        }

        public Criteria andGroupTopicIdNotLike(String value) {
            addCriterion("group_topic_id not like", value, "groupTopicId");
            return (Criteria) this;
        }

        public Criteria andGroupTopicIdIn(List<String> values) {
            addCriterion("group_topic_id in", values, "groupTopicId");
            return (Criteria) this;
        }

        public Criteria andGroupTopicIdNotIn(List<String> values) {
            addCriterion("group_topic_id not in", values, "groupTopicId");
            return (Criteria) this;
        }

        public Criteria andGroupTopicIdBetween(String value1, String value2) {
            addCriterion("group_topic_id between", value1, value2, "groupTopicId");
            return (Criteria) this;
        }

        public Criteria andGroupTopicIdNotBetween(String value1, String value2) {
            addCriterion("group_topic_id not between", value1, value2, "groupTopicId");
            return (Criteria) this;
        }

        public Criteria andGroupIdIsNull() {
            addCriterion("group_id is null");
            return (Criteria) this;
        }

        public Criteria andGroupIdIsNotNull() {
            addCriterion("group_id is not null");
            return (Criteria) this;
        }

        public Criteria andGroupIdEqualTo(String value) {
            addCriterion("group_id =", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdNotEqualTo(String value) {
            addCriterion("group_id <>", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdGreaterThan(String value) {
            addCriterion("group_id >", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdGreaterThanOrEqualTo(String value) {
            addCriterion("group_id >=", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdLessThan(String value) {
            addCriterion("group_id <", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdLessThanOrEqualTo(String value) {
            addCriterion("group_id <=", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdLike(String value) {
            addCriterion("group_id like", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdNotLike(String value) {
            addCriterion("group_id not like", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdIn(List<String> values) {
            addCriterion("group_id in", values, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdNotIn(List<String> values) {
            addCriterion("group_id not in", values, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdBetween(String value1, String value2) {
            addCriterion("group_id between", value1, value2, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdNotBetween(String value1, String value2) {
            addCriterion("group_id not between", value1, value2, "groupId");
            return (Criteria) this;
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

        public Criteria andGroupTopicTimeIsNull() {
            addCriterion("group_topic_time is null");
            return (Criteria) this;
        }

        public Criteria andGroupTopicTimeIsNotNull() {
            addCriterion("group_topic_time is not null");
            return (Criteria) this;
        }

        public Criteria andGroupTopicTimeEqualTo(String value) {
            addCriterion("group_topic_time =", value, "groupTopicTime");
            return (Criteria) this;
        }

        public Criteria andGroupTopicTimeNotEqualTo(String value) {
            addCriterion("group_topic_time <>", value, "groupTopicTime");
            return (Criteria) this;
        }

        public Criteria andGroupTopicTimeGreaterThan(String value) {
            addCriterion("group_topic_time >", value, "groupTopicTime");
            return (Criteria) this;
        }

        public Criteria andGroupTopicTimeGreaterThanOrEqualTo(String value) {
            addCriterion("group_topic_time >=", value, "groupTopicTime");
            return (Criteria) this;
        }

        public Criteria andGroupTopicTimeLessThan(String value) {
            addCriterion("group_topic_time <", value, "groupTopicTime");
            return (Criteria) this;
        }

        public Criteria andGroupTopicTimeLessThanOrEqualTo(String value) {
            addCriterion("group_topic_time <=", value, "groupTopicTime");
            return (Criteria) this;
        }

        public Criteria andGroupTopicTimeLike(String value) {
            addCriterion("group_topic_time like", value, "groupTopicTime");
            return (Criteria) this;
        }

        public Criteria andGroupTopicTimeNotLike(String value) {
            addCriterion("group_topic_time not like", value, "groupTopicTime");
            return (Criteria) this;
        }

        public Criteria andGroupTopicTimeIn(List<String> values) {
            addCriterion("group_topic_time in", values, "groupTopicTime");
            return (Criteria) this;
        }

        public Criteria andGroupTopicTimeNotIn(List<String> values) {
            addCriterion("group_topic_time not in", values, "groupTopicTime");
            return (Criteria) this;
        }

        public Criteria andGroupTopicTimeBetween(String value1, String value2) {
            addCriterion("group_topic_time between", value1, value2, "groupTopicTime");
            return (Criteria) this;
        }

        public Criteria andGroupTopicTimeNotBetween(String value1, String value2) {
            addCriterion("group_topic_time not between", value1, value2, "groupTopicTime");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}