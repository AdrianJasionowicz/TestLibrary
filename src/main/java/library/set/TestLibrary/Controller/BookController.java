package library.set.TestLibrary.Controller;

import library.set.TestLibrary.Entity.Book;
import library.set.TestLibrary.Service.BookService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookController {
    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping("/Books")
    public List<Book> findAll() {
        return bookService.getAll();
    }

    @GetMapping("/Books/{id}")
    public Book showBook(@PathVariable Integer id) {
     return bookService.getById(id);
    }

    @DeleteMapping("/Books/{id}")
    public void  deleteBook(@PathVariable Integer id) {
        bookService.deleteById(id);
    }

@PostMapping("/Books/{id}")
    public Book addBook(@PathVariable Book book) {
        return bookService.save(book);
}

}
