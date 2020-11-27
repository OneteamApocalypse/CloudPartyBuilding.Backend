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

public class CpbReport {
    private Integer reportId;

    private String reportName;

    private String reportContent;

    private Date reportDate;

    private String reportIp;

    public CpbReport(Integer reportId, String reportName, String reportContent) {
        this.reportId = reportId;
        this.reportName = reportName;
        this.reportContent = reportContent;
    }
}