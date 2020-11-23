package apocalypse.cloudpartybuilding.service;

import apocalypse.cloudpartybuilding.pojo.CpbWork;
import org.springframework.stereotype.Service;

/**
 * @Author skyrocketing Hong
 * @Date 2020-11-23 023 16:12:36
 * @Version 1.0
 */

@Service
public interface CpbWorkService {
    CpbWork selectByPrimaryKey(String id);
}
