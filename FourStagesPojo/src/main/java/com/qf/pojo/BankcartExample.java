package com.qf.pojo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class BankcartExample implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BankcartExample() {
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

        public Criteria andBcidIsNull() {
            addCriterion("bcid is null");
            return (Criteria) this;
        }

        public Criteria andBcidIsNotNull() {
            addCriterion("bcid is not null");
            return (Criteria) this;
        }

        public Criteria andBcidEqualTo(Integer value) {
            addCriterion("bcid =", value, "bcid");
            return (Criteria) this;
        }

        public Criteria andBcidNotEqualTo(Integer value) {
            addCriterion("bcid <>", value, "bcid");
            return (Criteria) this;
        }

        public Criteria andBcidGreaterThan(Integer value) {
            addCriterion("bcid >", value, "bcid");
            return (Criteria) this;
        }

        public Criteria andBcidGreaterThanOrEqualTo(Integer value) {
            addCriterion("bcid >=", value, "bcid");
            return (Criteria) this;
        }

        public Criteria andBcidLessThan(Integer value) {
            addCriterion("bcid <", value, "bcid");
            return (Criteria) this;
        }

        public Criteria andBcidLessThanOrEqualTo(Integer value) {
            addCriterion("bcid <=", value, "bcid");
            return (Criteria) this;
        }

        public Criteria andBcidIn(List<Integer> values) {
            addCriterion("bcid in", values, "bcid");
            return (Criteria) this;
        }

        public Criteria andBcidNotIn(List<Integer> values) {
            addCriterion("bcid not in", values, "bcid");
            return (Criteria) this;
        }

        public Criteria andBcidBetween(Integer value1, Integer value2) {
            addCriterion("bcid between", value1, value2, "bcid");
            return (Criteria) this;
        }

        public Criteria andBcidNotBetween(Integer value1, Integer value2) {
            addCriterion("bcid not between", value1, value2, "bcid");
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

        public Criteria andBccodeIsNull() {
            addCriterion("bccode is null");
            return (Criteria) this;
        }

        public Criteria andBccodeIsNotNull() {
            addCriterion("bccode is not null");
            return (Criteria) this;
        }

        public Criteria andBccodeEqualTo(String value) {
            addCriterion("bccode =", value, "bccode");
            return (Criteria) this;
        }

        public Criteria andBccodeNotEqualTo(String value) {
            addCriterion("bccode <>", value, "bccode");
            return (Criteria) this;
        }

        public Criteria andBccodeGreaterThan(String value) {
            addCriterion("bccode >", value, "bccode");
            return (Criteria) this;
        }

        public Criteria andBccodeGreaterThanOrEqualTo(String value) {
            addCriterion("bccode >=", value, "bccode");
            return (Criteria) this;
        }

        public Criteria andBccodeLessThan(String value) {
            addCriterion("bccode <", value, "bccode");
            return (Criteria) this;
        }

        public Criteria andBccodeLessThanOrEqualTo(String value) {
            addCriterion("bccode <=", value, "bccode");
            return (Criteria) this;
        }

        public Criteria andBccodeLike(String value) {
            addCriterion("bccode like", value, "bccode");
            return (Criteria) this;
        }

        public Criteria andBccodeNotLike(String value) {
            addCriterion("bccode not like", value, "bccode");
            return (Criteria) this;
        }

        public Criteria andBccodeIn(List<String> values) {
            addCriterion("bccode in", values, "bccode");
            return (Criteria) this;
        }

        public Criteria andBccodeNotIn(List<String> values) {
            addCriterion("bccode not in", values, "bccode");
            return (Criteria) this;
        }

        public Criteria andBccodeBetween(String value1, String value2) {
            addCriterion("bccode between", value1, value2, "bccode");
            return (Criteria) this;
        }

        public Criteria andBccodeNotBetween(String value1, String value2) {
            addCriterion("bccode not between", value1, value2, "bccode");
            return (Criteria) this;
        }

        public Criteria andBcnameIsNull() {
            addCriterion("bcname is null");
            return (Criteria) this;
        }

        public Criteria andBcnameIsNotNull() {
            addCriterion("bcname is not null");
            return (Criteria) this;
        }

        public Criteria andBcnameEqualTo(String value) {
            addCriterion("bcname =", value, "bcname");
            return (Criteria) this;
        }

        public Criteria andBcnameNotEqualTo(String value) {
            addCriterion("bcname <>", value, "bcname");
            return (Criteria) this;
        }

        public Criteria andBcnameGreaterThan(String value) {
            addCriterion("bcname >", value, "bcname");
            return (Criteria) this;
        }

        public Criteria andBcnameGreaterThanOrEqualTo(String value) {
            addCriterion("bcname >=", value, "bcname");
            return (Criteria) this;
        }

        public Criteria andBcnameLessThan(String value) {
            addCriterion("bcname <", value, "bcname");
            return (Criteria) this;
        }

        public Criteria andBcnameLessThanOrEqualTo(String value) {
            addCriterion("bcname <=", value, "bcname");
            return (Criteria) this;
        }

        public Criteria andBcnameLike(String value) {
            addCriterion("bcname like", value, "bcname");
            return (Criteria) this;
        }

        public Criteria andBcnameNotLike(String value) {
            addCriterion("bcname not like", value, "bcname");
            return (Criteria) this;
        }

        public Criteria andBcnameIn(List<String> values) {
            addCriterion("bcname in", values, "bcname");
            return (Criteria) this;
        }

        public Criteria andBcnameNotIn(List<String> values) {
            addCriterion("bcname not in", values, "bcname");
            return (Criteria) this;
        }

        public Criteria andBcnameBetween(String value1, String value2) {
            addCriterion("bcname between", value1, value2, "bcname");
            return (Criteria) this;
        }

        public Criteria andBcnameNotBetween(String value1, String value2) {
            addCriterion("bcname not between", value1, value2, "bcname");
            return (Criteria) this;
        }

        public Criteria andBcprovinceIsNull() {
            addCriterion("bcprovince is null");
            return (Criteria) this;
        }

        public Criteria andBcprovinceIsNotNull() {
            addCriterion("bcprovince is not null");
            return (Criteria) this;
        }

        public Criteria andBcprovinceEqualTo(String value) {
            addCriterion("bcprovince =", value, "bcprovince");
            return (Criteria) this;
        }

        public Criteria andBcprovinceNotEqualTo(String value) {
            addCriterion("bcprovince <>", value, "bcprovince");
            return (Criteria) this;
        }

        public Criteria andBcprovinceGreaterThan(String value) {
            addCriterion("bcprovince >", value, "bcprovince");
            return (Criteria) this;
        }

        public Criteria andBcprovinceGreaterThanOrEqualTo(String value) {
            addCriterion("bcprovince >=", value, "bcprovince");
            return (Criteria) this;
        }

        public Criteria andBcprovinceLessThan(String value) {
            addCriterion("bcprovince <", value, "bcprovince");
            return (Criteria) this;
        }

        public Criteria andBcprovinceLessThanOrEqualTo(String value) {
            addCriterion("bcprovince <=", value, "bcprovince");
            return (Criteria) this;
        }

        public Criteria andBcprovinceLike(String value) {
            addCriterion("bcprovince like", value, "bcprovince");
            return (Criteria) this;
        }

        public Criteria andBcprovinceNotLike(String value) {
            addCriterion("bcprovince not like", value, "bcprovince");
            return (Criteria) this;
        }

        public Criteria andBcprovinceIn(List<String> values) {
            addCriterion("bcprovince in", values, "bcprovince");
            return (Criteria) this;
        }

        public Criteria andBcprovinceNotIn(List<String> values) {
            addCriterion("bcprovince not in", values, "bcprovince");
            return (Criteria) this;
        }

        public Criteria andBcprovinceBetween(String value1, String value2) {
            addCriterion("bcprovince between", value1, value2, "bcprovince");
            return (Criteria) this;
        }

        public Criteria andBcprovinceNotBetween(String value1, String value2) {
            addCriterion("bcprovince not between", value1, value2, "bcprovince");
            return (Criteria) this;
        }

        public Criteria andBccityIsNull() {
            addCriterion("bccity is null");
            return (Criteria) this;
        }

        public Criteria andBccityIsNotNull() {
            addCriterion("bccity is not null");
            return (Criteria) this;
        }

        public Criteria andBccityEqualTo(String value) {
            addCriterion("bccity =", value, "bccity");
            return (Criteria) this;
        }

        public Criteria andBccityNotEqualTo(String value) {
            addCriterion("bccity <>", value, "bccity");
            return (Criteria) this;
        }

        public Criteria andBccityGreaterThan(String value) {
            addCriterion("bccity >", value, "bccity");
            return (Criteria) this;
        }

        public Criteria andBccityGreaterThanOrEqualTo(String value) {
            addCriterion("bccity >=", value, "bccity");
            return (Criteria) this;
        }

        public Criteria andBccityLessThan(String value) {
            addCriterion("bccity <", value, "bccity");
            return (Criteria) this;
        }

        public Criteria andBccityLessThanOrEqualTo(String value) {
            addCriterion("bccity <=", value, "bccity");
            return (Criteria) this;
        }

        public Criteria andBccityLike(String value) {
            addCriterion("bccity like", value, "bccity");
            return (Criteria) this;
        }

        public Criteria andBccityNotLike(String value) {
            addCriterion("bccity not like", value, "bccity");
            return (Criteria) this;
        }

        public Criteria andBccityIn(List<String> values) {
            addCriterion("bccity in", values, "bccity");
            return (Criteria) this;
        }

        public Criteria andBccityNotIn(List<String> values) {
            addCriterion("bccity not in", values, "bccity");
            return (Criteria) this;
        }

        public Criteria andBccityBetween(String value1, String value2) {
            addCriterion("bccity between", value1, value2, "bccity");
            return (Criteria) this;
        }

        public Criteria andBccityNotBetween(String value1, String value2) {
            addCriterion("bccity not between", value1, value2, "bccity");
            return (Criteria) this;
        }

        public Criteria andBcbranchIsNull() {
            addCriterion("bcbranch is null");
            return (Criteria) this;
        }

        public Criteria andBcbranchIsNotNull() {
            addCriterion("bcbranch is not null");
            return (Criteria) this;
        }

        public Criteria andBcbranchEqualTo(String value) {
            addCriterion("bcbranch =", value, "bcbranch");
            return (Criteria) this;
        }

        public Criteria andBcbranchNotEqualTo(String value) {
            addCriterion("bcbranch <>", value, "bcbranch");
            return (Criteria) this;
        }

        public Criteria andBcbranchGreaterThan(String value) {
            addCriterion("bcbranch >", value, "bcbranch");
            return (Criteria) this;
        }

        public Criteria andBcbranchGreaterThanOrEqualTo(String value) {
            addCriterion("bcbranch >=", value, "bcbranch");
            return (Criteria) this;
        }

        public Criteria andBcbranchLessThan(String value) {
            addCriterion("bcbranch <", value, "bcbranch");
            return (Criteria) this;
        }

        public Criteria andBcbranchLessThanOrEqualTo(String value) {
            addCriterion("bcbranch <=", value, "bcbranch");
            return (Criteria) this;
        }

        public Criteria andBcbranchLike(String value) {
            addCriterion("bcbranch like", value, "bcbranch");
            return (Criteria) this;
        }

        public Criteria andBcbranchNotLike(String value) {
            addCriterion("bcbranch not like", value, "bcbranch");
            return (Criteria) this;
        }

        public Criteria andBcbranchIn(List<String> values) {
            addCriterion("bcbranch in", values, "bcbranch");
            return (Criteria) this;
        }

        public Criteria andBcbranchNotIn(List<String> values) {
            addCriterion("bcbranch not in", values, "bcbranch");
            return (Criteria) this;
        }

        public Criteria andBcbranchBetween(String value1, String value2) {
            addCriterion("bcbranch between", value1, value2, "bcbranch");
            return (Criteria) this;
        }

        public Criteria andBcbranchNotBetween(String value1, String value2) {
            addCriterion("bcbranch not between", value1, value2, "bcbranch");
            return (Criteria) this;
        }

        public Criteria andBcchongzhimoneyIsNull() {
            addCriterion("bcchongzhimoney is null");
            return (Criteria) this;
        }

        public Criteria andBcchongzhimoneyIsNotNull() {
            addCriterion("bcchongzhimoney is not null");
            return (Criteria) this;
        }

        public Criteria andBcchongzhimoneyEqualTo(String value) {
            addCriterion("bcchongzhimoney =", value, "bcchongzhimoney");
            return (Criteria) this;
        }

        public Criteria andBcchongzhimoneyNotEqualTo(String value) {
            addCriterion("bcchongzhimoney <>", value, "bcchongzhimoney");
            return (Criteria) this;
        }

        public Criteria andBcchongzhimoneyGreaterThan(String value) {
            addCriterion("bcchongzhimoney >", value, "bcchongzhimoney");
            return (Criteria) this;
        }

        public Criteria andBcchongzhimoneyGreaterThanOrEqualTo(String value) {
            addCriterion("bcchongzhimoney >=", value, "bcchongzhimoney");
            return (Criteria) this;
        }

        public Criteria andBcchongzhimoneyLessThan(String value) {
            addCriterion("bcchongzhimoney <", value, "bcchongzhimoney");
            return (Criteria) this;
        }

        public Criteria andBcchongzhimoneyLessThanOrEqualTo(String value) {
            addCriterion("bcchongzhimoney <=", value, "bcchongzhimoney");
            return (Criteria) this;
        }

        public Criteria andBcchongzhimoneyLike(String value) {
            addCriterion("bcchongzhimoney like", value, "bcchongzhimoney");
            return (Criteria) this;
        }

        public Criteria andBcchongzhimoneyNotLike(String value) {
            addCriterion("bcchongzhimoney not like", value, "bcchongzhimoney");
            return (Criteria) this;
        }

        public Criteria andBcchongzhimoneyIn(List<String> values) {
            addCriterion("bcchongzhimoney in", values, "bcchongzhimoney");
            return (Criteria) this;
        }

        public Criteria andBcchongzhimoneyNotIn(List<String> values) {
            addCriterion("bcchongzhimoney not in", values, "bcchongzhimoney");
            return (Criteria) this;
        }

        public Criteria andBcchongzhimoneyBetween(String value1, String value2) {
            addCriterion("bcchongzhimoney between", value1, value2, "bcchongzhimoney");
            return (Criteria) this;
        }

        public Criteria andBcchongzhimoneyNotBetween(String value1, String value2) {
            addCriterion("bcchongzhimoney not between", value1, value2, "bcchongzhimoney");
            return (Criteria) this;
        }

        public Criteria andBcchongtimeIsNull() {
            addCriterion("bcchongtime is null");
            return (Criteria) this;
        }

        public Criteria andBcchongtimeIsNotNull() {
            addCriterion("bcchongtime is not null");
            return (Criteria) this;
        }

        public Criteria andBcchongtimeEqualTo(Date value) {
            addCriterionForJDBCDate("bcchongtime =", value, "bcchongtime");
            return (Criteria) this;
        }

        public Criteria andBcchongtimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("bcchongtime <>", value, "bcchongtime");
            return (Criteria) this;
        }

        public Criteria andBcchongtimeGreaterThan(Date value) {
            addCriterionForJDBCDate("bcchongtime >", value, "bcchongtime");
            return (Criteria) this;
        }

        public Criteria andBcchongtimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("bcchongtime >=", value, "bcchongtime");
            return (Criteria) this;
        }

        public Criteria andBcchongtimeLessThan(Date value) {
            addCriterionForJDBCDate("bcchongtime <", value, "bcchongtime");
            return (Criteria) this;
        }

        public Criteria andBcchongtimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("bcchongtime <=", value, "bcchongtime");
            return (Criteria) this;
        }

        public Criteria andBcchongtimeIn(List<Date> values) {
            addCriterionForJDBCDate("bcchongtime in", values, "bcchongtime");
            return (Criteria) this;
        }

        public Criteria andBcchongtimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("bcchongtime not in", values, "bcchongtime");
            return (Criteria) this;
        }

        public Criteria andBcchongtimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("bcchongtime between", value1, value2, "bcchongtime");
            return (Criteria) this;
        }

        public Criteria andBcchongtimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("bcchongtime not between", value1, value2, "bcchongtime");
            return (Criteria) this;
        }

        public Criteria andBcmoneyIsNull() {
            addCriterion("bcmoney is null");
            return (Criteria) this;
        }

        public Criteria andBcmoneyIsNotNull() {
            addCriterion("bcmoney is not null");
            return (Criteria) this;
        }

        public Criteria andBcmoneyEqualTo(Double value) {
            addCriterion("bcmoney =", value, "bcmoney");
            return (Criteria) this;
        }

        public Criteria andBcmoneyNotEqualTo(Double value) {
            addCriterion("bcmoney <>", value, "bcmoney");
            return (Criteria) this;
        }

        public Criteria andBcmoneyGreaterThan(Double value) {
            addCriterion("bcmoney >", value, "bcmoney");
            return (Criteria) this;
        }

        public Criteria andBcmoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("bcmoney >=", value, "bcmoney");
            return (Criteria) this;
        }

        public Criteria andBcmoneyLessThan(Double value) {
            addCriterion("bcmoney <", value, "bcmoney");
            return (Criteria) this;
        }

        public Criteria andBcmoneyLessThanOrEqualTo(Double value) {
            addCriterion("bcmoney <=", value, "bcmoney");
            return (Criteria) this;
        }

        public Criteria andBcmoneyIn(List<Double> values) {
            addCriterion("bcmoney in", values, "bcmoney");
            return (Criteria) this;
        }

        public Criteria andBcmoneyNotIn(List<Double> values) {
            addCriterion("bcmoney not in", values, "bcmoney");
            return (Criteria) this;
        }

        public Criteria andBcmoneyBetween(Double value1, Double value2) {
            addCriterion("bcmoney between", value1, value2, "bcmoney");
            return (Criteria) this;
        }

        public Criteria andBcmoneyNotBetween(Double value1, Double value2) {
            addCriterion("bcmoney not between", value1, value2, "bcmoney");
            return (Criteria) this;
        }

        public Criteria andBcflagIsNull() {
            addCriterion("bcflag is null");
            return (Criteria) this;
        }

        public Criteria andBcflagIsNotNull() {
            addCriterion("bcflag is not null");
            return (Criteria) this;
        }

        public Criteria andBcflagEqualTo(String value) {
            addCriterion("bcflag =", value, "bcflag");
            return (Criteria) this;
        }

        public Criteria andBcflagNotEqualTo(String value) {
            addCriterion("bcflag <>", value, "bcflag");
            return (Criteria) this;
        }

        public Criteria andBcflagGreaterThan(String value) {
            addCriterion("bcflag >", value, "bcflag");
            return (Criteria) this;
        }

        public Criteria andBcflagGreaterThanOrEqualTo(String value) {
            addCriterion("bcflag >=", value, "bcflag");
            return (Criteria) this;
        }

        public Criteria andBcflagLessThan(String value) {
            addCriterion("bcflag <", value, "bcflag");
            return (Criteria) this;
        }

        public Criteria andBcflagLessThanOrEqualTo(String value) {
            addCriterion("bcflag <=", value, "bcflag");
            return (Criteria) this;
        }

        public Criteria andBcflagLike(String value) {
            addCriterion("bcflag like", value, "bcflag");
            return (Criteria) this;
        }

        public Criteria andBcflagNotLike(String value) {
            addCriterion("bcflag not like", value, "bcflag");
            return (Criteria) this;
        }

        public Criteria andBcflagIn(List<String> values) {
            addCriterion("bcflag in", values, "bcflag");
            return (Criteria) this;
        }

        public Criteria andBcflagNotIn(List<String> values) {
            addCriterion("bcflag not in", values, "bcflag");
            return (Criteria) this;
        }

        public Criteria andBcflagBetween(String value1, String value2) {
            addCriterion("bcflag between", value1, value2, "bcflag");
            return (Criteria) this;
        }

        public Criteria andBcflagNotBetween(String value1, String value2) {
            addCriterion("bcflag not between", value1, value2, "bcflag");
            return (Criteria) this;
        }

        public Criteria andBcflag2IsNull() {
            addCriterion("bcflag2 is null");
            return (Criteria) this;
        }

        public Criteria andBcflag2IsNotNull() {
            addCriterion("bcflag2 is not null");
            return (Criteria) this;
        }

        public Criteria andBcflag2EqualTo(String value) {
            addCriterion("bcflag2 =", value, "bcflag2");
            return (Criteria) this;
        }

        public Criteria andBcflag2NotEqualTo(String value) {
            addCriterion("bcflag2 <>", value, "bcflag2");
            return (Criteria) this;
        }

        public Criteria andBcflag2GreaterThan(String value) {
            addCriterion("bcflag2 >", value, "bcflag2");
            return (Criteria) this;
        }

        public Criteria andBcflag2GreaterThanOrEqualTo(String value) {
            addCriterion("bcflag2 >=", value, "bcflag2");
            return (Criteria) this;
        }

        public Criteria andBcflag2LessThan(String value) {
            addCriterion("bcflag2 <", value, "bcflag2");
            return (Criteria) this;
        }

        public Criteria andBcflag2LessThanOrEqualTo(String value) {
            addCriterion("bcflag2 <=", value, "bcflag2");
            return (Criteria) this;
        }

        public Criteria andBcflag2Like(String value) {
            addCriterion("bcflag2 like", value, "bcflag2");
            return (Criteria) this;
        }

        public Criteria andBcflag2NotLike(String value) {
            addCriterion("bcflag2 not like", value, "bcflag2");
            return (Criteria) this;
        }

        public Criteria andBcflag2In(List<String> values) {
            addCriterion("bcflag2 in", values, "bcflag2");
            return (Criteria) this;
        }

        public Criteria andBcflag2NotIn(List<String> values) {
            addCriterion("bcflag2 not in", values, "bcflag2");
            return (Criteria) this;
        }

        public Criteria andBcflag2Between(String value1, String value2) {
            addCriterion("bcflag2 between", value1, value2, "bcflag2");
            return (Criteria) this;
        }

        public Criteria andBcflag2NotBetween(String value1, String value2) {
            addCriterion("bcflag2 not between", value1, value2, "bcflag2");
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