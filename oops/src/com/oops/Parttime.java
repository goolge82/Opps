package com.oops;

import java.util.Scanner;



public class Parttime extends CompanyImpl {
	
	static Scanner sc=new Scanner(System.in);

	public static void main(String[] args) {
		
		
		Parttime pt=new Parttime();
		
		int eid=pt.getEmployeeid();
		String ename=pt.getEmployeename();
	    double ehours=pt.getHours();
	    
	    double ebasic=pt.getBasicpay();
	    
	    System.out.println(eid);
	    System.out.println(ename);

	    System.out.println(ehours);
	    System.out.println(ebasic);
		
	   

	}
	
	@Override
	public Double getBasicpay() {
		double sal=getEmployeeSalary();
		double increment=sal*0.5;
		double total=sal+increment;
		return total;
	}
	

}
