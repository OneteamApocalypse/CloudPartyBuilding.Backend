package apocalypse.cloudpartybuilding.controller;

import apocalypse.cloudpartybuilding.pojo.CpbNews;
import apocalypse.cloudpartybuilding.pojo.CpbWork;
import apocalypse.cloudpartybuilding.service.CpbWorkService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author skyrocketing Hong
 * @Date 2020-11-23 023 16:02:12
 * @Version 1.0
 */
@Slf4j
@RestController//返回的数据都是json
@RequestMapping("/work")
public class CpbWorkController {
    @Autowired
    CpbWorkService cpbWorkService;

    @RequestMapping(value ="/query",method = RequestMethod.GET)
    public CpbWork queryWorkById(@RequestParam("id")String id){
        return cpbWorkService.selectByPrimaryKey(id);
    }
}
