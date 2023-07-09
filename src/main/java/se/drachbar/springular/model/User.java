package se.drachbar.springular.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "tbl_user")
public class User {
    @Id
    private Long idUser;

    @OneToOne
    @MapsId
    @JoinColumn(name = "id_user")
    private LoginCredentials loginCredentials;
    private String username;
}
