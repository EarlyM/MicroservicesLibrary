package ua.microserviceslibrary.bookservice.model;

import lombok.Data;

import javax.persistence.*;

@Table(name = "publishers")
@Data
public class Publisher {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "publisher_id")
    private Long id;

    @Column(name = "publisher_name")
    private String name;

}
