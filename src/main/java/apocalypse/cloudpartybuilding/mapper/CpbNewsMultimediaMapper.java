package apocalypse.cloudpartybuilding.mapper;

import apocalypse.cloudpartybuilding.pojo.CpbNewsMultimedia;

public interface CpbNewsMultimediaMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CpbNewsMultimedia record);

    int insertSelective(CpbNewsMultimedia record);

    CpbNewsMultimedia selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CpbNewsMultimedia record);

    int updateByPrimaryKey(CpbNewsMultimedia record);
}