package apocalypse.cloudpartybuilding.service;

import apocalypse.cloudpartybuilding.pojo.CpbNewsComment;

import java.util.List;

public interface CpbNewsCommentService {
    public int insertSelective(CpbNewsComment record);
    public List<CpbNewsComment> selectByNewsId(String news_id);
}
