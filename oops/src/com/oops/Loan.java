package com.oops;

public interface Loan {

	public abstract Double getEmployeeSalary();

	int getEmployeeAge();

	int getCibilScore();

	double getLoanAmount();

	int getLoanTenure();

	double calculateEMI(double amount, double roi, int years);

	double getTotalInterest(double roi, int years, double amount);

	double getROI();

	boolean isAdharVaild();

	boolean isPanVaild();

	boolean isPhonnumberVaild();

}
