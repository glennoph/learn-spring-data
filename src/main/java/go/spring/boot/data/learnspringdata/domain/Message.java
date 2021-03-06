package go.spring.boot.data.learnspringdata.domain;

import org.hibernate.annotations.CreationTimestamp;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Message {

    @Id
    @GeneratedValue
    private Long id; // primary key

    private String title;

    private String text;

    @CreationTimestamp
    @Column(columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
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

//    public void setDateCreated(Date dateCreated) {
//        this.dateCreated = dateCreated;
//    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Message{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", text='" + text + '\'' +
                ", dateCreated=" + dateCreated +
                ", author=" + author +
                '}';
    }
}
