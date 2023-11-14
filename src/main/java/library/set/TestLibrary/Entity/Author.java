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
public class Author {
@Id
    private Integer id;
    private String name;
    private String surname;
    private String bornPlace;
    private Integer age;


}
