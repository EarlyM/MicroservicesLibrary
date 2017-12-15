package ua.microserviceslibrery.commonmodule.dto.message.request;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class MessageRequest {

    private Long bookId;
    private Long messageRow;
    private Long page;
}
