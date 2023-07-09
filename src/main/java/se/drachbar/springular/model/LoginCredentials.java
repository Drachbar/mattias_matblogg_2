package se.drachbar.springular.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "tbl_login_credentials")
public class LoginCredentials {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idUser;
    private String password;
    private String email;
    private boolean activated;
    @OneToOne(mappedBy = "loginCredentials", cascade = CascadeType.ALL)
    private User user;

    public void setUser(User user) {
        this.user = user;
        user.setLoginCredentials(this);
    }
}
