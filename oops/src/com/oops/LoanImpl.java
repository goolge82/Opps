package com.oops;

import java.util.Scanner;

public class LoanImpl implements Loan {

 
	
	static Scanner sc=new Scanner(System.in);
//	employee salary
	@Override
	public Double getEmployeeSalary() {
		System.out.println("enter your Salary:- ");
		double sal=sc.nextDouble();
		return sal;
	}
	
//	employee's age
	@Override
	public int getEmployeeAge() {
		System.out.println("enter your age:- ");
		int age=sc.nextInt();
		return age;
	}
	
//	cibilscore
//	but based on cibil score i want to rate of interest
	
	@Override
	public int getCibilScore() {
		System.out.println("enter your cibilscore:- ");
		int cibil=sc.nextInt();
		return cibil;
	}
	
	@Override
	public double getLoanAmount() {
		
		System.out.println("enter loan amount:- ");
		double amount=sc.nextDouble();
		
		return amount;
	}
	
	@Override
	public int getLoanTenure() {
		System.out.println("enter the loan tenure in years:- ");
		int years=sc.nextInt();
		
		return years;
	}
	
	
//	boolean isAgeEligible() {
//		
//		int age=getEmployeeAge();
//		
//		if(age>=21 && age<=60) {
//			System.out.println("Age is eligible");
//			return true;
//		}
//		else {
//			System.out.println("Age is not Eligible");
//			return false;
//		}
//	}
	
	@Override
	public double calculateEMI(double amount, double roi, int years) {

	    double interest = (amount * roi * years) / 100;

	    double totalAmount = amount + interest;

	    double emi = totalAmount / (years * 12);

	    return emi;
	}
	
	@Override
	public double getTotalInterest(double roi, int years, double amount) {


	    double interest = (amount*roi*years)/100;

	    return interest;
	}
	
	public void generateLoanReport(double amount, double emi,
            double interest, int years) {

System.out.println("\n====== LOAN REPORT ======");

System.out.println("Loan Amount: " + amount);

System.out.println("Loan Tenure: " + years + " Years");

System.out.println("Monthly EMI: " + emi);

System.out.println("Total Interest: " + interest);

System.out.println("Total Payment: " + (amount + interest));

System.out.println("=========================");
}
	
	@Override
	public double getROI() {
		
		double roi=0;
		
		int  cibil=getCibilScore();
		
		if(cibil>800 && cibil<=900) {
			System.out.println("Excellent: Strong credit profile, best Loan terms.");
			roi=9.0;
		}
		
		else if(cibil>770 && cibil<=800) {
			System.out.println("Very Good:High approval chance, competitive rates");
			roi=9.5;
			
		}
		else if(cibil>700 && cibil<=770) {
			System.out.println("Good: eligible for most loans with decent terms.");
			roi=10.0;
		}
		else if(cibil>600 && cibil<=700) {
			System.out.println("Averge : May get loans but at higher interest");
			roi=12.0;
		}
		else if(cibil>300 && cibil<=600) {
			System.out.println("Poor: High risk; loan application often rejected");
		}
		else {
			System.out.println("invalid entery");
		}
		return roi;
	}
	
	
	@Override
	public boolean isAdharVaild() {
		System.out.println("enter your 12 digits addhar card nuumber:- ");
		String addhar=sc.next();
		boolean addharStatus=addhar.matches("[2-9]{1}[0-9]{11}");
		
		return  addharStatus;
	}
	@Override
	public boolean isPanVaild() {
		System.out.println("enter your 10 digits pan card nuumber:- ");
		String pan=sc.next();
		boolean panStatus=pan.matches("[A-Z]{5}[0-9]{4}[A-Z]{1}");
		
		return  panStatus;
	}
	@Override
	public boolean isPhonnumberVaild() {
		System.out.println("enter your 10 digits phone nuumber:- ");
		String phone=sc.next();
		boolean phoneStatus=phone.matches("[6-9]{1}[0-9]{9}");
		return  phoneStatus;
	}
	
	
	

}
