package home.pb.springwebmvc.controller;
import home.pb.springwebmvc.entity.Customer;
import home.pb.springwebmvc.model.Page;
import home.pb.springwebmvc.model.PageParam;
import home.pb.springwebmvc.service.CustomerService;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

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
    public JSONObject test2(int limit,int offset,String order){
        JSONObject result = new JSONObject();
        PageParam pageParam = new PageParam(offset,limit,null,order);

        Page page = customerService.selectByPrimaryKey(pageParam);
        result.put("total",page.getTotal());
        result.put("rows",page.getRows());
        return result;
    }
}
