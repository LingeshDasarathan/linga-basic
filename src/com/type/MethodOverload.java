package com.type;



public class MethodOverload {
	public void bank_Details() {
		System.out.println("personal Details");
	}
	public void bank_Details(String a) {
		System.out.println("customer name:"+a);
	}
	public void bank_Details(int b,int c,int d) {
		System.out.println("Account number:"+b);
		System.out.println("cif no:"+c); 
		System.out.println("micr no:"+d);
	}
	public void bank_Details(String e,int f) {
		System.out.println("Address:"+e);
		System.out.println("pincode:"+f);
	}
public static void main(String[] args) {
	MethodOverload bank=new MethodOverload();
	bank.bank_Details();
	bank.bank_Details("lingesh");
	bank.bank_Details(123, 456, 789);
	bank.bank_Details("kolathur", 600099);
	
}
	
	
	
	

}


