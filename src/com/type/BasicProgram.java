package com.type;



public class BasicProgram {
	public void factorial() {
		int count=1;
		for(int i=1;i<=5;i++) {
			count=count*i;
		}
		System.out.println("factorial"+count);

	}
	public void fibonacci() {
		int a=0,b=1,c;
		System.out.println(a+",");
		System.out.println(b+",");
		for(int i=1;i<=10;i++) {
			c=a+b;
		
		System.out.println(c+",");
		a=b;
		b=c;
		}
		}
	public void star() {
		for(int i=1;i<10;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
			
		
			
			
		public static void main(String[] args) {
			BasicProgram b=new BasicProgram();
			b.factorial();
			b.fibonacci();
			b.star();
			
		}
		
		

	}


