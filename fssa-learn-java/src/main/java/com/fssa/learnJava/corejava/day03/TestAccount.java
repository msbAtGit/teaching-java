package com.fssa.learnJava.corejava.day03;

class Account {
	 
    private String accNo;
 
    private String name;
 
    private double balance;

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
 
}

public class TestAccount {
	public static void main(String[] args) {
		//create Account
        Account acct1 = new Account();
        acct1.setAccNo("A101");
        acct1.setName("Naresh");
        acct1.setBalance(1000);
 
        System.out.println(acct1.getAccNo() + "-" + acct1.getName() + "-" + acct1.getBalance());
         
         
        //create Account
        Account acct2 = new Account();
        acct2.setAccNo("A102");
        acct2.setName("Arun");
        acct2.setBalance(500);
 
        System.out.println(acct2.getAccNo() + "-" + acct2.getName() + "-" + acct2.getBalance());
        
	}
}
