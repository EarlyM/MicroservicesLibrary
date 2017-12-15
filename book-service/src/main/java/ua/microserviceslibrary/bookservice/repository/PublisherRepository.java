package ua.microserviceslibrary.bookservice.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ua.microserviceslibrary.bookservice.model.Publisher;

@Repository
public interface PublisherRepository extends CrudRepository<Publisher, Long>{
}
