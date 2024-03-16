package Modelos;

public class Videos {
    private Integer id;
    private String video_uri;

    public Videos() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getVideo_uri() {
        return video_uri;
    }

    public void setVideo_uri(String video_uri) {
        this.video_uri = video_uri;
    }

    public Videos(int id, String video_uri) {
        this.id = id;
        this.video_uri = video_uri;
    }
}
