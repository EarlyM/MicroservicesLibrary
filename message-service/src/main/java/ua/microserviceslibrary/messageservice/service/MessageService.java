package ua.microserviceslibrary.messageservice.service;

import ua.microserviceslibrary.messageservice.model.Message;
import ua.microserviceslibrery.commonmodule.dto.message.request.MessageRequest;

import java.util.List;

public interface MessageService {

    List<Message> getAllMessageByBook(MessageRequest messageRequest);
    Object findMessageById(Long id);
    void deleteMessageById(Long id);
    Object createMessage(Object message);
    Object updateMessage(Object message);
}
