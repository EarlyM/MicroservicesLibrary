package ua.microserviceslibrary.bookservice.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;
import ua.microserviceslibrary.bookservice.model.Author;

@Repository
public interface AuthorRepository extends CrudRepository<Author, Long> {
}
