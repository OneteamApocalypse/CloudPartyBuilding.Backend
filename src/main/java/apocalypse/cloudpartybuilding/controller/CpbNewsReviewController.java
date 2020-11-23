package apocalypse.cloudpartybuilding.controller;

import apocalypse.cloudpartybuilding.pojo.CpbNewsReview;
import apocalypse.cloudpartybuilding.service.CpbNewsReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController//返回的数据都是json
@RequestMapping("/newsReview")
public class CpbNewsReviewController {
    @Autowired
    private CpbNewsReviewService cpbNewsReviewService;
//    public void test01(HttpServletRequest request, HttpServletResponse response,String path) throws ServletException, IOException {
//        //请求转发
//        request.getRequestDispatcher(path).forward(request, response);
//    }
    //根据id查询审批
    @RequestMapping(value ="/selectByPrimaryKey",method = RequestMethod.GET)
    public CpbNewsReview selectNewsReview(@RequestParam("id")int id){
        return cpbNewsReviewService.selectByPrimaryKey(id);
    }
    //显示未审核的新闻
    @RequestMapping(value ="/selectUnreviewedById",method = RequestMethod.GET)
    public List<CpbNewsReview> selectNewsReviewUnreviewed(){
        return cpbNewsReviewService.selectUnreviewedAll();
    }
//    @RequestMapping(value ="/updateStatusByPrimaryKeySelective",method = RequestMethod.GET)
//    public ModelAndView updateStatusByPrimaryKeySelective(@RequestParam("id")int id){
//        cpbNewsReviewService.updateStatusByPrimaryKeySelective(id);
//        ModelAndView mv = new ModelAndView();
//        mv.setViewName("forward:/newsReview/updateByPrimaryKeySelective");
//        return mv;
//    }
    //审批
    @RequestMapping(value = "/updateByPrimaryKeySelective",method = RequestMethod.POST)
    public int insertSelective(@RequestBody CpbNewsReview cpbNewsReview) {
        cpbNewsReviewService.updateStatusByPrimaryKeySelective(cpbNewsReview.getId());
        return cpbNewsReviewService.updateByPrimaryKeySelective(cpbNewsReview);
    }

}
