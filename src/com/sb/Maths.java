package com.sb;

import java.util.Scanner;

public class Maths {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		System.out.println("Enter number:");
		System.out.println(x);
		
		
		int n=(int)(Math.random()*11);
		System.out.println("random number:");
		System.out.println(n);
		System.out.println("result:");
		
		if(n==x) {
			System.out.println("won");
			
		}
		else {
			System.out.println("lose");
		}
		
	}

}



