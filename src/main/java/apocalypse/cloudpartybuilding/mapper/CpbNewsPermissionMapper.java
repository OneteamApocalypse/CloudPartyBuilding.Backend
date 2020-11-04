package apocalypse.cloudpartybuilding.mapper;

import apocalypse.cloudpartybuilding.pojo.CpbNewsPermission;

public interface CpbNewsPermissionMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CpbNewsPermission record);

    int insertSelective(CpbNewsPermission record);

    CpbNewsPermission selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CpbNewsPermission record);

    int updateByPrimaryKey(CpbNewsPermission record);
}