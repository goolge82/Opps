package com.oops;

public class Customer implements Cloneable {
	
	@Override
	
	protected Object clone()  throws CloneNotSupportedException{
		return super.clone();
	}
	
	int cid;
	String cname;
	Address1 add1;
	public Customer(int cid, String cname, Address1 add1) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.add1 = add1;
	}

}

class Address1{
	String city;

	public Address1(String city) {
		super();
		this.city = city;
	}
}
