package apocalypse.cloudpartybuilding.service;

import apocalypse.cloudpartybuilding.pojo.CpbMeeting;

import java.util.List;

public interface CpbMeetingService {
    public CpbMeeting selectByPrimaryKey(String meetingId);
    public List<CpbMeeting> selectByAll();
    public int insertSelective(CpbMeeting record);
}
