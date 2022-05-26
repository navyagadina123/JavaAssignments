package com.cg.practice.bank;

public class SavingAccount extends BankAccount{
	
	
	@Override
	public boolean withdraw(double amount) {
		balance -= amount;
		return true;
	}
} 


