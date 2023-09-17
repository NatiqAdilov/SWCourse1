package org.example;
import lombok.*;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class User {
    private Integer id;
    private String name;
    private String surname;
    private String password;
}
