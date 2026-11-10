package com.oops;

import java.util.Scanner;

public class PersonalLoan extends LoanImpl{
	
	static Scanner sc=new Scanner(System.in);
	
	void getPersonalLoanDocInfo() {
		System.out.println("Personal Loan Doc info receviced");
	}

	public static void main(String[] args) {
		
		System.out.println("welcome to Union Personal Loan Banking");
		
//		by using child object child refernce
//		we can call both child class & parent class functionalities
		PersonalLoan pl=new PersonalLoan();
		
		double salary=pl.getEmployeeSalary();
		int cibil=pl.getCibilScore();
		double amount=pl.getLoanAmount();
		double roi=pl.getROI();
		int year=pl.getLoanTenure();
		
		double interest=pl.getTotalInterest(roi, year, amount);
		double emi=pl.calculateEMI(amount, roi, year);
		
		if(salary>=100000.00 && cibil>=300 && cibil <=900) {
			
			System.out.println("Good to know lets Starts the remining process ");
			
			if(pl.isAdharVaild() && pl.isPanVaild() && pl.isPhonnumberVaild()) {
				System.out.println("Congrtulation !! your personal loan got approch");
				System.out.println("personal loan ROI is:"+pl.getROI());
				
				pl.getPersonalLoanDocInfo();
			}
		}
		else {
			System.out.println("your Loan got rejected. Please try again later.");
		}
		
		System.out.println("Loan Tenure: " + year + " Years");

		System.out.println("Monthly EMI: " + emi);

		System.out.println("Total Interest: " + interest);
		System.out.println("loan amount to be payed:- "+(amount+interest));
	}

}
