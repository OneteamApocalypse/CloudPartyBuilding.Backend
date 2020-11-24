package apocalypse.cloudpartybuilding.service.implement;

import apocalypse.cloudpartybuilding.mapper.CpbWorkMapper;
import apocalypse.cloudpartybuilding.pojo.CpbWork;
import apocalypse.cloudpartybuilding.service.CpbWorkService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

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
    public int insert(CpbWork cpbWork) {
        return cpbWorkMapper.insert(cpbWork);
    }
}
