package apocalypse.cloudpartybuilding.controller.Test;

import apocalypse.cloudpartybuilding.pojo.UserFile;
import apocalypse.cloudpartybuilding.pojo.tUser;
import apocalypse.cloudpartybuilding.service.implement.UserFileServiceImpl;
import apocalypse.cloudpartybuilding.service.implement.fUserServiceImpl;
import org.apache.commons.io.FilenameUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.ResourceUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

@Controller
@RequestMapping("/fuser")
public class fIndexController {
    @Autowired
    private fUserServiceImpl fUserService;
    private UserFileServiceImpl userFileService;
    @GetMapping("/login")
    public String login(String username, String password, HttpSession session) {
        tUser login = fUserService.login(username, password);
        if (login != null) {
            session.setAttribute("user", login); // 用户存在
            System.out.println("登录成功！");
            return "forward:/file/showAll";
        } else {
            return "forward:/fileg/flogin"; // 没有该用户, 跳转回登录界面
        }
    }
}
