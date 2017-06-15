package com.zhang.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Tea_apply_directionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Tea_apply_directionExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    protected Tea_apply_directionExample(Tea_apply_directionExample example) {
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

        public Criteria andTeaApplyTimeIsNull() {
            addCriterion("tea_apply_time is null");
            return (Criteria) this;
        }

        public Criteria andTeaApplyTimeIsNotNull() {
            addCriterion("tea_apply_time is not null");
            return (Criteria) this;
        }

        public Criteria andTeaApplyTimeEqualTo(Date value) {
            addCriterion("tea_apply_time =", value, "teaApplyTime");
            return (Criteria) this;
        }

        public Criteria andTeaApplyTimeNotEqualTo(Date value) {
            addCriterion("tea_apply_time <>", value, "teaApplyTime");
            return (Criteria) this;
        }

        public Criteria andTeaApplyTimeGreaterThan(Date value) {
            addCriterion("tea_apply_time >", value, "teaApplyTime");
            return (Criteria) this;
        }

        public Criteria andTeaApplyTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("tea_apply_time >=", value, "teaApplyTime");
            return (Criteria) this;
        }

        public Criteria andTeaApplyTimeLessThan(Date value) {
            addCriterion("tea_apply_time <", value, "teaApplyTime");
            return (Criteria) this;
        }

        public Criteria andTeaApplyTimeLessThanOrEqualTo(Date value) {
            addCriterion("tea_apply_time <=", value, "teaApplyTime");
            return (Criteria) this;
        }

        public Criteria andTeaApplyTimeIn(List<Date> values) {
            addCriterion("tea_apply_time in", values, "teaApplyTime");
            return (Criteria) this;
        }

        public Criteria andTeaApplyTimeNotIn(List<Date> values) {
            addCriterion("tea_apply_time not in", values, "teaApplyTime");
            return (Criteria) this;
        }

        public Criteria andTeaApplyTimeBetween(Date value1, Date value2) {
            addCriterion("tea_apply_time between", value1, value2, "teaApplyTime");
            return (Criteria) this;
        }

        public Criteria andTeaApplyTimeNotBetween(Date value1, Date value2) {
            addCriterion("tea_apply_time not between", value1, value2, "teaApplyTime");
            return (Criteria) this;
        }

        public Criteria andTeaApplyStatusIsNull() {
            addCriterion("tea_apply_status is null");
            return (Criteria) this;
        }

        public Criteria andTeaApplyStatusIsNotNull() {
            addCriterion("tea_apply_status is not null");
            return (Criteria) this;
        }

        public Criteria andTeaApplyStatusEqualTo(Byte value) {
            addCriterion("tea_apply_status =", value, "teaApplyStatus");
            return (Criteria) this;
        }

        public Criteria andTeaApplyStatusNotEqualTo(Byte value) {
            addCriterion("tea_apply_status <>", value, "teaApplyStatus");
            return (Criteria) this;
        }

        public Criteria andTeaApplyStatusGreaterThan(Byte value) {
            addCriterion("tea_apply_status >", value, "teaApplyStatus");
            return (Criteria) this;
        }

        public Criteria andTeaApplyStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("tea_apply_status >=", value, "teaApplyStatus");
            return (Criteria) this;
        }

        public Criteria andTeaApplyStatusLessThan(Byte value) {
            addCriterion("tea_apply_status <", value, "teaApplyStatus");
            return (Criteria) this;
        }

        public Criteria andTeaApplyStatusLessThanOrEqualTo(Byte value) {
            addCriterion("tea_apply_status <=", value, "teaApplyStatus");
            return (Criteria) this;
        }

        public Criteria andTeaApplyStatusIn(List<Byte> values) {
            addCriterion("tea_apply_status in", values, "teaApplyStatus");
            return (Criteria) this;
        }

        public Criteria andTeaApplyStatusNotIn(List<Byte> values) {
            addCriterion("tea_apply_status not in", values, "teaApplyStatus");
            return (Criteria) this;
        }

        public Criteria andTeaApplyStatusBetween(Byte value1, Byte value2) {
            addCriterion("tea_apply_status between", value1, value2, "teaApplyStatus");
            return (Criteria) this;
        }

        public Criteria andTeaApplyStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("tea_apply_status not between", value1, value2, "teaApplyStatus");
            return (Criteria) this;
        }

        public Criteria andTeaApplyDirTitleIsNull() {
            addCriterion("tea_apply_dir_title is null");
            return (Criteria) this;
        }

        public Criteria andTeaApplyDirTitleIsNotNull() {
            addCriterion("tea_apply_dir_title is not null");
            return (Criteria) this;
        }

        public Criteria andTeaApplyDirTitleEqualTo(String value) {
            addCriterion("tea_apply_dir_title =", value, "teaApplyDirTitle");
            return (Criteria) this;
        }

        public Criteria andTeaApplyDirTitleNotEqualTo(String value) {
            addCriterion("tea_apply_dir_title <>", value, "teaApplyDirTitle");
            return (Criteria) this;
        }

        public Criteria andTeaApplyDirTitleGreaterThan(String value) {
            addCriterion("tea_apply_dir_title >", value, "teaApplyDirTitle");
            return (Criteria) this;
        }

        public Criteria andTeaApplyDirTitleGreaterThanOrEqualTo(String value) {
            addCriterion("tea_apply_dir_title >=", value, "teaApplyDirTitle");
            return (Criteria) this;
        }

        public Criteria andTeaApplyDirTitleLessThan(String value) {
            addCriterion("tea_apply_dir_title <", value, "teaApplyDirTitle");
            return (Criteria) this;
        }

        public Criteria andTeaApplyDirTitleLessThanOrEqualTo(String value) {
            addCriterion("tea_apply_dir_title <=", value, "teaApplyDirTitle");
            return (Criteria) this;
        }

        public Criteria andTeaApplyDirTitleLike(String value) {
            addCriterion("tea_apply_dir_title like", value, "teaApplyDirTitle");
            return (Criteria) this;
        }

        public Criteria andTeaApplyDirTitleNotLike(String value) {
            addCriterion("tea_apply_dir_title not like", value, "teaApplyDirTitle");
            return (Criteria) this;
        }

        public Criteria andTeaApplyDirTitleIn(List<String> values) {
            addCriterion("tea_apply_dir_title in", values, "teaApplyDirTitle");
            return (Criteria) this;
        }

        public Criteria andTeaApplyDirTitleNotIn(List<String> values) {
            addCriterion("tea_apply_dir_title not in", values, "teaApplyDirTitle");
            return (Criteria) this;
        }

        public Criteria andTeaApplyDirTitleBetween(String value1, String value2) {
            addCriterion("tea_apply_dir_title between", value1, value2, "teaApplyDirTitle");
            return (Criteria) this;
        }

        public Criteria andTeaApplyDirTitleNotBetween(String value1, String value2) {
            addCriterion("tea_apply_dir_title not between", value1, value2, "teaApplyDirTitle");
            return (Criteria) this;
        }

        public Criteria andTeaApplyStuTypeIsNull() {
            addCriterion("tea_apply_stu_type is null");
            return (Criteria) this;
        }

        public Criteria andTeaApplyStuTypeIsNotNull() {
            addCriterion("tea_apply_stu_type is not null");
            return (Criteria) this;
        }

        public Criteria andTeaApplyStuTypeEqualTo(Byte value) {
            addCriterion("tea_apply_stu_type =", value, "teaApplyStuType");
            return (Criteria) this;
        }

        public Criteria andTeaApplyStuTypeNotEqualTo(Byte value) {
            addCriterion("tea_apply_stu_type <>", value, "teaApplyStuType");
            return (Criteria) this;
        }

        public Criteria andTeaApplyStuTypeGreaterThan(Byte value) {
            addCriterion("tea_apply_stu_type >", value, "teaApplyStuType");
            return (Criteria) this;
        }

        public Criteria andTeaApplyStuTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("tea_apply_stu_type >=", value, "teaApplyStuType");
            return (Criteria) this;
        }

        public Criteria andTeaApplyStuTypeLessThan(Byte value) {
            addCriterion("tea_apply_stu_type <", value, "teaApplyStuType");
            return (Criteria) this;
        }

        public Criteria andTeaApplyStuTypeLessThanOrEqualTo(Byte value) {
            addCriterion("tea_apply_stu_type <=", value, "teaApplyStuType");
            return (Criteria) this;
        }

        public Criteria andTeaApplyStuTypeIn(List<Byte> values) {
            addCriterion("tea_apply_stu_type in", values, "teaApplyStuType");
            return (Criteria) this;
        }

        public Criteria andTeaApplyStuTypeNotIn(List<Byte> values) {
            addCriterion("tea_apply_stu_type not in", values, "teaApplyStuType");
            return (Criteria) this;
        }

        public Criteria andTeaApplyStuTypeBetween(Byte value1, Byte value2) {
            addCriterion("tea_apply_stu_type between", value1, value2, "teaApplyStuType");
            return (Criteria) this;
        }

        public Criteria andTeaApplyStuTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("tea_apply_stu_type not between", value1, value2, "teaApplyStuType");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}