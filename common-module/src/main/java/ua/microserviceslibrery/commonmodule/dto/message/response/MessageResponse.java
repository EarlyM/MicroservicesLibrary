package ua.microserviceslibrery.commonmodule.dto.message.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import ua.microserviceslibrery.commonmodule.dto.message.MessageDto;

import java.util.List;

@Data
@AllArgsConstructor
public class MessageResponse {
    private Long bookId;
    private List<MessageDto> messages;
}
