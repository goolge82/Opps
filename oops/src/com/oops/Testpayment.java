package com.oops;

import java.util.Scanner;

class Payment{
	
	
	static Scanner sc=new Scanner(System.in);

	String Customername;
	double Amount;
	
	void getname() {
		System.out.println("enter Custmoer name:- ");
		Customername=sc.next();;
	}
	void getamount() {
		System.out.println("enter the amount:- ");
		Amount=sc.nextDouble();
	}
	
	void makePayment() {
		
		System.out.println("payment method is:- ");
	}
}


class upi extends Payment{
	
        int upiVaild() {
        	System.out.println("enter upi pin:- ");
        	int n1=sc.nextInt();
        	return n1;
	}
        
        void makePayment() {
        	
        	int s=upiVaild();
        	
        	if(s==123456) {
        		System.out.println("upi number is vaild");
        		System.out.println("payment successfully");
        	}
        	else {
        		System.out.println("upi number is not vaild");
        		System.out.println("payment is unsuccessfully");
        	}
        	
        }
	
}

class card extends Payment{
	
	int cardVaild() {
		System.out.println("enter your card:- ");
		int n2=sc.nextInt();
		return n2;
	}
	
	void makePayment() {
		
		int cvv=cardVaild();
		
		if(cvv==345) {
			System.out.println("card number is vaild");
			System.out.println("payment successfully");
		}
		else {
			System.out.println("card is not vaild");
			System.out.println("payment is unsuccessfully");
		}
	}
	
}

class cash extends Payment{
	
	double cash() {
		System.out.println("enter  cash:- ");
		double c=sc.nextDouble();
		return c;
	}
	
	void makePayment() {
	    double bal = cash();

	    if(bal >= Amount) {
	        System.out.println("Sufficient cash");
	        System.out.println("Payment successful");
	        System.out.println("Remaining balance: " + (bal - Amount));
	    }
	    else {
	        System.out.println("Insufficient cash");
	        System.out.println("Shortage: " + (Amount - bal));
	    }
	}
	
}


public class Testpayment {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("1.upi");
		System.out.println("2.card");
		System.out.println("3.cash");
		
		System.out.println("enter choice:- ");
		int choice=sc.nextInt();
		
		switch(choice) {
		
		case 1:
			upi u=new upi();
			
			u.getname();
			u.getamount();
			u.makePayment();
			break;
			
		case 2:
			card cd=new card();
			
			cd.getname();
			cd.getamount();
			cd.makePayment();
			break;
			
		case 3:
			cash c=new cash();
			
			c.getname();
			c.getamount();
			c.makePayment();
			break;
			
			default:
				System.out.println("invaild number");
		}
		sc.close();
		

	}

}
