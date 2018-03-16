package home.pb.springwebmvc.controller;
import net.sf.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class LoginController {
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


}
