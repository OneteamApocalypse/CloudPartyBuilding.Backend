package apocalypse.cloudpartybuilding.controller;

import apocalypse.cloudpartybuilding.pojo.CpbNews;
import apocalypse.cloudpartybuilding.pojo.CpbWork;
import apocalypse.cloudpartybuilding.service.CpbWorkService;
import apocalypse.cloudpartybuilding.util.RespBean;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

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

    //按照工作id查询
    @RequestMapping(value ="/query",method = RequestMethod.GET)
    public CpbWork queryWorkById(@RequestParam("id") String id) {
        return cpbWorkService.selectByPrimaryKey(id);
    }

    //添加工作
    @PostMapping(value = "/insert", produces = "application/json;charset=utf-8;")
    public RespBean insert(@RequestBody Map<String, String> jsonParam) {
        String id = jsonParam.get("id");
        String name = jsonParam.get("name");

        CpbWork cpbWork = new CpbWork(id, name);

        int status = cpbWorkService.insert(cpbWork);
        if (status == 0) {
            return new RespBean("error", "添加失败");
        } else {
            return new RespBean("success", "添加成功");
        }
    }
}
