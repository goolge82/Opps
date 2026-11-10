package com.oops;

public class Bank1 {
	

	//Write a Java program to create a BankAccount class with 
	//private variables accountHolderName and balance. Provide public getter and setter methods 
	//to access and update these variables. Create an object in the main() method, set the account details, 
	//and display them using getter methods.

	private String accountholdername;
	private double balance;
	
	
//	accountholdername
	public void setholder(String accountholdername) {
		
		if(accountholdername!= null && accountholdername.length()<=12) {
			
			this.accountholdername=accountholdername;
		}
		else {
			System.out.println("invaild accountholdername");
		}
	}
	
	
  public String getholder() {
	  return accountholdername;
  }
 
  
//  balance
  public void setbalance(double balance) {
	  if(balance>0) {
		  this.balance=balance;
	  }
	  else {
		  System.out.println("invaild balance");
	  }
  }
  
  public double getbal() {
	  return balance;
  }
  

}
