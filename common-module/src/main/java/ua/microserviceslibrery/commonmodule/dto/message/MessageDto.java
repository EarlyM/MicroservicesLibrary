package ua.microserviceslibrery.commonmodule.dto.message;

import lombok.AllArgsConstructor;
import lombok.Data;


import java.util.Date;

@Data
@AllArgsConstructor
public class MessageDto {

    private Long id;
    private String text;
    private Date createDate;
    private String accountLogin;
    private Long parent;

}
