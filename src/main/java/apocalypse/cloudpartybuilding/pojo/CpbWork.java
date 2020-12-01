package apocalypse.cloudpartybuilding.pojo;

import java.util.Date;

public class CpbWork {
    private String workId;

    private String workName;

    private Date workStartDate;

    private String workLocation;

    private Date workEndDate;

    private String workDescription;

    private Integer attendanceId;

    private Integer personLeaveId;

    private Integer numberOfWorkers;

    private Integer usersId;

    private Integer workStatus;

    private String usersname;

    public CpbWork(String workId, String workName, Date workStartDate, String workLocation, Date workEndDate, String workDescription, Integer attendanceId, Integer personLeaveId, Integer numberOfWorkers, Integer usersId, Integer workStatus, String usersname) {
        this.workId = workId;
        this.workName = workName;
        this.workStartDate = workStartDate;
        this.workLocation = workLocation;
        this.workEndDate = workEndDate;
        this.workDescription = workDescription;
        this.attendanceId = attendanceId;
        this.personLeaveId = personLeaveId;
        this.numberOfWorkers = numberOfWorkers;
        this.usersId = usersId;
        this.workStatus = workStatus;
        this.usersname = usersname;
    }

    public CpbWork() {
        super();
    }

    public CpbWork(String id, String name) {
        this.workId=id;
        this.workName=name;
    }

    public String getWorkId() {
        return workId;
    }

    public void setWorkId(String workId) {
        this.workId = workId == null ? null : workId.trim();
    }

    public String getWorkName() {
        return workName;
    }

    public void setWorkName(String workName) {
        this.workName = workName == null ? null : workName.trim();
    }

    public Date getWorkStartDate() {
        return workStartDate;
    }

    public void setWorkStartDate(Date workStartDate) {
        this.workStartDate = workStartDate;
    }

    public String getWorkLocation() {
        return workLocation;
    }

    public void setWorkLocation(String workLocation) {
        this.workLocation = workLocation == null ? null : workLocation.trim();
    }

    public Date getWorkEndDate() {
        return workEndDate;
    }

    public void setWorkEndDate(Date workEndDate) {
        this.workEndDate = workEndDate;
    }

    public String getWorkDescription() {
        return workDescription;
    }

    public void setWorkDescription(String workDescription) {
        this.workDescription = workDescription == null ? null : workDescription.trim();
    }

    public Integer getAttendanceId() {
        return attendanceId;
    }

    public void setAttendanceId(Integer attendanceId) {
        this.attendanceId = attendanceId;
    }

    public Integer getPersonLeaveId() {
        return personLeaveId;
    }

    public void setPersonLeaveId(Integer personLeaveId) {
        this.personLeaveId = personLeaveId;
    }

    public Integer getNumberOfWorkers() {
        return numberOfWorkers;
    }

    public void setNumberOfWorkers(Integer numberOfWorkers) {
        this.numberOfWorkers = numberOfWorkers;
    }

    public Integer getUsersId() {
        return usersId;
    }

    public void setUsersId(Integer usersId) {
        this.usersId = usersId;
    }

    public Integer getWorkStatus() {
        return workStatus;
    }

    public void setWorkStatus(Integer workStatus) {
        this.workStatus = workStatus;
    }

    public String getUsersname() {
        return usersname;
    }

    public void setUsersname(String usersname) {
        this.usersname = usersname == null ? null : usersname.trim();
    }
}