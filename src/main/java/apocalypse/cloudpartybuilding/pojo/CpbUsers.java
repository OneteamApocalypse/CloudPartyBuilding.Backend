package apocalypse.cloudpartybuilding.pojo;

import lombok.Generated;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Setter
@Getter
@Generated
public class CpbUsers {
    private Integer userId;

    private String userName;

    private String imgId;

    private String usersSex;

    private Integer branchId;

    private Integer organizationId;

    private Integer usersPhone;

    private String usersEmail;

    private String usersPolitical;

    private Date usersJoinDate;

    private Date usersCorrectiondate;

    private Integer roleId;

    private String usersPassword;

    private Integer wechatId;

    private Integer usersStatus;

    public CpbUsers(Integer usersPhone, String usersPassword) {
        this.usersPhone = usersPhone;
        this.usersPassword = usersPassword;
    }
}