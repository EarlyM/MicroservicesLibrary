package ua.microserviceslibrary.userservice.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ua.microserviceslibrary.userservice.model.Account;

@Repository
public interface AccountRepository extends CrudRepository<Account, String> {
}
