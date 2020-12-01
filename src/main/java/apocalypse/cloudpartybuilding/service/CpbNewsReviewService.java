package apocalypse.cloudpartybuilding.service;

import apocalypse.cloudpartybuilding.pojo.CpbNewsReview;

import java.util.List;

public interface CpbNewsReviewService {
    public int updateByPrimaryKeySelective(CpbNewsReview record);
    public CpbNewsReview selectByPrimaryKey(Integer id);
    public CpbNewsReview selectByNewsid(String news_id);
    public List<CpbNewsReview> selectUnreviewedAll();
    public int updateStatusByPrimaryKeySelective(Integer id);
    public List<CpbNewsReview> newsReviewStatusSelectAll();
}
