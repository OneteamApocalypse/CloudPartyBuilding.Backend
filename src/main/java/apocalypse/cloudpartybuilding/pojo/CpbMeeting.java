package apocalypse.cloudpartybuilding.pojo;

import lombok.*;

import java.util.Date;
@Data
@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
public class CpbMeeting {
    private String meetingId;

    private String meetingName;

    private String meetingRecord;

    private String meetingHost;

    private String meetingPlace;

    private Date meetingTime;

    private Integer meetingState;

    public String getMeetingId() {
        return meetingId;
    }

    public void setMeetingId(String meetingId) {
        this.meetingId = meetingId == null ? null : meetingId.trim();
    }

    public String getMeetingName() {
        return meetingName;
    }

    public void setMeetingName(String meetingName) {
        this.meetingName = meetingName == null ? null : meetingName.trim();
    }

    public String getMeetingRecord() {
        return meetingRecord;
    }

    public void setMeetingRecord(String meetingRecord) {
        this.meetingRecord = meetingRecord == null ? null : meetingRecord.trim();
    }

    public String getMeetingHost() {
        return meetingHost;
    }

    public void setMeetingHost(String meetingHost) {
        this.meetingHost = meetingHost == null ? null : meetingHost.trim();
    }

    public String getMeetingPlace() {
        return meetingPlace;
    }

    public void setMeetingPlace(String meetingPlace) {
        this.meetingPlace = meetingPlace == null ? null : meetingPlace.trim();
    }

    public Date getMeetingTime() {
        return meetingTime;
    }

    public void setMeetingTime(Date meetingTime) {
        this.meetingTime = meetingTime;
    }

    public Integer getMeetingState() {
        return meetingState;
    }

    public void setMeetingState(Integer meetingState) {
        this.meetingState = meetingState;
    }
}