package apocalypse.cloudpartybuilding.service.implement;

import apocalypse.cloudpartybuilding.mapper.ReportMapper;
import apocalypse.cloudpartybuilding.pojo.Report;
import apocalypse.cloudpartybuilding.service.ReportService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ReportServiceImpl implements ReportService {
    @Resource
    private ReportMapper reportMapper;
    @Override
    public List<Report> selectByAll() {
        return reportMapper.selectByAll();
    }

    @Override
    public int insertSelective(Report record) {
        return reportMapper.insertSelective(record);
    }

    @Override
    public int updateByPrimaryKeySelective(Report record) {
        return reportMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public Report selectByPrimaryKey(Integer id) {
        return reportMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<Report> selectByType() {
        return reportMapper.selectByType();
    }
}
