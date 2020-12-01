package apocalypse.cloudpartybuilding.controller;

import apocalypse.cloudpartybuilding.pojo.CpbNews;
import apocalypse.cloudpartybuilding.pojo.Grades;
import apocalypse.cloudpartybuilding.service.GradesService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController//返回的数据都是json
@RequestMapping("/grades")
public class GradesController {
    @Autowired
    GradesService gradesService;
    @RequestMapping(value = "/insertAll",method = RequestMethod.POST)
    public int insertAll(@RequestBody Grades Grades){
        return gradesService.insertSelective(Grades);
    }
    //查询所有
    @RequestMapping(value = "/query_all",method = RequestMethod.GET)
    public PageInfo<Grades> selectAllNews(@RequestParam(defaultValue = "1") int pageNo, @RequestParam(defaultValue = "3") int pageSize){
        PageHelper.startPage(pageNo,pageSize);
        List<Grades> list = gradesService.selectByAll();
        PageInfo<Grades> pageInfo=new PageInfo(list);
        return pageInfo;
    }

}
