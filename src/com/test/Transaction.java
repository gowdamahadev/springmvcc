package com.test;

	public class Transaction 
	{
	public static void withdraw(double amt,BankAccount ref)
	{
	double temp=ref.getBalance();
	temp=temp-amt;
	ref.setBalance(temp);

	}
	public static void Deposit(double amt, BankAccount ref) {
	ref.setBalance(ref.getBalance()+amt);
	System.out.println("Deposit successful");

	}
	public static void show_account_details(BankAccount ref) {
	System.out.println("Bank Name: "+ref.bankName);
	System.out.println("Owner Name "+ ref.ownerName);
	System.out.println("Contact No: "+ref.contactNumber);
	}
	public static void checkbalance(BankAccount ref) {
	System.out.println("Balance is: "+ref.getBalance());
	}
	}



