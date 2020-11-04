package apocalypse.cloudpartybuilding.pojo;

public class CpbNewsPermission {
    private Integer id;

    private Integer userId;

    private Integer editable;

    private Integer commentable;

    private Integer review;

    private Integer release;

    private Integer status;

    public CpbNewsPermission(Integer id, Integer userId, Integer editable, Integer commentable, Integer review, Integer release, Integer status) {
        this.id = id;
        this.userId = userId;
        this.editable = editable;
        this.commentable = commentable;
        this.review = review;
        this.release = release;
        this.status = status;
    }

    public CpbNewsPermission() {
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

    public Integer getEditable() {
        return editable;
    }

    public void setEditable(Integer editable) {
        this.editable = editable;
    }

    public Integer getCommentable() {
        return commentable;
    }

    public void setCommentable(Integer commentable) {
        this.commentable = commentable;
    }

    public Integer getReview() {
        return review;
    }

    public void setReview(Integer review) {
        this.review = review;
    }

    public Integer getRelease() {
        return release;
    }

    public void setRelease(Integer release) {
        this.release = release;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}