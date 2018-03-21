package home.pb.springwebmvc.service;

import home.pb.springwebmvc.entity.Customer;

public interface CustomerService {

    Customer selectByPrimaryKey(Integer customer_id);

}
