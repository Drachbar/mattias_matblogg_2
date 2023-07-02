package se.drachbar.springular.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import se.drachbar.springular.model.LoginCredentials;
import se.drachbar.springular.repositories.LoginCredentialsRepository;

@RestController
@RequestMapping("/api/v1")
public class LoginCredentialsController {
    private final LoginCredentialsRepository loginCredentialsRepository;

    @Autowired
    public LoginCredentialsController(LoginCredentialsRepository loginCredentialsRepository) {
        this.loginCredentialsRepository = loginCredentialsRepository;
    }

    @PostMapping("/login-credentials")
    public ResponseEntity<LoginCredentials> createLoginCredentials(@RequestBody LoginCredentials loginCredentials) {
        LoginCredentials createdCredentials = loginCredentialsRepository.save(loginCredentials);
        return new ResponseEntity<>(createdCredentials, HttpStatus.CREATED);
    }
}
