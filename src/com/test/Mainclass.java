package com.test;

public class Mainclass 
{

	public static void main(String[] args) {
	BankAccount bank=new BankAccount("state banbk of india", "sbi", 64478478747l);
	Transaction.show_account_details(bank);
	Transaction.Deposit(1000, bank);
	Transaction.checkbalance(bank);
	Transaction.withdraw(1000, bank);
	Transaction.checkbalance(bank);
	Transaction.withdraw(900, bank);
	Transaction.checkbalance(bank);

	}

	}



