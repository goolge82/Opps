package com.oops;


//Write a Java program to create a BankAccount class with 
//private variables accountHolderName and balance. Provide public getter and setter methods 
//to access and update these variables. Create an object in the main() method, set the account details, 
//and display them using getter methods.
public class Bank {
	
	private String accountholder;
	private double balance=1000;
	private double deposite;
	private double withdraw;
	
	
	
	public double getbal() {
		return balance;
	}
	
	
	public void setholder(String accountholder) {
		
		if(accountholder.length()<=15) {
		
		this.accountholder=accountholder;
		}
		else {
			System.out.println("invaild accountholder");
		}
	}
	public String getholder() {
		return accountholder;
	}

	
	public void setdeposite(int amount) {
		
		deposite=amount;
		
		if(amount>0) {
		balance=balance+amount;
		}
		else {
			System.out.println("invaild amount is not accpet");
		}
		
	}
	
	public void setwithdraw(int amount1) {
		
		withdraw=amount1;
		
		balance=balance-amount1;
	}
	
	public double getdraw() {
		return withdraw ;
	}



	public double getdepo() {
		return deposite;
	}
	public double getdepo1() {
		return balance;
	}

	
	public double getbal1() {
		return balance;
	}
}
