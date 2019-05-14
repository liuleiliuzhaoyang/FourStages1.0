package com.qf.pojo;

import java.util.ArrayList;
import java.util.List;

public class IdentifyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public IdentifyExample() {
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

        public Criteria andIdentifyidIsNull() {
            addCriterion("identifyid is null");
            return (Criteria) this;
        }

        public Criteria andIdentifyidIsNotNull() {
            addCriterion("identifyid is not null");
            return (Criteria) this;
        }

        public Criteria andIdentifyidEqualTo(Integer value) {
            addCriterion("identifyid =", value, "identifyid");
            return (Criteria) this;
        }

        public Criteria andIdentifyidNotEqualTo(Integer value) {
            addCriterion("identifyid <>", value, "identifyid");
            return (Criteria) this;
        }

        public Criteria andIdentifyidGreaterThan(Integer value) {
            addCriterion("identifyid >", value, "identifyid");
            return (Criteria) this;
        }

        public Criteria andIdentifyidGreaterThanOrEqualTo(Integer value) {
            addCriterion("identifyid >=", value, "identifyid");
            return (Criteria) this;
        }

        public Criteria andIdentifyidLessThan(Integer value) {
            addCriterion("identifyid <", value, "identifyid");
            return (Criteria) this;
        }

        public Criteria andIdentifyidLessThanOrEqualTo(Integer value) {
            addCriterion("identifyid <=", value, "identifyid");
            return (Criteria) this;
        }

        public Criteria andIdentifyidIn(List<Integer> values) {
            addCriterion("identifyid in", values, "identifyid");
            return (Criteria) this;
        }

        public Criteria andIdentifyidNotIn(List<Integer> values) {
            addCriterion("identifyid not in", values, "identifyid");
            return (Criteria) this;
        }

        public Criteria andIdentifyidBetween(Integer value1, Integer value2) {
            addCriterion("identifyid between", value1, value2, "identifyid");
            return (Criteria) this;
        }

        public Criteria andIdentifyidNotBetween(Integer value1, Integer value2) {
            addCriterion("identifyid not between", value1, value2, "identifyid");
            return (Criteria) this;
        }

        public Criteria andIdentifynameIsNull() {
            addCriterion("identifyname is null");
            return (Criteria) this;
        }

        public Criteria andIdentifynameIsNotNull() {
            addCriterion("identifyname is not null");
            return (Criteria) this;
        }

        public Criteria andIdentifynameEqualTo(String value) {
            addCriterion("identifyname =", value, "identifyname");
            return (Criteria) this;
        }

        public Criteria andIdentifynameNotEqualTo(String value) {
            addCriterion("identifyname <>", value, "identifyname");
            return (Criteria) this;
        }

        public Criteria andIdentifynameGreaterThan(String value) {
            addCriterion("identifyname >", value, "identifyname");
            return (Criteria) this;
        }

        public Criteria andIdentifynameGreaterThanOrEqualTo(String value) {
            addCriterion("identifyname >=", value, "identifyname");
            return (Criteria) this;
        }

        public Criteria andIdentifynameLessThan(String value) {
            addCriterion("identifyname <", value, "identifyname");
            return (Criteria) this;
        }

        public Criteria andIdentifynameLessThanOrEqualTo(String value) {
            addCriterion("identifyname <=", value, "identifyname");
            return (Criteria) this;
        }

        public Criteria andIdentifynameLike(String value) {
            addCriterion("identifyname like", value, "identifyname");
            return (Criteria) this;
        }

        public Criteria andIdentifynameNotLike(String value) {
            addCriterion("identifyname not like", value, "identifyname");
            return (Criteria) this;
        }

        public Criteria andIdentifynameIn(List<String> values) {
            addCriterion("identifyname in", values, "identifyname");
            return (Criteria) this;
        }

        public Criteria andIdentifynameNotIn(List<String> values) {
            addCriterion("identifyname not in", values, "identifyname");
            return (Criteria) this;
        }

        public Criteria andIdentifynameBetween(String value1, String value2) {
            addCriterion("identifyname between", value1, value2, "identifyname");
            return (Criteria) this;
        }

        public Criteria andIdentifynameNotBetween(String value1, String value2) {
            addCriterion("identifyname not between", value1, value2, "identifyname");
            return (Criteria) this;
        }

        public Criteria andIdentifycodeIsNull() {
            addCriterion("identifycode is null");
            return (Criteria) this;
        }

        public Criteria andIdentifycodeIsNotNull() {
            addCriterion("identifycode is not null");
            return (Criteria) this;
        }

        public Criteria andIdentifycodeEqualTo(String value) {
            addCriterion("identifycode =", value, "identifycode");
            return (Criteria) this;
        }

        public Criteria andIdentifycodeNotEqualTo(String value) {
            addCriterion("identifycode <>", value, "identifycode");
            return (Criteria) this;
        }

        public Criteria andIdentifycodeGreaterThan(String value) {
            addCriterion("identifycode >", value, "identifycode");
            return (Criteria) this;
        }

        public Criteria andIdentifycodeGreaterThanOrEqualTo(String value) {
            addCriterion("identifycode >=", value, "identifycode");
            return (Criteria) this;
        }

        public Criteria andIdentifycodeLessThan(String value) {
            addCriterion("identifycode <", value, "identifycode");
            return (Criteria) this;
        }

        public Criteria andIdentifycodeLessThanOrEqualTo(String value) {
            addCriterion("identifycode <=", value, "identifycode");
            return (Criteria) this;
        }

        public Criteria andIdentifycodeLike(String value) {
            addCriterion("identifycode like", value, "identifycode");
            return (Criteria) this;
        }

        public Criteria andIdentifycodeNotLike(String value) {
            addCriterion("identifycode not like", value, "identifycode");
            return (Criteria) this;
        }

        public Criteria andIdentifycodeIn(List<String> values) {
            addCriterion("identifycode in", values, "identifycode");
            return (Criteria) this;
        }

        public Criteria andIdentifycodeNotIn(List<String> values) {
            addCriterion("identifycode not in", values, "identifycode");
            return (Criteria) this;
        }

        public Criteria andIdentifycodeBetween(String value1, String value2) {
            addCriterion("identifycode between", value1, value2, "identifycode");
            return (Criteria) this;
        }

        public Criteria andIdentifycodeNotBetween(String value1, String value2) {
            addCriterion("identifycode not between", value1, value2, "identifycode");
            return (Criteria) this;
        }

        public Criteria andIdentifytelIsNull() {
            addCriterion("identifytel is null");
            return (Criteria) this;
        }

        public Criteria andIdentifytelIsNotNull() {
            addCriterion("identifytel is not null");
            return (Criteria) this;
        }

        public Criteria andIdentifytelEqualTo(String value) {
            addCriterion("identifytel =", value, "identifytel");
            return (Criteria) this;
        }

        public Criteria andIdentifytelNotEqualTo(String value) {
            addCriterion("identifytel <>", value, "identifytel");
            return (Criteria) this;
        }

        public Criteria andIdentifytelGreaterThan(String value) {
            addCriterion("identifytel >", value, "identifytel");
            return (Criteria) this;
        }

        public Criteria andIdentifytelGreaterThanOrEqualTo(String value) {
            addCriterion("identifytel >=", value, "identifytel");
            return (Criteria) this;
        }

        public Criteria andIdentifytelLessThan(String value) {
            addCriterion("identifytel <", value, "identifytel");
            return (Criteria) this;
        }

        public Criteria andIdentifytelLessThanOrEqualTo(String value) {
            addCriterion("identifytel <=", value, "identifytel");
            return (Criteria) this;
        }

        public Criteria andIdentifytelLike(String value) {
            addCriterion("identifytel like", value, "identifytel");
            return (Criteria) this;
        }

        public Criteria andIdentifytelNotLike(String value) {
            addCriterion("identifytel not like", value, "identifytel");
            return (Criteria) this;
        }

        public Criteria andIdentifytelIn(List<String> values) {
            addCriterion("identifytel in", values, "identifytel");
            return (Criteria) this;
        }

        public Criteria andIdentifytelNotIn(List<String> values) {
            addCriterion("identifytel not in", values, "identifytel");
            return (Criteria) this;
        }

        public Criteria andIdentifytelBetween(String value1, String value2) {
            addCriterion("identifytel between", value1, value2, "identifytel");
            return (Criteria) this;
        }

        public Criteria andIdentifytelNotBetween(String value1, String value2) {
            addCriterion("identifytel not between", value1, value2, "identifytel");
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