package apocalypse.cloudpartybuilding.mapper;

import apocalypse.cloudpartybuilding.pojo.CpbNewsPermission;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CpbNewsPermissionMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CpbNewsPermission record);

    int insertSelective(CpbNewsPermission record);

    CpbNewsPermission selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CpbNewsPermission record);

    int updateByPrimaryKey(CpbNewsPermission record);

    CpbNewsPermission selectByForeignKey(Integer userId);
}