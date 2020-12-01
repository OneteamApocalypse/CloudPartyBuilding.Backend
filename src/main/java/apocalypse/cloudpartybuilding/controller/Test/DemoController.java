package apocalypse.cloudpartybuilding.controller.Test;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class DemoController {
    private static final org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(DemoController.class);

    @RequestMapping("/test1")
    public String demo() {
        log.info("log4j2-------/test接口调用成功-----------");
        return "log4j2";
    }
}
