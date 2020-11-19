package apocalypse.cloudpartybuilding.controller;


import apocalypse.cloudpartybuilding.pojo.CpbUsers;
import apocalypse.cloudpartybuilding.service.CpbUsersService;
import apocalypse.cloudpartybuilding.util.RespBean;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.Map;
@Slf4j
@RestController//返回的数据都是json
@RequestMapping("/user")
public class CpbUsersController {
    @Autowired
    CpbUsersService cpbUsersService;


    @RequestMapping(value ="/selectid",method = RequestMethod.GET)
    public CpbUsers selectidUser() {
        return cpbUsersService.selectByPrimaryKey(1);
    }
    //验证码
    @GetMapping("/captcha")
    public void DefaultCaptcha(HttpServletRequest httpServletRequest,
                               HttpServletResponse httpServletResponse) throws Exception {

    }

    //注册
    @PostMapping(value = "/signup", produces = "application/json;charset=utf-8;")
    public RespBean SignUp(@RequestBody Map<String, String> jsonParam, HttpSession session) {
        Integer usersPhone = Integer.parseInt(jsonParam.get("phone"));
        String usersPassword = jsonParam.get("password");
        String username = jsonParam.get("username");
        CpbUsers cpbUser = new CpbUsers(username,usersPassword,usersPhone);
        log.warn(cpbUser.toString());
        try {
            int signup = cpbUsersService.signup(cpbUser);
            if(signup==0){
                return new RespBean("error", "注册失败");
            }else{
                return new RespBean("success", "注册成功");
            }
        }catch (Exception e){
            return new RespBean("error", "事务错误，账号存在");
        }


    }

    //登录
    @PostMapping(value = "/signin", produces = "application/json;charset=utf-8;")
    public RespBean SingIn (@RequestBody Map<String, String> jsonParam, HttpSession session) {
        String usersPhone = jsonParam.get("phone");
        String usersPassword = jsonParam.get("password");
        CpbUsers cpbUser = cpbUsersService.signin(usersPhone, usersPassword);
        if (cpbUser != null) {
            session.setAttribute("loginUser", cpbUser.getUserName());
            session.setAttribute("loginUserId", cpbUser.getUserId());
            //session过期时间设置为7200秒 即两小时
            session.setMaxInactiveInterval(60 * 60 * 2);
            return new RespBean("success", "登录成功");
        } else {
            return new RespBean("error", "登录失败");
        }
    }


}
