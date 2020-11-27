package apocalypse.cloudpartybuilding.service;

import apocalypse.cloudpartybuilding.pojo.CpbReport;

/**
 * @Author skyrocketing Hong
 * @Date 2020-11-27 027 15:10:26
 * @Version 1.0
 */
public interface CpbReportService {
    CpbReport selectByPrimaryKey(int id);

    int addReport(CpbReport cpbReport);
}
