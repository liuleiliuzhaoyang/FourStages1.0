package com.qf.pojo;

import java.util.ArrayList;
import java.util.List;

public class TopupExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TopupExample() {
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

        public Criteria andTopupidIsNull() {
            addCriterion("topupid is null");
            return (Criteria) this;
        }

        public Criteria andTopupidIsNotNull() {
            addCriterion("topupid is not null");
            return (Criteria) this;
        }

        public Criteria andTopupidEqualTo(Integer value) {
            addCriterion("topupid =", value, "topupid");
            return (Criteria) this;
        }

        public Criteria andTopupidNotEqualTo(Integer value) {
            addCriterion("topupid <>", value, "topupid");
            return (Criteria) this;
        }

        public Criteria andTopupidGreaterThan(Integer value) {
            addCriterion("topupid >", value, "topupid");
            return (Criteria) this;
        }

        public Criteria andTopupidGreaterThanOrEqualTo(Integer value) {
            addCriterion("topupid >=", value, "topupid");
            return (Criteria) this;
        }

        public Criteria andTopupidLessThan(Integer value) {
            addCriterion("topupid <", value, "topupid");
            return (Criteria) this;
        }

        public Criteria andTopupidLessThanOrEqualTo(Integer value) {
            addCriterion("topupid <=", value, "topupid");
            return (Criteria) this;
        }

        public Criteria andTopupidIn(List<Integer> values) {
            addCriterion("topupid in", values, "topupid");
            return (Criteria) this;
        }

        public Criteria andTopupidNotIn(List<Integer> values) {
            addCriterion("topupid not in", values, "topupid");
            return (Criteria) this;
        }

        public Criteria andTopupidBetween(Integer value1, Integer value2) {
            addCriterion("topupid between", value1, value2, "topupid");
            return (Criteria) this;
        }

        public Criteria andTopupidNotBetween(Integer value1, Integer value2) {
            addCriterion("topupid not between", value1, value2, "topupid");
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

        public Criteria andTopupnumberIsNull() {
            addCriterion("topupnumber is null");
            return (Criteria) this;
        }

        public Criteria andTopupnumberIsNotNull() {
            addCriterion("topupnumber is not null");
            return (Criteria) this;
        }

        public Criteria andTopupnumberEqualTo(String value) {
            addCriterion("topupnumber =", value, "topupnumber");
            return (Criteria) this;
        }

        public Criteria andTopupnumberNotEqualTo(String value) {
            addCriterion("topupnumber <>", value, "topupnumber");
            return (Criteria) this;
        }

        public Criteria andTopupnumberGreaterThan(String value) {
            addCriterion("topupnumber >", value, "topupnumber");
            return (Criteria) this;
        }

        public Criteria andTopupnumberGreaterThanOrEqualTo(String value) {
            addCriterion("topupnumber >=", value, "topupnumber");
            return (Criteria) this;
        }

        public Criteria andTopupnumberLessThan(String value) {
            addCriterion("topupnumber <", value, "topupnumber");
            return (Criteria) this;
        }

        public Criteria andTopupnumberLessThanOrEqualTo(String value) {
            addCriterion("topupnumber <=", value, "topupnumber");
            return (Criteria) this;
        }

        public Criteria andTopupnumberLike(String value) {
            addCriterion("topupnumber like", value, "topupnumber");
            return (Criteria) this;
        }

        public Criteria andTopupnumberNotLike(String value) {
            addCriterion("topupnumber not like", value, "topupnumber");
            return (Criteria) this;
        }

        public Criteria andTopupnumberIn(List<String> values) {
            addCriterion("topupnumber in", values, "topupnumber");
            return (Criteria) this;
        }

        public Criteria andTopupnumberNotIn(List<String> values) {
            addCriterion("topupnumber not in", values, "topupnumber");
            return (Criteria) this;
        }

        public Criteria andTopupnumberBetween(String value1, String value2) {
            addCriterion("topupnumber between", value1, value2, "topupnumber");
            return (Criteria) this;
        }

        public Criteria andTopupnumberNotBetween(String value1, String value2) {
            addCriterion("topupnumber not between", value1, value2, "topupnumber");
            return (Criteria) this;
        }

        public Criteria andTopupleixingIsNull() {
            addCriterion("topupleixing is null");
            return (Criteria) this;
        }

        public Criteria andTopupleixingIsNotNull() {
            addCriterion("topupleixing is not null");
            return (Criteria) this;
        }

        public Criteria andTopupleixingEqualTo(String value) {
            addCriterion("topupleixing =", value, "topupleixing");
            return (Criteria) this;
        }

        public Criteria andTopupleixingNotEqualTo(String value) {
            addCriterion("topupleixing <>", value, "topupleixing");
            return (Criteria) this;
        }

        public Criteria andTopupleixingGreaterThan(String value) {
            addCriterion("topupleixing >", value, "topupleixing");
            return (Criteria) this;
        }

        public Criteria andTopupleixingGreaterThanOrEqualTo(String value) {
            addCriterion("topupleixing >=", value, "topupleixing");
            return (Criteria) this;
        }

        public Criteria andTopupleixingLessThan(String value) {
            addCriterion("topupleixing <", value, "topupleixing");
            return (Criteria) this;
        }

        public Criteria andTopupleixingLessThanOrEqualTo(String value) {
            addCriterion("topupleixing <=", value, "topupleixing");
            return (Criteria) this;
        }

        public Criteria andTopupleixingLike(String value) {
            addCriterion("topupleixing like", value, "topupleixing");
            return (Criteria) this;
        }

        public Criteria andTopupleixingNotLike(String value) {
            addCriterion("topupleixing not like", value, "topupleixing");
            return (Criteria) this;
        }

        public Criteria andTopupleixingIn(List<String> values) {
            addCriterion("topupleixing in", values, "topupleixing");
            return (Criteria) this;
        }

        public Criteria andTopupleixingNotIn(List<String> values) {
            addCriterion("topupleixing not in", values, "topupleixing");
            return (Criteria) this;
        }

        public Criteria andTopupleixingBetween(String value1, String value2) {
            addCriterion("topupleixing between", value1, value2, "topupleixing");
            return (Criteria) this;
        }

        public Criteria andTopupleixingNotBetween(String value1, String value2) {
            addCriterion("topupleixing not between", value1, value2, "topupleixing");
            return (Criteria) this;
        }

        public Criteria andTopupfangshiIsNull() {
            addCriterion("topupfangshi is null");
            return (Criteria) this;
        }

        public Criteria andTopupfangshiIsNotNull() {
            addCriterion("topupfangshi is not null");
            return (Criteria) this;
        }

        public Criteria andTopupfangshiEqualTo(String value) {
            addCriterion("topupfangshi =", value, "topupfangshi");
            return (Criteria) this;
        }

        public Criteria andTopupfangshiNotEqualTo(String value) {
            addCriterion("topupfangshi <>", value, "topupfangshi");
            return (Criteria) this;
        }

        public Criteria andTopupfangshiGreaterThan(String value) {
            addCriterion("topupfangshi >", value, "topupfangshi");
            return (Criteria) this;
        }

        public Criteria andTopupfangshiGreaterThanOrEqualTo(String value) {
            addCriterion("topupfangshi >=", value, "topupfangshi");
            return (Criteria) this;
        }

        public Criteria andTopupfangshiLessThan(String value) {
            addCriterion("topupfangshi <", value, "topupfangshi");
            return (Criteria) this;
        }

        public Criteria andTopupfangshiLessThanOrEqualTo(String value) {
            addCriterion("topupfangshi <=", value, "topupfangshi");
            return (Criteria) this;
        }

        public Criteria andTopupfangshiLike(String value) {
            addCriterion("topupfangshi like", value, "topupfangshi");
            return (Criteria) this;
        }

        public Criteria andTopupfangshiNotLike(String value) {
            addCriterion("topupfangshi not like", value, "topupfangshi");
            return (Criteria) this;
        }

        public Criteria andTopupfangshiIn(List<String> values) {
            addCriterion("topupfangshi in", values, "topupfangshi");
            return (Criteria) this;
        }

        public Criteria andTopupfangshiNotIn(List<String> values) {
            addCriterion("topupfangshi not in", values, "topupfangshi");
            return (Criteria) this;
        }

        public Criteria andTopupfangshiBetween(String value1, String value2) {
            addCriterion("topupfangshi between", value1, value2, "topupfangshi");
            return (Criteria) this;
        }

        public Criteria andTopupfangshiNotBetween(String value1, String value2) {
            addCriterion("topupfangshi not between", value1, value2, "topupfangshi");
            return (Criteria) this;
        }

        public Criteria andTopupbeizhuIsNull() {
            addCriterion("topupbeizhu is null");
            return (Criteria) this;
        }

        public Criteria andTopupbeizhuIsNotNull() {
            addCriterion("topupbeizhu is not null");
            return (Criteria) this;
        }

        public Criteria andTopupbeizhuEqualTo(String value) {
            addCriterion("topupbeizhu =", value, "topupbeizhu");
            return (Criteria) this;
        }

        public Criteria andTopupbeizhuNotEqualTo(String value) {
            addCriterion("topupbeizhu <>", value, "topupbeizhu");
            return (Criteria) this;
        }

        public Criteria andTopupbeizhuGreaterThan(String value) {
            addCriterion("topupbeizhu >", value, "topupbeizhu");
            return (Criteria) this;
        }

        public Criteria andTopupbeizhuGreaterThanOrEqualTo(String value) {
            addCriterion("topupbeizhu >=", value, "topupbeizhu");
            return (Criteria) this;
        }

        public Criteria andTopupbeizhuLessThan(String value) {
            addCriterion("topupbeizhu <", value, "topupbeizhu");
            return (Criteria) this;
        }

        public Criteria andTopupbeizhuLessThanOrEqualTo(String value) {
            addCriterion("topupbeizhu <=", value, "topupbeizhu");
            return (Criteria) this;
        }

        public Criteria andTopupbeizhuLike(String value) {
            addCriterion("topupbeizhu like", value, "topupbeizhu");
            return (Criteria) this;
        }

        public Criteria andTopupbeizhuNotLike(String value) {
            addCriterion("topupbeizhu not like", value, "topupbeizhu");
            return (Criteria) this;
        }

        public Criteria andTopupbeizhuIn(List<String> values) {
            addCriterion("topupbeizhu in", values, "topupbeizhu");
            return (Criteria) this;
        }

        public Criteria andTopupbeizhuNotIn(List<String> values) {
            addCriterion("topupbeizhu not in", values, "topupbeizhu");
            return (Criteria) this;
        }

        public Criteria andTopupbeizhuBetween(String value1, String value2) {
            addCriterion("topupbeizhu between", value1, value2, "topupbeizhu");
            return (Criteria) this;
        }

        public Criteria andTopupbeizhuNotBetween(String value1, String value2) {
            addCriterion("topupbeizhu not between", value1, value2, "topupbeizhu");
            return (Criteria) this;
        }

        public Criteria andTopupzhuangtaiIsNull() {
            addCriterion("topupzhuangtai is null");
            return (Criteria) this;
        }

        public Criteria andTopupzhuangtaiIsNotNull() {
            addCriterion("topupzhuangtai is not null");
            return (Criteria) this;
        }

        public Criteria andTopupzhuangtaiEqualTo(String value) {
            addCriterion("topupzhuangtai =", value, "topupzhuangtai");
            return (Criteria) this;
        }

        public Criteria andTopupzhuangtaiNotEqualTo(String value) {
            addCriterion("topupzhuangtai <>", value, "topupzhuangtai");
            return (Criteria) this;
        }

        public Criteria andTopupzhuangtaiGreaterThan(String value) {
            addCriterion("topupzhuangtai >", value, "topupzhuangtai");
            return (Criteria) this;
        }

        public Criteria andTopupzhuangtaiGreaterThanOrEqualTo(String value) {
            addCriterion("topupzhuangtai >=", value, "topupzhuangtai");
            return (Criteria) this;
        }

        public Criteria andTopupzhuangtaiLessThan(String value) {
            addCriterion("topupzhuangtai <", value, "topupzhuangtai");
            return (Criteria) this;
        }

        public Criteria andTopupzhuangtaiLessThanOrEqualTo(String value) {
            addCriterion("topupzhuangtai <=", value, "topupzhuangtai");
            return (Criteria) this;
        }

        public Criteria andTopupzhuangtaiLike(String value) {
            addCriterion("topupzhuangtai like", value, "topupzhuangtai");
            return (Criteria) this;
        }

        public Criteria andTopupzhuangtaiNotLike(String value) {
            addCriterion("topupzhuangtai not like", value, "topupzhuangtai");
            return (Criteria) this;
        }

        public Criteria andTopupzhuangtaiIn(List<String> values) {
            addCriterion("topupzhuangtai in", values, "topupzhuangtai");
            return (Criteria) this;
        }

        public Criteria andTopupzhuangtaiNotIn(List<String> values) {
            addCriterion("topupzhuangtai not in", values, "topupzhuangtai");
            return (Criteria) this;
        }

        public Criteria andTopupzhuangtaiBetween(String value1, String value2) {
            addCriterion("topupzhuangtai between", value1, value2, "topupzhuangtai");
            return (Criteria) this;
        }

        public Criteria andTopupzhuangtaiNotBetween(String value1, String value2) {
            addCriterion("topupzhuangtai not between", value1, value2, "topupzhuangtai");
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