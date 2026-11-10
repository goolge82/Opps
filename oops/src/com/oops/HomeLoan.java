package com.oops;

import java.util.Scanner;

public class HomeLoan extends LoanImpl {

	
	void homeLoanDocInfo() {
		System.out.println("Home Loan Doc info Recevieds Successfully!!");
	}
	static Scanner sc = new Scanner(System.in);

	public static void main(){
		
		HomeLoan hl=new HomeLoan();
		
		if(hl.getEmployeeSalary()>=60000.00 && hl.getCibilScore()>300 && hl.getCibilScore()<=900) {
			if(hl.isAdharVaild() && hl.isPanVaild() && hl.isPhonnumberVaild()) {
				System.out.println("Congrtulations!! Your Home loan got approve!!");
				System.out.println("Homan Loan ROI is: "+hl.getROI());	
				hl.homeLoanDocInfo();
			}
		else {
			System.out.println("Something went wrong with your personal data, can you re-check once");			
		}
		}
			else {
				System.out.println("Your loan got Rejected.Please Try again Later");
			}
		
	}

}
