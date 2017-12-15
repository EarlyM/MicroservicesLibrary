package ua.microserviceslibrary.messageservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ua.microserviceslibrary.messageservice.model.Message;
import ua.microserviceslibrary.messageservice.service.MessageService;
import ua.microserviceslibrery.commonmodule.dto.message.request.MessageRequest;

import java.util.List;

@RestController
@RequestMapping("/message")
public class MessageController {

    @Autowired
    private MessageService messageService;

    @GetMapping
    public List<Message> getAllMessageForBook(@RequestBody MessageRequest request){
        return messageService.getAllMessageByBook(request);
    }

    @PostMapping("/{bookId}")
    public Object createMessage(@PathVariable Long bookId, @RequestBody Object message){
        return messageService.createMessage(message);
    }

    @GetMapping("/{messageId}")
    public void deleteMessageById(@PathVariable Long messageId){
        messageService.deleteMessageById(messageId);
    }

    @PostMapping("/{messageId}")
    public Object updateMessage(@PathVariable Long messageId, @RequestBody Object message){
        return messageService.updateMessage(message);
    }
}
