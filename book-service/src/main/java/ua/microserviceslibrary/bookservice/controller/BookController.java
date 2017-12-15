package ua.microserviceslibrary.bookservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ua.microserviceslibrary.bookservice.model.Book;
import ua.microserviceslibrary.bookservice.service.BookService;

@RestController
@RequestMapping("/book")
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping
    public Iterable<Book> findAllBooks(){
        return bookService.getBooksByRow();
    }

    @PostMapping("/save")
    public Object createBook(@RequestBody Object book){
        Book newBook = (Book) book;
        return bookService.createOrUpdateBook(newBook);
    }

    @GetMapping("/delete/{bookId}")
    public void deleteBook(@PathVariable Long bookId){
        bookService.deleteBook(bookId);
    }

    @GetMapping("/{bookId}")
    public Object getBook(@PathVariable Long bookId){
        return bookService.getBook(bookId);
    }


}
