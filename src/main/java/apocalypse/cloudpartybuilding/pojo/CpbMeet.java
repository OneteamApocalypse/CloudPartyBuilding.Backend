package apocalypse.cloudpartybuilding.pojo;

import java.util.Date;

public class CpbMeet {
    private String meetId;

    private String meetName;

    private String meetRecord;

    private Date meetTime;

    private String meetPlace;

    private String meetHost;

    private Integer meetState;

    public CpbMeet(String meetId, String meetName, String meetRecord, Date meetTime, String meetPlace, String meetHost, Integer meetState) {
        this.meetId = meetId;
        this.meetName = meetName;
        this.meetRecord = meetRecord;
        this.meetTime = meetTime;
        this.meetPlace = meetPlace;
        this.meetHost = meetHost;
        this.meetState = meetState;
    }

    public CpbMeet() {
        super();
    }

    public String getMeetId() {
        return meetId;
    }

    public void setMeetId(String meetId) {
        this.meetId = meetId == null ? null : meetId.trim();
    }

    public String getMeetName() {
        return meetName;
    }

    public void setMeetName(String meetName) {
        this.meetName = meetName == null ? null : meetName.trim();
    }

    public String getMeetRecord() {
        return meetRecord;
    }

    public void setMeetRecord(String meetRecord) {
        this.meetRecord = meetRecord == null ? null : meetRecord.trim();
    }

    public Date getMeetTime() {
        return meetTime;
    }

    public void setMeetTime(Date meetTime) {
        this.meetTime = meetTime;
    }

    public String getMeetPlace() {
        return meetPlace;
    }

    public void setMeetPlace(String meetPlace) {
        this.meetPlace = meetPlace == null ? null : meetPlace.trim();
    }

    public String getMeetHost() {
        return meetHost;
    }

    public void setMeetHost(String meetHost) {
        this.meetHost = meetHost == null ? null : meetHost.trim();
    }

    public Integer getMeetState() {
        return meetState;
    }

    public void setMeetState(Integer meetState) {
        this.meetState = meetState;
    }
}