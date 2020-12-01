package apocalypse.cloudpartybuilding.controller.Test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@Controller
@RequestMapping("/fileg")
public class filesmywebcontroller {
    @RequestMapping("/flogin")
    public String demo1() {
        return "flogin";
    }
    @RequestMapping("/filerest")
    public String demo2() {
        return "file";
    }

}
