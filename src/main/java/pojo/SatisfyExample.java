package pojo;

import java.util.ArrayList;
import java.util.List;

public class SatisfyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SatisfyExample() {
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

        public Criteria andSatisfyIdIsNull() {
            addCriterion("satisfy_id is null");
            return (Criteria) this;
        }

        public Criteria andSatisfyIdIsNotNull() {
            addCriterion("satisfy_id is not null");
            return (Criteria) this;
        }

        public Criteria andSatisfyIdEqualTo(String value) {
            addCriterion("satisfy_id =", value, "satisfyId");
            return (Criteria) this;
        }

        public Criteria andSatisfyIdNotEqualTo(String value) {
            addCriterion("satisfy_id <>", value, "satisfyId");
            return (Criteria) this;
        }

        public Criteria andSatisfyIdGreaterThan(String value) {
            addCriterion("satisfy_id >", value, "satisfyId");
            return (Criteria) this;
        }

        public Criteria andSatisfyIdGreaterThanOrEqualTo(String value) {
            addCriterion("satisfy_id >=", value, "satisfyId");
            return (Criteria) this;
        }

        public Criteria andSatisfyIdLessThan(String value) {
            addCriterion("satisfy_id <", value, "satisfyId");
            return (Criteria) this;
        }

        public Criteria andSatisfyIdLessThanOrEqualTo(String value) {
            addCriterion("satisfy_id <=", value, "satisfyId");
            return (Criteria) this;
        }

        public Criteria andSatisfyIdLike(String value) {
            addCriterion("satisfy_id like", value, "satisfyId");
            return (Criteria) this;
        }

        public Criteria andSatisfyIdNotLike(String value) {
            addCriterion("satisfy_id not like", value, "satisfyId");
            return (Criteria) this;
        }

        public Criteria andSatisfyIdIn(List<String> values) {
            addCriterion("satisfy_id in", values, "satisfyId");
            return (Criteria) this;
        }

        public Criteria andSatisfyIdNotIn(List<String> values) {
            addCriterion("satisfy_id not in", values, "satisfyId");
            return (Criteria) this;
        }

        public Criteria andSatisfyIdBetween(String value1, String value2) {
            addCriterion("satisfy_id between", value1, value2, "satisfyId");
            return (Criteria) this;
        }

        public Criteria andSatisfyIdNotBetween(String value1, String value2) {
            addCriterion("satisfy_id not between", value1, value2, "satisfyId");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(String value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(String value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(String value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(String value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(String value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLike(String value) {
            addCriterion("user_id like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotLike(String value) {
            addCriterion("user_id not like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<String> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<String> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(String value1, String value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(String value1, String value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andInformationIdIsNull() {
            addCriterion("information_id is null");
            return (Criteria) this;
        }

        public Criteria andInformationIdIsNotNull() {
            addCriterion("information_id is not null");
            return (Criteria) this;
        }

        public Criteria andInformationIdEqualTo(String value) {
            addCriterion("information_id =", value, "informationId");
            return (Criteria) this;
        }

        public Criteria andInformationIdNotEqualTo(String value) {
            addCriterion("information_id <>", value, "informationId");
            return (Criteria) this;
        }

        public Criteria andInformationIdGreaterThan(String value) {
            addCriterion("information_id >", value, "informationId");
            return (Criteria) this;
        }

        public Criteria andInformationIdGreaterThanOrEqualTo(String value) {
            addCriterion("information_id >=", value, "informationId");
            return (Criteria) this;
        }

        public Criteria andInformationIdLessThan(String value) {
            addCriterion("information_id <", value, "informationId");
            return (Criteria) this;
        }

        public Criteria andInformationIdLessThanOrEqualTo(String value) {
            addCriterion("information_id <=", value, "informationId");
            return (Criteria) this;
        }

        public Criteria andInformationIdLike(String value) {
            addCriterion("information_id like", value, "informationId");
            return (Criteria) this;
        }

        public Criteria andInformationIdNotLike(String value) {
            addCriterion("information_id not like", value, "informationId");
            return (Criteria) this;
        }

        public Criteria andInformationIdIn(List<String> values) {
            addCriterion("information_id in", values, "informationId");
            return (Criteria) this;
        }

        public Criteria andInformationIdNotIn(List<String> values) {
            addCriterion("information_id not in", values, "informationId");
            return (Criteria) this;
        }

        public Criteria andInformationIdBetween(String value1, String value2) {
            addCriterion("information_id between", value1, value2, "informationId");
            return (Criteria) this;
        }

        public Criteria andInformationIdNotBetween(String value1, String value2) {
            addCriterion("information_id not between", value1, value2, "informationId");
            return (Criteria) this;
        }

        public Criteria andSatisfyStarIsNull() {
            addCriterion("satisfy_star is null");
            return (Criteria) this;
        }

        public Criteria andSatisfyStarIsNotNull() {
            addCriterion("satisfy_star is not null");
            return (Criteria) this;
        }

        public Criteria andSatisfyStarEqualTo(Float value) {
            addCriterion("satisfy_star =", value, "satisfyStar");
            return (Criteria) this;
        }

        public Criteria andSatisfyStarNotEqualTo(Float value) {
            addCriterion("satisfy_star <>", value, "satisfyStar");
            return (Criteria) this;
        }

        public Criteria andSatisfyStarGreaterThan(Float value) {
            addCriterion("satisfy_star >", value, "satisfyStar");
            return (Criteria) this;
        }

        public Criteria andSatisfyStarGreaterThanOrEqualTo(Float value) {
            addCriterion("satisfy_star >=", value, "satisfyStar");
            return (Criteria) this;
        }

        public Criteria andSatisfyStarLessThan(Float value) {
            addCriterion("satisfy_star <", value, "satisfyStar");
            return (Criteria) this;
        }

        public Criteria andSatisfyStarLessThanOrEqualTo(Float value) {
            addCriterion("satisfy_star <=", value, "satisfyStar");
            return (Criteria) this;
        }

        public Criteria andSatisfyStarIn(List<Float> values) {
            addCriterion("satisfy_star in", values, "satisfyStar");
            return (Criteria) this;
        }

        public Criteria andSatisfyStarNotIn(List<Float> values) {
            addCriterion("satisfy_star not in", values, "satisfyStar");
            return (Criteria) this;
        }

        public Criteria andSatisfyStarBetween(Float value1, Float value2) {
            addCriterion("satisfy_star between", value1, value2, "satisfyStar");
            return (Criteria) this;
        }

        public Criteria andSatisfyStarNotBetween(Float value1, Float value2) {
            addCriterion("satisfy_star not between", value1, value2, "satisfyStar");
            return (Criteria) this;
        }
    }

    /**
     */
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