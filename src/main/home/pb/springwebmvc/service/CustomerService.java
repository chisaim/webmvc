package home.pb.springwebmvc.service;

import home.pb.springwebmvc.entity.Customer;
import home.pb.springwebmvc.entity.CustomerExample;

import java.util.List;

public interface CustomerService {

    Customer selectByPrimaryKey(Integer customer_id);

    List<Customer> getAllUserByExample(CustomerExample example);
}
