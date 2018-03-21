package home.pb.springwebmvc.controller;
import home.pb.springwebmvc.entity.Customer;
import home.pb.springwebmvc.service.CustomerService;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

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

    @RequestMapping(value = "/test.do",method = RequestMethod.GET)
    @ResponseBody
    public String test(){
        Customer customer = customerService.selectByPrimaryKey(1001);
        System.out.println("customer:" + customer);
        return customer.toString();
    }


}
