package apocalypse.cloudpartybuilding.service;

import apocalypse.cloudpartybuilding.pojo.CpbWork;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author skyrocketing Hong
 * @Date 2020-11-23 023 16:12:36
 * @Version 1.0
 */


public interface CpbWorkService {
    CpbWork selectByPrimaryKey(String id);

    int insertSelective(CpbWork record);
    int insert(CpbWork cpbWork);

    List<CpbWork> selectByAll();
}
