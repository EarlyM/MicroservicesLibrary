package ua.microserviceslibrary.bookservice.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.microserviceslibrary.bookservice.model.Genre;
import ua.microserviceslibrary.bookservice.repository.GenreRepository;
import ua.microserviceslibrary.bookservice.service.GenreService;

@Service
public class GenreServiceImpl implements GenreService {

    @Autowired
    private GenreRepository genreRepository;


    @Override
    public Iterable<Genre> getAllGenre() {
        return genreRepository.findAll();
    }

    @Override
    public Object createOrUpdateGenre(Object genre) {
        Genre newGenre = (Genre) genre;
        return genreRepository.save(newGenre);
    }

    @Override
    public void deleteGenre(Long genreId) {
        genreRepository.delete(genreId);
    }

}
