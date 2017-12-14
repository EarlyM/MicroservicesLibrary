package ua.microserviceslibrary.messageservice.service;

import ua.microserviceslibrary.messageservice.model.Message;

import java.util.List;

public interface MessageService {

    List<Message> getAllMessageByBook(Long bookId);
    Object findMessageById(Long id);
    void deleteMessageById(Long id);
    Object createMessage(Object message);
    Object updateMessage(Object message);
}
