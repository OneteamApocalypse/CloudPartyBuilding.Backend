package apocalypse.cloudpartybuilding.service.implement;

import apocalypse.cloudpartybuilding.mapper.CpbUsersMapper;
import apocalypse.cloudpartybuilding.pojo.CpbUsers;
import apocalypse.cloudpartybuilding.service.CpbUsersService;
import cn.hutool.crypto.SecureUtil;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class CpbUsersServiceImp implements CpbUsersService {
    @Resource
    private CpbUsersMapper cpbUsersMapper;

    @Override
    public CpbUsers selectByPrimaryKey(Integer userId) {
        return cpbUsersMapper.selectByPrimaryKey(userId);
    }

    @Override
    public CpbUsers signin(String usersPhone, String usersPassword) {
        String userPasswordEncrypt = SecureUtil.sha256(usersPassword);
        return cpbUsersMapper.signin(usersPhone, userPasswordEncrypt);
    }

    @Override
    public CpbUsers signup(CpbUsers cpbUsers) {
        String userPasswordEncrypt = SecureUtil.sha256(cpbUsers.getUsersPassword());
        return cpbUsersMapper.signup(cpbUsers);
    }
}
