package br.com.starter.modules.user.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.starter.modules.user.repository.UserRepository;
import br.com.starter.modules.user.models.User;;

@Service
public class CreateUserService {

    @Autowired
    UserRepository userRepository;

    public User execute(User user) {

        User existsUser = userRepository.findByName(user.getName());

        if (existsUser != null) {
            throw new Error("User already exists!");
        }

        User createdUser = userRepository.save(user);

        return createdUser;
    }

}
