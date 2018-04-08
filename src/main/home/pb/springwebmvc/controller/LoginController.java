package home.pb.springwebmvc.controller;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.github.pagehelper.StringUtil;
import home.pb.springwebmvc.entity.Customer;
import home.pb.springwebmvc.entity.CustomerExample;
import home.pb.springwebmvc.model.Pages;
import home.pb.springwebmvc.model.PageParam;
import home.pb.springwebmvc.service.CustomerService;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class LoginController {

    @Autowired
    @Qualifier("customerService")
    private CustomerService customerService;

    @RequestMapping(value = "/login.do",method = RequestMethod.POST)
    @ResponseBody
    public String login(@RequestBody JSONObject requestJson) {
//    public String login(@RequestParam(value = "username")String username,@RequestParam(value = "password")String password) {
        System.out.println("访问login.do方法");
        String username = requestJson.getString("username");
        String password = requestJson.getString("password");
        System.out.println("username:"+ username + "--password:" + password);
        return requestJson.toString();
    }

    @RequestMapping(value = "/test.do",method = RequestMethod.POST)
    @ResponseBody
    public JSONObject test(HttpServletRequest request){
        String limit = request.getParameter("limit");
        String offset = request.getParameter("offset");
        System.out.println("limit:" + limit + "--offset:" + offset);

        Customer customer = customerService.selectByPrimaryKey(1001);
        return JSONObject.fromObject(customer);
    }

    @RequestMapping(value = "/test2.do",method = RequestMethod.POST)
    @ResponseBody
    public Pages<Customer> test2(HttpServletRequest request){

        String limit = request.getParameter("limit");
        String pageNumber = request.getParameter("offset");
        String order = request.getParameter("order");

        // 当前页数
        int nowPaged = Integer.parseInt(null == pageNumber ? "1" : pageNumber);
        // 每页显示页数
        int limitd = Integer.parseInt(null == limit ? "10" : limit);

        Pages<Customer> pages = new Pages<>();
        PageHelper.startPage(nowPaged,limitd);

        CustomerExample example = new CustomerExample();
        CustomerExample.Criteria criteria = example.createCriteria();

        example.setOrderByClause(order);

        List<Customer> customerList = customerService.getAllUserByExample(example);

        PageInfo<Customer> pageInfo = new PageInfo<>(customerList);
        int total = (int) pageInfo.getTotal();

        pages.setTotal(total);
        pages.setRows(customerList);
        return pages;
    }
}
