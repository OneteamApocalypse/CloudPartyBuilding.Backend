package apocalypse.cloudpartybuilding.pojo;

import java.util.Date;

public class CpbNewsComment {
    private Integer id;

    private Integer userId;

    private String content;

    private Date date;

    private String newsId;

    private Integer lastCommentId;

    public CpbNewsComment(Integer id, Integer userId, String content, Date date, String newsId, Integer lastCommentId) {
        this.id = id;
        this.userId = userId;
        this.content = content;
        this.date = date;
        this.newsId = newsId;
        this.lastCommentId = lastCommentId;
    }

    public CpbNewsComment() {
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

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getNewsId() {
        return newsId;
    }

    public void setNewsId(String newsId) {
        this.newsId = newsId == null ? null : newsId.trim();
    }

    public Integer getLastCommentId() {
        return lastCommentId;
    }

    public void setLastCommentId(Integer lastCommentId) {
        this.lastCommentId = lastCommentId;
    }
}