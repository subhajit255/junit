package com.simplilearn;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class UserValidatorTest {
	UserValidator validate = new UserValidator();
	
	@Test
	void validUserName() {
		assertTrue(validate.isValidUserName("validUser"),"Username should be valid");
	}
	
	@Test
	void userNameTooShort() {
		assertFalse(validate.isValidUserName("user"),"username is too short");
	}
	
	@Test
	void userNameWithSpace() {
		assertFalse(validate.isValidUserName("Invalid User"),"Username should not contain any space");
	}
	
	@Test
	void userNameisNull() {
		assertFalse(validate.isValidUserName(null),"Null username should be invalid");
	}
}
