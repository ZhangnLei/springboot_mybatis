package com.zhang.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AnnExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AnnExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    protected AnnExample(AnnExample example) {
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

        public Criteria andAnnIdIsNull() {
            addCriterion("ann_id is null");
            return (Criteria) this;
        }

        public Criteria andAnnIdIsNotNull() {
            addCriterion("ann_id is not null");
            return (Criteria) this;
        }

        public Criteria andAnnIdEqualTo(String value) {
            addCriterion("ann_id =", value, "annId");
            return (Criteria) this;
        }

        public Criteria andAnnIdNotEqualTo(String value) {
            addCriterion("ann_id <>", value, "annId");
            return (Criteria) this;
        }

        public Criteria andAnnIdGreaterThan(String value) {
            addCriterion("ann_id >", value, "annId");
            return (Criteria) this;
        }

        public Criteria andAnnIdGreaterThanOrEqualTo(String value) {
            addCriterion("ann_id >=", value, "annId");
            return (Criteria) this;
        }

        public Criteria andAnnIdLessThan(String value) {
            addCriterion("ann_id <", value, "annId");
            return (Criteria) this;
        }

        public Criteria andAnnIdLessThanOrEqualTo(String value) {
            addCriterion("ann_id <=", value, "annId");
            return (Criteria) this;
        }

        public Criteria andAnnIdLike(String value) {
            addCriterion("ann_id like", value, "annId");
            return (Criteria) this;
        }

        public Criteria andAnnIdNotLike(String value) {
            addCriterion("ann_id not like", value, "annId");
            return (Criteria) this;
        }

        public Criteria andAnnIdIn(List<String> values) {
            addCriterion("ann_id in", values, "annId");
            return (Criteria) this;
        }

        public Criteria andAnnIdNotIn(List<String> values) {
            addCriterion("ann_id not in", values, "annId");
            return (Criteria) this;
        }

        public Criteria andAnnIdBetween(String value1, String value2) {
            addCriterion("ann_id between", value1, value2, "annId");
            return (Criteria) this;
        }

        public Criteria andAnnIdNotBetween(String value1, String value2) {
            addCriterion("ann_id not between", value1, value2, "annId");
            return (Criteria) this;
        }

        public Criteria andAnnUrlIsNull() {
            addCriterion("ann_url is null");
            return (Criteria) this;
        }

        public Criteria andAnnUrlIsNotNull() {
            addCriterion("ann_url is not null");
            return (Criteria) this;
        }

        public Criteria andAnnUrlEqualTo(String value) {
            addCriterion("ann_url =", value, "annUrl");
            return (Criteria) this;
        }

        public Criteria andAnnUrlNotEqualTo(String value) {
            addCriterion("ann_url <>", value, "annUrl");
            return (Criteria) this;
        }

        public Criteria andAnnUrlGreaterThan(String value) {
            addCriterion("ann_url >", value, "annUrl");
            return (Criteria) this;
        }

        public Criteria andAnnUrlGreaterThanOrEqualTo(String value) {
            addCriterion("ann_url >=", value, "annUrl");
            return (Criteria) this;
        }

        public Criteria andAnnUrlLessThan(String value) {
            addCriterion("ann_url <", value, "annUrl");
            return (Criteria) this;
        }

        public Criteria andAnnUrlLessThanOrEqualTo(String value) {
            addCriterion("ann_url <=", value, "annUrl");
            return (Criteria) this;
        }

        public Criteria andAnnUrlLike(String value) {
            addCriterion("ann_url like", value, "annUrl");
            return (Criteria) this;
        }

        public Criteria andAnnUrlNotLike(String value) {
            addCriterion("ann_url not like", value, "annUrl");
            return (Criteria) this;
        }

        public Criteria andAnnUrlIn(List<String> values) {
            addCriterion("ann_url in", values, "annUrl");
            return (Criteria) this;
        }

        public Criteria andAnnUrlNotIn(List<String> values) {
            addCriterion("ann_url not in", values, "annUrl");
            return (Criteria) this;
        }

        public Criteria andAnnUrlBetween(String value1, String value2) {
            addCriterion("ann_url between", value1, value2, "annUrl");
            return (Criteria) this;
        }

        public Criteria andAnnUrlNotBetween(String value1, String value2) {
            addCriterion("ann_url not between", value1, value2, "annUrl");
            return (Criteria) this;
        }

        public Criteria andAnnTitleIsNull() {
            addCriterion("ann_title is null");
            return (Criteria) this;
        }

        public Criteria andAnnTitleIsNotNull() {
            addCriterion("ann_title is not null");
            return (Criteria) this;
        }

        public Criteria andAnnTitleEqualTo(String value) {
            addCriterion("ann_title =", value, "annTitle");
            return (Criteria) this;
        }

        public Criteria andAnnTitleNotEqualTo(String value) {
            addCriterion("ann_title <>", value, "annTitle");
            return (Criteria) this;
        }

        public Criteria andAnnTitleGreaterThan(String value) {
            addCriterion("ann_title >", value, "annTitle");
            return (Criteria) this;
        }

        public Criteria andAnnTitleGreaterThanOrEqualTo(String value) {
            addCriterion("ann_title >=", value, "annTitle");
            return (Criteria) this;
        }

        public Criteria andAnnTitleLessThan(String value) {
            addCriterion("ann_title <", value, "annTitle");
            return (Criteria) this;
        }

        public Criteria andAnnTitleLessThanOrEqualTo(String value) {
            addCriterion("ann_title <=", value, "annTitle");
            return (Criteria) this;
        }

        public Criteria andAnnTitleLike(String value) {
            addCriterion("ann_title like", value, "annTitle");
            return (Criteria) this;
        }

        public Criteria andAnnTitleNotLike(String value) {
            addCriterion("ann_title not like", value, "annTitle");
            return (Criteria) this;
        }

        public Criteria andAnnTitleIn(List<String> values) {
            addCriterion("ann_title in", values, "annTitle");
            return (Criteria) this;
        }

        public Criteria andAnnTitleNotIn(List<String> values) {
            addCriterion("ann_title not in", values, "annTitle");
            return (Criteria) this;
        }

        public Criteria andAnnTitleBetween(String value1, String value2) {
            addCriterion("ann_title between", value1, value2, "annTitle");
            return (Criteria) this;
        }

        public Criteria andAnnTitleNotBetween(String value1, String value2) {
            addCriterion("ann_title not between", value1, value2, "annTitle");
            return (Criteria) this;
        }

        public Criteria andAnnContentIsNull() {
            addCriterion("ann_content is null");
            return (Criteria) this;
        }

        public Criteria andAnnContentIsNotNull() {
            addCriterion("ann_content is not null");
            return (Criteria) this;
        }

        public Criteria andAnnContentEqualTo(String value) {
            addCriterion("ann_content =", value, "annContent");
            return (Criteria) this;
        }

        public Criteria andAnnContentNotEqualTo(String value) {
            addCriterion("ann_content <>", value, "annContent");
            return (Criteria) this;
        }

        public Criteria andAnnContentGreaterThan(String value) {
            addCriterion("ann_content >", value, "annContent");
            return (Criteria) this;
        }

        public Criteria andAnnContentGreaterThanOrEqualTo(String value) {
            addCriterion("ann_content >=", value, "annContent");
            return (Criteria) this;
        }

        public Criteria andAnnContentLessThan(String value) {
            addCriterion("ann_content <", value, "annContent");
            return (Criteria) this;
        }

        public Criteria andAnnContentLessThanOrEqualTo(String value) {
            addCriterion("ann_content <=", value, "annContent");
            return (Criteria) this;
        }

        public Criteria andAnnContentLike(String value) {
            addCriterion("ann_content like", value, "annContent");
            return (Criteria) this;
        }

        public Criteria andAnnContentNotLike(String value) {
            addCriterion("ann_content not like", value, "annContent");
            return (Criteria) this;
        }

        public Criteria andAnnContentIn(List<String> values) {
            addCriterion("ann_content in", values, "annContent");
            return (Criteria) this;
        }

        public Criteria andAnnContentNotIn(List<String> values) {
            addCriterion("ann_content not in", values, "annContent");
            return (Criteria) this;
        }

        public Criteria andAnnContentBetween(String value1, String value2) {
            addCriterion("ann_content between", value1, value2, "annContent");
            return (Criteria) this;
        }

        public Criteria andAnnContentNotBetween(String value1, String value2) {
            addCriterion("ann_content not between", value1, value2, "annContent");
            return (Criteria) this;
        }

        public Criteria andAnnStartTimeIsNull() {
            addCriterion("ann_start_time is null");
            return (Criteria) this;
        }

        public Criteria andAnnStartTimeIsNotNull() {
            addCriterion("ann_start_time is not null");
            return (Criteria) this;
        }

        public Criteria andAnnStartTimeEqualTo(Date value) {
            addCriterion("ann_start_time =", value, "annStartTime");
            return (Criteria) this;
        }

        public Criteria andAnnStartTimeNotEqualTo(Date value) {
            addCriterion("ann_start_time <>", value, "annStartTime");
            return (Criteria) this;
        }

        public Criteria andAnnStartTimeGreaterThan(Date value) {
            addCriterion("ann_start_time >", value, "annStartTime");
            return (Criteria) this;
        }

        public Criteria andAnnStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("ann_start_time >=", value, "annStartTime");
            return (Criteria) this;
        }

        public Criteria andAnnStartTimeLessThan(Date value) {
            addCriterion("ann_start_time <", value, "annStartTime");
            return (Criteria) this;
        }

        public Criteria andAnnStartTimeLessThanOrEqualTo(Date value) {
            addCriterion("ann_start_time <=", value, "annStartTime");
            return (Criteria) this;
        }

        public Criteria andAnnStartTimeIn(List<Date> values) {
            addCriterion("ann_start_time in", values, "annStartTime");
            return (Criteria) this;
        }

        public Criteria andAnnStartTimeNotIn(List<Date> values) {
            addCriterion("ann_start_time not in", values, "annStartTime");
            return (Criteria) this;
        }

        public Criteria andAnnStartTimeBetween(Date value1, Date value2) {
            addCriterion("ann_start_time between", value1, value2, "annStartTime");
            return (Criteria) this;
        }

        public Criteria andAnnStartTimeNotBetween(Date value1, Date value2) {
            addCriterion("ann_start_time not between", value1, value2, "annStartTime");
            return (Criteria) this;
        }

        public Criteria andAnnEndTimeIsNull() {
            addCriterion("ann_end_time is null");
            return (Criteria) this;
        }

        public Criteria andAnnEndTimeIsNotNull() {
            addCriterion("ann_end_time is not null");
            return (Criteria) this;
        }

        public Criteria andAnnEndTimeEqualTo(Date value) {
            addCriterion("ann_end_time =", value, "annEndTime");
            return (Criteria) this;
        }

        public Criteria andAnnEndTimeNotEqualTo(Date value) {
            addCriterion("ann_end_time <>", value, "annEndTime");
            return (Criteria) this;
        }

        public Criteria andAnnEndTimeGreaterThan(Date value) {
            addCriterion("ann_end_time >", value, "annEndTime");
            return (Criteria) this;
        }

        public Criteria andAnnEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("ann_end_time >=", value, "annEndTime");
            return (Criteria) this;
        }

        public Criteria andAnnEndTimeLessThan(Date value) {
            addCriterion("ann_end_time <", value, "annEndTime");
            return (Criteria) this;
        }

        public Criteria andAnnEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("ann_end_time <=", value, "annEndTime");
            return (Criteria) this;
        }

        public Criteria andAnnEndTimeIn(List<Date> values) {
            addCriterion("ann_end_time in", values, "annEndTime");
            return (Criteria) this;
        }

        public Criteria andAnnEndTimeNotIn(List<Date> values) {
            addCriterion("ann_end_time not in", values, "annEndTime");
            return (Criteria) this;
        }

        public Criteria andAnnEndTimeBetween(Date value1, Date value2) {
            addCriterion("ann_end_time between", value1, value2, "annEndTime");
            return (Criteria) this;
        }

        public Criteria andAnnEndTimeNotBetween(Date value1, Date value2) {
            addCriterion("ann_end_time not between", value1, value2, "annEndTime");
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
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}