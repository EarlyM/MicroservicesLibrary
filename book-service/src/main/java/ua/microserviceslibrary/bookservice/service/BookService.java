package ua.microserviceslibrary.bookservice.service;

import ua.microserviceslibrary.bookservice.model.Book;


public interface BookService {

    Iterable<Book> getBooksByRow();
    Object createOrUpdateBook(Object book);
    void deleteBook(Long bookId);
    Object getBook(Long bookId);

}
