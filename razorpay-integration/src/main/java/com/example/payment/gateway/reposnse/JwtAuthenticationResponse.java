package com.example.payment.gateway.reposnse;

import com.example.payment.gateway.request.UserInfo;

import lombok.Value;

@Value
public class JwtAuthenticationResponse {
	private String accessToken;
	private boolean authenticated;
	private UserInfo user;
}