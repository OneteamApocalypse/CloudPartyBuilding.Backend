package apocalypse.cloudpartybuilding.controller;

import apocalypse.cloudpartybuilding.pojo.CpbUsers;
import apocalypse.cloudpartybuilding.service.CpbUsersService;
import apocalypse.cloudpartybuilding.util.CaptchaGenerator;
import apocalypse.cloudpartybuilding.util.RespBean;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.OutputStream;
import java.util.Map;
@Slf4j
@RestController//返回的数据都是json
@RequestMapping("/user")
public class CpbUsersController {
    @Autowired
    CpbUsersService cpbUsersService;

    Object[] captcha = CaptchaGenerator.newBuilder()
            .setWidth(120)   //设置图片的宽度
            .setHeight(35)   //设置图片的高度
            .setSize(6)      //设置字符的个数
            .setLines(10)    //设置干扰线的条数
            .setFontSize(25) //设置字体的大小
            .setTilt(true)   //设置是否需要倾斜
            .setBackgroundColor(Color.WHITE) //设置验证码的背景颜色
            .build()         //构建VerifyUtil项目
            .createImage();  //生成图片


    @RequestMapping(value = "/selectid", method = RequestMethod.GET)
    public CpbUsers selectidUser(@RequestParam("id")int id) {
        return cpbUsersService.selectByPrimaryKey(id);
    }

    //验证码
    @GetMapping("/captcha")
    public void DefaultCaptcha(HttpServletResponse httpServletResponse) throws Exception {
        BufferedImage image = (BufferedImage) captcha[1];
        httpServletResponse.setContentType("image/png");
        OutputStream os = httpServletResponse.getOutputStream();
        ImageIO.write(image, "png", os);
    }

    //注册
    @PostMapping(value = "/signup", produces = "application/json;charset=utf-8;")
    public RespBean SignUp(@RequestBody Map<String, String> jsonParam, HttpSession session) {
        Integer usersPhone = Integer.parseInt(jsonParam.get("phone"));
        String usersPassword = jsonParam.get("password");
        String username = jsonParam.get("username");
        //String captchaCode = jsonParam.get("captcha");
        CpbUsers cpbUser = new CpbUsers(username, usersPassword, usersPhone);
        log.warn(cpbUser.toString());
        try {
            int signup = cpbUsersService.signup(cpbUser);
            if (signup == 0) {

                    return new RespBean("error", "注册失败");

            } else {
                return new RespBean("success", "注册成功");
            }
        } catch (Exception e) {
            return new RespBean("error", "事务错误，账号存在");
        }
    }

    //登录
    @PostMapping(value = "/signin", produces = "application/json;charset=utf-8;")
    public RespBean SingIn(@RequestBody Map<String, String> jsonParam, HttpSession session) {
        String usersPhone = jsonParam.get("phone");
        String usersPassword = jsonParam.get("password");
       // String captchaCode = jsonParam.get("captcha");
        CpbUsers cpbUser = cpbUsersService.signin(usersPhone, usersPassword);


            session.setAttribute("loginUser", cpbUser.getUserName());
            session.setAttribute("loginUserId", cpbUser.getUserId());
            //session过期时间设置为7200秒 即两小时
            session.setMaxInactiveInterval(60 * 60 * 2);
            return new RespBean("success", "登录成功");

    }
}
