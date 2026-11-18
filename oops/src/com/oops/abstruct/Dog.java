package com.oops.abstruct;

public class Dog  implements Animal{

public void sound() {
		
		System.out.println("Dog sounds like bow bow !!");

	}

	public void eat() {
		
		System.out.println("Dog eat meat!!");

	}

	public void walk() {
		System.out.println("Dog walk like loyal !!");

	}
	
	@Override
	public void sleep() {
		System.out.println("Dog sleep at morning and help at night");
	}

}
