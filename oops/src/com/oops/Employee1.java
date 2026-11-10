package com.oops;

public class Employee1 {
	
	int eid;
	String ename;
	Address2 add2;
	public Employee1(int eid, String ename, Address2 add2) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.add2 = add2;
	}
	
	public Employee1(Employee1 emp) {
		super();
		this.eid =emp. eid;
		this.ename =emp. ename;
		this.add2 =new Address2(emp.add2);
	}

}


class Address2{
	
	String city;

	public Address2(String city) {
		this.city = city;
	}
	
	public Address2(Address2 add2) {
		this.city =add2.city;
		
	}
}
