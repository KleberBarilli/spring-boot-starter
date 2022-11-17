package br.com.starter.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.starter.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
