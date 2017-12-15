package ua.microserviceslibrery.commonmodule.dto.message.request;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class SaveMessageRequest {

    private String login;
    private String bookId;
    private String messageParent;
    private String text;

}
