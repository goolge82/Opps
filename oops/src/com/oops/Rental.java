package com.oops;

import java.util.Scanner;

class Vehicle{
	
	static Scanner sc=new Scanner(System.in);
	
	
//	private varibles
	private String vehicleNumber;
	private String brand;
	private int rent;
	
	
//	for above private varible to access the data i use Setters
	public void setnumber(String vehicleNumber) {
		
		this.vehicleNumber= vehicleNumber;
	}
	public void setbrand(String brand) {
		this.brand=brand;
		
	}
	public void setrent(int rent) {
		this.rent=rent;
	}

	
	
//	to read above setter data i use getters 
	public String getnumber() {
		return vehicleNumber;
	}
	
	public String getbrand() {
		return brand;
	}
	
	public int getrent() {
		return rent;
	}
	
	
//	here it is overriding the method in child class which class need according to they requreidments
	double calculate() {
		return 0.0;
	}
}


//here child class car extends parent class vehicle
class car extends Vehicle{
	

//	here i created a method day()
	int day() {
		System.out.println("enter how many days want rent:- ");
		int days=sc.nextInt();
		return days;
	}
	
	
//	here i override the calculate methode in child with different behaviour
	double calculate() {
		
//		 in these i took a varible charge for that i did charge calculation 
//		 given days by user and rent charge fixed by rental owner
		double charge=day()*getrent();
		return charge;
	}
	

}

class bike extends Vehicle{
	
//	here i created a method day()
	 int day() {
		 System.out.println("enter how many days want rent:- ");
		 int days=sc.nextInt();
		 return days;
	 }
	 
//		here i override the calculate methode in child with different behaviour

	 double calculate() {
		 
//		 in these i took a varible charge for that i did charge calculation 
//		 given days by user and rent charge fixed by rental owner
		 double charge=day()*getrent();
		 
		 return charge;
	 }
	
}

public class Rental {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		
//		displaying opions
		System.out.println("---------Welcome to Vcube rental Vehicles-----------------");
		System.out.println("1.Car");
		System.out.println("2.Bike");
		
		
//		user choice
		System.out.println("enter choice:- ");
		int c1=sc.nextInt();
		
//		switch case
		switch(c1) {
		
		case 1:
			System.out.println("Vehicle details");
			
			car c=new car();
			
			c.setnumber("AP160702");
			c.setbrand("Nexneo");
			c.setrent(1000);
			
			
			System.out.println("Car Number:-"+c.getnumber());
			System.out.println("Car Brand:-"+c.getbrand());
			System.out.println("Car rental per day:- "+c.getrent());
			System.out.println("total charge is:-"+c.calculate());
			break;
			
			
		case 2:
			System.out.println("Vehicle details");
			
			bike b=new bike();
			
			b.setnumber("AP1C602");
			b.setbrand("RoyalInFeild");
			b.setrent(500);
			
			
			System.out.println("Bike Number:-"+b.getnumber());
			System.out.println("Bike Brand:-"+b.getbrand());
			System.out.println("Bike rental per day:- "+b.getrent());
			System.out.println("total charge is:-"+b.calculate());
			break;
			
			
		default:
			System.out.println("invaild choice");
		}
		
		sc.close();
		

	}

}
