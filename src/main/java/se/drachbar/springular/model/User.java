package se.drachbar.springular.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "tbl_user")
public class User {
    @Id
    @OneToOne
    @JoinColumn(name = "id_user")
    private LoginCredentials idUser;
    private String username;
}
