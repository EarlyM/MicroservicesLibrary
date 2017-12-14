package ua.microserviceslibrary.messageservice.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "messages")
@Data
public class Message {

    @Id
    @Column(name = "message_id")
    private Long id;

    @Column(name = "message_text")
    private String text;

    @Column(name = "create_date")
    private Date createDate;

    @Column(name = "message_creator")
    private String accountLogin;

    @Column(name = "parent")
    private Long parent;

    @Column(name = "book_id")
    private Long bookId;
}
