package copetsystem.api.service;

import copetsystem.api.model.User;
import copetsystem.api.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;
    @Autowired
    private PasswordEncoder encoder;

    public User add(User user) {
        user.setPassword(encoder.encode(user.getPassword()));
        return this.repository.save(user);
    }

    public List<User> findAll() {
        return this.repository.findAll();
    }

    public Optional<User> findByLogin(String login) {
        return this.repository.findByLogin(login);
    }

    public boolean validatePassword(String password, String userPassword) {
        return encoder.matches(password, userPassword);
    }
}
