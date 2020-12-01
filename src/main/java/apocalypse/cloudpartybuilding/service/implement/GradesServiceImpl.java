package apocalypse.cloudpartybuilding.service.implement;

import apocalypse.cloudpartybuilding.mapper.GradesMapper;
import apocalypse.cloudpartybuilding.pojo.Grades;
import apocalypse.cloudpartybuilding.service.GradesService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Slf4j
@Service
public class GradesServiceImpl implements GradesService {
    @Resource
    GradesMapper gradesMapper;
    @Override
    public List<Grades> selectByAll() {
        return gradesMapper.selectByAll();
    }

    @Override
    public int insertSelective(Grades record) {
        return gradesMapper.insertSelective(record);
    }
}
