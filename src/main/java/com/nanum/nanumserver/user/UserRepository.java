package com.nanum.nanumserver.user;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    Boolean existsByUserName(String username);

    Optional<User> findByUsername(String username);

    List<User> findAllByUsername(String username);

}
