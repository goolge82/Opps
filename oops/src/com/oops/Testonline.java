package com.oops;

import java.util.Scanner;

//1.You are developing an online learning platform 
//where users can be students, instructors, or admins.
//
//-> All users share common attributes like username and password,
//but each has different roles and permissions.
//
//->Use inheritance to model this by creating a base class User 
//and extending it with role-specific classes.
//
//->Each subclass should implement behaviors like submitAssignment() for students 
//and createCourse() for
//instructors .
//Demonstrate the functionality in the main() method.

//class Online {
//	
//	static Scanner sc=new Scanner(System.in);
//	
//	String getname() {
//		System.out.println("enter your name:- ");
//		String name=sc.next();
//		return name;
//	}
//	
//	int getpassword() {
//		System.out.println("enter your password:- ");
//		int password=sc.nextInt();
//		return password;
//	}
//	
//}
//
//class student extends Online {
//	
//	void sumbit() {
//		System.out.println("assignments submit to instructors");
//	}
//	
//}
//
//class instructor extends Online {
//	
//	void assignments() {
//		System.out.println("assignments taken from students");
//	}
//	
//	void course() {
//		System.out.println("course created");
//	}
//	
//}
//
//class admin extends Online {
//	
//	void record() {
//		System.out.println("recorded class viedos sended to students");
//	}
//	
//}
//
//public class Testonline{
//	
//	public static void main(String[] args) {
//		
//		Scanner sc=new Scanner(System.in);
//		
//		
//		Online t=new Online();
//		
//		
//		System.out.println("--welcome to Vcube------");
//		System.out.println("1.Student");
//		System.out.println("2.instructor");
//		System.out.println("3.Admin");
//		
//	
//		
//		System.out.println("enter your choice:- ");
//		int c=sc.nextInt();
//		
//		String name=t.getname();
//		int password=t.getpassword();
//		
//		switch(c) {
//		
//		case 1:
//			student s=new student();
//			System.out.println("student-name:- "+name);
//			System.out.println("password:- "+password);
//			s.sumbit();
//			break;
//			
//			
//		case 2:
//			instructor i=new instructor();
//			System.out.println("instructor-name:- "+name);
//			System.out.println("password:- "+password);
//			i.assignments();
//			i.course();
//			break;
//			
//			
//		case 3:
//			admin a=new admin();
//			System.out.println("admin-name:- "+name);
//			System.out.println("password:- "+password);
//			a.record();
//			break;
//			
//			default:
//				System.out.println("invaild enter");
//			
//		}
//		
//		sc.close();
//	}
//	
//}

class User{
	
	static Scanner sc=new Scanner(System.in);
	
	String name;
	int password;
	
	void username() {
		System.out.println("enter your name:- ");
		name=sc.next();
	}
	
	void password() {
		System.out.println("enter password:- ");
		password=sc.nextInt();
	}
	
	void display() {
		System.out.println("User name:- "+name);
		System.out.println("User password:- "+password);
	}
}

class student extends User {
	
	void sumbit() {
		System.out.println("assignments submit to instructors");
	}
	
}

class instructor extends User {
	
	void assignments() {
		System.out.println("assignments taken from students");
	}
	
	void course() {
		System.out.println("course created");
	}
	
}

class admin extends User {
	
	void record() {
		System.out.println("recorded class viedos sended to students");
	}
}

public class Testonline{
	
	public static void main(String[] args) {
		

		
		Scanner sc=new Scanner(System.in);
//		User t=new User();
		
		
		System.out.println("--welcome to Vcube------");
		System.out.println("1.Student");
		System.out.println("2.instructor");
		System.out.println("3.Admin");
		
	
		
		System.out.println("enter your choice:- ");
		int c=sc.nextInt();
		
		switch(c) {
		
		case 1:
			student s=new student();
			
			s.username();
			s.password();
			s.display();
			s.sumbit();
			break;
			
			
		case 2:
			instructor i=new instructor();
			i.username();
			i.password();
			i.display();
			i.assignments();
			i.course();
			break;
			
			
		case 3:
			admin a=new admin();
			
			a.username();
			a.password();
			a.display();
			a.record();
			break;
			
			default:
				System.out.println("invaild enter");
			
		}
		sc.close();
	
	}
	
}


