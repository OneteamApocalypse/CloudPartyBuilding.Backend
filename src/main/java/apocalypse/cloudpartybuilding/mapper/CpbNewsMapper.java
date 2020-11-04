package apocalypse.cloudpartybuilding.mapper;

import apocalypse.cloudpartybuilding.pojo.CpbNews;

public interface CpbNewsMapper {
    int deleteByPrimaryKey(String id);

    int insert(CpbNews record);

    int insertSelective(CpbNews record);

    CpbNews selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(CpbNews record);

    int updateByPrimaryKey(CpbNews record);
}