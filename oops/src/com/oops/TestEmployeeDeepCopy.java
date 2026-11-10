package com.oops;

public class TestEmployeeDeepCopy {

	public static void main(String[] args) {
		
		
		Address2 add2=new Address2("Srikalahasti");
		
		Employee1 e1=new Employee1(1,"charan",add2);
		
		System.out.println("----e1 object details--------");
		System.out.println(e1.eid);
		System.out.println(e1.ename);
		System.out.println(e1.add2.city);
		
		
		
       Employee1 e2=new Employee1(e1);
		
		System.out.println("----e2 object details--------");
		System.out.println(e2.eid);
		System.out.println(e2.ename);
		System.out.println(e2.add2.city);
		
//yes here we simple copy the e1 data into e2 data
		
//		now here change e2 address
		
		e2.eid=2;
		e2.ename="eswar";
		e2.add2.city="Narasaropeta";
		System.out.println("----e2 object details after changing address--------");
		System.out.println(e2.eid);
		System.out.println(e2.ename);
		System.out.println(e2.add2.city);
		
//		now let's check e1 address
		
		System.out.println(e1.add2.city);//narasaropeta
//		here by changing e2 address e1 address also change 
//		but we don't need like we want it separted data for each object
//		so create new class for in copy constructor
		
		System.out.println("----ae2 object details after changing address e1 object details--------");

		System.out.println(e1.eid);
		System.out.println(e1.ename);
		System.out.println(e1.add2.city);


	}

}
