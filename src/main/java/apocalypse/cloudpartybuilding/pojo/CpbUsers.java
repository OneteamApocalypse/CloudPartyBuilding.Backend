package apocalypse.cloudpartybuilding.pojo;

import java.util.Date;

@Data
@AllArgsConstructor
@Getter
@Setter

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
}