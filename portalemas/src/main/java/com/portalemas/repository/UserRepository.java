package com.portalemas.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.portalemas.entity.User;

public interface UserRepository extends JpaRepository<User, Long>{
	Optional<User> findByUsername(String username);
	Optional<User> findByEmail(String email);
	Optional<User> findByEmail(String email);

}
