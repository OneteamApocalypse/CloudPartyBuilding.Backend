package apocalypse.cloudpartybuilding.mapper;

import apocalypse.cloudpartybuilding.pojo.CpbReport;

public interface CpbReportMapper {
    int deleteByPrimaryKey(Integer reportId);

    int insert(CpbReport record);

    int insertSelective(CpbReport record);

    CpbReport selectByPrimaryKey(Integer reportId);

    int updateByPrimaryKeySelective(CpbReport record);

    int updateByPrimaryKey(CpbReport record);
}