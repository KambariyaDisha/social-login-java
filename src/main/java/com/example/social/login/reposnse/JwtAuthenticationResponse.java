package com.example.social.login.reposnse;

import com.example.social.login.request.UserInfo;

import lombok.Value;

@Value
public class JwtAuthenticationResponse {
	private String accessToken;
	private boolean authenticated;
	private UserInfo user;
}