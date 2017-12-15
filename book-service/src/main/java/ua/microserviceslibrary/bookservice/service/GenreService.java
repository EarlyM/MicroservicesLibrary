package ua.microserviceslibrary.bookservice.service;


import ua.microserviceslibrary.bookservice.model.Genre;

public interface GenreService {

    Iterable<Genre> getAllGenre();
    Object createOrUpdateGenre(Object genre);
    void deleteGenre(Long genreId);

}
