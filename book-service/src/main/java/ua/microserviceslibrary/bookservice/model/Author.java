package ua.microserviceslibrary.bookservice.model;

import lombok.Data;

import javax.persistence.*;

@Table(name = "authors")
@Data
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "author_id")
    private Long id;

    @Column(name = "author_name", nullable = false)
    private String name;

    @Column(name = "author_lastname", nullable = false)
    private String lastname;
}
