package apocalypse.cloudpartybuilding.service;

import apocalypse.cloudpartybuilding.pojo.CpbNewsPermission;

import javax.annotation.Resource;

public interface CpbNewsPermissionService  {

    public CpbNewsPermission selectByForeignKey(Integer userID);
}
