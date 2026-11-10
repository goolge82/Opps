package com.oops;

import java.util.Scanner;


//-------------rectangle--------------------
class Rectangle extends Testshapes{
	

@Override
public Double getarea() {
		
	
		System.out.println("enter the length:- ");
		double l=sc.nextDouble();
		System.out.println("enter the breadth:- ");
		double b=sc.nextDouble();
		
		double area=l*b;
		
		return area;
	}
	
}

class Triangle extends Testshapes{
	
	public Double getarea() {
		
		System.out.println("enter the height:- ");
		double h=sc.nextDouble();
		System.out.println("enter the base :- ");
		double b=sc.nextDouble();
		
		double area=0.5*b*h;
		
		return area;
	}
	
}

class Square extends Testshapes{
	
	public Double getarea() {
		System.out.println("enter the side:- ");
		double s=sc.nextDouble();
		double area=s*s;
		return area;
		
	}
	
}

class Parallelogram extends Testshapes{
	
	public Double getarea() {
		
		System.out.println("enter the height:- ");
		double h=sc.nextDouble();
		System.out.println("enter the base :- ");
		double b=sc.nextDouble();
		
		double area=b*h;
		
		return area;
	}
	
}

class Rhombus extends Testshapes{
	
	public Double getarea() {
		
		System.out.println("enter the d1:- ");
		double d1=sc.nextDouble();
		System.out.println("enter the d2 :- ");
		double d2=sc.nextDouble();
		
		double area=0.5*d1*d2;
		
		return area;
	}
	
}


class Ecilpse extends Testshapes{

public Double getarea() {
		
		System.out.println("enter the a:- ");
		double a=sc.nextDouble();
		System.out.println("enter the b:- ");
		double b=sc.nextDouble();
		
		double area=3.14*a*b;
		
		return area;
	}
	
}

class Trapazium extends Testshapes{

public Double getarea() {
		
		System.out.println("enter the a:- ");
		double a=sc.nextDouble();
		System.out.println("enter the b:- ");
		double b=sc.nextDouble();
		System.out.println("enter the height:- ");
		double h=sc.nextDouble();
		
		double area=0.5*(a+b)*h;
		
		return area;
	}
	
}

public class TestshapesDemo  extends Testshapes{
	
	
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		
		TestshapesDemo t=new TestshapesDemo();
		
		Rectangle rect=new Rectangle();
		Triangle t1=new Triangle();
		Square s=new Square();
		Parallelogram p=new Parallelogram();
		Rhombus rh=new Rhombus();
		Ecilpse ec=new Ecilpse();
		Trapazium tra=new Trapazium();
		
		System.out.println("Area of Circle:- "+t.getarea());
		
		System.out.println("Area of Rectangle:- "+ rect.getarea());	
		System.out.println("Area of triangle:- "+ t1.getarea());	
		System.out.println("Area of Square:- "+ s.getarea());	
		System.out.println("Area of Parallelogram:- "+ p.getarea());	
		System.out.println("Area of Rhombus:- "+ rh.getarea());	
		System.out.println("Area of Ecilpse:- "+ ec.getarea());	
		System.out.println("Area of Trapazium:- "+ tra.getarea());	
		
			
		}
	
	
	
//	-------------------------circle--------------------------------------
	@Override
	public Double getarea() {
		
		System.out.println("enter the circle radius:- ");
		double r=sc.nextDouble();
		double area=3.14*r*r;
		return area;
	}
	
	public Integer getoffer() {
		System.out.println("enter the number:- ");
		int n=sc.nextInt();
		return n;
	}

	
	

}
