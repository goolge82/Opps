package com.oops;

public class TestStudent {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		
		Address add=new Address("tirupathi");
		Student s1=new Student(1, "charan", add);
		
		
		System.out.println("-----s1 object dettails----------");
		System.out.println(s1.sid);
		System.out.println(s1.sname);
		System.out.println(s1.add.city);
		
		System.out.println("-------s2 object details----------");
//		shallow copy is here shares the data
		Student s2=(Student)s1.clone();
		
		System.out.println(s2.sid);
		System.out.println(s2.sname);
		System.out.println(s2.add.city);
		
		
//		now change details for s2 student details
		
		System.out.println("----changing details for s2 object details--------");
		
		s2.sid=2;
		s2.sname="eswar";
		
		s2.add.city="guntur";
		
		System.out.println(s2.sid);
		System.out.println(s2.sname);
		System.out.println(s2.add.city);
		
//		let see s1 object details
		
		System.out.println("-----s1 object dettails  after s2 aaddress change ----------");
		
//		here internal data is not keeping the data it sharing the data between two same objects
		System.out.println(s1.sid);
		System.out.println(s1.sname);
		System.out.println(s1.add.city);
		
		
	}

}
