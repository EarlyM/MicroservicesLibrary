package ua.microserviceslibrary.userservice.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.microserviceslibrary.userservice.model.Account;
import ua.microserviceslibrary.userservice.repository.AccountRepository;
import ua.microserviceslibrary.userservice.service.AccountService;

@Service
public class AccountServiceIml implements AccountService {

    @Autowired
    private AccountRepository userRepository;


    @Override
    public Object findUserByName(String name) {
        return userRepository.findOne(name);
    }

    @Override
    public Object updateUser(Object account) {
        Account newAccount = (Account) account;
        return userRepository.save(newAccount);
    }

    @Override
    public void deleteUser(Object account) {
        Account deleteAccount = (Account) account;
        userRepository.delete(deleteAccount);
    }

    @Override
    public Object createUser(Object account) {
        Account newAccount = (Account) account;
        return userRepository.save(newAccount);
    }
}
