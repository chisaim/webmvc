package home.pb.springwebmvc.entity;

import java.util.ArrayList;
import java.util.List;

public class CustomerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CustomerExample() {
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

        public Criteria andCustomer_idIsNull() {
            addCriterion("customer_id is null");
            return (Criteria) this;
        }

        public Criteria andCustomer_idIsNotNull() {
            addCriterion("customer_id is not null");
            return (Criteria) this;
        }

        public Criteria andCustomer_idEqualTo(Integer value) {
            addCriterion("customer_id =", value, "customer_id");
            return (Criteria) this;
        }

        public Criteria andCustomer_idNotEqualTo(Integer value) {
            addCriterion("customer_id <>", value, "customer_id");
            return (Criteria) this;
        }

        public Criteria andCustomer_idGreaterThan(Integer value) {
            addCriterion("customer_id >", value, "customer_id");
            return (Criteria) this;
        }

        public Criteria andCustomer_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("customer_id >=", value, "customer_id");
            return (Criteria) this;
        }

        public Criteria andCustomer_idLessThan(Integer value) {
            addCriterion("customer_id <", value, "customer_id");
            return (Criteria) this;
        }

        public Criteria andCustomer_idLessThanOrEqualTo(Integer value) {
            addCriterion("customer_id <=", value, "customer_id");
            return (Criteria) this;
        }

        public Criteria andCustomer_idIn(List<Integer> values) {
            addCriterion("customer_id in", values, "customer_id");
            return (Criteria) this;
        }

        public Criteria andCustomer_idNotIn(List<Integer> values) {
            addCriterion("customer_id not in", values, "customer_id");
            return (Criteria) this;
        }

        public Criteria andCustomer_idBetween(Integer value1, Integer value2) {
            addCriterion("customer_id between", value1, value2, "customer_id");
            return (Criteria) this;
        }

        public Criteria andCustomer_idNotBetween(Integer value1, Integer value2) {
            addCriterion("customer_id not between", value1, value2, "customer_id");
            return (Criteria) this;
        }

        public Criteria andCustomer_nameIsNull() {
            addCriterion("customer_name is null");
            return (Criteria) this;
        }

        public Criteria andCustomer_nameIsNotNull() {
            addCriterion("customer_name is not null");
            return (Criteria) this;
        }

        public Criteria andCustomer_nameEqualTo(String value) {
            addCriterion("customer_name =", value, "customer_name");
            return (Criteria) this;
        }

        public Criteria andCustomer_nameNotEqualTo(String value) {
            addCriterion("customer_name <>", value, "customer_name");
            return (Criteria) this;
        }

        public Criteria andCustomer_nameGreaterThan(String value) {
            addCriterion("customer_name >", value, "customer_name");
            return (Criteria) this;
        }

        public Criteria andCustomer_nameGreaterThanOrEqualTo(String value) {
            addCriterion("customer_name >=", value, "customer_name");
            return (Criteria) this;
        }

        public Criteria andCustomer_nameLessThan(String value) {
            addCriterion("customer_name <", value, "customer_name");
            return (Criteria) this;
        }

        public Criteria andCustomer_nameLessThanOrEqualTo(String value) {
            addCriterion("customer_name <=", value, "customer_name");
            return (Criteria) this;
        }

        public Criteria andCustomer_nameLike(String value) {
            addCriterion("customer_name like", value, "customer_name");
            return (Criteria) this;
        }

        public Criteria andCustomer_nameNotLike(String value) {
            addCriterion("customer_name not like", value, "customer_name");
            return (Criteria) this;
        }

        public Criteria andCustomer_nameIn(List<String> values) {
            addCriterion("customer_name in", values, "customer_name");
            return (Criteria) this;
        }

        public Criteria andCustomer_nameNotIn(List<String> values) {
            addCriterion("customer_name not in", values, "customer_name");
            return (Criteria) this;
        }

        public Criteria andCustomer_nameBetween(String value1, String value2) {
            addCriterion("customer_name between", value1, value2, "customer_name");
            return (Criteria) this;
        }

        public Criteria andCustomer_nameNotBetween(String value1, String value2) {
            addCriterion("customer_name not between", value1, value2, "customer_name");
            return (Criteria) this;
        }

        public Criteria andContact_nameIsNull() {
            addCriterion("contact_name is null");
            return (Criteria) this;
        }

        public Criteria andContact_nameIsNotNull() {
            addCriterion("contact_name is not null");
            return (Criteria) this;
        }

        public Criteria andContact_nameEqualTo(String value) {
            addCriterion("contact_name =", value, "contact_name");
            return (Criteria) this;
        }

        public Criteria andContact_nameNotEqualTo(String value) {
            addCriterion("contact_name <>", value, "contact_name");
            return (Criteria) this;
        }

        public Criteria andContact_nameGreaterThan(String value) {
            addCriterion("contact_name >", value, "contact_name");
            return (Criteria) this;
        }

        public Criteria andContact_nameGreaterThanOrEqualTo(String value) {
            addCriterion("contact_name >=", value, "contact_name");
            return (Criteria) this;
        }

        public Criteria andContact_nameLessThan(String value) {
            addCriterion("contact_name <", value, "contact_name");
            return (Criteria) this;
        }

        public Criteria andContact_nameLessThanOrEqualTo(String value) {
            addCriterion("contact_name <=", value, "contact_name");
            return (Criteria) this;
        }

        public Criteria andContact_nameLike(String value) {
            addCriterion("contact_name like", value, "contact_name");
            return (Criteria) this;
        }

        public Criteria andContact_nameNotLike(String value) {
            addCriterion("contact_name not like", value, "contact_name");
            return (Criteria) this;
        }

        public Criteria andContact_nameIn(List<String> values) {
            addCriterion("contact_name in", values, "contact_name");
            return (Criteria) this;
        }

        public Criteria andContact_nameNotIn(List<String> values) {
            addCriterion("contact_name not in", values, "contact_name");
            return (Criteria) this;
        }

        public Criteria andContact_nameBetween(String value1, String value2) {
            addCriterion("contact_name between", value1, value2, "contact_name");
            return (Criteria) this;
        }

        public Criteria andContact_nameNotBetween(String value1, String value2) {
            addCriterion("contact_name not between", value1, value2, "contact_name");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNull() {
            addCriterion("phone is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("phone is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("phone =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("phone <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("phone >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("phone >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("phone <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("phone <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("phone like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("phone not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("phone in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("phone not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("phone between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("phone not between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andProvinceIsNull() {
            addCriterion("province is null");
            return (Criteria) this;
        }

        public Criteria andProvinceIsNotNull() {
            addCriterion("province is not null");
            return (Criteria) this;
        }

        public Criteria andProvinceEqualTo(String value) {
            addCriterion("province =", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotEqualTo(String value) {
            addCriterion("province <>", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceGreaterThan(String value) {
            addCriterion("province >", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceGreaterThanOrEqualTo(String value) {
            addCriterion("province >=", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLessThan(String value) {
            addCriterion("province <", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLessThanOrEqualTo(String value) {
            addCriterion("province <=", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLike(String value) {
            addCriterion("province like", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotLike(String value) {
            addCriterion("province not like", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceIn(List<String> values) {
            addCriterion("province in", values, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotIn(List<String> values) {
            addCriterion("province not in", values, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceBetween(String value1, String value2) {
            addCriterion("province between", value1, value2, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotBetween(String value1, String value2) {
            addCriterion("province not between", value1, value2, "province");
            return (Criteria) this;
        }

        public Criteria andCityIsNull() {
            addCriterion("city is null");
            return (Criteria) this;
        }

        public Criteria andCityIsNotNull() {
            addCriterion("city is not null");
            return (Criteria) this;
        }

        public Criteria andCityEqualTo(String value) {
            addCriterion("city =", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotEqualTo(String value) {
            addCriterion("city <>", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThan(String value) {
            addCriterion("city >", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThanOrEqualTo(String value) {
            addCriterion("city >=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThan(String value) {
            addCriterion("city <", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThanOrEqualTo(String value) {
            addCriterion("city <=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLike(String value) {
            addCriterion("city like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotLike(String value) {
            addCriterion("city not like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityIn(List<String> values) {
            addCriterion("city in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotIn(List<String> values) {
            addCriterion("city not in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityBetween(String value1, String value2) {
            addCriterion("city between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotBetween(String value1, String value2) {
            addCriterion("city not between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andSale_employee_idIsNull() {
            addCriterion("sale_employee_id is null");
            return (Criteria) this;
        }

        public Criteria andSale_employee_idIsNotNull() {
            addCriterion("sale_employee_id is not null");
            return (Criteria) this;
        }

        public Criteria andSale_employee_idEqualTo(Integer value) {
            addCriterion("sale_employee_id =", value, "sale_employee_id");
            return (Criteria) this;
        }

        public Criteria andSale_employee_idNotEqualTo(Integer value) {
            addCriterion("sale_employee_id <>", value, "sale_employee_id");
            return (Criteria) this;
        }

        public Criteria andSale_employee_idGreaterThan(Integer value) {
            addCriterion("sale_employee_id >", value, "sale_employee_id");
            return (Criteria) this;
        }

        public Criteria andSale_employee_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("sale_employee_id >=", value, "sale_employee_id");
            return (Criteria) this;
        }

        public Criteria andSale_employee_idLessThan(Integer value) {
            addCriterion("sale_employee_id <", value, "sale_employee_id");
            return (Criteria) this;
        }

        public Criteria andSale_employee_idLessThanOrEqualTo(Integer value) {
            addCriterion("sale_employee_id <=", value, "sale_employee_id");
            return (Criteria) this;
        }

        public Criteria andSale_employee_idIn(List<Integer> values) {
            addCriterion("sale_employee_id in", values, "sale_employee_id");
            return (Criteria) this;
        }

        public Criteria andSale_employee_idNotIn(List<Integer> values) {
            addCriterion("sale_employee_id not in", values, "sale_employee_id");
            return (Criteria) this;
        }

        public Criteria andSale_employee_idBetween(Integer value1, Integer value2) {
            addCriterion("sale_employee_id between", value1, value2, "sale_employee_id");
            return (Criteria) this;
        }

        public Criteria andSale_employee_idNotBetween(Integer value1, Integer value2) {
            addCriterion("sale_employee_id not between", value1, value2, "sale_employee_id");
            return (Criteria) this;
        }

        public Criteria andCredit_limitIsNull() {
            addCriterion("credit_limit is null");
            return (Criteria) this;
        }

        public Criteria andCredit_limitIsNotNull() {
            addCriterion("credit_limit is not null");
            return (Criteria) this;
        }

        public Criteria andCredit_limitEqualTo(Integer value) {
            addCriterion("credit_limit =", value, "credit_limit");
            return (Criteria) this;
        }

        public Criteria andCredit_limitNotEqualTo(Integer value) {
            addCriterion("credit_limit <>", value, "credit_limit");
            return (Criteria) this;
        }

        public Criteria andCredit_limitGreaterThan(Integer value) {
            addCriterion("credit_limit >", value, "credit_limit");
            return (Criteria) this;
        }

        public Criteria andCredit_limitGreaterThanOrEqualTo(Integer value) {
            addCriterion("credit_limit >=", value, "credit_limit");
            return (Criteria) this;
        }

        public Criteria andCredit_limitLessThan(Integer value) {
            addCriterion("credit_limit <", value, "credit_limit");
            return (Criteria) this;
        }

        public Criteria andCredit_limitLessThanOrEqualTo(Integer value) {
            addCriterion("credit_limit <=", value, "credit_limit");
            return (Criteria) this;
        }

        public Criteria andCredit_limitIn(List<Integer> values) {
            addCriterion("credit_limit in", values, "credit_limit");
            return (Criteria) this;
        }

        public Criteria andCredit_limitNotIn(List<Integer> values) {
            addCriterion("credit_limit not in", values, "credit_limit");
            return (Criteria) this;
        }

        public Criteria andCredit_limitBetween(Integer value1, Integer value2) {
            addCriterion("credit_limit between", value1, value2, "credit_limit");
            return (Criteria) this;
        }

        public Criteria andCredit_limitNotBetween(Integer value1, Integer value2) {
            addCriterion("credit_limit not between", value1, value2, "credit_limit");
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