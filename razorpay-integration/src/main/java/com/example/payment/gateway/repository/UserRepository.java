package com.example.payment.gateway.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.payment.gateway.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

	User findByEmail(String email);

	boolean existsByEmail(String email);
}