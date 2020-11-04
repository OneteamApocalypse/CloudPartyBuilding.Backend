package apocalypse.cloudpartybuilding.mapper;

import apocalypse.cloudpartybuilding.pojo.CpbNewsReview;

public interface CpbNewsReviewMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CpbNewsReview record);

    int insertSelective(CpbNewsReview record);

    CpbNewsReview selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CpbNewsReview record);

    int updateByPrimaryKey(CpbNewsReview record);
}