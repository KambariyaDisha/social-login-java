package com.example.social.login.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.social.login.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

	User findByEmail(String email);

	boolean existsByEmail(String email);
}