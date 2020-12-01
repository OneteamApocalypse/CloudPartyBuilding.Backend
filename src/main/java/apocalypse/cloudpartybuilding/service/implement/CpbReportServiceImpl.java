package apocalypse.cloudpartybuilding.service.implement;

import apocalypse.cloudpartybuilding.mapper.CpbReportMapper;
import apocalypse.cloudpartybuilding.mapper.CpbUsersMapper;
import apocalypse.cloudpartybuilding.pojo.CpbReport;
import apocalypse.cloudpartybuilding.service.CpbReportService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Author skyrocketing Hong
 * @Date 2020-11-27 027 15:11:53
 * @Version 1.0
 */
@Slf4j
@Service
public class CpbReportServiceImpl implements CpbReportService {
    @Resource
    private CpbReportMapper cpbReportMapper;

    @Override
    public CpbReport selectByPrimaryKey(int id) {
        return cpbReportMapper.selectByPrimaryKey(id);
    }

    @Override
    public int addReport(CpbReport cpbReport) {
        return cpbReportMapper.insert(cpbReport);
    }
}
