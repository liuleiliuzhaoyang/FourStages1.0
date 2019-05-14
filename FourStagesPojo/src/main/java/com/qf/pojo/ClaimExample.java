package com.qf.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ClaimExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ClaimExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andClaimidIsNull() {
            addCriterion("claimid is null");
            return (Criteria) this;
        }

        public Criteria andClaimidIsNotNull() {
            addCriterion("claimid is not null");
            return (Criteria) this;
        }

        public Criteria andClaimidEqualTo(Integer value) {
            addCriterion("claimid =", value, "claimid");
            return (Criteria) this;
        }

        public Criteria andClaimidNotEqualTo(Integer value) {
            addCriterion("claimid <>", value, "claimid");
            return (Criteria) this;
        }

        public Criteria andClaimidGreaterThan(Integer value) {
            addCriterion("claimid >", value, "claimid");
            return (Criteria) this;
        }

        public Criteria andClaimidGreaterThanOrEqualTo(Integer value) {
            addCriterion("claimid >=", value, "claimid");
            return (Criteria) this;
        }

        public Criteria andClaimidLessThan(Integer value) {
            addCriterion("claimid <", value, "claimid");
            return (Criteria) this;
        }

        public Criteria andClaimidLessThanOrEqualTo(Integer value) {
            addCriterion("claimid <=", value, "claimid");
            return (Criteria) this;
        }

        public Criteria andClaimidIn(List<Integer> values) {
            addCriterion("claimid in", values, "claimid");
            return (Criteria) this;
        }

        public Criteria andClaimidNotIn(List<Integer> values) {
            addCriterion("claimid not in", values, "claimid");
            return (Criteria) this;
        }

        public Criteria andClaimidBetween(Integer value1, Integer value2) {
            addCriterion("claimid between", value1, value2, "claimid");
            return (Criteria) this;
        }

        public Criteria andClaimidNotBetween(Integer value1, Integer value2) {
            addCriterion("claimid not between", value1, value2, "claimid");
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

        public Criteria andClaimzuidiIsNull() {
            addCriterion("claimzuidi is null");
            return (Criteria) this;
        }

        public Criteria andClaimzuidiIsNotNull() {
            addCriterion("claimzuidi is not null");
            return (Criteria) this;
        }

        public Criteria andClaimzuidiEqualTo(String value) {
            addCriterion("claimzuidi =", value, "claimzuidi");
            return (Criteria) this;
        }

        public Criteria andClaimzuidiNotEqualTo(String value) {
            addCriterion("claimzuidi <>", value, "claimzuidi");
            return (Criteria) this;
        }

        public Criteria andClaimzuidiGreaterThan(String value) {
            addCriterion("claimzuidi >", value, "claimzuidi");
            return (Criteria) this;
        }

        public Criteria andClaimzuidiGreaterThanOrEqualTo(String value) {
            addCriterion("claimzuidi >=", value, "claimzuidi");
            return (Criteria) this;
        }

        public Criteria andClaimzuidiLessThan(String value) {
            addCriterion("claimzuidi <", value, "claimzuidi");
            return (Criteria) this;
        }

        public Criteria andClaimzuidiLessThanOrEqualTo(String value) {
            addCriterion("claimzuidi <=", value, "claimzuidi");
            return (Criteria) this;
        }

        public Criteria andClaimzuidiLike(String value) {
            addCriterion("claimzuidi like", value, "claimzuidi");
            return (Criteria) this;
        }

        public Criteria andClaimzuidiNotLike(String value) {
            addCriterion("claimzuidi not like", value, "claimzuidi");
            return (Criteria) this;
        }

        public Criteria andClaimzuidiIn(List<String> values) {
            addCriterion("claimzuidi in", values, "claimzuidi");
            return (Criteria) this;
        }

        public Criteria andClaimzuidiNotIn(List<String> values) {
            addCriterion("claimzuidi not in", values, "claimzuidi");
            return (Criteria) this;
        }

        public Criteria andClaimzuidiBetween(String value1, String value2) {
            addCriterion("claimzuidi between", value1, value2, "claimzuidi");
            return (Criteria) this;
        }

        public Criteria andClaimzuidiNotBetween(String value1, String value2) {
            addCriterion("claimzuidi not between", value1, value2, "claimzuidi");
            return (Criteria) this;
        }

        public Criteria andClaimzuigaoIsNull() {
            addCriterion("claimzuigao is null");
            return (Criteria) this;
        }

        public Criteria andClaimzuigaoIsNotNull() {
            addCriterion("claimzuigao is not null");
            return (Criteria) this;
        }

        public Criteria andClaimzuigaoEqualTo(String value) {
            addCriterion("claimzuigao =", value, "claimzuigao");
            return (Criteria) this;
        }

        public Criteria andClaimzuigaoNotEqualTo(String value) {
            addCriterion("claimzuigao <>", value, "claimzuigao");
            return (Criteria) this;
        }

        public Criteria andClaimzuigaoGreaterThan(String value) {
            addCriterion("claimzuigao >", value, "claimzuigao");
            return (Criteria) this;
        }

        public Criteria andClaimzuigaoGreaterThanOrEqualTo(String value) {
            addCriterion("claimzuigao >=", value, "claimzuigao");
            return (Criteria) this;
        }

        public Criteria andClaimzuigaoLessThan(String value) {
            addCriterion("claimzuigao <", value, "claimzuigao");
            return (Criteria) this;
        }

        public Criteria andClaimzuigaoLessThanOrEqualTo(String value) {
            addCriterion("claimzuigao <=", value, "claimzuigao");
            return (Criteria) this;
        }

        public Criteria andClaimzuigaoLike(String value) {
            addCriterion("claimzuigao like", value, "claimzuigao");
            return (Criteria) this;
        }

        public Criteria andClaimzuigaoNotLike(String value) {
            addCriterion("claimzuigao not like", value, "claimzuigao");
            return (Criteria) this;
        }

        public Criteria andClaimzuigaoIn(List<String> values) {
            addCriterion("claimzuigao in", values, "claimzuigao");
            return (Criteria) this;
        }

        public Criteria andClaimzuigaoNotIn(List<String> values) {
            addCriterion("claimzuigao not in", values, "claimzuigao");
            return (Criteria) this;
        }

        public Criteria andClaimzuigaoBetween(String value1, String value2) {
            addCriterion("claimzuigao between", value1, value2, "claimzuigao");
            return (Criteria) this;
        }

        public Criteria andClaimzuigaoNotBetween(String value1, String value2) {
            addCriterion("claimzuigao not between", value1, value2, "claimzuigao");
            return (Criteria) this;
        }

        public Criteria andClaimzhuanrangIsNull() {
            addCriterion("claimzhuanrang is null");
            return (Criteria) this;
        }

        public Criteria andClaimzhuanrangIsNotNull() {
            addCriterion("claimzhuanrang is not null");
            return (Criteria) this;
        }

        public Criteria andClaimzhuanrangEqualTo(String value) {
            addCriterion("claimzhuanrang =", value, "claimzhuanrang");
            return (Criteria) this;
        }

        public Criteria andClaimzhuanrangNotEqualTo(String value) {
            addCriterion("claimzhuanrang <>", value, "claimzhuanrang");
            return (Criteria) this;
        }

        public Criteria andClaimzhuanrangGreaterThan(String value) {
            addCriterion("claimzhuanrang >", value, "claimzhuanrang");
            return (Criteria) this;
        }

        public Criteria andClaimzhuanrangGreaterThanOrEqualTo(String value) {
            addCriterion("claimzhuanrang >=", value, "claimzhuanrang");
            return (Criteria) this;
        }

        public Criteria andClaimzhuanrangLessThan(String value) {
            addCriterion("claimzhuanrang <", value, "claimzhuanrang");
            return (Criteria) this;
        }

        public Criteria andClaimzhuanrangLessThanOrEqualTo(String value) {
            addCriterion("claimzhuanrang <=", value, "claimzhuanrang");
            return (Criteria) this;
        }

        public Criteria andClaimzhuanrangLike(String value) {
            addCriterion("claimzhuanrang like", value, "claimzhuanrang");
            return (Criteria) this;
        }

        public Criteria andClaimzhuanrangNotLike(String value) {
            addCriterion("claimzhuanrang not like", value, "claimzhuanrang");
            return (Criteria) this;
        }

        public Criteria andClaimzhuanrangIn(List<String> values) {
            addCriterion("claimzhuanrang in", values, "claimzhuanrang");
            return (Criteria) this;
        }

        public Criteria andClaimzhuanrangNotIn(List<String> values) {
            addCriterion("claimzhuanrang not in", values, "claimzhuanrang");
            return (Criteria) this;
        }

        public Criteria andClaimzhuanrangBetween(String value1, String value2) {
            addCriterion("claimzhuanrang between", value1, value2, "claimzhuanrang");
            return (Criteria) this;
        }

        public Criteria andClaimzhuanrangNotBetween(String value1, String value2) {
            addCriterion("claimzhuanrang not between", value1, value2, "claimzhuanrang");
            return (Criteria) this;
        }

        public Criteria andClaimchengjieIsNull() {
            addCriterion("claimchengjie is null");
            return (Criteria) this;
        }

        public Criteria andClaimchengjieIsNotNull() {
            addCriterion("claimchengjie is not null");
            return (Criteria) this;
        }

        public Criteria andClaimchengjieEqualTo(String value) {
            addCriterion("claimchengjie =", value, "claimchengjie");
            return (Criteria) this;
        }

        public Criteria andClaimchengjieNotEqualTo(String value) {
            addCriterion("claimchengjie <>", value, "claimchengjie");
            return (Criteria) this;
        }

        public Criteria andClaimchengjieGreaterThan(String value) {
            addCriterion("claimchengjie >", value, "claimchengjie");
            return (Criteria) this;
        }

        public Criteria andClaimchengjieGreaterThanOrEqualTo(String value) {
            addCriterion("claimchengjie >=", value, "claimchengjie");
            return (Criteria) this;
        }

        public Criteria andClaimchengjieLessThan(String value) {
            addCriterion("claimchengjie <", value, "claimchengjie");
            return (Criteria) this;
        }

        public Criteria andClaimchengjieLessThanOrEqualTo(String value) {
            addCriterion("claimchengjie <=", value, "claimchengjie");
            return (Criteria) this;
        }

        public Criteria andClaimchengjieLike(String value) {
            addCriterion("claimchengjie like", value, "claimchengjie");
            return (Criteria) this;
        }

        public Criteria andClaimchengjieNotLike(String value) {
            addCriterion("claimchengjie not like", value, "claimchengjie");
            return (Criteria) this;
        }

        public Criteria andClaimchengjieIn(List<String> values) {
            addCriterion("claimchengjie in", values, "claimchengjie");
            return (Criteria) this;
        }

        public Criteria andClaimchengjieNotIn(List<String> values) {
            addCriterion("claimchengjie not in", values, "claimchengjie");
            return (Criteria) this;
        }

        public Criteria andClaimchengjieBetween(String value1, String value2) {
            addCriterion("claimchengjie between", value1, value2, "claimchengjie");
            return (Criteria) this;
        }

        public Criteria andClaimchengjieNotBetween(String value1, String value2) {
            addCriterion("claimchengjie not between", value1, value2, "claimchengjie");
            return (Criteria) this;
        }

        public Criteria andClaimzhuangrangdateIsNull() {
            addCriterion("claimzhuangrangdate is null");
            return (Criteria) this;
        }

        public Criteria andClaimzhuangrangdateIsNotNull() {
            addCriterion("claimzhuangrangdate is not null");
            return (Criteria) this;
        }

        public Criteria andClaimzhuangrangdateEqualTo(Date value) {
            addCriterionForJDBCDate("claimzhuangrangdate =", value, "claimzhuangrangdate");
            return (Criteria) this;
        }

        public Criteria andClaimzhuangrangdateNotEqualTo(Date value) {
            addCriterionForJDBCDate("claimzhuangrangdate <>", value, "claimzhuangrangdate");
            return (Criteria) this;
        }

        public Criteria andClaimzhuangrangdateGreaterThan(Date value) {
            addCriterionForJDBCDate("claimzhuangrangdate >", value, "claimzhuangrangdate");
            return (Criteria) this;
        }

        public Criteria andClaimzhuangrangdateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("claimzhuangrangdate >=", value, "claimzhuangrangdate");
            return (Criteria) this;
        }

        public Criteria andClaimzhuangrangdateLessThan(Date value) {
            addCriterionForJDBCDate("claimzhuangrangdate <", value, "claimzhuangrangdate");
            return (Criteria) this;
        }

        public Criteria andClaimzhuangrangdateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("claimzhuangrangdate <=", value, "claimzhuangrangdate");
            return (Criteria) this;
        }

        public Criteria andClaimzhuangrangdateIn(List<Date> values) {
            addCriterionForJDBCDate("claimzhuangrangdate in", values, "claimzhuangrangdate");
            return (Criteria) this;
        }

        public Criteria andClaimzhuangrangdateNotIn(List<Date> values) {
            addCriterionForJDBCDate("claimzhuangrangdate not in", values, "claimzhuangrangdate");
            return (Criteria) this;
        }

        public Criteria andClaimzhuangrangdateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("claimzhuangrangdate between", value1, value2, "claimzhuangrangdate");
            return (Criteria) this;
        }

        public Criteria andClaimzhuangrangdateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("claimzhuangrangdate not between", value1, value2, "claimzhuangrangdate");
            return (Criteria) this;
        }

        public Criteria andClaimzhuangtaiIsNull() {
            addCriterion("claimzhuangtai is null");
            return (Criteria) this;
        }

        public Criteria andClaimzhuangtaiIsNotNull() {
            addCriterion("claimzhuangtai is not null");
            return (Criteria) this;
        }

        public Criteria andClaimzhuangtaiEqualTo(String value) {
            addCriterion("claimzhuangtai =", value, "claimzhuangtai");
            return (Criteria) this;
        }

        public Criteria andClaimzhuangtaiNotEqualTo(String value) {
            addCriterion("claimzhuangtai <>", value, "claimzhuangtai");
            return (Criteria) this;
        }

        public Criteria andClaimzhuangtaiGreaterThan(String value) {
            addCriterion("claimzhuangtai >", value, "claimzhuangtai");
            return (Criteria) this;
        }

        public Criteria andClaimzhuangtaiGreaterThanOrEqualTo(String value) {
            addCriterion("claimzhuangtai >=", value, "claimzhuangtai");
            return (Criteria) this;
        }

        public Criteria andClaimzhuangtaiLessThan(String value) {
            addCriterion("claimzhuangtai <", value, "claimzhuangtai");
            return (Criteria) this;
        }

        public Criteria andClaimzhuangtaiLessThanOrEqualTo(String value) {
            addCriterion("claimzhuangtai <=", value, "claimzhuangtai");
            return (Criteria) this;
        }

        public Criteria andClaimzhuangtaiLike(String value) {
            addCriterion("claimzhuangtai like", value, "claimzhuangtai");
            return (Criteria) this;
        }

        public Criteria andClaimzhuangtaiNotLike(String value) {
            addCriterion("claimzhuangtai not like", value, "claimzhuangtai");
            return (Criteria) this;
        }

        public Criteria andClaimzhuangtaiIn(List<String> values) {
            addCriterion("claimzhuangtai in", values, "claimzhuangtai");
            return (Criteria) this;
        }

        public Criteria andClaimzhuangtaiNotIn(List<String> values) {
            addCriterion("claimzhuangtai not in", values, "claimzhuangtai");
            return (Criteria) this;
        }

        public Criteria andClaimzhuangtaiBetween(String value1, String value2) {
            addCriterion("claimzhuangtai between", value1, value2, "claimzhuangtai");
            return (Criteria) this;
        }

        public Criteria andClaimzhuangtaiNotBetween(String value1, String value2) {
            addCriterion("claimzhuangtai not between", value1, value2, "claimzhuangtai");
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