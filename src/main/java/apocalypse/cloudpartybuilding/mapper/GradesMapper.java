package apocalypse.cloudpartybuilding.mapper;

import apocalypse.cloudpartybuilding.pojo.Grades;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface GradesMapper {
    int deleteByPrimaryKey(Integer gradesid);

    int insert(Grades record);

    int insertSelective(Grades record);

    Grades selectByPrimaryKey(Integer gradesid);

    List<Grades>selectByAll();

    int updateByPrimaryKeySelective(Grades record);

    int updateByPrimaryKey(Grades record);
}