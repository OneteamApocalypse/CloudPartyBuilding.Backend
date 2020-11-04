package apocalypse.cloudpartybuilding.mapper;

import apocalypse.cloudpartybuilding.pojo.CpbNewsComment;

public interface CpbNewsCommentMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CpbNewsComment record);

    int insertSelective(CpbNewsComment record);

    CpbNewsComment selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CpbNewsComment record);

    int updateByPrimaryKey(CpbNewsComment record);
}