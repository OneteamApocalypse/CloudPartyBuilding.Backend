package apocalypse.cloudpartybuilding.controller;


import apocalypse.cloudpartybuilding.pojo.CpbUsers;
import apocalypse.cloudpartybuilding.service.CpbUsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController//返回的数据都是json
@RequestMapping("/user")
public class CpbUsersController {
    @Autowired
    CpbUsersService cpbUsersService;
    @RequestMapping(value ="/selectid",method = RequestMethod.GET)
    public CpbUsers selectidUser(){
        return cpbUsersService.selectByPrimaryKey(1);
    }
}
