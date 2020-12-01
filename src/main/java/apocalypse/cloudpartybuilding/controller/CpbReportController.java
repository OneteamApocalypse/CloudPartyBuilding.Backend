package apocalypse.cloudpartybuilding.controller;

import apocalypse.cloudpartybuilding.pojo.CpbReport;
import apocalypse.cloudpartybuilding.pojo.CpbWork;
import apocalypse.cloudpartybuilding.service.CpbReportService;
import apocalypse.cloudpartybuilding.util.RespBean;
import cn.hutool.core.date.DateUnit;
import cn.hutool.core.date.DateUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.Map;
import java.util.TimeZone;

/**
 * @Author skyrocketing Hong
 * @Date 2020-11-27 027 15:09:40
 * @Version 1.0
 */
@Slf4j
@RestController//返回的数据都是json
@RequestMapping("/report")
public class CpbReportController {
    @Autowired
    CpbReportService cpbReportService;

    @RequestMapping(value = "/query", method = RequestMethod.GET)
    public CpbReport GetReportById(@RequestParam("id") String id) {
        return cpbReportService.selectByPrimaryKey(Integer.parseInt(id));
    }

    @PostMapping(value = "/insert", produces = "application/json;charset=utf-8;")
    public RespBean insert(@RequestBody Map<String, String> jsonParam) {
        Integer id = Integer.parseInt(jsonParam.get("id"));
        String name = jsonParam.get("name");
        String content = jsonParam.get("content");

        CpbReport cpbReport = new CpbReport(id, name, content);

        int status = cpbReportService.addReport(cpbReport);
        if (status == 0) {
            return new RespBean("error", "添加失败");
        } else {
            return new RespBean("success", "添加成功");
        }
    }
}
