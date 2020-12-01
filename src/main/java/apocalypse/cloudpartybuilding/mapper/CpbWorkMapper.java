package apocalypse.cloudpartybuilding.mapper;

import apocalypse.cloudpartybuilding.pojo.CpbWork;

import java.util.List;

public interface CpbWorkMapper {
    int insert(CpbWork record);

    int insertSelective(CpbWork record);

    List<CpbWork> selectByAll();

    CpbWork selectByPrimaryKey(String id);
}