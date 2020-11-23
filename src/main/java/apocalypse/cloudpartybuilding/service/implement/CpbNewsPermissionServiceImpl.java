package apocalypse.cloudpartybuilding.service.implement;

import apocalypse.cloudpartybuilding.mapper.CpbNewsPermissionMapper;
import apocalypse.cloudpartybuilding.pojo.CpbNewsPermission;
import apocalypse.cloudpartybuilding.service.CpbNewsPermissionService;

import javax.annotation.Resource;

public class CpbNewsPermissionServiceImpl implements CpbNewsPermissionService {
    @Resource
    private CpbNewsPermissionMapper cpbNewsPermissionMapper;
    @Override
    public CpbNewsPermission selectByForeignKey(Integer userID) {
        return cpbNewsPermissionMapper.selectByForeignKey(userID);
    }
}
