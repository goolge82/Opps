package com.oops;

public class Employee {

	private int eid;
	private String ename;
	private double esal;



public void setid(int eid) {
	this.eid=eid;
}
public void setname(String ename) {
	
	if(ename.length()<9) {
	this.ename="hello "+ename;
}
	else {
		System.out.println("invaild name");
	}
}
public void setsal(double esal) {
	this.esal=esal;
}

public int getid() {
	return eid;
}
public String getname() {
	return ename;
}
public double getsal() {
	return esal;
}
}
