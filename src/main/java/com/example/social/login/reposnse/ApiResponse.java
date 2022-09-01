package com.example.social.login.reposnse;

import lombok.Value;

@Value
public class ApiResponse {
	private Boolean success;
	private String message;
}