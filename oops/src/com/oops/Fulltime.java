package com.oops;

import java.util.Scanner;

public class Fulltime extends CompanyImpl {
	
	static Scanner sc=new Scanner(System.in);

	public static void main(String[] args) {
		
		Fulltime fl=new Fulltime();
		
		int eid=fl.getEmployeeid();
		
		String ename=fl.getEmployeename();
		
		double ebasic=fl.getBasicpay();
		
		double eannual=fl.getannual(ebasic);
		
		double ebonus=fl.getcalbonus(ebasic);
		
		
		System.out.println("employee id:- "+ eid);
		System.out.println("employee name:- "+ ename);
		System.out.println("employee basic salary:- "+ ebasic);
		System.out.println("employee annual salary:- "+ eannual);
		System.out.println("employee bouns:-"+ ebonus);
		System.out.println("total monthly salary after bonus:- "+ (ebasic+ebonus));


	}
	
	@Override
	public Double getBasicpay() {
		double sal=getEmployeeSalary();
		return sal;
	}

}
