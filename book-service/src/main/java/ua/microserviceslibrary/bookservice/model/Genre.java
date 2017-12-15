package ua.microserviceslibrary.bookservice.model;

import lombok.Data;

import javax.persistence.*;

@Table(name = "genres")
@Data
public class Genre {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "genre_id")
    private Long id;

    @Column(name = "genre_name")
    private String name;
}
