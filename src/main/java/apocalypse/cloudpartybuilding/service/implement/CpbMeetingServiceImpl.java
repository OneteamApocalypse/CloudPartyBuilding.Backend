package apocalypse.cloudpartybuilding.service.implement;

import apocalypse.cloudpartybuilding.mapper.CpbMeetingMapper;
import apocalypse.cloudpartybuilding.pojo.CpbMeeting;
import apocalypse.cloudpartybuilding.service.CpbMeetingService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class CpbMeetingServiceImpl implements CpbMeetingService {
    @Resource
    private CpbMeetingMapper cpbMeetingMapper;
    @Override
    public CpbMeeting selectByPrimaryKey(String meetingId) {
        return cpbMeetingMapper.selectByPrimaryKey(meetingId);
    }

    @Override
    public List<CpbMeeting> selectByAll() {
        return cpbMeetingMapper.selectByAll();
    }

    @Override
    public int insertSelective(CpbMeeting record) {
        return cpbMeetingMapper.insertSelective(record);
    }
}
