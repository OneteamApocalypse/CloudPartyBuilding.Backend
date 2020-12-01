package apocalypse.cloudpartybuilding.service;

import apocalypse.cloudpartybuilding.pojo.Report;

import java.util.List;

public interface ReportService {
    List<Report> selectByAll();
    int insertSelective(Report record);
    int updateByPrimaryKeySelective(Report record);
    Report selectByPrimaryKey(Integer id);
    List<Report>selectByType();
}
