package apocalypse.cloudpartybuilding.pojo;

import java.util.Date;

public class CpbMeeting {
    private String meetingId;

    private String meetingName;

    private String meetingRecord;

    private Date meetingTime;

    private String meetingPlace;

    private String meetingHost;

    private Integer meetingState;

    public CpbMeeting(String meetingId, String meetingName, String meetingRecord, Date meetingTime, String meetingPlace, String meetingHost, Integer meetingState) {
        this.meetingId = meetingId;
        this.meetingName = meetingName;
        this.meetingRecord = meetingRecord;
        this.meetingTime = meetingTime;
        this.meetingPlace = meetingPlace;
        this.meetingHost = meetingHost;
        this.meetingState = meetingState;
    }

    public CpbMeeting() {
        super();
    }

    public String getmeetingId() {
        return meetingId;
    }

    public void setmeetingId(String meetingId) {
        this.meetingId = meetingId == null ? null : meetingId.trim();
    }

    public String getmeetingName() {
        return meetingName;
    }

    public void setmeetingName(String meetingName) {
        this.meetingName = meetingName == null ? null : meetingName.trim();
    }

    public String getmeetingRecord() {
        return meetingRecord;
    }

    public void setmeetingRecord(String meetingRecord) {
        this.meetingRecord = meetingRecord == null ? null : meetingRecord.trim();
    }

    public Date getmeetingTime() {
        return meetingTime;
    }

    public void setmeetingTime(Date meetingTime) {
        this.meetingTime = meetingTime;
    }

    public String getmeetingPlace() {
        return meetingPlace;
    }

    public void setmeetingPlace(String meetingPlace) {
        this.meetingPlace = meetingPlace == null ? null : meetingPlace.trim();
    }

    public String getmeetingHost() {
        return meetingHost;
    }

    public void setmeetingHost(String meetingHost) {
        this.meetingHost = meetingHost == null ? null : meetingHost.trim();
    }

    public Integer getmeetingState() {
        return meetingState;
    }

    public void setmeetingState(Integer meetingState) {
        this.meetingState = meetingState;
    }
}