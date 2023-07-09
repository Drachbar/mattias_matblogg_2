package se.drachbar.springular.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import se.drachbar.springular.model.LoginCredentials;
import se.drachbar.springular.model.User;
import se.drachbar.springular.repositories.LoginCredentialsRepository;
import se.drachbar.springular.repositories.UserRepository;
import se.drachbar.springular.requests.CreateUserRequest;

@Service
public class UserService {
    private final UserRepository userRepository;
    private final LoginCredentialsRepository loginCredentialsRepository;

    @Autowired
    public UserService(UserRepository userRepository, LoginCredentialsRepository loginCredentialsRepository) {
        this.userRepository = userRepository;
        this.loginCredentialsRepository = loginCredentialsRepository;
    }

    public void createUser(CreateUserRequest request) {
        LoginCredentials loginCredentials = new LoginCredentials();
        loginCredentials.setPassword(request.getPassword());
        loginCredentials.setEmail(request.getEmail());

        User user = new User();
        user.setUsername(request.getUsername());
        user.setLoginCredentials(loginCredentials);

        loginCredentials.setUser(user);

        loginCredentialsRepository.save(loginCredentials);
        userRepository.save(user);
    }
}
