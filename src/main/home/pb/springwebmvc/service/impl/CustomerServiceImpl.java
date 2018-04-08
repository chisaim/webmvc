package home.pb.springwebmvc.service.impl;

import home.pb.springwebmvc.dao.CustomerMapper;
import home.pb.springwebmvc.entity.Customer;
import home.pb.springwebmvc.model.Page;
import home.pb.springwebmvc.model.PageParam;
import home.pb.springwebmvc.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service("customerService")
public class CustomerServiceImpl implements CustomerService{

    @Autowired
    private CustomerMapper customerMapper;

    @Override
    public Customer selectByPrimaryKey(Integer customer_id) {
        return customerMapper.selectByPrimaryKey(customer_id);
    }

    @Override
    public Page selectByPrimaryKey(PageParam pageParam) {
        return customerMapper.selectByPrimaryKey(pageParam);
    }


}
