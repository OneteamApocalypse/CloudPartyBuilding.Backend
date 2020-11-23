package apocalypse.cloudpartybuilding.mapper;

import apocalypse.cloudpartybuilding.pojo.CpbMeeting;

import java.util.List;

public interface CpbMeetingMapper {
    int deleteByPrimaryKey(String meetingId);

    int insert(CpbMeeting record);

    int insertSelective(CpbMeeting record);

    CpbMeeting selectByPrimaryKey(String meetingId);

    List<CpbMeeting> selectByAll();

    int updateByPrimaryKeySelective(CpbMeeting record);

    int updateByPrimaryKey(CpbMeeting record);
}