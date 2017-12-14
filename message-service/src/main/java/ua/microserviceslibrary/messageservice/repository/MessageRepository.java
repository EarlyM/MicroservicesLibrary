package ua.microserviceslibrary.messageservice.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ua.microserviceslibrary.messageservice.model.Message;

import java.util.List;
import java.util.Set;

@Repository
public interface MessageRepository extends CrudRepository<Message, Long>{

    List<Message> getAllByBookId(Long bookId);

    List<Message> findAllByBookIdOrderByParentDescIdAsc(Long bookId);

}
