package copetsystem.api.controller;

import copetsystem.api.model.User;
import copetsystem.api.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/user")
public class UserController {
    private final UserService service;

    public UserController(UserService service){
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<User> add(@RequestBody User user){
        return ResponseEntity.ok(service.add(user));
    }

    @GetMapping
    public ResponseEntity<List<User>> findAll(){
        return ResponseEntity.ok(service.findAll());
    }
}
