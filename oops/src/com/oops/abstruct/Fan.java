package com.oops.abstruct;

import java.util.Scanner;

class AC implements Smart{
	
	public void turnon() {
		System.out.println("AC turn On");
	}
	
	public void turnoff() {
		System.out.println("AC turn Off");
	}
}

class Light implements Smart{
	
	@Override
	public void turnon() {
		System.out.println("Light turn On");
		
	}
	
	
	public void turnoff() {
		System.out.println("Light turn Off");
	}

}

public class Fan  implements Smart{
	
	@Override
	public void turnon() {
		System.out.println("fan turn On");
		
	}
	
	
	public void turnoff() {
		System.out.println("fan turn Off");
	}

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Fan-device");
		System.out.println("Light-device");
		System.out.println("AC-device");
		System.out.println("enter your choice:-");
		int c=sc.nextInt();
		
		 switch (c) {

         case 1:
        	 Smart s = new Fan();
        	 s.turnon();
        	 s.turnoff();
             break;

         case 2:
        	 Smart a = new Light();
        	 a.turnon();
        	 a.turnoff();
             break;

         case 3:
        	Smart  b = new AC();
        	 b.turnon();
        	 b.turnoff();
             break;

         default:
             System.out.println("Given choice is invalid");
     }

     sc.close();
 }
}