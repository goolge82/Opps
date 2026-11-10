package com.oops;



class Device{
	private String brand;
	private double price;
	
	public void setbrand(String brand) {
		this.brand=brand;
	}
	
	public void setprice(double price) {
		this.price=price;
	}
	
	public String getbrand() {
		return brand;
	}
	public double getprice() {
		return price;
	}
	
	void displaymethod() {
		System.out.println("brand is:- "+brand);
		System.out.println("price of product:-"+price);
	}

}

class laptop extends Device{
	
	int ram;
	String processor;
	
	void cunIDE() {
		System.out.println("IDE is Installed");
	}
	void compilecode() {
		System.out.println("Code is compiled");
	}
	
	void displaymethod() {
		
		System.out.println("brand is:- "+getbrand());
		System.out.println("price of product:-"+getprice());
		System.out.println("laptop ram is:- "+ram);
		System.out.println("laptop  processor is:- "+processor);
	}
	
	
}

class mobile extends Device{
	
	int camera=48;
	int battery=100;
	
	void makecall() {
		System.out.println("make a call");
	}
	void takephoto() {
		System.out.println("take a photo");
	}
	
void displaymethod() {
		
		System.out.println("brand is:- "+getbrand());
		System.out.println("price of product:-"+getprice());
		System.out.println("mobile ram is:- "+camera);
		System.out.println("mobile  processor is:- "+battery);
	}
	
}
public class Vcube {

	public static void main(String[] args) {
		
	
		
		laptop l=new laptop();
		
		l.setbrand("HP");
		l.setprice(650000);
		l.ram=16;
		l.processor="inteal5";
		
		l.displaymethod();

	}

}
