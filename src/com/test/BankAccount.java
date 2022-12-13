package com.test;

public class BankAccount 
{

	String bankName;
	String ownerName;
	long contactNumber;
	private double balance;

	BankAccount(String bankName, String ownerName, long contactNumber){
	this.bankName=bankName;
	this.ownerName=ownerName;
	this.contactNumber=contactNumber;
	}
	public void setBalance(double balance) {
	if(balance>0) {
	this.balance = balance;

	}
	else {
	System.out.println("insufficient Balance");
	}
	}
	public double getBalance() {
	return balance;
	}

	}



