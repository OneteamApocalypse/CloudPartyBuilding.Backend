package apocalypse.cloudpartybuilding.controller;

import apocalypse.cloudpartybuilding.pojo.Report;
import apocalypse.cloudpartybuilding.service.ReportService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController//返回的数据都是json
@RequestMapping("/report")
public class ReportController {
    @Autowired
    ReportService reportService;
    @RequestMapping(value = "/insertAll",method = RequestMethod.POST)
    public int insertAll(@RequestBody Report report){
        return reportService.insertSelective(report);
    }
    //查询所有
    @RequestMapping(value = "/query_all",method = RequestMethod.GET)
    public PageInfo<Report> selectAllNews(@RequestParam(defaultValue = "1") int pageNo, @RequestParam(defaultValue = "3") int pageSize){
        PageHelper.startPage(pageNo,pageSize);
        List<Report> list = reportService.selectByAll();
        PageInfo<Report> pageInfo=new PageInfo(list);
        return pageInfo;
    }
    @RequestMapping(value ="/query",method = RequestMethod.GET)
    public Report selectByPrimaryKey(@RequestParam("id")Integer id){
        return reportService.selectByPrimaryKey(id);
    }

    @RequestMapping(value = "/updateAll",method = RequestMethod.POST)
    public int updateAll(@RequestBody Report report){
        return reportService.updateByPrimaryKeySelective(report);
    }

    @RequestMapping(value ="/queryType",method = RequestMethod.GET)
    public PageInfo<Report> selectByType(@RequestParam(defaultValue = "1") int pageNo, @RequestParam(defaultValue = "3") int pageSize){
        PageHelper.startPage(pageNo,pageSize);
        List<Report> list = reportService.selectByType();
        PageInfo<Report> pageInfo=new PageInfo(list);
        return pageInfo;
    }

}
