package apocalypse.cloudpartybuilding.controller;

import apocalypse.cloudpartybuilding.pojo.CpbNewsComment;
import apocalypse.cloudpartybuilding.pojo.CpbUsers;
import apocalypse.cloudpartybuilding.service.CpbNewsCommentService;
import apocalypse.cloudpartybuilding.service.CpbUsersService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController//返回的数据都是json
@RequestMapping("/newComment")
public class CpbNewsCommentController {
    @Autowired
    CpbNewsCommentService cpbNewsCommentService;
    //根据新闻id查询该新闻评论
    @RequestMapping(value = "selectByNewsId",method = RequestMethod.GET)
    public PageInfo<CpbNewsComment> selectAllNewsComment(@RequestParam(defaultValue = "1") int pageNo, @RequestParam(defaultValue = "3") int pageSize,@RequestParam("news_id")String news_id){
        PageHelper.startPage(pageNo,pageSize);
        List<CpbNewsComment> list = cpbNewsCommentService.selectByNewsId(news_id);
        //将查询到的数据封装到PageInfo对象
        PageInfo<CpbNewsComment> pageInfo=new PageInfo(list);
        return pageInfo;
    }

    //插入新闻评论
    @RequestMapping(value = "insertSelective",method = RequestMethod.POST)
    public int insertSelective(@RequestBody CpbNewsComment cpbNewsComment) {
        return cpbNewsCommentService.insertSelective(cpbNewsComment);
    }
}
