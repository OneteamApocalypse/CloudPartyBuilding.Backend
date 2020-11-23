package apocalypse.cloudpartybuilding.mapper;

import apocalypse.cloudpartybuilding.pojo.CpbWork;

public interface CpbWorkMapper {
    int insert(CpbWork record);

    int insertSelective(CpbWork record);
}