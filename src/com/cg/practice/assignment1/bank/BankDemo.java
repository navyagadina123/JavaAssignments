package com.cg.practice.bank;

public class BankDemo {

	public static void main(String[] args) {
		CurrentAccount cacc=new CurrentAccount();
		SavingAccount save=new SavingAccount();
		cacc.deposite(500.00);
		save.deposite(500.00);
	
	}
	public static void doWithdrawal(BankAccount acc) {
		boolean result=acc.withdraw(1000.00);
		if(result) {
			System.out.println("Withdrawc Succeed");
		}else {
			System.out.println("Withdraw failed");
		}
	}
	


	}


