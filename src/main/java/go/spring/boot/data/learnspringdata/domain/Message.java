package go.spring.boot.data.learnspringdata.domain;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Message {

    @Id
    @GeneratedValue
    private Long id; // primary key

    private String title;

    private String text;
    private Date dateCreated;

    // author - many posts tied to one author
    @ManyToOne
    private Author author;

    private Message() {
    }

    public Message(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    @Override
    public String toString() {
        return "Message{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", body='" + text + '\'' +
                ", dateCreated=" + dateCreated +
                '}';
    }
}
