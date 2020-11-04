package apocalypse.cloudpartybuilding.service.implement;


import apocalypse.cloudpartybuilding.mapper.CpbUsersMapper;
import apocalypse.cloudpartybuilding.pojo.CpbUsers;
import apocalypse.cloudpartybuilding.service.CpbUsersService;
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
}
