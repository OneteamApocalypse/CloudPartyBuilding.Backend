package apocalypse.cloudpartybuilding.service.implement;

import apocalypse.cloudpartybuilding.mapper.CpbNewsCommentMapper;
import apocalypse.cloudpartybuilding.pojo.CpbNewsComment;
import apocalypse.cloudpartybuilding.service.CpbNewsCommentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class CpbNewsCommentServiceImpl implements CpbNewsCommentService {
    @Resource
    private CpbNewsCommentMapper cpbNewsCommentMapper;

    @Override
    public int insertSelective(CpbNewsComment record) {
        return cpbNewsCommentMapper.insertSelective(record);
    }

    @Override
    public List<CpbNewsComment> selectByNewsId(String news_id) {
        return cpbNewsCommentMapper.selectByNewsId(news_id);
    }
}
