package com.zhang.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GroupExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    protected GroupExample(GroupExample example) {
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

        public Criteria andGroupNameIsNull() {
            addCriterion("group_name is null");
            return (Criteria) this;
        }

        public Criteria andGroupNameIsNotNull() {
            addCriterion("group_name is not null");
            return (Criteria) this;
        }

        public Criteria andGroupNameEqualTo(String value) {
            addCriterion("group_name =", value, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameNotEqualTo(String value) {
            addCriterion("group_name <>", value, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameGreaterThan(String value) {
            addCriterion("group_name >", value, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameGreaterThanOrEqualTo(String value) {
            addCriterion("group_name >=", value, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameLessThan(String value) {
            addCriterion("group_name <", value, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameLessThanOrEqualTo(String value) {
            addCriterion("group_name <=", value, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameLike(String value) {
            addCriterion("group_name like", value, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameNotLike(String value) {
            addCriterion("group_name not like", value, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameIn(List<String> values) {
            addCriterion("group_name in", values, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameNotIn(List<String> values) {
            addCriterion("group_name not in", values, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameBetween(String value1, String value2) {
            addCriterion("group_name between", value1, value2, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameNotBetween(String value1, String value2) {
            addCriterion("group_name not between", value1, value2, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupStuNumIsNull() {
            addCriterion("group_stu_num is null");
            return (Criteria) this;
        }

        public Criteria andGroupStuNumIsNotNull() {
            addCriterion("group_stu_num is not null");
            return (Criteria) this;
        }

        public Criteria andGroupStuNumEqualTo(String value) {
            addCriterion("group_stu_num =", value, "groupStuNum");
            return (Criteria) this;
        }

        public Criteria andGroupStuNumNotEqualTo(String value) {
            addCriterion("group_stu_num <>", value, "groupStuNum");
            return (Criteria) this;
        }

        public Criteria andGroupStuNumGreaterThan(String value) {
            addCriterion("group_stu_num >", value, "groupStuNum");
            return (Criteria) this;
        }

        public Criteria andGroupStuNumGreaterThanOrEqualTo(String value) {
            addCriterion("group_stu_num >=", value, "groupStuNum");
            return (Criteria) this;
        }

        public Criteria andGroupStuNumLessThan(String value) {
            addCriterion("group_stu_num <", value, "groupStuNum");
            return (Criteria) this;
        }

        public Criteria andGroupStuNumLessThanOrEqualTo(String value) {
            addCriterion("group_stu_num <=", value, "groupStuNum");
            return (Criteria) this;
        }

        public Criteria andGroupStuNumLike(String value) {
            addCriterion("group_stu_num like", value, "groupStuNum");
            return (Criteria) this;
        }

        public Criteria andGroupStuNumNotLike(String value) {
            addCriterion("group_stu_num not like", value, "groupStuNum");
            return (Criteria) this;
        }

        public Criteria andGroupStuNumIn(List<String> values) {
            addCriterion("group_stu_num in", values, "groupStuNum");
            return (Criteria) this;
        }

        public Criteria andGroupStuNumNotIn(List<String> values) {
            addCriterion("group_stu_num not in", values, "groupStuNum");
            return (Criteria) this;
        }

        public Criteria andGroupStuNumBetween(String value1, String value2) {
            addCriterion("group_stu_num between", value1, value2, "groupStuNum");
            return (Criteria) this;
        }

        public Criteria andGroupStuNumNotBetween(String value1, String value2) {
            addCriterion("group_stu_num not between", value1, value2, "groupStuNum");
            return (Criteria) this;
        }

        public Criteria andLeaderIdIsNull() {
            addCriterion("leader_id is null");
            return (Criteria) this;
        }

        public Criteria andLeaderIdIsNotNull() {
            addCriterion("leader_id is not null");
            return (Criteria) this;
        }

        public Criteria andLeaderIdEqualTo(String value) {
            addCriterion("leader_id =", value, "leaderId");
            return (Criteria) this;
        }

        public Criteria andLeaderIdNotEqualTo(String value) {
            addCriterion("leader_id <>", value, "leaderId");
            return (Criteria) this;
        }

        public Criteria andLeaderIdGreaterThan(String value) {
            addCriterion("leader_id >", value, "leaderId");
            return (Criteria) this;
        }

        public Criteria andLeaderIdGreaterThanOrEqualTo(String value) {
            addCriterion("leader_id >=", value, "leaderId");
            return (Criteria) this;
        }

        public Criteria andLeaderIdLessThan(String value) {
            addCriterion("leader_id <", value, "leaderId");
            return (Criteria) this;
        }

        public Criteria andLeaderIdLessThanOrEqualTo(String value) {
            addCriterion("leader_id <=", value, "leaderId");
            return (Criteria) this;
        }

        public Criteria andLeaderIdLike(String value) {
            addCriterion("leader_id like", value, "leaderId");
            return (Criteria) this;
        }

        public Criteria andLeaderIdNotLike(String value) {
            addCriterion("leader_id not like", value, "leaderId");
            return (Criteria) this;
        }

        public Criteria andLeaderIdIn(List<String> values) {
            addCriterion("leader_id in", values, "leaderId");
            return (Criteria) this;
        }

        public Criteria andLeaderIdNotIn(List<String> values) {
            addCriterion("leader_id not in", values, "leaderId");
            return (Criteria) this;
        }

        public Criteria andLeaderIdBetween(String value1, String value2) {
            addCriterion("leader_id between", value1, value2, "leaderId");
            return (Criteria) this;
        }

        public Criteria andLeaderIdNotBetween(String value1, String value2) {
            addCriterion("leader_id not between", value1, value2, "leaderId");
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

        public Criteria andGroupTeaIdIsNull() {
            addCriterion("group_tea_id is null");
            return (Criteria) this;
        }

        public Criteria andGroupTeaIdIsNotNull() {
            addCriterion("group_tea_id is not null");
            return (Criteria) this;
        }

        public Criteria andGroupTeaIdEqualTo(String value) {
            addCriterion("group_tea_id =", value, "groupTeaId");
            return (Criteria) this;
        }

        public Criteria andGroupTeaIdNotEqualTo(String value) {
            addCriterion("group_tea_id <>", value, "groupTeaId");
            return (Criteria) this;
        }

        public Criteria andGroupTeaIdGreaterThan(String value) {
            addCriterion("group_tea_id >", value, "groupTeaId");
            return (Criteria) this;
        }

        public Criteria andGroupTeaIdGreaterThanOrEqualTo(String value) {
            addCriterion("group_tea_id >=", value, "groupTeaId");
            return (Criteria) this;
        }

        public Criteria andGroupTeaIdLessThan(String value) {
            addCriterion("group_tea_id <", value, "groupTeaId");
            return (Criteria) this;
        }

        public Criteria andGroupTeaIdLessThanOrEqualTo(String value) {
            addCriterion("group_tea_id <=", value, "groupTeaId");
            return (Criteria) this;
        }

        public Criteria andGroupTeaIdLike(String value) {
            addCriterion("group_tea_id like", value, "groupTeaId");
            return (Criteria) this;
        }

        public Criteria andGroupTeaIdNotLike(String value) {
            addCriterion("group_tea_id not like", value, "groupTeaId");
            return (Criteria) this;
        }

        public Criteria andGroupTeaIdIn(List<String> values) {
            addCriterion("group_tea_id in", values, "groupTeaId");
            return (Criteria) this;
        }

        public Criteria andGroupTeaIdNotIn(List<String> values) {
            addCriterion("group_tea_id not in", values, "groupTeaId");
            return (Criteria) this;
        }

        public Criteria andGroupTeaIdBetween(String value1, String value2) {
            addCriterion("group_tea_id between", value1, value2, "groupTeaId");
            return (Criteria) this;
        }

        public Criteria andGroupTeaIdNotBetween(String value1, String value2) {
            addCriterion("group_tea_id not between", value1, value2, "groupTeaId");
            return (Criteria) this;
        }

        public Criteria andTeaApplyIdIsNull() {
            addCriterion("tea_apply_id is null");
            return (Criteria) this;
        }

        public Criteria andTeaApplyIdIsNotNull() {
            addCriterion("tea_apply_id is not null");
            return (Criteria) this;
        }

        public Criteria andTeaApplyIdEqualTo(String value) {
            addCriterion("tea_apply_id =", value, "teaApplyId");
            return (Criteria) this;
        }

        public Criteria andTeaApplyIdNotEqualTo(String value) {
            addCriterion("tea_apply_id <>", value, "teaApplyId");
            return (Criteria) this;
        }

        public Criteria andTeaApplyIdGreaterThan(String value) {
            addCriterion("tea_apply_id >", value, "teaApplyId");
            return (Criteria) this;
        }

        public Criteria andTeaApplyIdGreaterThanOrEqualTo(String value) {
            addCriterion("tea_apply_id >=", value, "teaApplyId");
            return (Criteria) this;
        }

        public Criteria andTeaApplyIdLessThan(String value) {
            addCriterion("tea_apply_id <", value, "teaApplyId");
            return (Criteria) this;
        }

        public Criteria andTeaApplyIdLessThanOrEqualTo(String value) {
            addCriterion("tea_apply_id <=", value, "teaApplyId");
            return (Criteria) this;
        }

        public Criteria andTeaApplyIdLike(String value) {
            addCriterion("tea_apply_id like", value, "teaApplyId");
            return (Criteria) this;
        }

        public Criteria andTeaApplyIdNotLike(String value) {
            addCriterion("tea_apply_id not like", value, "teaApplyId");
            return (Criteria) this;
        }

        public Criteria andTeaApplyIdIn(List<String> values) {
            addCriterion("tea_apply_id in", values, "teaApplyId");
            return (Criteria) this;
        }

        public Criteria andTeaApplyIdNotIn(List<String> values) {
            addCriterion("tea_apply_id not in", values, "teaApplyId");
            return (Criteria) this;
        }

        public Criteria andTeaApplyIdBetween(String value1, String value2) {
            addCriterion("tea_apply_id between", value1, value2, "teaApplyId");
            return (Criteria) this;
        }

        public Criteria andTeaApplyIdNotBetween(String value1, String value2) {
            addCriterion("tea_apply_id not between", value1, value2, "teaApplyId");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}