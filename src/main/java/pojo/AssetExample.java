package pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class AssetExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AssetExample() {
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

        public Criteria andAssetIdIsNull() {
            addCriterion("asset_id is null");
            return (Criteria) this;
        }

        public Criteria andAssetIdIsNotNull() {
            addCriterion("asset_id is not null");
            return (Criteria) this;
        }

        public Criteria andAssetIdEqualTo(String value) {
            addCriterion("asset_id =", value, "assetId");
            return (Criteria) this;
        }

        public Criteria andAssetIdNotEqualTo(String value) {
            addCriterion("asset_id <>", value, "assetId");
            return (Criteria) this;
        }

        public Criteria andAssetIdGreaterThan(String value) {
            addCriterion("asset_id >", value, "assetId");
            return (Criteria) this;
        }

        public Criteria andAssetIdGreaterThanOrEqualTo(String value) {
            addCriterion("asset_id >=", value, "assetId");
            return (Criteria) this;
        }

        public Criteria andAssetIdLessThan(String value) {
            addCriterion("asset_id <", value, "assetId");
            return (Criteria) this;
        }

        public Criteria andAssetIdLessThanOrEqualTo(String value) {
            addCriterion("asset_id <=", value, "assetId");
            return (Criteria) this;
        }

        public Criteria andAssetIdLike(String value) {
            addCriterion("asset_id like", value, "assetId");
            return (Criteria) this;
        }

        public Criteria andAssetIdNotLike(String value) {
            addCriterion("asset_id not like", value, "assetId");
            return (Criteria) this;
        }

        public Criteria andAssetIdIn(List<String> values) {
            addCriterion("asset_id in", values, "assetId");
            return (Criteria) this;
        }

        public Criteria andAssetIdNotIn(List<String> values) {
            addCriterion("asset_id not in", values, "assetId");
            return (Criteria) this;
        }

        public Criteria andAssetIdBetween(String value1, String value2) {
            addCriterion("asset_id between", value1, value2, "assetId");
            return (Criteria) this;
        }

        public Criteria andAssetIdNotBetween(String value1, String value2) {
            addCriterion("asset_id not between", value1, value2, "assetId");
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

        public Criteria andAssetNumberIsNull() {
            addCriterion("asset_number is null");
            return (Criteria) this;
        }

        public Criteria andAssetNumberIsNotNull() {
            addCriterion("asset_number is not null");
            return (Criteria) this;
        }

        public Criteria andAssetNumberEqualTo(Integer value) {
            addCriterion("asset_number =", value, "assetNumber");
            return (Criteria) this;
        }

        public Criteria andAssetNumberNotEqualTo(Integer value) {
            addCriterion("asset_number <>", value, "assetNumber");
            return (Criteria) this;
        }

        public Criteria andAssetNumberGreaterThan(Integer value) {
            addCriterion("asset_number >", value, "assetNumber");
            return (Criteria) this;
        }

        public Criteria andAssetNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("asset_number >=", value, "assetNumber");
            return (Criteria) this;
        }

        public Criteria andAssetNumberLessThan(Integer value) {
            addCriterion("asset_number <", value, "assetNumber");
            return (Criteria) this;
        }

        public Criteria andAssetNumberLessThanOrEqualTo(Integer value) {
            addCriterion("asset_number <=", value, "assetNumber");
            return (Criteria) this;
        }

        public Criteria andAssetNumberIn(List<Integer> values) {
            addCriterion("asset_number in", values, "assetNumber");
            return (Criteria) this;
        }

        public Criteria andAssetNumberNotIn(List<Integer> values) {
            addCriterion("asset_number not in", values, "assetNumber");
            return (Criteria) this;
        }

        public Criteria andAssetNumberBetween(Integer value1, Integer value2) {
            addCriterion("asset_number between", value1, value2, "assetNumber");
            return (Criteria) this;
        }

        public Criteria andAssetNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("asset_number not between", value1, value2, "assetNumber");
            return (Criteria) this;
        }

        public Criteria andAssetDateIsNull() {
            addCriterion("asset_date is null");
            return (Criteria) this;
        }

        public Criteria andAssetDateIsNotNull() {
            addCriterion("asset_date is not null");
            return (Criteria) this;
        }

        public Criteria andAssetDateEqualTo(Date value) {
            addCriterionForJDBCDate("asset_date =", value, "assetDate");
            return (Criteria) this;
        }

        public Criteria andAssetDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("asset_date <>", value, "assetDate");
            return (Criteria) this;
        }

        public Criteria andAssetDateGreaterThan(Date value) {
            addCriterionForJDBCDate("asset_date >", value, "assetDate");
            return (Criteria) this;
        }

        public Criteria andAssetDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("asset_date >=", value, "assetDate");
            return (Criteria) this;
        }

        public Criteria andAssetDateLessThan(Date value) {
            addCriterionForJDBCDate("asset_date <", value, "assetDate");
            return (Criteria) this;
        }

        public Criteria andAssetDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("asset_date <=", value, "assetDate");
            return (Criteria) this;
        }

        public Criteria andAssetDateIn(List<Date> values) {
            addCriterionForJDBCDate("asset_date in", values, "assetDate");
            return (Criteria) this;
        }

        public Criteria andAssetDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("asset_date not in", values, "assetDate");
            return (Criteria) this;
        }

        public Criteria andAssetDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("asset_date between", value1, value2, "assetDate");
            return (Criteria) this;
        }

        public Criteria andAssetDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("asset_date not between", value1, value2, "assetDate");
            return (Criteria) this;
        }

        public Criteria andAssetPriceIsNull() {
            addCriterion("asset_price is null");
            return (Criteria) this;
        }

        public Criteria andAssetPriceIsNotNull() {
            addCriterion("asset_price is not null");
            return (Criteria) this;
        }

        public Criteria andAssetPriceEqualTo(Float value) {
            addCriterion("asset_price =", value, "assetPrice");
            return (Criteria) this;
        }

        public Criteria andAssetPriceNotEqualTo(Float value) {
            addCriterion("asset_price <>", value, "assetPrice");
            return (Criteria) this;
        }

        public Criteria andAssetPriceGreaterThan(Float value) {
            addCriterion("asset_price >", value, "assetPrice");
            return (Criteria) this;
        }

        public Criteria andAssetPriceGreaterThanOrEqualTo(Float value) {
            addCriterion("asset_price >=", value, "assetPrice");
            return (Criteria) this;
        }

        public Criteria andAssetPriceLessThan(Float value) {
            addCriterion("asset_price <", value, "assetPrice");
            return (Criteria) this;
        }

        public Criteria andAssetPriceLessThanOrEqualTo(Float value) {
            addCriterion("asset_price <=", value, "assetPrice");
            return (Criteria) this;
        }

        public Criteria andAssetPriceIn(List<Float> values) {
            addCriterion("asset_price in", values, "assetPrice");
            return (Criteria) this;
        }

        public Criteria andAssetPriceNotIn(List<Float> values) {
            addCriterion("asset_price not in", values, "assetPrice");
            return (Criteria) this;
        }

        public Criteria andAssetPriceBetween(Float value1, Float value2) {
            addCriterion("asset_price between", value1, value2, "assetPrice");
            return (Criteria) this;
        }

        public Criteria andAssetPriceNotBetween(Float value1, Float value2) {
            addCriterion("asset_price not between", value1, value2, "assetPrice");
            return (Criteria) this;
        }

        public Criteria andAssetBelongIsNull() {
            addCriterion("asset_belong is null");
            return (Criteria) this;
        }

        public Criteria andAssetBelongIsNotNull() {
            addCriterion("asset_belong is not null");
            return (Criteria) this;
        }

        public Criteria andAssetBelongEqualTo(String value) {
            addCriterion("asset_belong =", value, "assetBelong");
            return (Criteria) this;
        }

        public Criteria andAssetBelongNotEqualTo(String value) {
            addCriterion("asset_belong <>", value, "assetBelong");
            return (Criteria) this;
        }

        public Criteria andAssetBelongGreaterThan(String value) {
            addCriterion("asset_belong >", value, "assetBelong");
            return (Criteria) this;
        }

        public Criteria andAssetBelongGreaterThanOrEqualTo(String value) {
            addCriterion("asset_belong >=", value, "assetBelong");
            return (Criteria) this;
        }

        public Criteria andAssetBelongLessThan(String value) {
            addCriterion("asset_belong <", value, "assetBelong");
            return (Criteria) this;
        }

        public Criteria andAssetBelongLessThanOrEqualTo(String value) {
            addCriterion("asset_belong <=", value, "assetBelong");
            return (Criteria) this;
        }

        public Criteria andAssetBelongLike(String value) {
            addCriterion("asset_belong like", value, "assetBelong");
            return (Criteria) this;
        }

        public Criteria andAssetBelongNotLike(String value) {
            addCriterion("asset_belong not like", value, "assetBelong");
            return (Criteria) this;
        }

        public Criteria andAssetBelongIn(List<String> values) {
            addCriterion("asset_belong in", values, "assetBelong");
            return (Criteria) this;
        }

        public Criteria andAssetBelongNotIn(List<String> values) {
            addCriterion("asset_belong not in", values, "assetBelong");
            return (Criteria) this;
        }

        public Criteria andAssetBelongBetween(String value1, String value2) {
            addCriterion("asset_belong between", value1, value2, "assetBelong");
            return (Criteria) this;
        }

        public Criteria andAssetBelongNotBetween(String value1, String value2) {
            addCriterion("asset_belong not between", value1, value2, "assetBelong");
            return (Criteria) this;
        }

        public Criteria andAssetDepreciationIsNull() {
            addCriterion("asset_depreciation is null");
            return (Criteria) this;
        }

        public Criteria andAssetDepreciationIsNotNull() {
            addCriterion("asset_depreciation is not null");
            return (Criteria) this;
        }

        public Criteria andAssetDepreciationEqualTo(Float value) {
            addCriterion("asset_depreciation =", value, "assetDepreciation");
            return (Criteria) this;
        }

        public Criteria andAssetDepreciationNotEqualTo(Float value) {
            addCriterion("asset_depreciation <>", value, "assetDepreciation");
            return (Criteria) this;
        }

        public Criteria andAssetDepreciationGreaterThan(Float value) {
            addCriterion("asset_depreciation >", value, "assetDepreciation");
            return (Criteria) this;
        }

        public Criteria andAssetDepreciationGreaterThanOrEqualTo(Float value) {
            addCriterion("asset_depreciation >=", value, "assetDepreciation");
            return (Criteria) this;
        }

        public Criteria andAssetDepreciationLessThan(Float value) {
            addCriterion("asset_depreciation <", value, "assetDepreciation");
            return (Criteria) this;
        }

        public Criteria andAssetDepreciationLessThanOrEqualTo(Float value) {
            addCriterion("asset_depreciation <=", value, "assetDepreciation");
            return (Criteria) this;
        }

        public Criteria andAssetDepreciationIn(List<Float> values) {
            addCriterion("asset_depreciation in", values, "assetDepreciation");
            return (Criteria) this;
        }

        public Criteria andAssetDepreciationNotIn(List<Float> values) {
            addCriterion("asset_depreciation not in", values, "assetDepreciation");
            return (Criteria) this;
        }

        public Criteria andAssetDepreciationBetween(Float value1, Float value2) {
            addCriterion("asset_depreciation between", value1, value2, "assetDepreciation");
            return (Criteria) this;
        }

        public Criteria andAssetDepreciationNotBetween(Float value1, Float value2) {
            addCriterion("asset_depreciation not between", value1, value2, "assetDepreciation");
            return (Criteria) this;
        }

        public Criteria andAssetYearIsNull() {
            addCriterion("asset_year is null");
            return (Criteria) this;
        }

        public Criteria andAssetYearIsNotNull() {
            addCriterion("asset_year is not null");
            return (Criteria) this;
        }

        public Criteria andAssetYearEqualTo(Integer value) {
            addCriterion("asset_year =", value, "assetYear");
            return (Criteria) this;
        }

        public Criteria andAssetYearNotEqualTo(Integer value) {
            addCriterion("asset_year <>", value, "assetYear");
            return (Criteria) this;
        }

        public Criteria andAssetYearGreaterThan(Integer value) {
            addCriterion("asset_year >", value, "assetYear");
            return (Criteria) this;
        }

        public Criteria andAssetYearGreaterThanOrEqualTo(Integer value) {
            addCriterion("asset_year >=", value, "assetYear");
            return (Criteria) this;
        }

        public Criteria andAssetYearLessThan(Integer value) {
            addCriterion("asset_year <", value, "assetYear");
            return (Criteria) this;
        }

        public Criteria andAssetYearLessThanOrEqualTo(Integer value) {
            addCriterion("asset_year <=", value, "assetYear");
            return (Criteria) this;
        }

        public Criteria andAssetYearIn(List<Integer> values) {
            addCriterion("asset_year in", values, "assetYear");
            return (Criteria) this;
        }

        public Criteria andAssetYearNotIn(List<Integer> values) {
            addCriterion("asset_year not in", values, "assetYear");
            return (Criteria) this;
        }

        public Criteria andAssetYearBetween(Integer value1, Integer value2) {
            addCriterion("asset_year between", value1, value2, "assetYear");
            return (Criteria) this;
        }

        public Criteria andAssetYearNotBetween(Integer value1, Integer value2) {
            addCriterion("asset_year not between", value1, value2, "assetYear");
            return (Criteria) this;
        }

        public Criteria andAssetLocationIsNull() {
            addCriterion("asset_location is null");
            return (Criteria) this;
        }

        public Criteria andAssetLocationIsNotNull() {
            addCriterion("asset_location is not null");
            return (Criteria) this;
        }

        public Criteria andAssetLocationEqualTo(String value) {
            addCriterion("asset_location =", value, "assetLocation");
            return (Criteria) this;
        }

        public Criteria andAssetLocationNotEqualTo(String value) {
            addCriterion("asset_location <>", value, "assetLocation");
            return (Criteria) this;
        }

        public Criteria andAssetLocationGreaterThan(String value) {
            addCriterion("asset_location >", value, "assetLocation");
            return (Criteria) this;
        }

        public Criteria andAssetLocationGreaterThanOrEqualTo(String value) {
            addCriterion("asset_location >=", value, "assetLocation");
            return (Criteria) this;
        }

        public Criteria andAssetLocationLessThan(String value) {
            addCriterion("asset_location <", value, "assetLocation");
            return (Criteria) this;
        }

        public Criteria andAssetLocationLessThanOrEqualTo(String value) {
            addCriterion("asset_location <=", value, "assetLocation");
            return (Criteria) this;
        }

        public Criteria andAssetLocationLike(String value) {
            addCriterion("asset_location like", value, "assetLocation");
            return (Criteria) this;
        }

        public Criteria andAssetLocationNotLike(String value) {
            addCriterion("asset_location not like", value, "assetLocation");
            return (Criteria) this;
        }

        public Criteria andAssetLocationIn(List<String> values) {
            addCriterion("asset_location in", values, "assetLocation");
            return (Criteria) this;
        }

        public Criteria andAssetLocationNotIn(List<String> values) {
            addCriterion("asset_location not in", values, "assetLocation");
            return (Criteria) this;
        }

        public Criteria andAssetLocationBetween(String value1, String value2) {
            addCriterion("asset_location between", value1, value2, "assetLocation");
            return (Criteria) this;
        }

        public Criteria andAssetLocationNotBetween(String value1, String value2) {
            addCriterion("asset_location not between", value1, value2, "assetLocation");
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