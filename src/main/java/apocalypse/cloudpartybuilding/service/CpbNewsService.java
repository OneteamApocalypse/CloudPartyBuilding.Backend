package apocalypse.cloudpartybuilding.service;

import apocalypse.cloudpartybuilding.pojo.CpbNews;

import java.util.List;

public interface CpbNewsService {
    public CpbNews selectByPrimaryKey(String newsId);
    public List<CpbNews> selectAllNews();
    public int insertSelective(CpbNews record);
}
