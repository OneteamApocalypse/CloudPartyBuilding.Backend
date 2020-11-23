package apocalypse.cloudpartybuilding.controller;


import apocalypse.cloudpartybuilding.pojo.CpbNews;
import apocalypse.cloudpartybuilding.service.CpbNewsService;
import apocalypse.cloudpartybuilding.service.CpbUsersService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController//返回的数据都是json
@RequestMapping("/news")
public class CpbNewsController {
    @Autowired
    CpbNewsService cpbNewsService;

    //根据id查询新闻
    @RequestMapping(value ="/query",method = RequestMethod.GET)
    public CpbNews selectidNews(@RequestParam("id")String id){
        return cpbNewsService.selectByPrimaryKey(id);
    }

    //查询所有
    @RequestMapping(value = "/query_all",method = RequestMethod.GET)
    public PageInfo<CpbNews> selectAllNews(@RequestParam(defaultValue = "1") int pageNo, @RequestParam(defaultValue = "3") int pageSize){
        PageHelper.startPage(pageNo,pageSize);
        List<CpbNews> list = cpbNewsService.selectAllNews();
        PageInfo<CpbNews> pageInfo=new PageInfo(list);
        return pageInfo;
    }
    //编辑新闻
    @RequestMapping(value = "/insert",method = RequestMethod.POST)
    public int insertSelective(@RequestBody CpbNews cpbNews){
        CpbUsersService cpbUsersService;
        return cpbNewsService.insertSelective(cpbNews);
    }

}
