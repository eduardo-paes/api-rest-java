package copetsystem.api.service;

import copetsystem.api.model.Imc;
import copetsystem.api.model.User;
import copetsystem.api.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private UserRepository repository;

    public UserService(UserRepository repository) {
        this.repository = repository;
    }

    public User add(User user) {
        return this.repository.save(user);
    }

    public List<User> findAll() {
        return this.repository.findAll();
    }
}
