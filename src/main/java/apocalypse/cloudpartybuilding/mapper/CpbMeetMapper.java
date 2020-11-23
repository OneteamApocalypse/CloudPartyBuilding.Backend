package apocalypse.cloudpartybuilding.mapper;

import apocalypse.cloudpartybuilding.pojo.CpbMeet;

public interface CpbMeetMapper {
    int deleteByPrimaryKey(String meetId);

    int insert(CpbMeet record);

    int insertSelective(CpbMeet record);

    CpbMeet selectByPrimaryKey(String meetId);

    int updateByPrimaryKeySelective(CpbMeet record);

    int updateByPrimaryKey(CpbMeet record);
}