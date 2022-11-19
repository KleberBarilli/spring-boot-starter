package br.com.starter.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import br.com.starter.modules.user.models.User;
import br.com.starter.modules.user.repository.UserRepository;

@Service
public class CustomUserDetailsService implements UserDetailsService {

    @Autowired
    UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        // System.out.println(username);
        User existsUser = userRepository.findByEmailFetchRoles(username);
        System.out.println("FUCKKKKKKKKKKKKK" + existsUser);

        if (existsUser == null) {
            throw new Error("User does not exists!");
        }
        return UserPrincipal.create(existsUser);
    }

}
