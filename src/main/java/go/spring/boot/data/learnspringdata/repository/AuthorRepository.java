package go.spring.boot.data.learnspringdata.repository;

import go.spring.boot.data.learnspringdata.domain.Author;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepository extends CrudRepository<Author, Long> {

}
