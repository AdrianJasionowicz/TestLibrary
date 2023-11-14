package library.set.TestLibrary.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Setter
public class Book {

    @Id
    private Integer id;
    private String name;
    private Integer isbn;

}
