package library.set.TestLibrary.Service;

import library.set.TestLibrary.Entity.Author;
import library.set.TestLibrary.Repository.AuthorRepository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class AuthorService {

    private final AuthorRepository authorRepository;

    public AuthorService(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }


    public List<Author> getAll() {
        return authorRepository.findAll();
    }

    public Author getById(Integer id) {
        Optional<Author> optionalAuthor = authorRepository.findById(id);
        return optionalAuthor.orElse(null);
    }

    public void deleteById(Integer id) {
        authorRepository.deleteById(id);
    }

    public Author save(Author author) {
        return authorRepository.save(author);
    }
}
