package apocalypse.cloudpartybuilding.mapper;

import apocalypse.cloudpartybuilding.pojo.CpbUsers;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CpbUsersMapper {
    int deleteByPrimaryKey(Integer userId);

    int insert(CpbUsers record);

    int insertSelective(CpbUsers record);

    CpbUsers selectByPrimaryKey(Integer userId);

    int updateByPrimaryKeySelective(CpbUsers record);

    int updateByPrimaryKey(CpbUsers record);

    CpbUsers signin(String usersPhone, String usersPassword);

    CpbUsers signup(CpbUsers cpbUsers);
}