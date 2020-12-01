package apocalypse.cloudpartybuilding.mapper;

import apocalypse.cloudpartybuilding.pojo.CpbNews;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CpbNewsMapper {
    int deleteByPrimaryKey(String id);

    int insert(CpbNews record);

    int insertSelective(CpbNews record);

    CpbNews selectByPrimaryKey(String id);

    List<CpbNews> selectByAll();

    int updateByPrimaryKeySelective(CpbNews record);

    int updateByPrimaryKey(CpbNews record);

}