package pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class InformationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public InformationExample() {
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

        public Criteria andInformationItitleIsNull() {
            addCriterion("information_title is null");
            return (Criteria) this;
        }

        public Criteria andInformationItitleIsNotNull() {
            addCriterion("information_title is not null");
            return (Criteria) this;
        }

        public Criteria andInformationItitleEqualTo(String value) {
            addCriterion("information_title =", value, "informationItitle");
            return (Criteria) this;
        }

        public Criteria andInformationItitleNotEqualTo(String value) {
            addCriterion("information_title <>", value, "informationItitle");
            return (Criteria) this;
        }

        public Criteria andInformationItitleGreaterThan(String value) {
            addCriterion("information_title >", value, "informationItitle");
            return (Criteria) this;
        }

        public Criteria andInformationItitleGreaterThanOrEqualTo(String value) {
            addCriterion("information_title >=", value, "informationItitle");
            return (Criteria) this;
        }

        public Criteria andInformationItitleLessThan(String value) {
            addCriterion("information_title <", value, "informationItitle");
            return (Criteria) this;
        }

        public Criteria andInformationItitleLessThanOrEqualTo(String value) {
            addCriterion("information_title <=", value, "informationItitle");
            return (Criteria) this;
        }

        public Criteria andInformationItitleLike(String value) {
            addCriterion("information_title like", value, "informationItitle");
            return (Criteria) this;
        }

        public Criteria andInformationItitleNotLike(String value) {
            addCriterion("information_title not like", value, "informationItitle");
            return (Criteria) this;
        }

        public Criteria andInformationItitleIn(List<String> values) {
            addCriterion("information_title in", values, "informationItitle");
            return (Criteria) this;
        }

        public Criteria andInformationItitleNotIn(List<String> values) {
            addCriterion("information_title not in", values, "informationItitle");
            return (Criteria) this;
        }

        public Criteria andInformationItitleBetween(String value1, String value2) {
            addCriterion("information_title between", value1, value2, "informationItitle");
            return (Criteria) this;
        }

        public Criteria andInformationItitleNotBetween(String value1, String value2) {
            addCriterion("information_title not between", value1, value2, "informationItitle");
            return (Criteria) this;
        }

        public Criteria andInformationImessageIsNull() {
            addCriterion("information_message is null");
            return (Criteria) this;
        }

        public Criteria andInformationImessageIsNotNull() {
            addCriterion("information_message is not null");
            return (Criteria) this;
        }

        public Criteria andInformationImessageEqualTo(String value) {
            addCriterion("information_message =", value, "informationImessage");
            return (Criteria) this;
        }

        public Criteria andInformationImessageNotEqualTo(String value) {
            addCriterion("information_message <>", value, "informationImessage");
            return (Criteria) this;
        }

        public Criteria andInformationImessageGreaterThan(String value) {
            addCriterion("information_message >", value, "informationImessage");
            return (Criteria) this;
        }

        public Criteria andInformationImessageGreaterThanOrEqualTo(String value) {
            addCriterion("information_message >=", value, "informationImessage");
            return (Criteria) this;
        }

        public Criteria andInformationImessageLessThan(String value) {
            addCriterion("information_message <", value, "informationImessage");
            return (Criteria) this;
        }

        public Criteria andInformationImessageLessThanOrEqualTo(String value) {
            addCriterion("information_message <=", value, "informationImessage");
            return (Criteria) this;
        }

        public Criteria andInformationImessageLike(String value) {
            addCriterion("information_message like", value, "informationImessage");
            return (Criteria) this;
        }

        public Criteria andInformationImessageNotLike(String value) {
            addCriterion("information_message not like", value, "informationImessage");
            return (Criteria) this;
        }

        public Criteria andInformationImessageIn(List<String> values) {
            addCriterion("information_message in", values, "informationImessage");
            return (Criteria) this;
        }

        public Criteria andInformationImessageNotIn(List<String> values) {
            addCriterion("information_message not in", values, "informationImessage");
            return (Criteria) this;
        }

        public Criteria andInformationImessageBetween(String value1, String value2) {
            addCriterion("information_message between", value1, value2, "informationImessage");
            return (Criteria) this;
        }

        public Criteria andInformationImessageNotBetween(String value1, String value2) {
            addCriterion("information_message not between", value1, value2, "informationImessage");
            return (Criteria) this;
        }

        public Criteria andInformationIdateIsNull() {
            addCriterion("information_date is null");
            return (Criteria) this;
        }

        public Criteria andInformationIdateIsNotNull() {
            addCriterion("information_date is not null");
            return (Criteria) this;
        }

        public Criteria andInformationIdateEqualTo(Date value) {
            addCriterionForJDBCDate("information_date =", value, "informationIdate");
            return (Criteria) this;
        }

        public Criteria andInformationIdateNotEqualTo(Date value) {
            addCriterionForJDBCDate("information_date <>", value, "informationIdate");
            return (Criteria) this;
        }

        public Criteria andInformationIdateGreaterThan(Date value) {
            addCriterionForJDBCDate("information_date >", value, "informationIdate");
            return (Criteria) this;
        }

        public Criteria andInformationIdateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("information_date >=", value, "informationIdate");
            return (Criteria) this;
        }

        public Criteria andInformationIdateLessThan(Date value) {
            addCriterionForJDBCDate("information_date <", value, "informationIdate");
            return (Criteria) this;
        }

        public Criteria andInformationIdateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("information_date <=", value, "informationIdate");
            return (Criteria) this;
        }

        public Criteria andInformationIdateIn(List<Date> values) {
            addCriterionForJDBCDate("information_date in", values, "informationIdate");
            return (Criteria) this;
        }

        public Criteria andInformationIdateNotIn(List<Date> values) {
            addCriterionForJDBCDate("information_date not in", values, "informationIdate");
            return (Criteria) this;
        }

        public Criteria andInformationIdateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("information_date between", value1, value2, "informationIdate");
            return (Criteria) this;
        }

        public Criteria andInformationIdateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("information_date not between", value1, value2, "informationIdate");
            return (Criteria) this;
        }

        public Criteria andInformationTypeIsNull() {
            addCriterion("information_type is null");
            return (Criteria) this;
        }

        public Criteria andInformationTypeIsNotNull() {
            addCriterion("information_type is not null");
            return (Criteria) this;
        }

        public Criteria andInformationTypeEqualTo(String value) {
            addCriterion("information_type =", value, "informationType");
            return (Criteria) this;
        }

        public Criteria andInformationTypeNotEqualTo(String value) {
            addCriterion("information_type <>", value, "informationType");
            return (Criteria) this;
        }

        public Criteria andInformationTypeGreaterThan(String value) {
            addCriterion("information_type >", value, "informationType");
            return (Criteria) this;
        }

        public Criteria andInformationTypeGreaterThanOrEqualTo(String value) {
            addCriterion("information_type >=", value, "informationType");
            return (Criteria) this;
        }

        public Criteria andInformationTypeLessThan(String value) {
            addCriterion("information_type <", value, "informationType");
            return (Criteria) this;
        }

        public Criteria andInformationTypeLessThanOrEqualTo(String value) {
            addCriterion("information_type <=", value, "informationType");
            return (Criteria) this;
        }

        public Criteria andInformationTypeLike(String value) {
            addCriterion("information_type like", value, "informationType");
            return (Criteria) this;
        }

        public Criteria andInformationTypeNotLike(String value) {
            addCriterion("information_type not like", value, "informationType");
            return (Criteria) this;
        }

        public Criteria andInformationTypeIn(List<String> values) {
            addCriterion("information_type in", values, "informationType");
            return (Criteria) this;
        }

        public Criteria andInformationTypeNotIn(List<String> values) {
            addCriterion("information_type not in", values, "informationType");
            return (Criteria) this;
        }

        public Criteria andInformationTypeBetween(String value1, String value2) {
            addCriterion("information_type between", value1, value2, "informationType");
            return (Criteria) this;
        }

        public Criteria andInformationTypeNotBetween(String value1, String value2) {
            addCriterion("information_type not between", value1, value2, "informationType");
            return (Criteria) this;
        }

        public Criteria andIshotIsNull() {
            addCriterion("isHot is null");
            return (Criteria) this;
        }

        public Criteria andIshotIsNotNull() {
            addCriterion("isHot is not null");
            return (Criteria) this;
        }

        public Criteria andIshotEqualTo(Integer value) {
            addCriterion("isHot =", value, "ishot");
            return (Criteria) this;
        }

        public Criteria andIshotNotEqualTo(Integer value) {
            addCriterion("isHot <>", value, "ishot");
            return (Criteria) this;
        }

        public Criteria andIshotGreaterThan(Integer value) {
            addCriterion("isHot >", value, "ishot");
            return (Criteria) this;
        }

        public Criteria andIshotGreaterThanOrEqualTo(Integer value) {
            addCriterion("isHot >=", value, "ishot");
            return (Criteria) this;
        }

        public Criteria andIshotLessThan(Integer value) {
            addCriterion("isHot <", value, "ishot");
            return (Criteria) this;
        }

        public Criteria andIshotLessThanOrEqualTo(Integer value) {
            addCriterion("isHot <=", value, "ishot");
            return (Criteria) this;
        }

        public Criteria andIshotIn(List<Integer> values) {
            addCriterion("isHot in", values, "ishot");
            return (Criteria) this;
        }

        public Criteria andIshotNotIn(List<Integer> values) {
            addCriterion("isHot not in", values, "ishot");
            return (Criteria) this;
        }

        public Criteria andIshotBetween(Integer value1, Integer value2) {
            addCriterion("isHot between", value1, value2, "ishot");
            return (Criteria) this;
        }

        public Criteria andIshotNotBetween(Integer value1, Integer value2) {
            addCriterion("isHot not between", value1, value2, "ishot");
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