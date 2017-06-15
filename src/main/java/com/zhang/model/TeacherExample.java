package com.zhang.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TeacherExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TeacherExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    protected TeacherExample(TeacherExample example) {
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

        public Criteria andTeaNameIsNull() {
            addCriterion("tea_name is null");
            return (Criteria) this;
        }

        public Criteria andTeaNameIsNotNull() {
            addCriterion("tea_name is not null");
            return (Criteria) this;
        }

        public Criteria andTeaNameEqualTo(String value) {
            addCriterion("tea_name =", value, "teaName");
            return (Criteria) this;
        }

        public Criteria andTeaNameNotEqualTo(String value) {
            addCriterion("tea_name <>", value, "teaName");
            return (Criteria) this;
        }

        public Criteria andTeaNameGreaterThan(String value) {
            addCriterion("tea_name >", value, "teaName");
            return (Criteria) this;
        }

        public Criteria andTeaNameGreaterThanOrEqualTo(String value) {
            addCriterion("tea_name >=", value, "teaName");
            return (Criteria) this;
        }

        public Criteria andTeaNameLessThan(String value) {
            addCriterion("tea_name <", value, "teaName");
            return (Criteria) this;
        }

        public Criteria andTeaNameLessThanOrEqualTo(String value) {
            addCriterion("tea_name <=", value, "teaName");
            return (Criteria) this;
        }

        public Criteria andTeaNameLike(String value) {
            addCriterion("tea_name like", value, "teaName");
            return (Criteria) this;
        }

        public Criteria andTeaNameNotLike(String value) {
            addCriterion("tea_name not like", value, "teaName");
            return (Criteria) this;
        }

        public Criteria andTeaNameIn(List<String> values) {
            addCriterion("tea_name in", values, "teaName");
            return (Criteria) this;
        }

        public Criteria andTeaNameNotIn(List<String> values) {
            addCriterion("tea_name not in", values, "teaName");
            return (Criteria) this;
        }

        public Criteria andTeaNameBetween(String value1, String value2) {
            addCriterion("tea_name between", value1, value2, "teaName");
            return (Criteria) this;
        }

        public Criteria andTeaNameNotBetween(String value1, String value2) {
            addCriterion("tea_name not between", value1, value2, "teaName");
            return (Criteria) this;
        }

        public Criteria andTeaTelIsNull() {
            addCriterion("tea_tel is null");
            return (Criteria) this;
        }

        public Criteria andTeaTelIsNotNull() {
            addCriterion("tea_tel is not null");
            return (Criteria) this;
        }

        public Criteria andTeaTelEqualTo(String value) {
            addCriterion("tea_tel =", value, "teaTel");
            return (Criteria) this;
        }

        public Criteria andTeaTelNotEqualTo(String value) {
            addCriterion("tea_tel <>", value, "teaTel");
            return (Criteria) this;
        }

        public Criteria andTeaTelGreaterThan(String value) {
            addCriterion("tea_tel >", value, "teaTel");
            return (Criteria) this;
        }

        public Criteria andTeaTelGreaterThanOrEqualTo(String value) {
            addCriterion("tea_tel >=", value, "teaTel");
            return (Criteria) this;
        }

        public Criteria andTeaTelLessThan(String value) {
            addCriterion("tea_tel <", value, "teaTel");
            return (Criteria) this;
        }

        public Criteria andTeaTelLessThanOrEqualTo(String value) {
            addCriterion("tea_tel <=", value, "teaTel");
            return (Criteria) this;
        }

        public Criteria andTeaTelLike(String value) {
            addCriterion("tea_tel like", value, "teaTel");
            return (Criteria) this;
        }

        public Criteria andTeaTelNotLike(String value) {
            addCriterion("tea_tel not like", value, "teaTel");
            return (Criteria) this;
        }

        public Criteria andTeaTelIn(List<String> values) {
            addCriterion("tea_tel in", values, "teaTel");
            return (Criteria) this;
        }

        public Criteria andTeaTelNotIn(List<String> values) {
            addCriterion("tea_tel not in", values, "teaTel");
            return (Criteria) this;
        }

        public Criteria andTeaTelBetween(String value1, String value2) {
            addCriterion("tea_tel between", value1, value2, "teaTel");
            return (Criteria) this;
        }

        public Criteria andTeaTelNotBetween(String value1, String value2) {
            addCriterion("tea_tel not between", value1, value2, "teaTel");
            return (Criteria) this;
        }

        public Criteria andTeaEmailIsNull() {
            addCriterion("tea_email is null");
            return (Criteria) this;
        }

        public Criteria andTeaEmailIsNotNull() {
            addCriterion("tea_email is not null");
            return (Criteria) this;
        }

        public Criteria andTeaEmailEqualTo(String value) {
            addCriterion("tea_email =", value, "teaEmail");
            return (Criteria) this;
        }

        public Criteria andTeaEmailNotEqualTo(String value) {
            addCriterion("tea_email <>", value, "teaEmail");
            return (Criteria) this;
        }

        public Criteria andTeaEmailGreaterThan(String value) {
            addCriterion("tea_email >", value, "teaEmail");
            return (Criteria) this;
        }

        public Criteria andTeaEmailGreaterThanOrEqualTo(String value) {
            addCriterion("tea_email >=", value, "teaEmail");
            return (Criteria) this;
        }

        public Criteria andTeaEmailLessThan(String value) {
            addCriterion("tea_email <", value, "teaEmail");
            return (Criteria) this;
        }

        public Criteria andTeaEmailLessThanOrEqualTo(String value) {
            addCriterion("tea_email <=", value, "teaEmail");
            return (Criteria) this;
        }

        public Criteria andTeaEmailLike(String value) {
            addCriterion("tea_email like", value, "teaEmail");
            return (Criteria) this;
        }

        public Criteria andTeaEmailNotLike(String value) {
            addCriterion("tea_email not like", value, "teaEmail");
            return (Criteria) this;
        }

        public Criteria andTeaEmailIn(List<String> values) {
            addCriterion("tea_email in", values, "teaEmail");
            return (Criteria) this;
        }

        public Criteria andTeaEmailNotIn(List<String> values) {
            addCriterion("tea_email not in", values, "teaEmail");
            return (Criteria) this;
        }

        public Criteria andTeaEmailBetween(String value1, String value2) {
            addCriterion("tea_email between", value1, value2, "teaEmail");
            return (Criteria) this;
        }

        public Criteria andTeaEmailNotBetween(String value1, String value2) {
            addCriterion("tea_email not between", value1, value2, "teaEmail");
            return (Criteria) this;
        }

        public Criteria andTeaDepartmentIsNull() {
            addCriterion("tea_department is null");
            return (Criteria) this;
        }

        public Criteria andTeaDepartmentIsNotNull() {
            addCriterion("tea_department is not null");
            return (Criteria) this;
        }

        public Criteria andTeaDepartmentEqualTo(String value) {
            addCriterion("tea_department =", value, "teaDepartment");
            return (Criteria) this;
        }

        public Criteria andTeaDepartmentNotEqualTo(String value) {
            addCriterion("tea_department <>", value, "teaDepartment");
            return (Criteria) this;
        }

        public Criteria andTeaDepartmentGreaterThan(String value) {
            addCriterion("tea_department >", value, "teaDepartment");
            return (Criteria) this;
        }

        public Criteria andTeaDepartmentGreaterThanOrEqualTo(String value) {
            addCriterion("tea_department >=", value, "teaDepartment");
            return (Criteria) this;
        }

        public Criteria andTeaDepartmentLessThan(String value) {
            addCriterion("tea_department <", value, "teaDepartment");
            return (Criteria) this;
        }

        public Criteria andTeaDepartmentLessThanOrEqualTo(String value) {
            addCriterion("tea_department <=", value, "teaDepartment");
            return (Criteria) this;
        }

        public Criteria andTeaDepartmentLike(String value) {
            addCriterion("tea_department like", value, "teaDepartment");
            return (Criteria) this;
        }

        public Criteria andTeaDepartmentNotLike(String value) {
            addCriterion("tea_department not like", value, "teaDepartment");
            return (Criteria) this;
        }

        public Criteria andTeaDepartmentIn(List<String> values) {
            addCriterion("tea_department in", values, "teaDepartment");
            return (Criteria) this;
        }

        public Criteria andTeaDepartmentNotIn(List<String> values) {
            addCriterion("tea_department not in", values, "teaDepartment");
            return (Criteria) this;
        }

        public Criteria andTeaDepartmentBetween(String value1, String value2) {
            addCriterion("tea_department between", value1, value2, "teaDepartment");
            return (Criteria) this;
        }

        public Criteria andTeaDepartmentNotBetween(String value1, String value2) {
            addCriterion("tea_department not between", value1, value2, "teaDepartment");
            return (Criteria) this;
        }

        public Criteria andTeaDirectionIsNull() {
            addCriterion("tea_direction is null");
            return (Criteria) this;
        }

        public Criteria andTeaDirectionIsNotNull() {
            addCriterion("tea_direction is not null");
            return (Criteria) this;
        }

        public Criteria andTeaDirectionEqualTo(String value) {
            addCriterion("tea_direction =", value, "teaDirection");
            return (Criteria) this;
        }

        public Criteria andTeaDirectionNotEqualTo(String value) {
            addCriterion("tea_direction <>", value, "teaDirection");
            return (Criteria) this;
        }

        public Criteria andTeaDirectionGreaterThan(String value) {
            addCriterion("tea_direction >", value, "teaDirection");
            return (Criteria) this;
        }

        public Criteria andTeaDirectionGreaterThanOrEqualTo(String value) {
            addCriterion("tea_direction >=", value, "teaDirection");
            return (Criteria) this;
        }

        public Criteria andTeaDirectionLessThan(String value) {
            addCriterion("tea_direction <", value, "teaDirection");
            return (Criteria) this;
        }

        public Criteria andTeaDirectionLessThanOrEqualTo(String value) {
            addCriterion("tea_direction <=", value, "teaDirection");
            return (Criteria) this;
        }

        public Criteria andTeaDirectionLike(String value) {
            addCriterion("tea_direction like", value, "teaDirection");
            return (Criteria) this;
        }

        public Criteria andTeaDirectionNotLike(String value) {
            addCriterion("tea_direction not like", value, "teaDirection");
            return (Criteria) this;
        }

        public Criteria andTeaDirectionIn(List<String> values) {
            addCriterion("tea_direction in", values, "teaDirection");
            return (Criteria) this;
        }

        public Criteria andTeaDirectionNotIn(List<String> values) {
            addCriterion("tea_direction not in", values, "teaDirection");
            return (Criteria) this;
        }

        public Criteria andTeaDirectionBetween(String value1, String value2) {
            addCriterion("tea_direction between", value1, value2, "teaDirection");
            return (Criteria) this;
        }

        public Criteria andTeaDirectionNotBetween(String value1, String value2) {
            addCriterion("tea_direction not between", value1, value2, "teaDirection");
            return (Criteria) this;
        }

        public Criteria andTeaTypeIsNull() {
            addCriterion("tea_type is null");
            return (Criteria) this;
        }

        public Criteria andTeaTypeIsNotNull() {
            addCriterion("tea_type is not null");
            return (Criteria) this;
        }

        public Criteria andTeaTypeEqualTo(String value) {
            addCriterion("tea_type =", value, "teaType");
            return (Criteria) this;
        }

        public Criteria andTeaTypeNotEqualTo(String value) {
            addCriterion("tea_type <>", value, "teaType");
            return (Criteria) this;
        }

        public Criteria andTeaTypeGreaterThan(String value) {
            addCriterion("tea_type >", value, "teaType");
            return (Criteria) this;
        }

        public Criteria andTeaTypeGreaterThanOrEqualTo(String value) {
            addCriterion("tea_type >=", value, "teaType");
            return (Criteria) this;
        }

        public Criteria andTeaTypeLessThan(String value) {
            addCriterion("tea_type <", value, "teaType");
            return (Criteria) this;
        }

        public Criteria andTeaTypeLessThanOrEqualTo(String value) {
            addCriterion("tea_type <=", value, "teaType");
            return (Criteria) this;
        }

        public Criteria andTeaTypeLike(String value) {
            addCriterion("tea_type like", value, "teaType");
            return (Criteria) this;
        }

        public Criteria andTeaTypeNotLike(String value) {
            addCriterion("tea_type not like", value, "teaType");
            return (Criteria) this;
        }

        public Criteria andTeaTypeIn(List<String> values) {
            addCriterion("tea_type in", values, "teaType");
            return (Criteria) this;
        }

        public Criteria andTeaTypeNotIn(List<String> values) {
            addCriterion("tea_type not in", values, "teaType");
            return (Criteria) this;
        }

        public Criteria andTeaTypeBetween(String value1, String value2) {
            addCriterion("tea_type between", value1, value2, "teaType");
            return (Criteria) this;
        }

        public Criteria andTeaTypeNotBetween(String value1, String value2) {
            addCriterion("tea_type not between", value1, value2, "teaType");
            return (Criteria) this;
        }

        public Criteria andTeaGradeIsNull() {
            addCriterion("tea_grade is null");
            return (Criteria) this;
        }

        public Criteria andTeaGradeIsNotNull() {
            addCriterion("tea_grade is not null");
            return (Criteria) this;
        }

        public Criteria andTeaGradeEqualTo(String value) {
            addCriterion("tea_grade =", value, "teaGrade");
            return (Criteria) this;
        }

        public Criteria andTeaGradeNotEqualTo(String value) {
            addCriterion("tea_grade <>", value, "teaGrade");
            return (Criteria) this;
        }

        public Criteria andTeaGradeGreaterThan(String value) {
            addCriterion("tea_grade >", value, "teaGrade");
            return (Criteria) this;
        }

        public Criteria andTeaGradeGreaterThanOrEqualTo(String value) {
            addCriterion("tea_grade >=", value, "teaGrade");
            return (Criteria) this;
        }

        public Criteria andTeaGradeLessThan(String value) {
            addCriterion("tea_grade <", value, "teaGrade");
            return (Criteria) this;
        }

        public Criteria andTeaGradeLessThanOrEqualTo(String value) {
            addCriterion("tea_grade <=", value, "teaGrade");
            return (Criteria) this;
        }

        public Criteria andTeaGradeLike(String value) {
            addCriterion("tea_grade like", value, "teaGrade");
            return (Criteria) this;
        }

        public Criteria andTeaGradeNotLike(String value) {
            addCriterion("tea_grade not like", value, "teaGrade");
            return (Criteria) this;
        }

        public Criteria andTeaGradeIn(List<String> values) {
            addCriterion("tea_grade in", values, "teaGrade");
            return (Criteria) this;
        }

        public Criteria andTeaGradeNotIn(List<String> values) {
            addCriterion("tea_grade not in", values, "teaGrade");
            return (Criteria) this;
        }

        public Criteria andTeaGradeBetween(String value1, String value2) {
            addCriterion("tea_grade between", value1, value2, "teaGrade");
            return (Criteria) this;
        }

        public Criteria andTeaGradeNotBetween(String value1, String value2) {
            addCriterion("tea_grade not between", value1, value2, "teaGrade");
            return (Criteria) this;
        }

        public Criteria andTeaPowerIsNull() {
            addCriterion("tea_power is null");
            return (Criteria) this;
        }

        public Criteria andTeaPowerIsNotNull() {
            addCriterion("tea_power is not null");
            return (Criteria) this;
        }

        public Criteria andTeaPowerEqualTo(Byte value) {
            addCriterion("tea_power =", value, "teaPower");
            return (Criteria) this;
        }

        public Criteria andTeaPowerNotEqualTo(Byte value) {
            addCriterion("tea_power <>", value, "teaPower");
            return (Criteria) this;
        }

        public Criteria andTeaPowerGreaterThan(Byte value) {
            addCriterion("tea_power >", value, "teaPower");
            return (Criteria) this;
        }

        public Criteria andTeaPowerGreaterThanOrEqualTo(Byte value) {
            addCriterion("tea_power >=", value, "teaPower");
            return (Criteria) this;
        }

        public Criteria andTeaPowerLessThan(Byte value) {
            addCriterion("tea_power <", value, "teaPower");
            return (Criteria) this;
        }

        public Criteria andTeaPowerLessThanOrEqualTo(Byte value) {
            addCriterion("tea_power <=", value, "teaPower");
            return (Criteria) this;
        }

        public Criteria andTeaPowerIn(List<Byte> values) {
            addCriterion("tea_power in", values, "teaPower");
            return (Criteria) this;
        }

        public Criteria andTeaPowerNotIn(List<Byte> values) {
            addCriterion("tea_power not in", values, "teaPower");
            return (Criteria) this;
        }

        public Criteria andTeaPowerBetween(Byte value1, Byte value2) {
            addCriterion("tea_power between", value1, value2, "teaPower");
            return (Criteria) this;
        }

        public Criteria andTeaPowerNotBetween(Byte value1, Byte value2) {
            addCriterion("tea_power not between", value1, value2, "teaPower");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}