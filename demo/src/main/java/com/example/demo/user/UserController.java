package com.example.demo.user;

import com.example.demo.userservice.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/users") // Базовый путь для API
public class UserController {

    private final UserService userService  ;

    // Внедрение репозитория через конструкто
    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    // 1. Получить всех пользователей
    @GetMapping("/getusers")
    public List<User> getAllUsers() {
        userService.test();
        return null;
    }

    // 2. Получить пользователя по ID
    @GetMapping("/{id}")
    public Optional<User> getUserById(@PathVariable Long id) {
        userService.test();
        return null;
    }

    // 3. Создать нового пользователя
    @PostMapping
    public User createUser(@RequestBody User user) {
        userService.test();
        return null;
    }

    // 4. Удалить пользователя по ID
    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable Long id) {
        userService.test();

    }
}

