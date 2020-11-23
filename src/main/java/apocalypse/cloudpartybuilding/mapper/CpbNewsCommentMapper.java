package apocalypse.cloudpartybuilding.mapper;

import apocalypse.cloudpartybuilding.pojo.CpbNewsComment;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CpbNewsCommentMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CpbNewsComment record);

    int insertSelective(CpbNewsComment record);

    CpbNewsComment selectByPrimaryKey(Integer id);

    List<CpbNewsComment> selectByNewsId(String news_id);

    int updateByPrimaryKeySelective(CpbNewsComment record);

    int updateByPrimaryKey(CpbNewsComment record);
}