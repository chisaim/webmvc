package home.pb.springwebmvc.dao;

import home.pb.springwebmvc.entity.Customer;
import home.pb.springwebmvc.model.Page;
import home.pb.springwebmvc.model.PageParam;

public interface CustomerMapper {

    Customer selectByPrimaryKey(Integer customer_id);

    Page selectByPrimaryKey(PageParam pageParam);
}