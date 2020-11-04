package apocalypse.cloudpartybuilding.pojo;

public class CpbNewsMultimedia {
    private Integer id;

    private String newsMultimediaPath;

    private String newsId;

    public CpbNewsMultimedia(Integer id, String newsMultimediaPath, String newsId) {
        this.id = id;
        this.newsMultimediaPath = newsMultimediaPath;
        this.newsId = newsId;
    }

    public CpbNewsMultimedia() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNewsMultimediaPath() {
        return newsMultimediaPath;
    }

    public void setNewsMultimediaPath(String newsMultimediaPath) {
        this.newsMultimediaPath = newsMultimediaPath == null ? null : newsMultimediaPath.trim();
    }

    public String getNewsId() {
        return newsId;
    }

    public void setNewsId(String newsId) {
        this.newsId = newsId == null ? null : newsId.trim();
    }
}