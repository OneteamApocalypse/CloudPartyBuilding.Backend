package apocalypse.cloudpartybuilding.service;

import apocalypse.cloudpartybuilding.pojo.Grades;

import java.util.List;

public interface GradesService {
    List<Grades>selectByAll();
    int insertSelective(Grades record);
}
