package apocalypse.cloudpartybuilding.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import java.util.Date;

@Data
@AllArgsConstructor
@Getter
@Setter

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

    public CpbWork(String id, String name) {
        this.workId = id;
        this.workName = name;
    }
}