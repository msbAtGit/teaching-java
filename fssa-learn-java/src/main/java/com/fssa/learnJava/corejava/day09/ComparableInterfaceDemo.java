package com.fssa.learnJava.corejava.day09;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//class Account {
class Account implements Comparable<Account> {

	private String accNo;
	private String name;
	private double balance;

	public Account(String accNo, String name, double balance) {

		this.accNo = accNo;
		this.name = name;
		this.balance = balance;
	}

	public String getAccNo() {
		return accNo;
	}

	public void setAccNo(String accNo) {
		this.accNo = accNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	@Override
	public int compareTo(Account o) {

		if (this.balance == o.getBalance()) {
			return 0;
		} else {
			if (this.balance < o.getBalance()) {
				return -1;
			} else {
				return 1;
			}
			// return ( this.balance > o.getBalance()) ? 1: -1;
		}
	}

	@Override
	public String toString() {
		return "Account [accNo=" + accNo + ", name=" + name + ", balance=" + balance + "]";
	}

}

public class ComparableInterfaceDemo {
	public static void main(String[] args) {

		Account acct1 = new Account("A101", "Naresh", 1000);
		Account acct2 = new Account("A102", "Arun", 5000);
//		Account acct3 = new Account("A103", "Karthik", 3000);

		List<Account> list = new ArrayList<Account>();
		list.add(acct1);
		list.add(acct2);
//		list.add(acct3);

		System.out.println(list);

		Collections.sort(list);
		
		//Printing numbers sorted by balance
		System.out.println(list);

	}

}
