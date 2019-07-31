package pojo;

import java.util.ArrayList;
import java.util.List;

public class ResourceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ResourceExample() {
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

        public Criteria andResourceIdIsNull() {
            addCriterion("resource_id is null");
            return (Criteria) this;
        }

        public Criteria andResourceIdIsNotNull() {
            addCriterion("resource_id is not null");
            return (Criteria) this;
        }

        public Criteria andResourceIdEqualTo(String value) {
            addCriterion("resource_id =", value, "resourceId");
            return (Criteria) this;
        }

        public Criteria andResourceIdNotEqualTo(String value) {
            addCriterion("resource_id <>", value, "resourceId");
            return (Criteria) this;
        }

        public Criteria andResourceIdGreaterThan(String value) {
            addCriterion("resource_id >", value, "resourceId");
            return (Criteria) this;
        }

        public Criteria andResourceIdGreaterThanOrEqualTo(String value) {
            addCriterion("resource_id >=", value, "resourceId");
            return (Criteria) this;
        }

        public Criteria andResourceIdLessThan(String value) {
            addCriterion("resource_id <", value, "resourceId");
            return (Criteria) this;
        }

        public Criteria andResourceIdLessThanOrEqualTo(String value) {
            addCriterion("resource_id <=", value, "resourceId");
            return (Criteria) this;
        }

        public Criteria andResourceIdLike(String value) {
            addCriterion("resource_id like", value, "resourceId");
            return (Criteria) this;
        }

        public Criteria andResourceIdNotLike(String value) {
            addCriterion("resource_id not like", value, "resourceId");
            return (Criteria) this;
        }

        public Criteria andResourceIdIn(List<String> values) {
            addCriterion("resource_id in", values, "resourceId");
            return (Criteria) this;
        }

        public Criteria andResourceIdNotIn(List<String> values) {
            addCriterion("resource_id not in", values, "resourceId");
            return (Criteria) this;
        }

        public Criteria andResourceIdBetween(String value1, String value2) {
            addCriterion("resource_id between", value1, value2, "resourceId");
            return (Criteria) this;
        }

        public Criteria andResourceIdNotBetween(String value1, String value2) {
            addCriterion("resource_id not between", value1, value2, "resourceId");
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

        public Criteria andResourceNameIsNull() {
            addCriterion("resource_name is null");
            return (Criteria) this;
        }

        public Criteria andResourceNameIsNotNull() {
            addCriterion("resource_name is not null");
            return (Criteria) this;
        }

        public Criteria andResourceNameEqualTo(String value) {
            addCriterion("resource_name =", value, "resourceName");
            return (Criteria) this;
        }

        public Criteria andResourceNameNotEqualTo(String value) {
            addCriterion("resource_name <>", value, "resourceName");
            return (Criteria) this;
        }

        public Criteria andResourceNameGreaterThan(String value) {
            addCriterion("resource_name >", value, "resourceName");
            return (Criteria) this;
        }

        public Criteria andResourceNameGreaterThanOrEqualTo(String value) {
            addCriterion("resource_name >=", value, "resourceName");
            return (Criteria) this;
        }

        public Criteria andResourceNameLessThan(String value) {
            addCriterion("resource_name <", value, "resourceName");
            return (Criteria) this;
        }

        public Criteria andResourceNameLessThanOrEqualTo(String value) {
            addCriterion("resource_name <=", value, "resourceName");
            return (Criteria) this;
        }

        public Criteria andResourceNameLike(String value) {
            addCriterion("resource_name like", value, "resourceName");
            return (Criteria) this;
        }

        public Criteria andResourceNameNotLike(String value) {
            addCriterion("resource_name not like", value, "resourceName");
            return (Criteria) this;
        }

        public Criteria andResourceNameIn(List<String> values) {
            addCriterion("resource_name in", values, "resourceName");
            return (Criteria) this;
        }

        public Criteria andResourceNameNotIn(List<String> values) {
            addCriterion("resource_name not in", values, "resourceName");
            return (Criteria) this;
        }

        public Criteria andResourceNameBetween(String value1, String value2) {
            addCriterion("resource_name between", value1, value2, "resourceName");
            return (Criteria) this;
        }

        public Criteria andResourceNameNotBetween(String value1, String value2) {
            addCriterion("resource_name not between", value1, value2, "resourceName");
            return (Criteria) this;
        }

        public Criteria andResourceNumberIsNull() {
            addCriterion("resource_number is null");
            return (Criteria) this;
        }

        public Criteria andResourceNumberIsNotNull() {
            addCriterion("resource_number is not null");
            return (Criteria) this;
        }

        public Criteria andResourceNumberEqualTo(Integer value) {
            addCriterion("resource_number =", value, "resourceNumber");
            return (Criteria) this;
        }

        public Criteria andResourceNumberNotEqualTo(Integer value) {
            addCriterion("resource_number <>", value, "resourceNumber");
            return (Criteria) this;
        }

        public Criteria andResourceNumberGreaterThan(Integer value) {
            addCriterion("resource_number >", value, "resourceNumber");
            return (Criteria) this;
        }

        public Criteria andResourceNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("resource_number >=", value, "resourceNumber");
            return (Criteria) this;
        }

        public Criteria andResourceNumberLessThan(Integer value) {
            addCriterion("resource_number <", value, "resourceNumber");
            return (Criteria) this;
        }

        public Criteria andResourceNumberLessThanOrEqualTo(Integer value) {
            addCriterion("resource_number <=", value, "resourceNumber");
            return (Criteria) this;
        }

        public Criteria andResourceNumberIn(List<Integer> values) {
            addCriterion("resource_number in", values, "resourceNumber");
            return (Criteria) this;
        }

        public Criteria andResourceNumberNotIn(List<Integer> values) {
            addCriterion("resource_number not in", values, "resourceNumber");
            return (Criteria) this;
        }

        public Criteria andResourceNumberBetween(Integer value1, Integer value2) {
            addCriterion("resource_number between", value1, value2, "resourceNumber");
            return (Criteria) this;
        }

        public Criteria andResourceNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("resource_number not between", value1, value2, "resourceNumber");
            return (Criteria) this;
        }

        public Criteria andResourceValueIsNull() {
            addCriterion("resource_value is null");
            return (Criteria) this;
        }

        public Criteria andResourceValueIsNotNull() {
            addCriterion("resource_value is not null");
            return (Criteria) this;
        }

        public Criteria andResourceValueEqualTo(Float value) {
            addCriterion("resource_value =", value, "resourceValue");
            return (Criteria) this;
        }

        public Criteria andResourceValueNotEqualTo(Float value) {
            addCriterion("resource_value <>", value, "resourceValue");
            return (Criteria) this;
        }

        public Criteria andResourceValueGreaterThan(Float value) {
            addCriterion("resource_value >", value, "resourceValue");
            return (Criteria) this;
        }

        public Criteria andResourceValueGreaterThanOrEqualTo(Float value) {
            addCriterion("resource_value >=", value, "resourceValue");
            return (Criteria) this;
        }

        public Criteria andResourceValueLessThan(Float value) {
            addCriterion("resource_value <", value, "resourceValue");
            return (Criteria) this;
        }

        public Criteria andResourceValueLessThanOrEqualTo(Float value) {
            addCriterion("resource_value <=", value, "resourceValue");
            return (Criteria) this;
        }

        public Criteria andResourceValueIn(List<Float> values) {
            addCriterion("resource_value in", values, "resourceValue");
            return (Criteria) this;
        }

        public Criteria andResourceValueNotIn(List<Float> values) {
            addCriterion("resource_value not in", values, "resourceValue");
            return (Criteria) this;
        }

        public Criteria andResourceValueBetween(Float value1, Float value2) {
            addCriterion("resource_value between", value1, value2, "resourceValue");
            return (Criteria) this;
        }

        public Criteria andResourceValueNotBetween(Float value1, Float value2) {
            addCriterion("resource_value not between", value1, value2, "resourceValue");
            return (Criteria) this;
        }

        public Criteria andResourceLocationIsNull() {
            addCriterion("resource_location is null");
            return (Criteria) this;
        }

        public Criteria andResourceLocationIsNotNull() {
            addCriterion("resource_location is not null");
            return (Criteria) this;
        }

        public Criteria andResourceLocationEqualTo(String value) {
            addCriterion("resource_location =", value, "resourceLocation");
            return (Criteria) this;
        }

        public Criteria andResourceLocationNotEqualTo(String value) {
            addCriterion("resource_location <>", value, "resourceLocation");
            return (Criteria) this;
        }

        public Criteria andResourceLocationGreaterThan(String value) {
            addCriterion("resource_location >", value, "resourceLocation");
            return (Criteria) this;
        }

        public Criteria andResourceLocationGreaterThanOrEqualTo(String value) {
            addCriterion("resource_location >=", value, "resourceLocation");
            return (Criteria) this;
        }

        public Criteria andResourceLocationLessThan(String value) {
            addCriterion("resource_location <", value, "resourceLocation");
            return (Criteria) this;
        }

        public Criteria andResourceLocationLessThanOrEqualTo(String value) {
            addCriterion("resource_location <=", value, "resourceLocation");
            return (Criteria) this;
        }

        public Criteria andResourceLocationLike(String value) {
            addCriterion("resource_location like", value, "resourceLocation");
            return (Criteria) this;
        }

        public Criteria andResourceLocationNotLike(String value) {
            addCriterion("resource_location not like", value, "resourceLocation");
            return (Criteria) this;
        }

        public Criteria andResourceLocationIn(List<String> values) {
            addCriterion("resource_location in", values, "resourceLocation");
            return (Criteria) this;
        }

        public Criteria andResourceLocationNotIn(List<String> values) {
            addCriterion("resource_location not in", values, "resourceLocation");
            return (Criteria) this;
        }

        public Criteria andResourceLocationBetween(String value1, String value2) {
            addCriterion("resource_location between", value1, value2, "resourceLocation");
            return (Criteria) this;
        }

        public Criteria andResourceLocationNotBetween(String value1, String value2) {
            addCriterion("resource_location not between", value1, value2, "resourceLocation");
            return (Criteria) this;
        }

        public Criteria andResourceRemarkIsNull() {
            addCriterion("resource_remark is null");
            return (Criteria) this;
        }

        public Criteria andResourceRemarkIsNotNull() {
            addCriterion("resource_remark is not null");
            return (Criteria) this;
        }

        public Criteria andResourceRemarkEqualTo(String value) {
            addCriterion("resource_remark =", value, "resourceRemark");
            return (Criteria) this;
        }

        public Criteria andResourceRemarkNotEqualTo(String value) {
            addCriterion("resource_remark <>", value, "resourceRemark");
            return (Criteria) this;
        }

        public Criteria andResourceRemarkGreaterThan(String value) {
            addCriterion("resource_remark >", value, "resourceRemark");
            return (Criteria) this;
        }

        public Criteria andResourceRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("resource_remark >=", value, "resourceRemark");
            return (Criteria) this;
        }

        public Criteria andResourceRemarkLessThan(String value) {
            addCriterion("resource_remark <", value, "resourceRemark");
            return (Criteria) this;
        }

        public Criteria andResourceRemarkLessThanOrEqualTo(String value) {
            addCriterion("resource_remark <=", value, "resourceRemark");
            return (Criteria) this;
        }

        public Criteria andResourceRemarkLike(String value) {
            addCriterion("resource_remark like", value, "resourceRemark");
            return (Criteria) this;
        }

        public Criteria andResourceRemarkNotLike(String value) {
            addCriterion("resource_remark not like", value, "resourceRemark");
            return (Criteria) this;
        }

        public Criteria andResourceRemarkIn(List<String> values) {
            addCriterion("resource_remark in", values, "resourceRemark");
            return (Criteria) this;
        }

        public Criteria andResourceRemarkNotIn(List<String> values) {
            addCriterion("resource_remark not in", values, "resourceRemark");
            return (Criteria) this;
        }

        public Criteria andResourceRemarkBetween(String value1, String value2) {
            addCriterion("resource_remark between", value1, value2, "resourceRemark");
            return (Criteria) this;
        }

        public Criteria andResourceRemarkNotBetween(String value1, String value2) {
            addCriterion("resource_remark not between", value1, value2, "resourceRemark");
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