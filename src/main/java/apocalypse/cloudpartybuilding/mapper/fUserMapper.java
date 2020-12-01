package apocalypse.cloudpartybuilding.mapper;

import apocalypse.cloudpartybuilding.pojo.tUser;
import org.apache.ibatis.annotations.Param;

public interface fUserMapper {
    tUser login(@Param("username") String username, @Param("password") String password);

}
