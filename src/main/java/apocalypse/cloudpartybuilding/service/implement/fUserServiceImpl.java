package apocalypse.cloudpartybuilding.service.implement;

import apocalypse.cloudpartybuilding.mapper.fUserMapper;
import apocalypse.cloudpartybuilding.pojo.tUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class fUserServiceImpl {
    @Autowired
    private fUserMapper fUserMapper;

    public tUser login(String username, String password) {
        return fUserMapper.login(username, password);
    }

}
