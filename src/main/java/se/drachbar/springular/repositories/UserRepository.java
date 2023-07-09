package se.drachbar.springular.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import se.drachbar.springular.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
