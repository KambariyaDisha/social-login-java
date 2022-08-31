package com.example.payment.gateway.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import com.example.payment.gateway.request.SignUpRequest;


public class PasswordMatchesValidator implements ConstraintValidator<PasswordMatches, SignUpRequest> {

	@Override
	public boolean isValid(final SignUpRequest user, final ConstraintValidatorContext context) {
		return user.getPassword().equals(user.getMatchingPassword());
	}

}
