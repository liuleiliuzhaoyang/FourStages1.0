package com.qf.pojo;

import java.util.ArrayList;
import java.util.List;

public class AccountExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AccountExample() {
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

        public Criteria andAccountidIsNull() {
            addCriterion("accountid is null");
            return (Criteria) this;
        }

        public Criteria andAccountidIsNotNull() {
            addCriterion("accountid is not null");
            return (Criteria) this;
        }

        public Criteria andAccountidEqualTo(Integer value) {
            addCriterion("accountid =", value, "accountid");
            return (Criteria) this;
        }

        public Criteria andAccountidNotEqualTo(Integer value) {
            addCriterion("accountid <>", value, "accountid");
            return (Criteria) this;
        }

        public Criteria andAccountidGreaterThan(Integer value) {
            addCriterion("accountid >", value, "accountid");
            return (Criteria) this;
        }

        public Criteria andAccountidGreaterThanOrEqualTo(Integer value) {
            addCriterion("accountid >=", value, "accountid");
            return (Criteria) this;
        }

        public Criteria andAccountidLessThan(Integer value) {
            addCriterion("accountid <", value, "accountid");
            return (Criteria) this;
        }

        public Criteria andAccountidLessThanOrEqualTo(Integer value) {
            addCriterion("accountid <=", value, "accountid");
            return (Criteria) this;
        }

        public Criteria andAccountidIn(List<Integer> values) {
            addCriterion("accountid in", values, "accountid");
            return (Criteria) this;
        }

        public Criteria andAccountidNotIn(List<Integer> values) {
            addCriterion("accountid not in", values, "accountid");
            return (Criteria) this;
        }

        public Criteria andAccountidBetween(Integer value1, Integer value2) {
            addCriterion("accountid between", value1, value2, "accountid");
            return (Criteria) this;
        }

        public Criteria andAccountidNotBetween(Integer value1, Integer value2) {
            addCriterion("accountid not between", value1, value2, "accountid");
            return (Criteria) this;
        }

        public Criteria andUseridIsNull() {
            addCriterion("userid is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("userid is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(Integer value) {
            addCriterion("userid =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(Integer value) {
            addCriterion("userid <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(Integer value) {
            addCriterion("userid >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("userid >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(Integer value) {
            addCriterion("userid <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(Integer value) {
            addCriterion("userid <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<Integer> values) {
            addCriterion("userid in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<Integer> values) {
            addCriterion("userid not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(Integer value1, Integer value2) {
            addCriterion("userid between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(Integer value1, Integer value2) {
            addCriterion("userid not between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andAccounttotalmoneyIsNull() {
            addCriterion("accounttotalmoney is null");
            return (Criteria) this;
        }

        public Criteria andAccounttotalmoneyIsNotNull() {
            addCriterion("accounttotalmoney is not null");
            return (Criteria) this;
        }

        public Criteria andAccounttotalmoneyEqualTo(Double value) {
            addCriterion("accounttotalmoney =", value, "accounttotalmoney");
            return (Criteria) this;
        }

        public Criteria andAccounttotalmoneyNotEqualTo(Double value) {
            addCriterion("accounttotalmoney <>", value, "accounttotalmoney");
            return (Criteria) this;
        }

        public Criteria andAccounttotalmoneyGreaterThan(Double value) {
            addCriterion("accounttotalmoney >", value, "accounttotalmoney");
            return (Criteria) this;
        }

        public Criteria andAccounttotalmoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("accounttotalmoney >=", value, "accounttotalmoney");
            return (Criteria) this;
        }

        public Criteria andAccounttotalmoneyLessThan(Double value) {
            addCriterion("accounttotalmoney <", value, "accounttotalmoney");
            return (Criteria) this;
        }

        public Criteria andAccounttotalmoneyLessThanOrEqualTo(Double value) {
            addCriterion("accounttotalmoney <=", value, "accounttotalmoney");
            return (Criteria) this;
        }

        public Criteria andAccounttotalmoneyIn(List<Double> values) {
            addCriterion("accounttotalmoney in", values, "accounttotalmoney");
            return (Criteria) this;
        }

        public Criteria andAccounttotalmoneyNotIn(List<Double> values) {
            addCriterion("accounttotalmoney not in", values, "accounttotalmoney");
            return (Criteria) this;
        }

        public Criteria andAccounttotalmoneyBetween(Double value1, Double value2) {
            addCriterion("accounttotalmoney between", value1, value2, "accounttotalmoney");
            return (Criteria) this;
        }

        public Criteria andAccounttotalmoneyNotBetween(Double value1, Double value2) {
            addCriterion("accounttotalmoney not between", value1, value2, "accounttotalmoney");
            return (Criteria) this;
        }

        public Criteria andAccountusermoneyIsNull() {
            addCriterion("accountusermoney is null");
            return (Criteria) this;
        }

        public Criteria andAccountusermoneyIsNotNull() {
            addCriterion("accountusermoney is not null");
            return (Criteria) this;
        }

        public Criteria andAccountusermoneyEqualTo(Double value) {
            addCriterion("accountusermoney =", value, "accountusermoney");
            return (Criteria) this;
        }

        public Criteria andAccountusermoneyNotEqualTo(Double value) {
            addCriterion("accountusermoney <>", value, "accountusermoney");
            return (Criteria) this;
        }

        public Criteria andAccountusermoneyGreaterThan(Double value) {
            addCriterion("accountusermoney >", value, "accountusermoney");
            return (Criteria) this;
        }

        public Criteria andAccountusermoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("accountusermoney >=", value, "accountusermoney");
            return (Criteria) this;
        }

        public Criteria andAccountusermoneyLessThan(Double value) {
            addCriterion("accountusermoney <", value, "accountusermoney");
            return (Criteria) this;
        }

        public Criteria andAccountusermoneyLessThanOrEqualTo(Double value) {
            addCriterion("accountusermoney <=", value, "accountusermoney");
            return (Criteria) this;
        }

        public Criteria andAccountusermoneyIn(List<Double> values) {
            addCriterion("accountusermoney in", values, "accountusermoney");
            return (Criteria) this;
        }

        public Criteria andAccountusermoneyNotIn(List<Double> values) {
            addCriterion("accountusermoney not in", values, "accountusermoney");
            return (Criteria) this;
        }

        public Criteria andAccountusermoneyBetween(Double value1, Double value2) {
            addCriterion("accountusermoney between", value1, value2, "accountusermoney");
            return (Criteria) this;
        }

        public Criteria andAccountusermoneyNotBetween(Double value1, Double value2) {
            addCriterion("accountusermoney not between", value1, value2, "accountusermoney");
            return (Criteria) this;
        }

        public Criteria andAccountfrostmoneyIsNull() {
            addCriterion("accountfrostmoney is null");
            return (Criteria) this;
        }

        public Criteria andAccountfrostmoneyIsNotNull() {
            addCriterion("accountfrostmoney is not null");
            return (Criteria) this;
        }

        public Criteria andAccountfrostmoneyEqualTo(Double value) {
            addCriterion("accountfrostmoney =", value, "accountfrostmoney");
            return (Criteria) this;
        }

        public Criteria andAccountfrostmoneyNotEqualTo(Double value) {
            addCriterion("accountfrostmoney <>", value, "accountfrostmoney");
            return (Criteria) this;
        }

        public Criteria andAccountfrostmoneyGreaterThan(Double value) {
            addCriterion("accountfrostmoney >", value, "accountfrostmoney");
            return (Criteria) this;
        }

        public Criteria andAccountfrostmoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("accountfrostmoney >=", value, "accountfrostmoney");
            return (Criteria) this;
        }

        public Criteria andAccountfrostmoneyLessThan(Double value) {
            addCriterion("accountfrostmoney <", value, "accountfrostmoney");
            return (Criteria) this;
        }

        public Criteria andAccountfrostmoneyLessThanOrEqualTo(Double value) {
            addCriterion("accountfrostmoney <=", value, "accountfrostmoney");
            return (Criteria) this;
        }

        public Criteria andAccountfrostmoneyIn(List<Double> values) {
            addCriterion("accountfrostmoney in", values, "accountfrostmoney");
            return (Criteria) this;
        }

        public Criteria andAccountfrostmoneyNotIn(List<Double> values) {
            addCriterion("accountfrostmoney not in", values, "accountfrostmoney");
            return (Criteria) this;
        }

        public Criteria andAccountfrostmoneyBetween(Double value1, Double value2) {
            addCriterion("accountfrostmoney between", value1, value2, "accountfrostmoney");
            return (Criteria) this;
        }

        public Criteria andAccountfrostmoneyNotBetween(Double value1, Double value2) {
            addCriterion("accountfrostmoney not between", value1, value2, "accountfrostmoney");
            return (Criteria) this;
        }

        public Criteria andAccountyishoulixiIsNull() {
            addCriterion("accountyishoulixi is null");
            return (Criteria) this;
        }

        public Criteria andAccountyishoulixiIsNotNull() {
            addCriterion("accountyishoulixi is not null");
            return (Criteria) this;
        }

        public Criteria andAccountyishoulixiEqualTo(Double value) {
            addCriterion("accountyishoulixi =", value, "accountyishoulixi");
            return (Criteria) this;
        }

        public Criteria andAccountyishoulixiNotEqualTo(Double value) {
            addCriterion("accountyishoulixi <>", value, "accountyishoulixi");
            return (Criteria) this;
        }

        public Criteria andAccountyishoulixiGreaterThan(Double value) {
            addCriterion("accountyishoulixi >", value, "accountyishoulixi");
            return (Criteria) this;
        }

        public Criteria andAccountyishoulixiGreaterThanOrEqualTo(Double value) {
            addCriterion("accountyishoulixi >=", value, "accountyishoulixi");
            return (Criteria) this;
        }

        public Criteria andAccountyishoulixiLessThan(Double value) {
            addCriterion("accountyishoulixi <", value, "accountyishoulixi");
            return (Criteria) this;
        }

        public Criteria andAccountyishoulixiLessThanOrEqualTo(Double value) {
            addCriterion("accountyishoulixi <=", value, "accountyishoulixi");
            return (Criteria) this;
        }

        public Criteria andAccountyishoulixiIn(List<Double> values) {
            addCriterion("accountyishoulixi in", values, "accountyishoulixi");
            return (Criteria) this;
        }

        public Criteria andAccountyishoulixiNotIn(List<Double> values) {
            addCriterion("accountyishoulixi not in", values, "accountyishoulixi");
            return (Criteria) this;
        }

        public Criteria andAccountyishoulixiBetween(Double value1, Double value2) {
            addCriterion("accountyishoulixi between", value1, value2, "accountyishoulixi");
            return (Criteria) this;
        }

        public Criteria andAccountyishoulixiNotBetween(Double value1, Double value2) {
            addCriterion("accountyishoulixi not between", value1, value2, "accountyishoulixi");
            return (Criteria) this;
        }

        public Criteria andAccountdaishouzongeIsNull() {
            addCriterion("accountdaishouzonge is null");
            return (Criteria) this;
        }

        public Criteria andAccountdaishouzongeIsNotNull() {
            addCriterion("accountdaishouzonge is not null");
            return (Criteria) this;
        }

        public Criteria andAccountdaishouzongeEqualTo(Double value) {
            addCriterion("accountdaishouzonge =", value, "accountdaishouzonge");
            return (Criteria) this;
        }

        public Criteria andAccountdaishouzongeNotEqualTo(Double value) {
            addCriterion("accountdaishouzonge <>", value, "accountdaishouzonge");
            return (Criteria) this;
        }

        public Criteria andAccountdaishouzongeGreaterThan(Double value) {
            addCriterion("accountdaishouzonge >", value, "accountdaishouzonge");
            return (Criteria) this;
        }

        public Criteria andAccountdaishouzongeGreaterThanOrEqualTo(Double value) {
            addCriterion("accountdaishouzonge >=", value, "accountdaishouzonge");
            return (Criteria) this;
        }

        public Criteria andAccountdaishouzongeLessThan(Double value) {
            addCriterion("accountdaishouzonge <", value, "accountdaishouzonge");
            return (Criteria) this;
        }

        public Criteria andAccountdaishouzongeLessThanOrEqualTo(Double value) {
            addCriterion("accountdaishouzonge <=", value, "accountdaishouzonge");
            return (Criteria) this;
        }

        public Criteria andAccountdaishouzongeIn(List<Double> values) {
            addCriterion("accountdaishouzonge in", values, "accountdaishouzonge");
            return (Criteria) this;
        }

        public Criteria andAccountdaishouzongeNotIn(List<Double> values) {
            addCriterion("accountdaishouzonge not in", values, "accountdaishouzonge");
            return (Criteria) this;
        }

        public Criteria andAccountdaishouzongeBetween(Double value1, Double value2) {
            addCriterion("accountdaishouzonge between", value1, value2, "accountdaishouzonge");
            return (Criteria) this;
        }

        public Criteria andAccountdaishouzongeNotBetween(Double value1, Double value2) {
            addCriterion("accountdaishouzonge not between", value1, value2, "accountdaishouzonge");
            return (Criteria) this;
        }

        public Criteria andAccountdaihuanjineIsNull() {
            addCriterion("accountdaihuanjine is null");
            return (Criteria) this;
        }

        public Criteria andAccountdaihuanjineIsNotNull() {
            addCriterion("accountdaihuanjine is not null");
            return (Criteria) this;
        }

        public Criteria andAccountdaihuanjineEqualTo(Double value) {
            addCriterion("accountdaihuanjine =", value, "accountdaihuanjine");
            return (Criteria) this;
        }

        public Criteria andAccountdaihuanjineNotEqualTo(Double value) {
            addCriterion("accountdaihuanjine <>", value, "accountdaihuanjine");
            return (Criteria) this;
        }

        public Criteria andAccountdaihuanjineGreaterThan(Double value) {
            addCriterion("accountdaihuanjine >", value, "accountdaihuanjine");
            return (Criteria) this;
        }

        public Criteria andAccountdaihuanjineGreaterThanOrEqualTo(Double value) {
            addCriterion("accountdaihuanjine >=", value, "accountdaihuanjine");
            return (Criteria) this;
        }

        public Criteria andAccountdaihuanjineLessThan(Double value) {
            addCriterion("accountdaihuanjine <", value, "accountdaihuanjine");
            return (Criteria) this;
        }

        public Criteria andAccountdaihuanjineLessThanOrEqualTo(Double value) {
            addCriterion("accountdaihuanjine <=", value, "accountdaihuanjine");
            return (Criteria) this;
        }

        public Criteria andAccountdaihuanjineIn(List<Double> values) {
            addCriterion("accountdaihuanjine in", values, "accountdaihuanjine");
            return (Criteria) this;
        }

        public Criteria andAccountdaihuanjineNotIn(List<Double> values) {
            addCriterion("accountdaihuanjine not in", values, "accountdaihuanjine");
            return (Criteria) this;
        }

        public Criteria andAccountdaihuanjineBetween(Double value1, Double value2) {
            addCriterion("accountdaihuanjine between", value1, value2, "accountdaihuanjine");
            return (Criteria) this;
        }

        public Criteria andAccountdaihuanjineNotBetween(Double value1, Double value2) {
            addCriterion("accountdaihuanjine not between", value1, value2, "accountdaihuanjine");
            return (Criteria) this;
        }

        public Criteria andAccountflagIsNull() {
            addCriterion("accountflag is null");
            return (Criteria) this;
        }

        public Criteria andAccountflagIsNotNull() {
            addCriterion("accountflag is not null");
            return (Criteria) this;
        }

        public Criteria andAccountflagEqualTo(Double value) {
            addCriterion("accountflag =", value, "accountflag");
            return (Criteria) this;
        }

        public Criteria andAccountflagNotEqualTo(Double value) {
            addCriterion("accountflag <>", value, "accountflag");
            return (Criteria) this;
        }

        public Criteria andAccountflagGreaterThan(Double value) {
            addCriterion("accountflag >", value, "accountflag");
            return (Criteria) this;
        }

        public Criteria andAccountflagGreaterThanOrEqualTo(Double value) {
            addCriterion("accountflag >=", value, "accountflag");
            return (Criteria) this;
        }

        public Criteria andAccountflagLessThan(Double value) {
            addCriterion("accountflag <", value, "accountflag");
            return (Criteria) this;
        }

        public Criteria andAccountflagLessThanOrEqualTo(Double value) {
            addCriterion("accountflag <=", value, "accountflag");
            return (Criteria) this;
        }

        public Criteria andAccountflagIn(List<Double> values) {
            addCriterion("accountflag in", values, "accountflag");
            return (Criteria) this;
        }

        public Criteria andAccountflagNotIn(List<Double> values) {
            addCriterion("accountflag not in", values, "accountflag");
            return (Criteria) this;
        }

        public Criteria andAccountflagBetween(Double value1, Double value2) {
            addCriterion("accountflag between", value1, value2, "accountflag");
            return (Criteria) this;
        }

        public Criteria andAccountflagNotBetween(Double value1, Double value2) {
            addCriterion("accountflag not between", value1, value2, "accountflag");
            return (Criteria) this;
        }

        public Criteria andAccountflag2IsNull() {
            addCriterion("accountflag2 is null");
            return (Criteria) this;
        }

        public Criteria andAccountflag2IsNotNull() {
            addCriterion("accountflag2 is not null");
            return (Criteria) this;
        }

        public Criteria andAccountflag2EqualTo(Double value) {
            addCriterion("accountflag2 =", value, "accountflag2");
            return (Criteria) this;
        }

        public Criteria andAccountflag2NotEqualTo(Double value) {
            addCriterion("accountflag2 <>", value, "accountflag2");
            return (Criteria) this;
        }

        public Criteria andAccountflag2GreaterThan(Double value) {
            addCriterion("accountflag2 >", value, "accountflag2");
            return (Criteria) this;
        }

        public Criteria andAccountflag2GreaterThanOrEqualTo(Double value) {
            addCriterion("accountflag2 >=", value, "accountflag2");
            return (Criteria) this;
        }

        public Criteria andAccountflag2LessThan(Double value) {
            addCriterion("accountflag2 <", value, "accountflag2");
            return (Criteria) this;
        }

        public Criteria andAccountflag2LessThanOrEqualTo(Double value) {
            addCriterion("accountflag2 <=", value, "accountflag2");
            return (Criteria) this;
        }

        public Criteria andAccountflag2In(List<Double> values) {
            addCriterion("accountflag2 in", values, "accountflag2");
            return (Criteria) this;
        }

        public Criteria andAccountflag2NotIn(List<Double> values) {
            addCriterion("accountflag2 not in", values, "accountflag2");
            return (Criteria) this;
        }

        public Criteria andAccountflag2Between(Double value1, Double value2) {
            addCriterion("accountflag2 between", value1, value2, "accountflag2");
            return (Criteria) this;
        }

        public Criteria andAccountflag2NotBetween(Double value1, Double value2) {
            addCriterion("accountflag2 not between", value1, value2, "accountflag2");
            return (Criteria) this;
        }

        public Criteria andAccountflag3IsNull() {
            addCriterion("accountflag3 is null");
            return (Criteria) this;
        }

        public Criteria andAccountflag3IsNotNull() {
            addCriterion("accountflag3 is not null");
            return (Criteria) this;
        }

        public Criteria andAccountflag3EqualTo(Double value) {
            addCriterion("accountflag3 =", value, "accountflag3");
            return (Criteria) this;
        }

        public Criteria andAccountflag3NotEqualTo(Double value) {
            addCriterion("accountflag3 <>", value, "accountflag3");
            return (Criteria) this;
        }

        public Criteria andAccountflag3GreaterThan(Double value) {
            addCriterion("accountflag3 >", value, "accountflag3");
            return (Criteria) this;
        }

        public Criteria andAccountflag3GreaterThanOrEqualTo(Double value) {
            addCriterion("accountflag3 >=", value, "accountflag3");
            return (Criteria) this;
        }

        public Criteria andAccountflag3LessThan(Double value) {
            addCriterion("accountflag3 <", value, "accountflag3");
            return (Criteria) this;
        }

        public Criteria andAccountflag3LessThanOrEqualTo(Double value) {
            addCriterion("accountflag3 <=", value, "accountflag3");
            return (Criteria) this;
        }

        public Criteria andAccountflag3In(List<Double> values) {
            addCriterion("accountflag3 in", values, "accountflag3");
            return (Criteria) this;
        }

        public Criteria andAccountflag3NotIn(List<Double> values) {
            addCriterion("accountflag3 not in", values, "accountflag3");
            return (Criteria) this;
        }

        public Criteria andAccountflag3Between(Double value1, Double value2) {
            addCriterion("accountflag3 between", value1, value2, "accountflag3");
            return (Criteria) this;
        }

        public Criteria andAccountflag3NotBetween(Double value1, Double value2) {
            addCriterion("accountflag3 not between", value1, value2, "accountflag3");
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