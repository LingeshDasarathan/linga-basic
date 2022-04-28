package com.type;

public class TypeCast {
	public static void main(String[] args) {
		char a='A';
		int b=a;
		long c=b;	
		float d=c;
		System.out.println("before conversion is"+a);
		System.out.println("after conversion is"+b);
		System.out.println("after conversion is"+c);
		System.out.println("after conversion is"+d);
		
		double e=64.0;
		float f=(float)e;
		int g=(int)f;
		byte h=(byte)g;
		System.out.println("before conversion is"+e);
		System.out.println("after conversion is"+f);
		System.out.println("after conversion is"+g);
		System.out.println("after conversion is"+h);
	}

}



