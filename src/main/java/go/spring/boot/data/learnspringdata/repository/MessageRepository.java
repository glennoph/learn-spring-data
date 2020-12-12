package go.spring.boot.data.learnspringdata.repository;

import go.spring.boot.data.learnspringdata.domain.Message;
import org.springframework.data.repository.CrudRepository;

public interface MessageRepository extends CrudRepository<Message, Long> {


}
