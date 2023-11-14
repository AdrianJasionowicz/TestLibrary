package library.set.TestLibrary.Repository;

import library.set.TestLibrary.Entity.Book;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface BookRepository extends CrudRepository<Book,Integer> {

    List<Book> findAll();
}
