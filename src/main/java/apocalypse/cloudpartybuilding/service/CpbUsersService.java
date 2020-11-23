package apocalypse.cloudpartybuilding.service;

import apocalypse.cloudpartybuilding.pojo.CpbUsers;

public interface CpbUsersService {
    CpbUsers selectByPrimaryKey(Integer userId);
    //登录
    CpbUsers signin(String usersPhone, String usersPassword);
    //注册
    int signup(CpbUsers cpbUsers);
    //判断电话号码是否存在
//    int countuserphone(String phone);
}
