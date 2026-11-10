package com.oops;

import java.util.Scanner;

//parent class is delivery
class Delivery {
	
	static Scanner sc=new Scanner(System.in);
	int getid() {
		System.out.println("enter id:- ");
		int id=sc.nextInt();
		return id;
	}
	
	String getname() {
		System.out.println("enter name:- ");
		String name=sc.next();
		return name;
	}
	double getdistance() {
		System.out.println("enter distance:- ");
		double d=sc.nextDouble();
		return d;
	}
	
	double getcharge(double d) {
		return 0.0;
	}
}

	
	class Bike extends Delivery{
		
		public double getcharge(double d) {
			
			double charge=d*10;
			return charge;
		}
	
		
	}
	class Cycle extends Delivery{
      public double getcharge(double d) {
			
			double charge=d*5;
			return charge;
		}
	
		
	}
	class Express extends Delivery{
		
        public double getcharge(double d) {
			
			double charge=d*20;
			return charge;
		}
	
		
	}
public 	class TestDelievery{
	
	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		
		Delivery d=new Delivery();
		
		int id = d.getid();

        String name = d.getname();

        double distance = d.getdistance();
		
		System.out.println("1. Bike Delivery");
        System.out.println("2. Cycle Delivery");
        System.out.println("3. Express Delivery");

        System.out.println("Select delivery type:");
        int choice = sc.nextInt();


        switch (choice) {

        case 1:
        	
        	
        	Bike b=new Bike();
        	

            System.out.println("Delivery ID: " + id);
            System.out.println("Partner Name: " +name);
            System.out.println("Total distance: " +distance+"km");
            System.out.println("Total Charge: " + b.getcharge(distance));
            break;
       

        case 2:

        	
        	
        	Cycle c=new Cycle();
        	System.out.println("Delivery ID: " + id);
            System.out.println("Partner Name: " +name);
            System.out.println("Total distance: " +distance+"km");
            System.out.println("Total Charge: " + c.getcharge(distance));
            break;

        case 3:

        	
        	
  
        	
            Express e=new Express();
   
            System.out.println("Delivery ID: " + id);
            System.out.println("Partner Name: " +name);
            System.out.println("Total distance: " +distance+"km");
            System.out.println("Total Charge: " + e.getcharge(distance));
            break;

        default:
            System.out.println("Invalid choice");
        }
        
        sc.close();
    }
		
}

