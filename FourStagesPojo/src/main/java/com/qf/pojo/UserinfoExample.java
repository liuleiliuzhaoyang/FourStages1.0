package com.qf.pojo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class UserinfoExample implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserinfoExample() {
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

        public Criteria andUsernameIsNull() {
            addCriterion("username is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("username is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("username =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("username <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("username >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("username >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("username <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("username <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("username like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("username not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("username in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("username not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("username between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("username not between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsertelIsNull() {
            addCriterion("usertel is null");
            return (Criteria) this;
        }

        public Criteria andUsertelIsNotNull() {
            addCriterion("usertel is not null");
            return (Criteria) this;
        }

        public Criteria andUsertelEqualTo(String value) {
            addCriterion("usertel =", value, "usertel");
            return (Criteria) this;
        }

        public Criteria andUsertelNotEqualTo(String value) {
            addCriterion("usertel <>", value, "usertel");
            return (Criteria) this;
        }

        public Criteria andUsertelGreaterThan(String value) {
            addCriterion("usertel >", value, "usertel");
            return (Criteria) this;
        }

        public Criteria andUsertelGreaterThanOrEqualTo(String value) {
            addCriterion("usertel >=", value, "usertel");
            return (Criteria) this;
        }

        public Criteria andUsertelLessThan(String value) {
            addCriterion("usertel <", value, "usertel");
            return (Criteria) this;
        }

        public Criteria andUsertelLessThanOrEqualTo(String value) {
            addCriterion("usertel <=", value, "usertel");
            return (Criteria) this;
        }

        public Criteria andUsertelLike(String value) {
            addCriterion("usertel like", value, "usertel");
            return (Criteria) this;
        }

        public Criteria andUsertelNotLike(String value) {
            addCriterion("usertel not like", value, "usertel");
            return (Criteria) this;
        }

        public Criteria andUsertelIn(List<String> values) {
            addCriterion("usertel in", values, "usertel");
            return (Criteria) this;
        }

        public Criteria andUsertelNotIn(List<String> values) {
            addCriterion("usertel not in", values, "usertel");
            return (Criteria) this;
        }

        public Criteria andUsertelBetween(String value1, String value2) {
            addCriterion("usertel between", value1, value2, "usertel");
            return (Criteria) this;
        }

        public Criteria andUsertelNotBetween(String value1, String value2) {
            addCriterion("usertel not between", value1, value2, "usertel");
            return (Criteria) this;
        }

        public Criteria andUserpassIsNull() {
            addCriterion("userpass is null");
            return (Criteria) this;
        }

        public Criteria andUserpassIsNotNull() {
            addCriterion("userpass is not null");
            return (Criteria) this;
        }

        public Criteria andUserpassEqualTo(String value) {
            addCriterion("userpass =", value, "userpass");
            return (Criteria) this;
        }

        public Criteria andUserpassNotEqualTo(String value) {
            addCriterion("userpass <>", value, "userpass");
            return (Criteria) this;
        }

        public Criteria andUserpassGreaterThan(String value) {
            addCriterion("userpass >", value, "userpass");
            return (Criteria) this;
        }

        public Criteria andUserpassGreaterThanOrEqualTo(String value) {
            addCriterion("userpass >=", value, "userpass");
            return (Criteria) this;
        }

        public Criteria andUserpassLessThan(String value) {
            addCriterion("userpass <", value, "userpass");
            return (Criteria) this;
        }

        public Criteria andUserpassLessThanOrEqualTo(String value) {
            addCriterion("userpass <=", value, "userpass");
            return (Criteria) this;
        }

        public Criteria andUserpassLike(String value) {
            addCriterion("userpass like", value, "userpass");
            return (Criteria) this;
        }

        public Criteria andUserpassNotLike(String value) {
            addCriterion("userpass not like", value, "userpass");
            return (Criteria) this;
        }

        public Criteria andUserpassIn(List<String> values) {
            addCriterion("userpass in", values, "userpass");
            return (Criteria) this;
        }

        public Criteria andUserpassNotIn(List<String> values) {
            addCriterion("userpass not in", values, "userpass");
            return (Criteria) this;
        }

        public Criteria andUserpassBetween(String value1, String value2) {
            addCriterion("userpass between", value1, value2, "userpass");
            return (Criteria) this;
        }

        public Criteria andUserpassNotBetween(String value1, String value2) {
            addCriterion("userpass not between", value1, value2, "userpass");
            return (Criteria) this;
        }

        public Criteria andUserrnameIsNull() {
            addCriterion("userrname is null");
            return (Criteria) this;
        }

        public Criteria andUserrnameIsNotNull() {
            addCriterion("userrname is not null");
            return (Criteria) this;
        }

        public Criteria andUserrnameEqualTo(String value) {
            addCriterion("userrname =", value, "userrname");
            return (Criteria) this;
        }

        public Criteria andUserrnameNotEqualTo(String value) {
            addCriterion("userrname <>", value, "userrname");
            return (Criteria) this;
        }

        public Criteria andUserrnameGreaterThan(String value) {
            addCriterion("userrname >", value, "userrname");
            return (Criteria) this;
        }

        public Criteria andUserrnameGreaterThanOrEqualTo(String value) {
            addCriterion("userrname >=", value, "userrname");
            return (Criteria) this;
        }

        public Criteria andUserrnameLessThan(String value) {
            addCriterion("userrname <", value, "userrname");
            return (Criteria) this;
        }

        public Criteria andUserrnameLessThanOrEqualTo(String value) {
            addCriterion("userrname <=", value, "userrname");
            return (Criteria) this;
        }

        public Criteria andUserrnameLike(String value) {
            addCriterion("userrname like", value, "userrname");
            return (Criteria) this;
        }

        public Criteria andUserrnameNotLike(String value) {
            addCriterion("userrname not like", value, "userrname");
            return (Criteria) this;
        }

        public Criteria andUserrnameIn(List<String> values) {
            addCriterion("userrname in", values, "userrname");
            return (Criteria) this;
        }

        public Criteria andUserrnameNotIn(List<String> values) {
            addCriterion("userrname not in", values, "userrname");
            return (Criteria) this;
        }

        public Criteria andUserrnameBetween(String value1, String value2) {
            addCriterion("userrname between", value1, value2, "userrname");
            return (Criteria) this;
        }

        public Criteria andUserrnameNotBetween(String value1, String value2) {
            addCriterion("userrname not between", value1, value2, "userrname");
            return (Criteria) this;
        }

        public Criteria andUseridentifyIsNull() {
            addCriterion("useridentify is null");
            return (Criteria) this;
        }

        public Criteria andUseridentifyIsNotNull() {
            addCriterion("useridentify is not null");
            return (Criteria) this;
        }

        public Criteria andUseridentifyEqualTo(String value) {
            addCriterion("useridentify =", value, "useridentify");
            return (Criteria) this;
        }

        public Criteria andUseridentifyNotEqualTo(String value) {
            addCriterion("useridentify <>", value, "useridentify");
            return (Criteria) this;
        }

        public Criteria andUseridentifyGreaterThan(String value) {
            addCriterion("useridentify >", value, "useridentify");
            return (Criteria) this;
        }

        public Criteria andUseridentifyGreaterThanOrEqualTo(String value) {
            addCriterion("useridentify >=", value, "useridentify");
            return (Criteria) this;
        }

        public Criteria andUseridentifyLessThan(String value) {
            addCriterion("useridentify <", value, "useridentify");
            return (Criteria) this;
        }

        public Criteria andUseridentifyLessThanOrEqualTo(String value) {
            addCriterion("useridentify <=", value, "useridentify");
            return (Criteria) this;
        }

        public Criteria andUseridentifyLike(String value) {
            addCriterion("useridentify like", value, "useridentify");
            return (Criteria) this;
        }

        public Criteria andUseridentifyNotLike(String value) {
            addCriterion("useridentify not like", value, "useridentify");
            return (Criteria) this;
        }

        public Criteria andUseridentifyIn(List<String> values) {
            addCriterion("useridentify in", values, "useridentify");
            return (Criteria) this;
        }

        public Criteria andUseridentifyNotIn(List<String> values) {
            addCriterion("useridentify not in", values, "useridentify");
            return (Criteria) this;
        }

        public Criteria andUseridentifyBetween(String value1, String value2) {
            addCriterion("useridentify between", value1, value2, "useridentify");
            return (Criteria) this;
        }

        public Criteria andUseridentifyNotBetween(String value1, String value2) {
            addCriterion("useridentify not between", value1, value2, "useridentify");
            return (Criteria) this;
        }

        public Criteria andUserflagIsNull() {
            addCriterion("userflag is null");
            return (Criteria) this;
        }

        public Criteria andUserflagIsNotNull() {
            addCriterion("userflag is not null");
            return (Criteria) this;
        }

        public Criteria andUserflagEqualTo(Integer value) {
            addCriterion("userflag =", value, "userflag");
            return (Criteria) this;
        }

        public Criteria andUserflagNotEqualTo(Integer value) {
            addCriterion("userflag <>", value, "userflag");
            return (Criteria) this;
        }

        public Criteria andUserflagGreaterThan(Integer value) {
            addCriterion("userflag >", value, "userflag");
            return (Criteria) this;
        }

        public Criteria andUserflagGreaterThanOrEqualTo(Integer value) {
            addCriterion("userflag >=", value, "userflag");
            return (Criteria) this;
        }

        public Criteria andUserflagLessThan(Integer value) {
            addCriterion("userflag <", value, "userflag");
            return (Criteria) this;
        }

        public Criteria andUserflagLessThanOrEqualTo(Integer value) {
            addCriterion("userflag <=", value, "userflag");
            return (Criteria) this;
        }

        public Criteria andUserflagIn(List<Integer> values) {
            addCriterion("userflag in", values, "userflag");
            return (Criteria) this;
        }

        public Criteria andUserflagNotIn(List<Integer> values) {
            addCriterion("userflag not in", values, "userflag");
            return (Criteria) this;
        }

        public Criteria andUserflagBetween(Integer value1, Integer value2) {
            addCriterion("userflag between", value1, value2, "userflag");
            return (Criteria) this;
        }

        public Criteria andUserflagNotBetween(Integer value1, Integer value2) {
            addCriterion("userflag not between", value1, value2, "userflag");
            return (Criteria) this;
        }

        public Criteria andUserflag2IsNull() {
            addCriterion("userflag2 is null");
            return (Criteria) this;
        }

        public Criteria andUserflag2IsNotNull() {
            addCriterion("userflag2 is not null");
            return (Criteria) this;
        }

        public Criteria andUserflag2EqualTo(String value) {
            addCriterion("userflag2 =", value, "userflag2");
            return (Criteria) this;
        }

        public Criteria andUserflag2NotEqualTo(String value) {
            addCriterion("userflag2 <>", value, "userflag2");
            return (Criteria) this;
        }

        public Criteria andUserflag2GreaterThan(String value) {
            addCriterion("userflag2 >", value, "userflag2");
            return (Criteria) this;
        }

        public Criteria andUserflag2GreaterThanOrEqualTo(String value) {
            addCriterion("userflag2 >=", value, "userflag2");
            return (Criteria) this;
        }

        public Criteria andUserflag2LessThan(String value) {
            addCriterion("userflag2 <", value, "userflag2");
            return (Criteria) this;
        }

        public Criteria andUserflag2LessThanOrEqualTo(String value) {
            addCriterion("userflag2 <=", value, "userflag2");
            return (Criteria) this;
        }

        public Criteria andUserflag2Like(String value) {
            addCriterion("userflag2 like", value, "userflag2");
            return (Criteria) this;
        }

        public Criteria andUserflag2NotLike(String value) {
            addCriterion("userflag2 not like", value, "userflag2");
            return (Criteria) this;
        }

        public Criteria andUserflag2In(List<String> values) {
            addCriterion("userflag2 in", values, "userflag2");
            return (Criteria) this;
        }

        public Criteria andUserflag2NotIn(List<String> values) {
            addCriterion("userflag2 not in", values, "userflag2");
            return (Criteria) this;
        }

        public Criteria andUserflag2Between(String value1, String value2) {
            addCriterion("userflag2 between", value1, value2, "userflag2");
            return (Criteria) this;
        }

        public Criteria andUserflag2NotBetween(String value1, String value2) {
            addCriterion("userflag2 not between", value1, value2, "userflag2");
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