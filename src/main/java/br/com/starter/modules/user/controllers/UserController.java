package br.com.starter.modules.user.controllers;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.starter.modules.user.dto.CreateUserRoleDTO;
import br.com.starter.modules.user.models.User;
import br.com.starter.modules.user.repository.UserRepository;
import br.com.starter.modules.user.services.CreateRoleUserService;
import br.com.starter.modules.user.services.CreateUserService;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    CreateUserService createUserService;

    @Autowired
    CreateRoleUserService createRoleUserService;

    // @GetMapping("/{id}")
    // public User user(@PathVariable("id") UUID id) {
    // Optional<User> userFound = this.userRepository.findById(id);
    // if (userFound.isPresent()) {
    // return userFound.get();
    // }
    // return null;
    // }

    @PostMapping("/create")
    public User user(@RequestBody User user) {
        return createUserService.execute(user);

    }

    @PostMapping("/role")
    public User role(@RequestBody CreateUserRoleDTO userRole) {
        return createRoleUserService.execute(userRole);

    }

    // @GetMapping("/list")
    // public List<User> list() {
    // return this.userRepository.findAll();
    // }

    // @GetMapping("/list/more/{id}")
    // public List<User> more(@PathVariable("id") UUID id) {

    // return this.userRepository.findAllMoreThan(id);
    // }

    // @GetMapping("/list/{id}")
    // public List<User> listMoreThan(@PathVariable("id") UUID id) {
    // return this.userRepository.findByIdGreaterThan(id);
    // }

    // @GetMapping("/findByName/{name}")
    // public List<User> findByName(@PathVariable("name") String name) {
    // return this.userRepository.findByNameIgnoreCase(name);
    // }

}
