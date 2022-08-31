package com.example.payment.gateway.service;

import java.util.Map;
import java.util.Optional;

import org.springframework.security.oauth2.core.oidc.OidcIdToken;
import org.springframework.security.oauth2.core.oidc.OidcUserInfo;

import com.example.payment.gateway.exeption.UserAlreadyExistAuthenticationException;
import com.example.payment.gateway.model.User;
import com.example.payment.gateway.reposnse.LocalUser;
import com.example.payment.gateway.request.SignUpRequest;

public interface UserService {

	public User registerNewUser(SignUpRequest signUpRequest) throws UserAlreadyExistAuthenticationException;

	User findUserByEmail(String email);

	Optional<User> findUserById(Long id);

	LocalUser processUserRegistration(String registrationId, Map<String, Object> attributes, OidcIdToken idToken,
			OidcUserInfo userInfo);
}
