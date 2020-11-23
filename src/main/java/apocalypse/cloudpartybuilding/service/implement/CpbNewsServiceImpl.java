package apocalypse.cloudpartybuilding.service.implement;

import apocalypse.cloudpartybuilding.mapper.CpbNewsMapper;
import apocalypse.cloudpartybuilding.pojo.CpbNews;
import apocalypse.cloudpartybuilding.service.CpbNewsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class CpbNewsServiceImpl implements CpbNewsService {
    @Resource
    private CpbNewsMapper cpbNewsMapper;
    @Override
    public CpbNews selectByPrimaryKey(String newsId) {
        return cpbNewsMapper.selectByPrimaryKey(newsId);
    }

    @Override
    public List<CpbNews> selectAllNews() {
        return cpbNewsMapper.selectByAll();
    }

    @Override
    public int insertSelective(CpbNews record) {
        return cpbNewsMapper.insertSelective(record);
    }
}
