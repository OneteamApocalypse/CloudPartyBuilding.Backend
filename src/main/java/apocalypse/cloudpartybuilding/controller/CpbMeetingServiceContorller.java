package apocalypse.cloudpartybuilding.controller;

import apocalypse.cloudpartybuilding.pojo.CpbMeeting;
import apocalypse.cloudpartybuilding.service.CpbMeetingService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController//返回的数据都是json
@RequestMapping("/meeting")
public class CpbMeetingServiceContorller {
    @Autowired
    CpbMeetingService cpbMeetingService;
    //分页查询所有会议
    @RequestMapping(value = "/selectByAll",method = RequestMethod.GET)
    public PageInfo<CpbMeeting> selectByAll(@RequestParam(defaultValue = "1") int pageNo, @RequestParam(defaultValue = "3") int pageSize){
        PageHelper.startPage(pageNo,pageSize);
        List<CpbMeeting> list = cpbMeetingService.selectByAll();
        PageInfo<CpbMeeting> pageInfo=new PageInfo(list);
        return pageInfo;
    }
    @RequestMapping(value = "/insertSelective",method = RequestMethod.POST)
    public int insertSelective(@RequestBody CpbMeeting cpbMeeting){
        return cpbMeetingService.insertSelective(cpbMeeting);
    }
}
