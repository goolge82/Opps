package com.oops;

public class TestBank1 {

	public static void main(String[] args) {
		
		
		Bank1 b1=new Bank1();
		

        b1.setholder("charankumar");
        b1.setbalance(2500);

        System.out.println("Account Holder: "
                + b1.getholder());

        System.out.println("Balance: "
                + b1.getbal());

	}

}
