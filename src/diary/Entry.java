package diary;
import java.time.LocalDateTime;
public class Entry {

    private int id;
    private String title;
    private String body;
    private LocalDateTime dateCreated;

    public  Entry(int id,String title,String body){
            this.id = id;
            this.title = title;
            this.body = body;

        }


    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Object getbody() {
        return body;
    }

    public LocalDateTime getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(LocalDateTime dateCreated) {
        this.dateCreated = dateCreated;
    }
}
