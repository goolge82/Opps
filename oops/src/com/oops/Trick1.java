package com.oops;


class A{
	 int x=10;
	
	A(){
		
//		System.out.println("A.show it is constructor:- "+x);
		show();
//		System.out.println("A.show it is constructor:- "+x);
	}
	
	 void show() {
		System.out.println("A.show it is instance method:- "+x);
	}
	
}

class B extends A{
	 int x=20;
	
	B(){
		
		System.out.println("B.shows it constructor:-"+x);
	}
	
	 void show() {
		System.out.println("b.show it is instance method:-"+x);
	}
	
}

public class Trick1 {
	

	public static void main(String[] args) {
//		
       A a=new B();
//		
		System.out.println(a.x);
	
//		

	}

}
