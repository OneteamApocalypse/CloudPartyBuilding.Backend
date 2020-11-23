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

public class CpbNewsReview {
    private Integer id;

    private Integer userId;

    private String newsId;

    private Integer newsReviewStatus;

    private Date newsReviewDate;

    private String newsReviewDirections;

    private Integer newsReviewResult;
}