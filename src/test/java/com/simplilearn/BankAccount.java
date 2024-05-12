package com.simplilearn;

public class BankAccount {
	
	private double balence;
	public BankAccount(double initialBalence) {
		this.balence = initialBalence;
	}
	
	public void diposit(double amount) {
		if(amount < 0) {
			throw new IllegalArgumentException("Deposit amount must be positive");
		}
		this.balence += amount;
	}
	
	public void withDraw(double amount) throws InsufficientFundsException {
		if(amount > balence) {
			throw new InsufficientFundsException("Insufficient funds into your account");
		}
		this.balence -= amount;
	}
	
	public double getBalence() {
		return balence;
	}
}

class InsufficientFundsException extends Exception{
	public InsufficientFundsException(String message) {
		super(message);
	}
}
