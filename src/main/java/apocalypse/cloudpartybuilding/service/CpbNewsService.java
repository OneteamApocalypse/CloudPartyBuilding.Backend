package apocalypse.cloudpartybuilding.service;

import apocalypse.cloudpartybuilding.pojo.CpbNews;

import java.util.List;

public interface CpbNewsService {
    CpbNews selectByPrimaryKey(String newsId);

    List<CpbNews> selectAllNews();

    int insertSelective(CpbNews record);
}
