package copetsystem.api.repository;

import copetsystem.api.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository <User, Integer> {

    public Optional<User> findByLogin(String login);
}
