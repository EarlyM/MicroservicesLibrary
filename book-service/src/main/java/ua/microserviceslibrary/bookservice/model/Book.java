package ua.microserviceslibrary.bookservice.model;

import lombok.Data;

import javax.persistence.*;

@Table(name = "books")
@Data
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "book_id")
    private Long id;

    @Column(name = "book_name", nullable = false, length = 100)
    private String bookName;

    @Column(name = "ibsn", nullable = false, length = 25)
    private String isbn;

    @Column(name = "desc", nullable = false, length = 500)
    private String desc;

    @Column(name = "image", nullable = false)
    private byte[] image;

    @Column(name = "genre_id", nullable = false)
    private Genre genre;

    @Column(name = "author_id", nullable = false)
    private Author author;

    @Column(name = "publisher_id", nullable = false)
    private Publisher publisherId;

}
