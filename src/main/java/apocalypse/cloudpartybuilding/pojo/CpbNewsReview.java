package apocalypse.cloudpartybuilding.pojo;

import java.util.Date;

public class CpbNewsReview {
    private Integer id;

    private Integer userId;

    private String newsId;

    private Integer newsReviewStatus;

    private Date newsReviewDate;

    private String newsReviewDirections;

    private Integer newsReviewResult;

    public CpbNewsReview(Integer id, Integer userId, String newsId, Integer newsReviewStatus, Date newsReviewDate, String newsReviewDirections, Integer newsReviewResult) {
        this.id = id;
        this.userId = userId;
        this.newsId = newsId;
        this.newsReviewStatus = newsReviewStatus;
        this.newsReviewDate = newsReviewDate;
        this.newsReviewDirections = newsReviewDirections;
        this.newsReviewResult = newsReviewResult;
    }

    public CpbNewsReview() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getNewsId() {
        return newsId;
    }

    public void setNewsId(String newsId) {
        this.newsId = newsId == null ? null : newsId.trim();
    }

    public Integer getNewsReviewStatus() {
        return newsReviewStatus;
    }

    public void setNewsReviewStatus(Integer newsReviewStatus) {
        this.newsReviewStatus = newsReviewStatus;
    }

    public Date getNewsReviewDate() {
        return newsReviewDate;
    }

    public void setNewsReviewDate(Date newsReviewDate) {
        this.newsReviewDate = newsReviewDate;
    }

    public String getNewsReviewDirections() {
        return newsReviewDirections;
    }

    public void setNewsReviewDirections(String newsReviewDirections) {
        this.newsReviewDirections = newsReviewDirections == null ? null : newsReviewDirections.trim();
    }

    public Integer getNewsReviewResult() {
        return newsReviewResult;
    }

    public void setNewsReviewResult(Integer newsReviewResult) {
        this.newsReviewResult = newsReviewResult;
    }
}