package go.spring.boot.data.learnspringdata.service;

import go.spring.boot.data.learnspringdata.domain.Author;
import go.spring.boot.data.learnspringdata.domain.Message;
import go.spring.boot.data.learnspringdata.repository.AuthorRepository;
import go.spring.boot.data.learnspringdata.repository.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.Date;

@Service
public class DataLoader {

    private MessageRepository messageRepository;
    private AuthorRepository authorRepository;

    @Autowired
    public DataLoader(MessageRepository messageRepository, AuthorRepository authorRepository) {
        this.messageRepository = messageRepository;
        this.authorRepository = authorRepository;
    }

    @PostConstruct
    private void loadData() {
        // create author
        Author authgo = new Author("glenn", "opdycke");
        authorRepository.save(authgo);

        // create a message
        Message m1 = new Message("Spring data is fun?");
        m1.setText("post text here");
        //m1.setDateCreated(new Date());
        m1.setAuthor(authgo);
        messageRepository.save(m1);

    }

}
