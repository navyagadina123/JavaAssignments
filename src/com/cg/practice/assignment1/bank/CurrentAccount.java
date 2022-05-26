package com.cg.practice.bank;

public class CurrentAccount extends BankAccount{
	
	public boolean withdraw(double amount) {
		balance -= amount;
		return true;
	}
}


