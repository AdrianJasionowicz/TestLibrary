package library.set.TestLibrary.Service;

import library.set.TestLibrary.Entity.Book;
import library.set.TestLibrary.Repository.BookRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookService {

    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public Book getById(Integer id) {
        Optional<Book> optionalBook = bookRepository.findById(id);
        return optionalBook.orElse(null);
    }


    public List<Book> getAll() {
        return bookRepository.findAll();
    }

    public void deleteById(Integer id) {
        bookRepository.deleteById(id);
    }

    public Book save(Book book) {
        return bookRepository.save(book);
    }
}
