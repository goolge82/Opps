package com.oops;

public class TestBank {

	public static void main(String[] args) {
		
		
		Bank b=new Bank();
//		
//		b.accountholder="charan";
//		b.balance=1000;
//		
//		System.out.println(b.accountholder);
//		System.out.println(b.balance);
		
		
		b.setholder("charankumar");
		
		b.setdeposite(1500);
//		b.setwithdraw(258);
		
		System.out.println(b.getbal());
		System.out.println(b.getholder());
		System.out.println(b.getdepo());
		System.out.println(b.getdepo1());
//		System.out.println(b.getdraw());
		System.out.println(b.getbal1());

	}

}
