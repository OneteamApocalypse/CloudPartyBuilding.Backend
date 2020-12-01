package apocalypse.cloudpartybuilding.service.implement;

import apocalypse.cloudpartybuilding.mapper.CpbWorkMapper;
import apocalypse.cloudpartybuilding.pojo.CpbWork;
import apocalypse.cloudpartybuilding.service.CpbWorkService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author skyrocketing Hong
 * @Date 2020-11-23 023 16:12:51
 * @Version 1.0
 */

@Slf4j
@Service
public class CpbWorkServiceImpl implements CpbWorkService {
    @Resource
    CpbWorkMapper cpbWorkMapper;

    @Override
    public CpbWork selectByPrimaryKey(String id) {
        return cpbWorkMapper.selectByPrimaryKey(id);
    }

    @Override
    public int insertSelective(CpbWork record) {
        return cpbWorkMapper.insertSelective(record);
    }

    @Override
    public int insert(CpbWork cpbWork) {
        return cpbWorkMapper.insert(cpbWork);
    }

    @Override
    public List<CpbWork> selectByAll() {
        return cpbWorkMapper.selectByAll();
    }

}
