package br.com.starter.modules.user.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import br.com.starter.modules.user.models.User;
import java.util.UUID;

public interface UserRepository extends JpaRepository<User, UUID> {

    @Query("SELECT u from User u where u.id > :id")
    public List<User> findAllMoreThan(@Param("id") UUID id);

    public List<User> findByIdGreaterThan(UUID id);

    public List<User> findByNameIgnoreCase(String name);

    User findByName(String name);

}
