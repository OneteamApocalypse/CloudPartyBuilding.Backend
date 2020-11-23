package apocalypse.cloudpartybuilding.service.implement;

import apocalypse.cloudpartybuilding.mapper.CpbUsersMapper;
import apocalypse.cloudpartybuilding.pojo.CpbUsers;
import apocalypse.cloudpartybuilding.service.CpbUsersService;
import cn.hutool.crypto.SecureUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Slf4j
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
    //注册
    @Transactional
    @Override
    public int signup(CpbUsers cpbUsers) {
        String userPasswordEncrypt = SecureUtil.sha256(cpbUsers.getUsersPassword());
        int count = cpbUsersMapper.countuserphone(cpbUsers.getUsersPhone());
        log.warn(String.valueOf(count));
        if(count!=0){
            log.warn("错误：电话号码已经存在了");
            throw new RuntimeException("错误：电话号码已经存在了");
        }else{
            //不存在重复电话号码 //可注册
            log.warn("电话号码不存在了");
            return cpbUsersMapper.signup(cpbUsers);
        }
    }


}
