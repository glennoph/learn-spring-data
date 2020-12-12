package go.spring.boot.data.learnspringdata;

import go.spring.boot.data.learnspringdata.domain.Message;
import go.spring.boot.data.learnspringdata.repository.MessageRepository;
import org.slf4j.ILoggerFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LearnSpringDataApplication {

	private static final Logger logger = LoggerFactory.getLogger(LearnSpringDataApplication.class);

	// MessageRepository
	@Autowired
	MessageRepository messageRepository;

	public static void main(String[] args) {
		SpringApplication.run(LearnSpringDataApplication.class, args);
	}

	// MessageConstuct
	void seeMessages() {
		logger.info("see messages method call");
		for(Message message : messageRepository.findAll()) {
			logger.info(message.toString());
		}
	}


}
