package apocalypse.cloudpartybuilding.controller;


import apocalypse.cloudpartybuilding.pojo.CpbUsers;
import apocalypse.cloudpartybuilding.service.CpbUsersService;
import apocalypse.cloudpartybuilding.util.RespBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.imageio.ImageIO;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.util.Map;

@RestController//返回的数据都是json
@RequestMapping("/user")
public class CpbUsersController {
    @Autowired
    CpbUsersService cpbUsersService;

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
        CpbUsers cpbUser = new CpbUsers(usersPhone, usersPassword);
        cpbUsersService.signup(cpbUser);
        if (cpbUser != null) {
            return new RespBean("success", "注册成功");
        } else {
            return new RespBean("error", "注册失败");
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
