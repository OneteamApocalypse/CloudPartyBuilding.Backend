package apocalypse.cloudpartybuilding.controller;

import apocalypse.cloudpartybuilding.mapper.CpbNewsPermissionMapper;
import apocalypse.cloudpartybuilding.pojo.CpbNewsPermission;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController//返回的数据都是json
@RequestMapping("/newsPermission")
public class CpbNewsPermissionController {
    @Autowired
    private CpbNewsPermissionMapper cpbNewsPermissionMapper;
    //查询新闻权限
    @RequestMapping(value ="/selectByForeignKey",method = RequestMethod.GET)
    public CpbNewsPermission selectByForeignKey(@RequestParam("userID")int userID) {
        return cpbNewsPermissionMapper.selectByForeignKey(userID);
    }

}
