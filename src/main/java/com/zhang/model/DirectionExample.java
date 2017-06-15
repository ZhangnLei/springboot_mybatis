package com.zhang.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DirectionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DirectionExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    protected DirectionExample(DirectionExample example) {
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

        public Criteria andDirIdIsNull() {
            addCriterion("dir_id is null");
            return (Criteria) this;
        }

        public Criteria andDirIdIsNotNull() {
            addCriterion("dir_id is not null");
            return (Criteria) this;
        }

        public Criteria andDirIdEqualTo(String value) {
            addCriterion("dir_id =", value, "dirId");
            return (Criteria) this;
        }

        public Criteria andDirIdNotEqualTo(String value) {
            addCriterion("dir_id <>", value, "dirId");
            return (Criteria) this;
        }

        public Criteria andDirIdGreaterThan(String value) {
            addCriterion("dir_id >", value, "dirId");
            return (Criteria) this;
        }

        public Criteria andDirIdGreaterThanOrEqualTo(String value) {
            addCriterion("dir_id >=", value, "dirId");
            return (Criteria) this;
        }

        public Criteria andDirIdLessThan(String value) {
            addCriterion("dir_id <", value, "dirId");
            return (Criteria) this;
        }

        public Criteria andDirIdLessThanOrEqualTo(String value) {
            addCriterion("dir_id <=", value, "dirId");
            return (Criteria) this;
        }

        public Criteria andDirIdLike(String value) {
            addCriterion("dir_id like", value, "dirId");
            return (Criteria) this;
        }

        public Criteria andDirIdNotLike(String value) {
            addCriterion("dir_id not like", value, "dirId");
            return (Criteria) this;
        }

        public Criteria andDirIdIn(List<String> values) {
            addCriterion("dir_id in", values, "dirId");
            return (Criteria) this;
        }

        public Criteria andDirIdNotIn(List<String> values) {
            addCriterion("dir_id not in", values, "dirId");
            return (Criteria) this;
        }

        public Criteria andDirIdBetween(String value1, String value2) {
            addCriterion("dir_id between", value1, value2, "dirId");
            return (Criteria) this;
        }

        public Criteria andDirIdNotBetween(String value1, String value2) {
            addCriterion("dir_id not between", value1, value2, "dirId");
            return (Criteria) this;
        }

        public Criteria andDirTitleIsNull() {
            addCriterion("dir_title is null");
            return (Criteria) this;
        }

        public Criteria andDirTitleIsNotNull() {
            addCriterion("dir_title is not null");
            return (Criteria) this;
        }

        public Criteria andDirTitleEqualTo(String value) {
            addCriterion("dir_title =", value, "dirTitle");
            return (Criteria) this;
        }

        public Criteria andDirTitleNotEqualTo(String value) {
            addCriterion("dir_title <>", value, "dirTitle");
            return (Criteria) this;
        }

        public Criteria andDirTitleGreaterThan(String value) {
            addCriterion("dir_title >", value, "dirTitle");
            return (Criteria) this;
        }

        public Criteria andDirTitleGreaterThanOrEqualTo(String value) {
            addCriterion("dir_title >=", value, "dirTitle");
            return (Criteria) this;
        }

        public Criteria andDirTitleLessThan(String value) {
            addCriterion("dir_title <", value, "dirTitle");
            return (Criteria) this;
        }

        public Criteria andDirTitleLessThanOrEqualTo(String value) {
            addCriterion("dir_title <=", value, "dirTitle");
            return (Criteria) this;
        }

        public Criteria andDirTitleLike(String value) {
            addCriterion("dir_title like", value, "dirTitle");
            return (Criteria) this;
        }

        public Criteria andDirTitleNotLike(String value) {
            addCriterion("dir_title not like", value, "dirTitle");
            return (Criteria) this;
        }

        public Criteria andDirTitleIn(List<String> values) {
            addCriterion("dir_title in", values, "dirTitle");
            return (Criteria) this;
        }

        public Criteria andDirTitleNotIn(List<String> values) {
            addCriterion("dir_title not in", values, "dirTitle");
            return (Criteria) this;
        }

        public Criteria andDirTitleBetween(String value1, String value2) {
            addCriterion("dir_title between", value1, value2, "dirTitle");
            return (Criteria) this;
        }

        public Criteria andDirTitleNotBetween(String value1, String value2) {
            addCriterion("dir_title not between", value1, value2, "dirTitle");
            return (Criteria) this;
        }

        public Criteria andDirStuTypeIsNull() {
            addCriterion("dir_stu_type is null");
            return (Criteria) this;
        }

        public Criteria andDirStuTypeIsNotNull() {
            addCriterion("dir_stu_type is not null");
            return (Criteria) this;
        }

        public Criteria andDirStuTypeEqualTo(Byte value) {
            addCriterion("dir_stu_type =", value, "dirStuType");
            return (Criteria) this;
        }

        public Criteria andDirStuTypeNotEqualTo(Byte value) {
            addCriterion("dir_stu_type <>", value, "dirStuType");
            return (Criteria) this;
        }

        public Criteria andDirStuTypeGreaterThan(Byte value) {
            addCriterion("dir_stu_type >", value, "dirStuType");
            return (Criteria) this;
        }

        public Criteria andDirStuTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("dir_stu_type >=", value, "dirStuType");
            return (Criteria) this;
        }

        public Criteria andDirStuTypeLessThan(Byte value) {
            addCriterion("dir_stu_type <", value, "dirStuType");
            return (Criteria) this;
        }

        public Criteria andDirStuTypeLessThanOrEqualTo(Byte value) {
            addCriterion("dir_stu_type <=", value, "dirStuType");
            return (Criteria) this;
        }

        public Criteria andDirStuTypeIn(List<Byte> values) {
            addCriterion("dir_stu_type in", values, "dirStuType");
            return (Criteria) this;
        }

        public Criteria andDirStuTypeNotIn(List<Byte> values) {
            addCriterion("dir_stu_type not in", values, "dirStuType");
            return (Criteria) this;
        }

        public Criteria andDirStuTypeBetween(Byte value1, Byte value2) {
            addCriterion("dir_stu_type between", value1, value2, "dirStuType");
            return (Criteria) this;
        }

        public Criteria andDirStuTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("dir_stu_type not between", value1, value2, "dirStuType");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}