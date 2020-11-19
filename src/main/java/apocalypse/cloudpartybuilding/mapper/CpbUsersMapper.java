package apocalypse.cloudpartybuilding.mapper;

import apocalypse.cloudpartybuilding.pojo.CpbUsers;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;


public interface CpbUsersMapper {
    int deleteByPrimaryKey(Integer userId);

    int insert(CpbUsers record);

    int insertSelective(CpbUsers record);

    CpbUsers selectByPrimaryKey(Integer userId);

    int updateByPrimaryKeySelective(CpbUsers record);

    int updateByPrimaryKey(CpbUsers record);

    CpbUsers signin(String usersPhone, String usersPassword);

    int signup(CpbUsers cpbUsers);

    @Select("select count(*) from cpb_users where users_phone = #{phone}")
    int countuserphone(@Param("phone")Integer phone);
}