package com.zhang.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StudentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StudentExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    protected StudentExample(StudentExample example) {
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

        public Criteria andStuIdIsNull() {
            addCriterion("stu_id is null");
            return (Criteria) this;
        }

        public Criteria andStuIdIsNotNull() {
            addCriterion("stu_id is not null");
            return (Criteria) this;
        }

        public Criteria andStuIdEqualTo(String value) {
            addCriterion("stu_id =", value, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdNotEqualTo(String value) {
            addCriterion("stu_id <>", value, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdGreaterThan(String value) {
            addCriterion("stu_id >", value, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdGreaterThanOrEqualTo(String value) {
            addCriterion("stu_id >=", value, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdLessThan(String value) {
            addCriterion("stu_id <", value, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdLessThanOrEqualTo(String value) {
            addCriterion("stu_id <=", value, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdLike(String value) {
            addCriterion("stu_id like", value, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdNotLike(String value) {
            addCriterion("stu_id not like", value, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdIn(List<String> values) {
            addCriterion("stu_id in", values, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdNotIn(List<String> values) {
            addCriterion("stu_id not in", values, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdBetween(String value1, String value2) {
            addCriterion("stu_id between", value1, value2, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdNotBetween(String value1, String value2) {
            addCriterion("stu_id not between", value1, value2, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuNameIsNull() {
            addCriterion("stu_name is null");
            return (Criteria) this;
        }

        public Criteria andStuNameIsNotNull() {
            addCriterion("stu_name is not null");
            return (Criteria) this;
        }

        public Criteria andStuNameEqualTo(String value) {
            addCriterion("stu_name =", value, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameNotEqualTo(String value) {
            addCriterion("stu_name <>", value, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameGreaterThan(String value) {
            addCriterion("stu_name >", value, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameGreaterThanOrEqualTo(String value) {
            addCriterion("stu_name >=", value, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameLessThan(String value) {
            addCriterion("stu_name <", value, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameLessThanOrEqualTo(String value) {
            addCriterion("stu_name <=", value, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameLike(String value) {
            addCriterion("stu_name like", value, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameNotLike(String value) {
            addCriterion("stu_name not like", value, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameIn(List<String> values) {
            addCriterion("stu_name in", values, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameNotIn(List<String> values) {
            addCriterion("stu_name not in", values, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameBetween(String value1, String value2) {
            addCriterion("stu_name between", value1, value2, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameNotBetween(String value1, String value2) {
            addCriterion("stu_name not between", value1, value2, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuClassIsNull() {
            addCriterion("stu_class is null");
            return (Criteria) this;
        }

        public Criteria andStuClassIsNotNull() {
            addCriterion("stu_class is not null");
            return (Criteria) this;
        }

        public Criteria andStuClassEqualTo(String value) {
            addCriterion("stu_class =", value, "stuClass");
            return (Criteria) this;
        }

        public Criteria andStuClassNotEqualTo(String value) {
            addCriterion("stu_class <>", value, "stuClass");
            return (Criteria) this;
        }

        public Criteria andStuClassGreaterThan(String value) {
            addCriterion("stu_class >", value, "stuClass");
            return (Criteria) this;
        }

        public Criteria andStuClassGreaterThanOrEqualTo(String value) {
            addCriterion("stu_class >=", value, "stuClass");
            return (Criteria) this;
        }

        public Criteria andStuClassLessThan(String value) {
            addCriterion("stu_class <", value, "stuClass");
            return (Criteria) this;
        }

        public Criteria andStuClassLessThanOrEqualTo(String value) {
            addCriterion("stu_class <=", value, "stuClass");
            return (Criteria) this;
        }

        public Criteria andStuClassLike(String value) {
            addCriterion("stu_class like", value, "stuClass");
            return (Criteria) this;
        }

        public Criteria andStuClassNotLike(String value) {
            addCriterion("stu_class not like", value, "stuClass");
            return (Criteria) this;
        }

        public Criteria andStuClassIn(List<String> values) {
            addCriterion("stu_class in", values, "stuClass");
            return (Criteria) this;
        }

        public Criteria andStuClassNotIn(List<String> values) {
            addCriterion("stu_class not in", values, "stuClass");
            return (Criteria) this;
        }

        public Criteria andStuClassBetween(String value1, String value2) {
            addCriterion("stu_class between", value1, value2, "stuClass");
            return (Criteria) this;
        }

        public Criteria andStuClassNotBetween(String value1, String value2) {
            addCriterion("stu_class not between", value1, value2, "stuClass");
            return (Criteria) this;
        }

        public Criteria andStuDutyIsNull() {
            addCriterion("stu_duty is null");
            return (Criteria) this;
        }

        public Criteria andStuDutyIsNotNull() {
            addCriterion("stu_duty is not null");
            return (Criteria) this;
        }

        public Criteria andStuDutyEqualTo(String value) {
            addCriterion("stu_duty =", value, "stuDuty");
            return (Criteria) this;
        }

        public Criteria andStuDutyNotEqualTo(String value) {
            addCriterion("stu_duty <>", value, "stuDuty");
            return (Criteria) this;
        }

        public Criteria andStuDutyGreaterThan(String value) {
            addCriterion("stu_duty >", value, "stuDuty");
            return (Criteria) this;
        }

        public Criteria andStuDutyGreaterThanOrEqualTo(String value) {
            addCriterion("stu_duty >=", value, "stuDuty");
            return (Criteria) this;
        }

        public Criteria andStuDutyLessThan(String value) {
            addCriterion("stu_duty <", value, "stuDuty");
            return (Criteria) this;
        }

        public Criteria andStuDutyLessThanOrEqualTo(String value) {
            addCriterion("stu_duty <=", value, "stuDuty");
            return (Criteria) this;
        }

        public Criteria andStuDutyLike(String value) {
            addCriterion("stu_duty like", value, "stuDuty");
            return (Criteria) this;
        }

        public Criteria andStuDutyNotLike(String value) {
            addCriterion("stu_duty not like", value, "stuDuty");
            return (Criteria) this;
        }

        public Criteria andStuDutyIn(List<String> values) {
            addCriterion("stu_duty in", values, "stuDuty");
            return (Criteria) this;
        }

        public Criteria andStuDutyNotIn(List<String> values) {
            addCriterion("stu_duty not in", values, "stuDuty");
            return (Criteria) this;
        }

        public Criteria andStuDutyBetween(String value1, String value2) {
            addCriterion("stu_duty between", value1, value2, "stuDuty");
            return (Criteria) this;
        }

        public Criteria andStuDutyNotBetween(String value1, String value2) {
            addCriterion("stu_duty not between", value1, value2, "stuDuty");
            return (Criteria) this;
        }

        public Criteria andStuLastIpIsNull() {
            addCriterion("stu_last_ip is null");
            return (Criteria) this;
        }

        public Criteria andStuLastIpIsNotNull() {
            addCriterion("stu_last_ip is not null");
            return (Criteria) this;
        }

        public Criteria andStuLastIpEqualTo(String value) {
            addCriterion("stu_last_ip =", value, "stuLastIp");
            return (Criteria) this;
        }

        public Criteria andStuLastIpNotEqualTo(String value) {
            addCriterion("stu_last_ip <>", value, "stuLastIp");
            return (Criteria) this;
        }

        public Criteria andStuLastIpGreaterThan(String value) {
            addCriterion("stu_last_ip >", value, "stuLastIp");
            return (Criteria) this;
        }

        public Criteria andStuLastIpGreaterThanOrEqualTo(String value) {
            addCriterion("stu_last_ip >=", value, "stuLastIp");
            return (Criteria) this;
        }

        public Criteria andStuLastIpLessThan(String value) {
            addCriterion("stu_last_ip <", value, "stuLastIp");
            return (Criteria) this;
        }

        public Criteria andStuLastIpLessThanOrEqualTo(String value) {
            addCriterion("stu_last_ip <=", value, "stuLastIp");
            return (Criteria) this;
        }

        public Criteria andStuLastIpLike(String value) {
            addCriterion("stu_last_ip like", value, "stuLastIp");
            return (Criteria) this;
        }

        public Criteria andStuLastIpNotLike(String value) {
            addCriterion("stu_last_ip not like", value, "stuLastIp");
            return (Criteria) this;
        }

        public Criteria andStuLastIpIn(List<String> values) {
            addCriterion("stu_last_ip in", values, "stuLastIp");
            return (Criteria) this;
        }

        public Criteria andStuLastIpNotIn(List<String> values) {
            addCriterion("stu_last_ip not in", values, "stuLastIp");
            return (Criteria) this;
        }

        public Criteria andStuLastIpBetween(String value1, String value2) {
            addCriterion("stu_last_ip between", value1, value2, "stuLastIp");
            return (Criteria) this;
        }

        public Criteria andStuLastIpNotBetween(String value1, String value2) {
            addCriterion("stu_last_ip not between", value1, value2, "stuLastIp");
            return (Criteria) this;
        }

        public Criteria andStuDepartmentIsNull() {
            addCriterion("stu_department is null");
            return (Criteria) this;
        }

        public Criteria andStuDepartmentIsNotNull() {
            addCriterion("stu_department is not null");
            return (Criteria) this;
        }

        public Criteria andStuDepartmentEqualTo(String value) {
            addCriterion("stu_department =", value, "stuDepartment");
            return (Criteria) this;
        }

        public Criteria andStuDepartmentNotEqualTo(String value) {
            addCriterion("stu_department <>", value, "stuDepartment");
            return (Criteria) this;
        }

        public Criteria andStuDepartmentGreaterThan(String value) {
            addCriterion("stu_department >", value, "stuDepartment");
            return (Criteria) this;
        }

        public Criteria andStuDepartmentGreaterThanOrEqualTo(String value) {
            addCriterion("stu_department >=", value, "stuDepartment");
            return (Criteria) this;
        }

        public Criteria andStuDepartmentLessThan(String value) {
            addCriterion("stu_department <", value, "stuDepartment");
            return (Criteria) this;
        }

        public Criteria andStuDepartmentLessThanOrEqualTo(String value) {
            addCriterion("stu_department <=", value, "stuDepartment");
            return (Criteria) this;
        }

        public Criteria andStuDepartmentLike(String value) {
            addCriterion("stu_department like", value, "stuDepartment");
            return (Criteria) this;
        }

        public Criteria andStuDepartmentNotLike(String value) {
            addCriterion("stu_department not like", value, "stuDepartment");
            return (Criteria) this;
        }

        public Criteria andStuDepartmentIn(List<String> values) {
            addCriterion("stu_department in", values, "stuDepartment");
            return (Criteria) this;
        }

        public Criteria andStuDepartmentNotIn(List<String> values) {
            addCriterion("stu_department not in", values, "stuDepartment");
            return (Criteria) this;
        }

        public Criteria andStuDepartmentBetween(String value1, String value2) {
            addCriterion("stu_department between", value1, value2, "stuDepartment");
            return (Criteria) this;
        }

        public Criteria andStuDepartmentNotBetween(String value1, String value2) {
            addCriterion("stu_department not between", value1, value2, "stuDepartment");
            return (Criteria) this;
        }

        public Criteria andStuMajorIsNull() {
            addCriterion("stu_major is null");
            return (Criteria) this;
        }

        public Criteria andStuMajorIsNotNull() {
            addCriterion("stu_major is not null");
            return (Criteria) this;
        }

        public Criteria andStuMajorEqualTo(String value) {
            addCriterion("stu_major =", value, "stuMajor");
            return (Criteria) this;
        }

        public Criteria andStuMajorNotEqualTo(String value) {
            addCriterion("stu_major <>", value, "stuMajor");
            return (Criteria) this;
        }

        public Criteria andStuMajorGreaterThan(String value) {
            addCriterion("stu_major >", value, "stuMajor");
            return (Criteria) this;
        }

        public Criteria andStuMajorGreaterThanOrEqualTo(String value) {
            addCriterion("stu_major >=", value, "stuMajor");
            return (Criteria) this;
        }

        public Criteria andStuMajorLessThan(String value) {
            addCriterion("stu_major <", value, "stuMajor");
            return (Criteria) this;
        }

        public Criteria andStuMajorLessThanOrEqualTo(String value) {
            addCriterion("stu_major <=", value, "stuMajor");
            return (Criteria) this;
        }

        public Criteria andStuMajorLike(String value) {
            addCriterion("stu_major like", value, "stuMajor");
            return (Criteria) this;
        }

        public Criteria andStuMajorNotLike(String value) {
            addCriterion("stu_major not like", value, "stuMajor");
            return (Criteria) this;
        }

        public Criteria andStuMajorIn(List<String> values) {
            addCriterion("stu_major in", values, "stuMajor");
            return (Criteria) this;
        }

        public Criteria andStuMajorNotIn(List<String> values) {
            addCriterion("stu_major not in", values, "stuMajor");
            return (Criteria) this;
        }

        public Criteria andStuMajorBetween(String value1, String value2) {
            addCriterion("stu_major between", value1, value2, "stuMajor");
            return (Criteria) this;
        }

        public Criteria andStuMajorNotBetween(String value1, String value2) {
            addCriterion("stu_major not between", value1, value2, "stuMajor");
            return (Criteria) this;
        }

        public Criteria andStuLevelIsNull() {
            addCriterion("stu_level is null");
            return (Criteria) this;
        }

        public Criteria andStuLevelIsNotNull() {
            addCriterion("stu_level is not null");
            return (Criteria) this;
        }

        public Criteria andStuLevelEqualTo(Integer value) {
            addCriterion("stu_level =", value, "stuLevel");
            return (Criteria) this;
        }

        public Criteria andStuLevelNotEqualTo(Integer value) {
            addCriterion("stu_level <>", value, "stuLevel");
            return (Criteria) this;
        }

        public Criteria andStuLevelGreaterThan(Integer value) {
            addCriterion("stu_level >", value, "stuLevel");
            return (Criteria) this;
        }

        public Criteria andStuLevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("stu_level >=", value, "stuLevel");
            return (Criteria) this;
        }

        public Criteria andStuLevelLessThan(Integer value) {
            addCriterion("stu_level <", value, "stuLevel");
            return (Criteria) this;
        }

        public Criteria andStuLevelLessThanOrEqualTo(Integer value) {
            addCriterion("stu_level <=", value, "stuLevel");
            return (Criteria) this;
        }

        public Criteria andStuLevelIn(List<Integer> values) {
            addCriterion("stu_level in", values, "stuLevel");
            return (Criteria) this;
        }

        public Criteria andStuLevelNotIn(List<Integer> values) {
            addCriterion("stu_level not in", values, "stuLevel");
            return (Criteria) this;
        }

        public Criteria andStuLevelBetween(Integer value1, Integer value2) {
            addCriterion("stu_level between", value1, value2, "stuLevel");
            return (Criteria) this;
        }

        public Criteria andStuLevelNotBetween(Integer value1, Integer value2) {
            addCriterion("stu_level not between", value1, value2, "stuLevel");
            return (Criteria) this;
        }

        public Criteria andStuGroupIdIsNull() {
            addCriterion("stu_group_id is null");
            return (Criteria) this;
        }

        public Criteria andStuGroupIdIsNotNull() {
            addCriterion("stu_group_id is not null");
            return (Criteria) this;
        }

        public Criteria andStuGroupIdEqualTo(String value) {
            addCriterion("stu_group_id =", value, "stuGroupId");
            return (Criteria) this;
        }

        public Criteria andStuGroupIdNotEqualTo(String value) {
            addCriterion("stu_group_id <>", value, "stuGroupId");
            return (Criteria) this;
        }

        public Criteria andStuGroupIdGreaterThan(String value) {
            addCriterion("stu_group_id >", value, "stuGroupId");
            return (Criteria) this;
        }

        public Criteria andStuGroupIdGreaterThanOrEqualTo(String value) {
            addCriterion("stu_group_id >=", value, "stuGroupId");
            return (Criteria) this;
        }

        public Criteria andStuGroupIdLessThan(String value) {
            addCriterion("stu_group_id <", value, "stuGroupId");
            return (Criteria) this;
        }

        public Criteria andStuGroupIdLessThanOrEqualTo(String value) {
            addCriterion("stu_group_id <=", value, "stuGroupId");
            return (Criteria) this;
        }

        public Criteria andStuGroupIdLike(String value) {
            addCriterion("stu_group_id like", value, "stuGroupId");
            return (Criteria) this;
        }

        public Criteria andStuGroupIdNotLike(String value) {
            addCriterion("stu_group_id not like", value, "stuGroupId");
            return (Criteria) this;
        }

        public Criteria andStuGroupIdIn(List<String> values) {
            addCriterion("stu_group_id in", values, "stuGroupId");
            return (Criteria) this;
        }

        public Criteria andStuGroupIdNotIn(List<String> values) {
            addCriterion("stu_group_id not in", values, "stuGroupId");
            return (Criteria) this;
        }

        public Criteria andStuGroupIdBetween(String value1, String value2) {
            addCriterion("stu_group_id between", value1, value2, "stuGroupId");
            return (Criteria) this;
        }

        public Criteria andStuGroupIdNotBetween(String value1, String value2) {
            addCriterion("stu_group_id not between", value1, value2, "stuGroupId");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}