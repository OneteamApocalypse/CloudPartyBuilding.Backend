package apocalypse.cloudpartybuilding.pojo;

import java.util.Date;

public class CpbWork {
    private String workId;

    private String workName;

    private String workDescription;

    private String workLocation;

    private Date workStartDate;

    private Date workEndDate;

    private Integer attendanceId;

    private Integer personLeaveId;

    private Integer numberOfWorkers;

    private Integer usersId;

    private Integer workStatus;

    public CpbWork(String workId, String workName, String workDescription, String workLocation, Date workStartDate, Date workEndDate, Integer attendanceId, Integer personLeaveId, Integer numberOfWorkers, Integer usersId, Integer workStatus) {
        this.workId = workId;
        this.workName = workName;
        this.workDescription = workDescription;
        this.workLocation = workLocation;
        this.workStartDate = workStartDate;
        this.workEndDate = workEndDate;
        this.attendanceId = attendanceId;
        this.personLeaveId = personLeaveId;
        this.numberOfWorkers = numberOfWorkers;
        this.usersId = usersId;
        this.workStatus = workStatus;
    }

    public CpbWork() {
        super();
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

    public String getWorkDescription() {
        return workDescription;
    }

    public void setWorkDescription(String workDescription) {
        this.workDescription = workDescription == null ? null : workDescription.trim();
    }

    public String getWorkLocation() {
        return workLocation;
    }

    public void setWorkLocation(String workLocation) {
        this.workLocation = workLocation == null ? null : workLocation.trim();
    }

    public Date getWorkStartDate() {
        return workStartDate;
    }

    public void setWorkStartDate(Date workStartDate) {
        this.workStartDate = workStartDate;
    }

    public Date getWorkEndDate() {
        return workEndDate;
    }

    public void setWorkEndDate(Date workEndDate) {
        this.workEndDate = workEndDate;
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
}