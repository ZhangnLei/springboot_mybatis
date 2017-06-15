package com.zhang.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TopicExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TopicExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    protected TopicExample(TopicExample example) {
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

        public Criteria andTopicTitleIsNull() {
            addCriterion("topic_title is null");
            return (Criteria) this;
        }

        public Criteria andTopicTitleIsNotNull() {
            addCriterion("topic_title is not null");
            return (Criteria) this;
        }

        public Criteria andTopicTitleEqualTo(String value) {
            addCriterion("topic_title =", value, "topicTitle");
            return (Criteria) this;
        }

        public Criteria andTopicTitleNotEqualTo(String value) {
            addCriterion("topic_title <>", value, "topicTitle");
            return (Criteria) this;
        }

        public Criteria andTopicTitleGreaterThan(String value) {
            addCriterion("topic_title >", value, "topicTitle");
            return (Criteria) this;
        }

        public Criteria andTopicTitleGreaterThanOrEqualTo(String value) {
            addCriterion("topic_title >=", value, "topicTitle");
            return (Criteria) this;
        }

        public Criteria andTopicTitleLessThan(String value) {
            addCriterion("topic_title <", value, "topicTitle");
            return (Criteria) this;
        }

        public Criteria andTopicTitleLessThanOrEqualTo(String value) {
            addCriterion("topic_title <=", value, "topicTitle");
            return (Criteria) this;
        }

        public Criteria andTopicTitleLike(String value) {
            addCriterion("topic_title like", value, "topicTitle");
            return (Criteria) this;
        }

        public Criteria andTopicTitleNotLike(String value) {
            addCriterion("topic_title not like", value, "topicTitle");
            return (Criteria) this;
        }

        public Criteria andTopicTitleIn(List<String> values) {
            addCriterion("topic_title in", values, "topicTitle");
            return (Criteria) this;
        }

        public Criteria andTopicTitleNotIn(List<String> values) {
            addCriterion("topic_title not in", values, "topicTitle");
            return (Criteria) this;
        }

        public Criteria andTopicTitleBetween(String value1, String value2) {
            addCriterion("topic_title between", value1, value2, "topicTitle");
            return (Criteria) this;
        }

        public Criteria andTopicTitleNotBetween(String value1, String value2) {
            addCriterion("topic_title not between", value1, value2, "topicTitle");
            return (Criteria) this;
        }

        public Criteria andTopicContentIsNull() {
            addCriterion("topic_content is null");
            return (Criteria) this;
        }

        public Criteria andTopicContentIsNotNull() {
            addCriterion("topic_content is not null");
            return (Criteria) this;
        }

        public Criteria andTopicContentEqualTo(String value) {
            addCriterion("topic_content =", value, "topicContent");
            return (Criteria) this;
        }

        public Criteria andTopicContentNotEqualTo(String value) {
            addCriterion("topic_content <>", value, "topicContent");
            return (Criteria) this;
        }

        public Criteria andTopicContentGreaterThan(String value) {
            addCriterion("topic_content >", value, "topicContent");
            return (Criteria) this;
        }

        public Criteria andTopicContentGreaterThanOrEqualTo(String value) {
            addCriterion("topic_content >=", value, "topicContent");
            return (Criteria) this;
        }

        public Criteria andTopicContentLessThan(String value) {
            addCriterion("topic_content <", value, "topicContent");
            return (Criteria) this;
        }

        public Criteria andTopicContentLessThanOrEqualTo(String value) {
            addCriterion("topic_content <=", value, "topicContent");
            return (Criteria) this;
        }

        public Criteria andTopicContentLike(String value) {
            addCriterion("topic_content like", value, "topicContent");
            return (Criteria) this;
        }

        public Criteria andTopicContentNotLike(String value) {
            addCriterion("topic_content not like", value, "topicContent");
            return (Criteria) this;
        }

        public Criteria andTopicContentIn(List<String> values) {
            addCriterion("topic_content in", values, "topicContent");
            return (Criteria) this;
        }

        public Criteria andTopicContentNotIn(List<String> values) {
            addCriterion("topic_content not in", values, "topicContent");
            return (Criteria) this;
        }

        public Criteria andTopicContentBetween(String value1, String value2) {
            addCriterion("topic_content between", value1, value2, "topicContent");
            return (Criteria) this;
        }

        public Criteria andTopicContentNotBetween(String value1, String value2) {
            addCriterion("topic_content not between", value1, value2, "topicContent");
            return (Criteria) this;
        }

        public Criteria andTopUrlIsNull() {
            addCriterion("top_url is null");
            return (Criteria) this;
        }

        public Criteria andTopUrlIsNotNull() {
            addCriterion("top_url is not null");
            return (Criteria) this;
        }

        public Criteria andTopUrlEqualTo(String value) {
            addCriterion("top_url =", value, "topUrl");
            return (Criteria) this;
        }

        public Criteria andTopUrlNotEqualTo(String value) {
            addCriterion("top_url <>", value, "topUrl");
            return (Criteria) this;
        }

        public Criteria andTopUrlGreaterThan(String value) {
            addCriterion("top_url >", value, "topUrl");
            return (Criteria) this;
        }

        public Criteria andTopUrlGreaterThanOrEqualTo(String value) {
            addCriterion("top_url >=", value, "topUrl");
            return (Criteria) this;
        }

        public Criteria andTopUrlLessThan(String value) {
            addCriterion("top_url <", value, "topUrl");
            return (Criteria) this;
        }

        public Criteria andTopUrlLessThanOrEqualTo(String value) {
            addCriterion("top_url <=", value, "topUrl");
            return (Criteria) this;
        }

        public Criteria andTopUrlLike(String value) {
            addCriterion("top_url like", value, "topUrl");
            return (Criteria) this;
        }

        public Criteria andTopUrlNotLike(String value) {
            addCriterion("top_url not like", value, "topUrl");
            return (Criteria) this;
        }

        public Criteria andTopUrlIn(List<String> values) {
            addCriterion("top_url in", values, "topUrl");
            return (Criteria) this;
        }

        public Criteria andTopUrlNotIn(List<String> values) {
            addCriterion("top_url not in", values, "topUrl");
            return (Criteria) this;
        }

        public Criteria andTopUrlBetween(String value1, String value2) {
            addCriterion("top_url between", value1, value2, "topUrl");
            return (Criteria) this;
        }

        public Criteria andTopUrlNotBetween(String value1, String value2) {
            addCriterion("top_url not between", value1, value2, "topUrl");
            return (Criteria) this;
        }

        public Criteria andTopicStatusIsNull() {
            addCriterion("topic_status is null");
            return (Criteria) this;
        }

        public Criteria andTopicStatusIsNotNull() {
            addCriterion("topic_status is not null");
            return (Criteria) this;
        }

        public Criteria andTopicStatusEqualTo(Integer value) {
            addCriterion("topic_status =", value, "topicStatus");
            return (Criteria) this;
        }

        public Criteria andTopicStatusNotEqualTo(Integer value) {
            addCriterion("topic_status <>", value, "topicStatus");
            return (Criteria) this;
        }

        public Criteria andTopicStatusGreaterThan(Integer value) {
            addCriterion("topic_status >", value, "topicStatus");
            return (Criteria) this;
        }

        public Criteria andTopicStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("topic_status >=", value, "topicStatus");
            return (Criteria) this;
        }

        public Criteria andTopicStatusLessThan(Integer value) {
            addCriterion("topic_status <", value, "topicStatus");
            return (Criteria) this;
        }

        public Criteria andTopicStatusLessThanOrEqualTo(Integer value) {
            addCriterion("topic_status <=", value, "topicStatus");
            return (Criteria) this;
        }

        public Criteria andTopicStatusIn(List<Integer> values) {
            addCriterion("topic_status in", values, "topicStatus");
            return (Criteria) this;
        }

        public Criteria andTopicStatusNotIn(List<Integer> values) {
            addCriterion("topic_status not in", values, "topicStatus");
            return (Criteria) this;
        }

        public Criteria andTopicStatusBetween(Integer value1, Integer value2) {
            addCriterion("topic_status between", value1, value2, "topicStatus");
            return (Criteria) this;
        }

        public Criteria andTopicStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("topic_status not between", value1, value2, "topicStatus");
            return (Criteria) this;
        }

        public Criteria andTopicCoefficientIsNull() {
            addCriterion("topic_coefficient is null");
            return (Criteria) this;
        }

        public Criteria andTopicCoefficientIsNotNull() {
            addCriterion("topic_coefficient is not null");
            return (Criteria) this;
        }

        public Criteria andTopicCoefficientEqualTo(Integer value) {
            addCriterion("topic_coefficient =", value, "topicCoefficient");
            return (Criteria) this;
        }

        public Criteria andTopicCoefficientNotEqualTo(Integer value) {
            addCriterion("topic_coefficient <>", value, "topicCoefficient");
            return (Criteria) this;
        }

        public Criteria andTopicCoefficientGreaterThan(Integer value) {
            addCriterion("topic_coefficient >", value, "topicCoefficient");
            return (Criteria) this;
        }

        public Criteria andTopicCoefficientGreaterThanOrEqualTo(Integer value) {
            addCriterion("topic_coefficient >=", value, "topicCoefficient");
            return (Criteria) this;
        }

        public Criteria andTopicCoefficientLessThan(Integer value) {
            addCriterion("topic_coefficient <", value, "topicCoefficient");
            return (Criteria) this;
        }

        public Criteria andTopicCoefficientLessThanOrEqualTo(Integer value) {
            addCriterion("topic_coefficient <=", value, "topicCoefficient");
            return (Criteria) this;
        }

        public Criteria andTopicCoefficientIn(List<Integer> values) {
            addCriterion("topic_coefficient in", values, "topicCoefficient");
            return (Criteria) this;
        }

        public Criteria andTopicCoefficientNotIn(List<Integer> values) {
            addCriterion("topic_coefficient not in", values, "topicCoefficient");
            return (Criteria) this;
        }

        public Criteria andTopicCoefficientBetween(Integer value1, Integer value2) {
            addCriterion("topic_coefficient between", value1, value2, "topicCoefficient");
            return (Criteria) this;
        }

        public Criteria andTopicCoefficientNotBetween(Integer value1, Integer value2) {
            addCriterion("topic_coefficient not between", value1, value2, "topicCoefficient");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}