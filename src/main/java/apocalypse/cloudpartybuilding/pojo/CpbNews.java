package apocalypse.cloudpartybuilding.pojo;

import java.util.Date;

public class CpbNews {
    private String id;

    private String name;

    private String subtitle;

    private Integer author;

    private Integer publisher;

    private Date date;

    private String content;

    private Integer type;

    private Integer reviewId;

    private Integer status;

    public CpbNews(String id, String name, String subtitle, Integer author, Integer publisher, Date date, String content, Integer type, Integer reviewId, Integer status) {
        this.id = id;
        this.name = name;
        this.subtitle = subtitle;
        this.author = author;
        this.publisher = publisher;
        this.date = date;
        this.content = content;
        this.type = type;
        this.reviewId = reviewId;
        this.status = status;
    }

    public CpbNews() {
        super();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle == null ? null : subtitle.trim();
    }

    public Integer getAuthor() {
        return author;
    }

    public void setAuthor(Integer author) {
        this.author = author;
    }

    public Integer getPublisher() {
        return publisher;
    }

    public void setPublisher(Integer publisher) {
        this.publisher = publisher;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getReviewId() {
        return reviewId;
    }

    public void setReviewId(Integer reviewId) {
        this.reviewId = reviewId;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}