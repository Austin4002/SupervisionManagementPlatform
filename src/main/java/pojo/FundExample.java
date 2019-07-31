package pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class FundExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FundExample() {
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

        public Criteria andFundIdIsNull() {
            addCriterion("fund_id is null");
            return (Criteria) this;
        }

        public Criteria andFundIdIsNotNull() {
            addCriterion("fund_id is not null");
            return (Criteria) this;
        }

        public Criteria andFundIdEqualTo(String value) {
            addCriterion("fund_id =", value, "fundId");
            return (Criteria) this;
        }

        public Criteria andFundIdNotEqualTo(String value) {
            addCriterion("fund_id <>", value, "fundId");
            return (Criteria) this;
        }

        public Criteria andFundIdGreaterThan(String value) {
            addCriterion("fund_id >", value, "fundId");
            return (Criteria) this;
        }

        public Criteria andFundIdGreaterThanOrEqualTo(String value) {
            addCriterion("fund_id >=", value, "fundId");
            return (Criteria) this;
        }

        public Criteria andFundIdLessThan(String value) {
            addCriterion("fund_id <", value, "fundId");
            return (Criteria) this;
        }

        public Criteria andFundIdLessThanOrEqualTo(String value) {
            addCriterion("fund_id <=", value, "fundId");
            return (Criteria) this;
        }

        public Criteria andFundIdLike(String value) {
            addCriterion("fund_id like", value, "fundId");
            return (Criteria) this;
        }

        public Criteria andFundIdNotLike(String value) {
            addCriterion("fund_id not like", value, "fundId");
            return (Criteria) this;
        }

        public Criteria andFundIdIn(List<String> values) {
            addCriterion("fund_id in", values, "fundId");
            return (Criteria) this;
        }

        public Criteria andFundIdNotIn(List<String> values) {
            addCriterion("fund_id not in", values, "fundId");
            return (Criteria) this;
        }

        public Criteria andFundIdBetween(String value1, String value2) {
            addCriterion("fund_id between", value1, value2, "fundId");
            return (Criteria) this;
        }

        public Criteria andFundIdNotBetween(String value1, String value2) {
            addCriterion("fund_id not between", value1, value2, "fundId");
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

        public Criteria andFundCostIsNull() {
            addCriterion("fund_cost is null");
            return (Criteria) this;
        }

        public Criteria andFundCostIsNotNull() {
            addCriterion("fund_cost is not null");
            return (Criteria) this;
        }

        public Criteria andFundCostEqualTo(Float value) {
            addCriterion("fund_cost =", value, "fundCost");
            return (Criteria) this;
        }

        public Criteria andFundCostNotEqualTo(Float value) {
            addCriterion("fund_cost <>", value, "fundCost");
            return (Criteria) this;
        }

        public Criteria andFundCostGreaterThan(Float value) {
            addCriterion("fund_cost >", value, "fundCost");
            return (Criteria) this;
        }

        public Criteria andFundCostGreaterThanOrEqualTo(Float value) {
            addCriterion("fund_cost >=", value, "fundCost");
            return (Criteria) this;
        }

        public Criteria andFundCostLessThan(Float value) {
            addCriterion("fund_cost <", value, "fundCost");
            return (Criteria) this;
        }

        public Criteria andFundCostLessThanOrEqualTo(Float value) {
            addCriterion("fund_cost <=", value, "fundCost");
            return (Criteria) this;
        }

        public Criteria andFundCostIn(List<Float> values) {
            addCriterion("fund_cost in", values, "fundCost");
            return (Criteria) this;
        }

        public Criteria andFundCostNotIn(List<Float> values) {
            addCriterion("fund_cost not in", values, "fundCost");
            return (Criteria) this;
        }

        public Criteria andFundCostBetween(Float value1, Float value2) {
            addCriterion("fund_cost between", value1, value2, "fundCost");
            return (Criteria) this;
        }

        public Criteria andFundCostNotBetween(Float value1, Float value2) {
            addCriterion("fund_cost not between", value1, value2, "fundCost");
            return (Criteria) this;
        }

        public Criteria andFundTypeIsNull() {
            addCriterion("fund_type is null");
            return (Criteria) this;
        }

        public Criteria andFundTypeIsNotNull() {
            addCriterion("fund_type is not null");
            return (Criteria) this;
        }

        public Criteria andFundTypeEqualTo(String value) {
            addCriterion("fund_type =", value, "fundType");
            return (Criteria) this;
        }

        public Criteria andFundTypeNotEqualTo(String value) {
            addCriterion("fund_type <>", value, "fundType");
            return (Criteria) this;
        }

        public Criteria andFundTypeGreaterThan(String value) {
            addCriterion("fund_type >", value, "fundType");
            return (Criteria) this;
        }

        public Criteria andFundTypeGreaterThanOrEqualTo(String value) {
            addCriterion("fund_type >=", value, "fundType");
            return (Criteria) this;
        }

        public Criteria andFundTypeLessThan(String value) {
            addCriterion("fund_type <", value, "fundType");
            return (Criteria) this;
        }

        public Criteria andFundTypeLessThanOrEqualTo(String value) {
            addCriterion("fund_type <=", value, "fundType");
            return (Criteria) this;
        }

        public Criteria andFundTypeLike(String value) {
            addCriterion("fund_type like", value, "fundType");
            return (Criteria) this;
        }

        public Criteria andFundTypeNotLike(String value) {
            addCriterion("fund_type not like", value, "fundType");
            return (Criteria) this;
        }

        public Criteria andFundTypeIn(List<String> values) {
            addCriterion("fund_type in", values, "fundType");
            return (Criteria) this;
        }

        public Criteria andFundTypeNotIn(List<String> values) {
            addCriterion("fund_type not in", values, "fundType");
            return (Criteria) this;
        }

        public Criteria andFundTypeBetween(String value1, String value2) {
            addCriterion("fund_type between", value1, value2, "fundType");
            return (Criteria) this;
        }

        public Criteria andFundTypeNotBetween(String value1, String value2) {
            addCriterion("fund_type not between", value1, value2, "fundType");
            return (Criteria) this;
        }

        public Criteria andFundRemarkIsNull() {
            addCriterion("fund_remark is null");
            return (Criteria) this;
        }

        public Criteria andFundRemarkIsNotNull() {
            addCriterion("fund_remark is not null");
            return (Criteria) this;
        }

        public Criteria andFundRemarkEqualTo(String value) {
            addCriterion("fund_remark =", value, "fundRemark");
            return (Criteria) this;
        }

        public Criteria andFundRemarkNotEqualTo(String value) {
            addCriterion("fund_remark <>", value, "fundRemark");
            return (Criteria) this;
        }

        public Criteria andFundRemarkGreaterThan(String value) {
            addCriterion("fund_remark >", value, "fundRemark");
            return (Criteria) this;
        }

        public Criteria andFundRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("fund_remark >=", value, "fundRemark");
            return (Criteria) this;
        }

        public Criteria andFundRemarkLessThan(String value) {
            addCriterion("fund_remark <", value, "fundRemark");
            return (Criteria) this;
        }

        public Criteria andFundRemarkLessThanOrEqualTo(String value) {
            addCriterion("fund_remark <=", value, "fundRemark");
            return (Criteria) this;
        }

        public Criteria andFundRemarkLike(String value) {
            addCriterion("fund_remark like", value, "fundRemark");
            return (Criteria) this;
        }

        public Criteria andFundRemarkNotLike(String value) {
            addCriterion("fund_remark not like", value, "fundRemark");
            return (Criteria) this;
        }

        public Criteria andFundRemarkIn(List<String> values) {
            addCriterion("fund_remark in", values, "fundRemark");
            return (Criteria) this;
        }

        public Criteria andFundRemarkNotIn(List<String> values) {
            addCriterion("fund_remark not in", values, "fundRemark");
            return (Criteria) this;
        }

        public Criteria andFundRemarkBetween(String value1, String value2) {
            addCriterion("fund_remark between", value1, value2, "fundRemark");
            return (Criteria) this;
        }

        public Criteria andFundRemarkNotBetween(String value1, String value2) {
            addCriterion("fund_remark not between", value1, value2, "fundRemark");
            return (Criteria) this;
        }

        public Criteria andFundDateIsNull() {
            addCriterion("fund_date is null");
            return (Criteria) this;
        }

        public Criteria andFundDateIsNotNull() {
            addCriterion("fund_date is not null");
            return (Criteria) this;
        }

        public Criteria andFundDateEqualTo(Date value) {
            addCriterionForJDBCDate("fund_date =", value, "fundDate");
            return (Criteria) this;
        }

        public Criteria andFundDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("fund_date <>", value, "fundDate");
            return (Criteria) this;
        }

        public Criteria andFundDateGreaterThan(Date value) {
            addCriterionForJDBCDate("fund_date >", value, "fundDate");
            return (Criteria) this;
        }

        public Criteria andFundDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("fund_date >=", value, "fundDate");
            return (Criteria) this;
        }

        public Criteria andFundDateLessThan(Date value) {
            addCriterionForJDBCDate("fund_date <", value, "fundDate");
            return (Criteria) this;
        }

        public Criteria andFundDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("fund_date <=", value, "fundDate");
            return (Criteria) this;
        }

        public Criteria andFundDateIn(List<Date> values) {
            addCriterionForJDBCDate("fund_date in", values, "fundDate");
            return (Criteria) this;
        }

        public Criteria andFundDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("fund_date not in", values, "fundDate");
            return (Criteria) this;
        }

        public Criteria andFundDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("fund_date between", value1, value2, "fundDate");
            return (Criteria) this;
        }

        public Criteria andFundDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("fund_date not between", value1, value2, "fundDate");
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