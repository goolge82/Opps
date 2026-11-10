package com.oops;

public class TestCustomer {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		
		Address1 add1=new Address1("Bangoler");
		
		Customer c1=new Customer(1,"charan", add1);
		
		System.out.println("------c1 object details-----------");
		System.out.println(c1.cid);
		System.out.println(c1.cname);
		System.out.println(c1.add1.city);
		
		Customer c2=(Customer) c1.clone();
		
		System.out.println("------c2 object details-----------");
		System.out.println(c2.cid);
		System.out.println(c2.cname);
		System.out.println(c2.add1.city);
		
        System.out.println("----changing details for s2 object details--------");
		
		c2.cid=2;
		c2.cname="eswar";
		
		c2.add1.city="guntur";
		System.out.println(c2.cid);
		System.out.println(c2.cname);
		System.out.println(c2.add1.city);
		
//		let see s1 object details
		
		System.out.println("-----c1 object dettails  after c2 aaddress change ----------");
		
//		here internal data is not keeping the data it sharing the data between two same objects
		
//		here id and name are not sharing even if we changing it has own data for both but address are same for both
		
		System.out.println(c1.cid);
		System.out.println(c1.cname);
		System.out.println(c1.add1.city);
		
		System.out.println(c1==c2);// false because id, name are not same for both object
		System.out.println(c1.add1.city==c2.add1.city);//true here address are same for both
		

	}

}
