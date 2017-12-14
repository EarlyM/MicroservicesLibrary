package ua.microserviceslibrary.userservice.service;

public interface AccountService {

    Object findUserByName(String name);
    Object updateUser(Object user);
    void deleteUser(Object login);
    Object createUser(Object user);
}
