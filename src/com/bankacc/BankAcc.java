package com.bankacc;

public class BankAcc {
	private int acc;
	private String name;
	private double balance;
	
	public BankAcc(int acc,String name,double bal) {
		this.acc =acc;
		this.name=name;
		this.balance=bal;
	}
	public int getAcc() {
	     return acc; 
	}
	public String getName() {
		return this.name;
	}
	public double getBalance() {
		return this.balance;	
	}
	public double withdraw(double money) {
		if  (money<this.balance) {
			this.balance -= money;
		}
		else {
			System.out.println("Aukkat mai");
		}
		return this.balance;
	}
	public double Deposit(double money) {
		this.balance += money;
		return this.balance;
	}
	
}
