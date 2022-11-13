package br.com.starter.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.starter.model.User;

@RestController
@RequestMapping("/users")
public class UserController {

    @GetMapping("/")
    public User user() {
        User user = new User();
        user.setId(1L);
        user.setName("Kleber");
        user.setEmail("Kb@gmail.com");
        return user;
    }

}
