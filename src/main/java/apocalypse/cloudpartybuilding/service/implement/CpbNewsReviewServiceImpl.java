package apocalypse.cloudpartybuilding.service.implement;

import apocalypse.cloudpartybuilding.mapper.CpbNewsReviewMapper;
import apocalypse.cloudpartybuilding.pojo.CpbNewsReview;
import apocalypse.cloudpartybuilding.service.CpbNewsReviewService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class CpbNewsReviewServiceImpl implements CpbNewsReviewService {
    @Resource
    private CpbNewsReviewMapper cpbNewsReviewMapper;
    @Override
    public int updateByPrimaryKeySelective(CpbNewsReview record) {
        return cpbNewsReviewMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public CpbNewsReview selectByPrimaryKey(Integer id) {
        return cpbNewsReviewMapper.selectByPrimaryKey(id);
    }

    @Override
    public CpbNewsReview selectByNewsid(String news_id) {
        return cpbNewsReviewMapper.selectByNewsid(news_id);
    }

    @Override
    public List<CpbNewsReview> selectUnreviewedAll() {
        return cpbNewsReviewMapper.selectUnreviewedAll();
    }

    @Override
    public int updateStatusByPrimaryKeySelective(Integer id) {
        return cpbNewsReviewMapper.updateStatusByPrimaryKeySelective(id);
    }

    @Override
    public List<CpbNewsReview> newsReviewStatusSelectAll() {
        return cpbNewsReviewMapper.newsReviewStatusSelectAll();
    }
}
