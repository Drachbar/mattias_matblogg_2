package se.drachbar.springular.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import se.drachbar.springular.model.LoginCredentials;

@Repository
public interface LoginCredentialsRepository extends JpaRepository<LoginCredentials, Long> {
}
