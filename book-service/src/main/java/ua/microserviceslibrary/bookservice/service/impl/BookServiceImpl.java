package ua.microserviceslibrary.bookservice.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.microserviceslibrary.bookservice.model.Book;
import ua.microserviceslibrary.bookservice.repository.BookRepository;
import ua.microserviceslibrary.bookservice.service.BookService;

@Service
public class BookServiceImpl implements BookService{

    @Autowired
    private BookRepository bookRepository;

    public Iterable<Book> getBooksByRow(){
        return bookRepository.findAll();
    }

    public Object createOrUpdateBook(Object book){
        Book newBook = (Book) book;
        return bookRepository.save(newBook);
    }

    public void deleteBook(Long bookId){
        bookRepository.delete(bookId);
    }

    public Object getBook(Long bookId){
        return bookRepository.findOne(bookId);
    }
}
