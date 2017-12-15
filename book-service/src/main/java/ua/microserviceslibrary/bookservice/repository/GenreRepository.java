package ua.microserviceslibrary.bookservice.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ua.microserviceslibrary.bookservice.model.Genre;

@Repository
public interface GenreRepository extends CrudRepository<Genre, Long>{
}
