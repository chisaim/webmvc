package home.pb.springwebmvc.service;

import home.pb.springwebmvc.entity.Customer;
import home.pb.springwebmvc.model.Page;
import home.pb.springwebmvc.model.PageParam;

public interface CustomerService {

    Customer selectByPrimaryKey(Integer customer_id);

    Page selectByPrimaryKey(PageParam pageParam);

}
