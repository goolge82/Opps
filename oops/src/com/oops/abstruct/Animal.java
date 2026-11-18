package com.oops.abstruct;

public abstract interface Animal {
	
	
	public final static int a=10;
	
	int b=20;
	
	public static final  String orgName="Vcube";
	
//	by default interface variables are static final public which we cannot change 
	
//	by default interface is abstract
	
	public abstract void sound();
	
	public abstract void eat();
	
	public abstract void walk();
	
	
//	if we sudden requiredment to add it will give error to cat,dog,monkey classes
//	to avoid these we can use default methods
//	and also we can override default methods 
	default void sleep(){
		System.out.println("Animals can sleep");
		System.out.println(b);
		hello();
	}
	
	
//	if we need constent behavoir we can use default method also
//	we can only use default in interface only we cannot use default in classes-implement
	default void run() {
		System.out.println("Animals can run");
		hello();
	}
	
//	static methods and defaults methods are introduce from java 1.8 onwards
//	static methods cannot override
//	generally we can call directly
//	we can call with class name
//	we can call with object refence
//	but in abstract static method we cannot call with object reference
//	we can call with only interface name
	
//	we want constent information for all classes we can use static method
	public static void breath() {
		System.out.println("Animals can breath");
	}
	
	
	private void hello() {
		System.out.println("Hello!!");
		System.out.println("Hello!!");
		System.out.println("Hello!!");
		System.out.println("Hello!!");
		System.out.println("Hello!!");
	}

}
