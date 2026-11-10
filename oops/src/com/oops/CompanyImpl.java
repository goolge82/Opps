package com.oops;

import java.util.Scanner;

public class CompanyImpl implements Company {
	
	
	static Scanner sc=new Scanner(System.in);
	
	@Override
	public int getEmployeeid() {
		
		System.out.println("enter your id:- ");
		int id=sc.nextInt();
		return id;
	}
	
	@Override
	public String getEmployeename() {
		System.out.println("enter your name:- ");
		String name=sc.next();
		return name;
	}
	
	@Override
	public Double getEmployeeSalary() {
		System.out.println("enter your salary:- ");
		double sal=sc.nextDouble();
		return sal;
	}
	@Override
	public Double getHours() {
		System.out.println("enter your working hours:- ");
		double hours=sc.nextDouble();
		return hours;
	}
	@Override
	public double getannual(double sal) {
		double annual=sal*12;
		return annual;
	}
	@Override
	public double getcalbonus(double sal) {
		double bonus=sal*0.10;
		return bonus;
	}
	@Override
	public Double getBasicpay() {
		double sal=getEmployeeSalary();
		return sal;
	}
	

}
