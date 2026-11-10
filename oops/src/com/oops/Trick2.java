package com.oops;

public class Trick2 {

		// TODO Auto-generated method stub

		
		
		// Online Java Compiler
		// Use this editor to write, compile and run your Java code online

		   int x=10;
//		     static{
//		         System.out.println("static method:- "+x);
//		          x=20;
//		      // System.out.println("static method:- "+x);
		// }
		     // static int x=10;
		 // {
		 //        x=20;
		 //        System.out.println(x);
		 //    }

		    
		 //    {
		 //        x=30;
		 //        System.out.println(x);
		 //    }

		    static {
		        System.out.println("hi static");
		    }
		    {
		        System.out.println("hi block");
		    }

		    Trick2(){
		        System.out.println("hi constructor");
		    }


		    public static void main(String[] args) {

		        Trick2 m=new Trick2();
		        System.out.println(m.x);
		    }
	}

