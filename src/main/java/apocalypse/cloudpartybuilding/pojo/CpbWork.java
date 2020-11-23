package apocalypse.cloudpartybuilding.pojo;

import lombok.*;
import java.util.Date;

@Data
@AllArgsConstructor
@Getter
@Setter
public class CpbWork {
    private String workId;

    private String workName;

    private String workLocation;

    private Date workStartDate;

    private Date workEndDate;

    private Integer attendanceId;

    private Integer personLeaveId;

    private Integer numberOfWorkers;

    private Integer usersId;

    private Integer workStatus;

    private String workDescription;
}