package apocalypse.cloudpartybuilding.mapper;

import apocalypse.cloudpartybuilding.pojo.Report;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ReportMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Report record);

    int insertSelective(Report record);

    Report selectByPrimaryKey(Integer id);
    List<Report>selectByType();

    List<Report>selectByAll();

    int updateByPrimaryKeySelective(Report record);

    int updateByPrimaryKey(Report record);
}