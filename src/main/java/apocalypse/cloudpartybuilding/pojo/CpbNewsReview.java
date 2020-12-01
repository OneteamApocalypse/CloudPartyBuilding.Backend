package apocalypse.cloudpartybuilding.pojo;

import lombok.*;

import java.util.Date;

@Data
@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
public class CpbNewsReview {
    private Integer id;

    private Integer userId;

    private String newsId;

    private Integer newsReviewStatus;

    private Date newsReviewDate;

    private String newsReviewDirections;

    private Integer newsReviewResult;

    private CpbNews cpbNews;

    public CpbNews getCpbNews() {
        return cpbNews;
    }

    public void setCpbNews(CpbNews cpbNews) {
        this.cpbNews = cpbNews;
    }

}