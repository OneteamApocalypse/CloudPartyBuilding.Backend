package apocalypse.cloudpartybuilding.service;

import apocalypse.cloudpartybuilding.pojo.CpbNewsPermission;

public interface CpbNewsPermissionService  {

    public CpbNewsPermission selectByForeignKey(Integer userID);
}
