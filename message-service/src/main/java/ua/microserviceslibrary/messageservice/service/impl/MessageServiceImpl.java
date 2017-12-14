package ua.microserviceslibrary.messageservice.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.microserviceslibrary.messageservice.model.Message;
import ua.microserviceslibrary.messageservice.repository.MessageRepository;
import ua.microserviceslibrary.messageservice.service.MessageService;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class MessageServiceImpl implements MessageService {

    @Autowired
    private MessageRepository messageRepository;


    @Override
    public List<Message> getAllMessageByBook(Long bookId) {
        return messageRepository.getAllByBookId(bookId);
    }

    @Override
    public Object findMessageById(Long id) {
        return messageRepository.findOne(id);
    }

    @Override
    public void deleteMessageById(Long id) {
        messageRepository.delete(id);
    }

    @Override
    public Object createMessage(Object message) {
        Message newMessage = (Message) message;
        return messageRepository.save(newMessage);
    }

    @Override
    public Object updateMessage(Object message) {
        Message updateMessage = (Message) message;
        return messageRepository.save(updateMessage);
    }
}
