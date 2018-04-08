package home.pb.springwebmvc.entity;

public class Customer {
    private Integer customer_id;

    private String customer_name;

    private String contact_name;

    private String phone;

    private String address;

    private String province;

    private String city;

    private Integer sale_employee_id;

    private Integer credit_limit;

    public Customer(Integer customer_id, String customer_name, String contact_name, String phone, String address, String province, String city, Integer sale_employee_id, Integer credit_limit) {
        this.customer_id = customer_id;
        this.customer_name = customer_name;
        this.contact_name = contact_name;
        this.phone = phone;
        this.address = address;
        this.province = province;
        this.city = city;
        this.sale_employee_id = sale_employee_id;
        this.credit_limit = credit_limit;
    }

    public Customer() {
        super();
    }

    public Integer getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(Integer customer_id) {
        this.customer_id = customer_id;
    }

    public String getCustomer_name() {
        return customer_name;
    }

    public void setCustomer_name(String customer_name) {
        this.customer_name = customer_name == null ? null : customer_name.trim();
    }

    public String getContact_name() {
        return contact_name;
    }

    public void setContact_name(String contact_name) {
        this.contact_name = contact_name == null ? null : contact_name.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province == null ? null : province.trim();
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    public Integer getSale_employee_id() {
        return sale_employee_id;
    }

    public void setSale_employee_id(Integer sale_employee_id) {
        this.sale_employee_id = sale_employee_id;
    }

    public Integer getCredit_limit() {
        return credit_limit;
    }

    public void setCredit_limit(Integer credit_limit) {
        this.credit_limit = credit_limit;
    }
}