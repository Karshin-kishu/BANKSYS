package com.bankacc;

import java.util.Scanner;

public class Client {
	public static void main(String[] args) {
		System.out.println("ENTER NAME: ");
		Scanner sc = new Scanner(System.in);
		String name = sc.next();

		System.out.println("ENTER ACCNO: ");
		int accno = sc.nextInt();

		System.out.println("ENTER BALANCE: ");
		double bal  = sc.nextDouble();
		
		System.out.println("ENTER DEPOSIT AMOUNT: ");
		double money = sc.nextDouble();
		
		BankAcc a = new BankAcc(accno,name,bal);
		System.out.println("NAME: "+a.getName());
		System.out.println("ACCNO: "+a.getAcc());
		System.out.println("BALANCE: "+a.getBalance());
		System.out.println("DEPOSITED AMOUNT: " + money);
		System.out.println("UPDATED BALANCE: " + a.Deposit(money));
//		System.out.println("BALANCE: " +a.getBalance());
		
	} 
}