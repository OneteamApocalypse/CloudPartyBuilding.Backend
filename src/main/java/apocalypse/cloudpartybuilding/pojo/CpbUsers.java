package apocalypse.cloudpartybuilding.pojo;

import java.util.Date;

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

    public CpbUsers(Integer userId, String userName, String imgId, String usersSex, Integer branchId, Integer organizationId, Integer usersPhone, String usersEmail, String usersPolitical, Date usersJoinDate, Date usersCorrectiondate, Integer roleId, String usersPassword, Integer wechatId, Integer usersStatus) {
        this.userId = userId;
        this.userName = userName;
        this.imgId = imgId;
        this.usersSex = usersSex;
        this.branchId = branchId;
        this.organizationId = organizationId;
        this.usersPhone = usersPhone;
        this.usersEmail = usersEmail;
        this.usersPolitical = usersPolitical;
        this.usersJoinDate = usersJoinDate;
        this.usersCorrectiondate = usersCorrectiondate;
        this.roleId = roleId;
        this.usersPassword = usersPassword;
        this.wechatId = wechatId;
        this.usersStatus = usersStatus;
    }

    public CpbUsers() {
        super();
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getImgId() {
        return imgId;
    }

    public void setImgId(String imgId) {
        this.imgId = imgId == null ? null : imgId.trim();
    }

    public String getUsersSex() {
        return usersSex;
    }

    public void setUsersSex(String usersSex) {
        this.usersSex = usersSex == null ? null : usersSex.trim();
    }

    public Integer getBranchId() {
        return branchId;
    }

    public void setBranchId(Integer branchId) {
        this.branchId = branchId;
    }

    public Integer getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(Integer organizationId) {
        this.organizationId = organizationId;
    }

    public Integer getUsersPhone() {
        return usersPhone;
    }

    public void setUsersPhone(Integer usersPhone) {
        this.usersPhone = usersPhone;
    }

    public String getUsersEmail() {
        return usersEmail;
    }

    public void setUsersEmail(String usersEmail) {
        this.usersEmail = usersEmail == null ? null : usersEmail.trim();
    }

    public String getUsersPolitical() {
        return usersPolitical;
    }

    public void setUsersPolitical(String usersPolitical) {
        this.usersPolitical = usersPolitical == null ? null : usersPolitical.trim();
    }

    public Date getUsersJoinDate() {
        return usersJoinDate;
    }

    public void setUsersJoinDate(Date usersJoinDate) {
        this.usersJoinDate = usersJoinDate;
    }

    public Date getUsersCorrectiondate() {
        return usersCorrectiondate;
    }

    public void setUsersCorrectiondate(Date usersCorrectiondate) {
        this.usersCorrectiondate = usersCorrectiondate;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public String getUsersPassword() {
        return usersPassword;
    }

    public void setUsersPassword(String usersPassword) {
        this.usersPassword = usersPassword == null ? null : usersPassword.trim();
    }

    public Integer getWechatId() {
        return wechatId;
    }

    public void setWechatId(Integer wechatId) {
        this.wechatId = wechatId;
    }

    public Integer getUsersStatus() {
        return usersStatus;
    }

    public void setUsersStatus(Integer usersStatus) {
        this.usersStatus = usersStatus;
    }
}