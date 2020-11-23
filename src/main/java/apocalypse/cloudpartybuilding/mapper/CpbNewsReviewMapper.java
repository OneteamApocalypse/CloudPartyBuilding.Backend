package apocalypse.cloudpartybuilding.mapper;

import apocalypse.cloudpartybuilding.pojo.CpbNewsReview;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CpbNewsReviewMapper {
    int deleteByPrimaryKey(Integer id);

    int updateStatusByPrimaryKeySelective(Integer id);

    int insert(CpbNewsReview record);

    int insertSelective(CpbNewsReview record);

    CpbNewsReview selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CpbNewsReview record);

    int updateByPrimaryKey(CpbNewsReview record);

    CpbNewsReview selectByNewsid(String news_id);

    List<CpbNewsReview> selectUnreviewedAll();
}