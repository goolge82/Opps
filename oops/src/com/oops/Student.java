package com.oops;

public class Student implements Cloneable  {
	
//	shallow copy means cloaning the one object to another object
	
	
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
		
	}
	
	int sid;
	String sname;
	Address add;
	public Student(int sid, String sname, Address add) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.add = add;
	}
	

}
class Address{
	String city;

	public Address(String city) {

		
		this.city=city;
		
	}
	
}
