package com.simplilearn;

public class UserValidator {
	public boolean isValidUserName(String userName) {
		return userName != null && userName.length() >= 6 && !userName.contains(" ");
	}
}
