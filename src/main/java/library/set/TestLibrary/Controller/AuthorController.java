package library.set.TestLibrary.Controller;

import library.set.TestLibrary.Entity.Author;
import library.set.TestLibrary.Service.AuthorService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class AuthorController {

    private final AuthorService authorService;

    public AuthorController(AuthorService authorService) {
        this.authorService = authorService;
    }


    @GetMapping("/Author")
    public List<Author> showAuthors() {
        return authorService.getAll();
    }

    @GetMapping("/Author/{id}")
    public Author getAuthor(@PathVariable Integer id) {
        return authorService.getById(id);
    }

@DeleteMapping("/Author/{id}")
    public void deleteAuthor(@PathVariable Integer id) {
      authorService.deleteById(id);
}

@PostMapping("/Author")
    public Author postAuthor(@RequestBody Author author) {
    return authorService.save(author);
}


}
