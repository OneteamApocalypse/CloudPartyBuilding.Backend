package apocalypse.cloudpartybuilding.controller;


import apocalypse.cloudpartybuilding.pojo.CpbNews;
import apocalypse.cloudpartybuilding.pojo.CpbNewsComment;
import apocalypse.cloudpartybuilding.service.CpbNewsCommentService;
import apocalypse.cloudpartybuilding.service.CpbNewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController//返回的数据都是json
@RequestMapping("/new")
public class CpbNewsController {
    @Autowired
    CpbNewsService cpbNewsService;

    //根据id查询新闻
    @RequestMapping(value ="/selectByPrimaryKey",method = RequestMethod.GET)
    public CpbNews selectidNews(@RequestParam("id")String id){
        return cpbNewsService.selectByPrimaryKey(id);
    }
    //查询所有
    @RequestMapping(value = "/selectByAll",method = RequestMethod.GET)
    public List<CpbNews> selectAllNews(){
        return cpbNewsService.selectAllNews();
    }
    //编辑新闻
    @RequestMapping(value = "/insertSelective",method = RequestMethod.POST)
    public int insertSelective(@RequestBody CpbNews cpbNews){
        return cpbNewsService.insertSelective(cpbNews);
    }

}
