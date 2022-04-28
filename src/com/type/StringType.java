package com.type;

public class StringType {
	public static void main(String[] args) {
		String s="hello javva";
		String e="  HELLO JAVA    ";
		
		
	int length = s.length();
	System.out.println("length of the string is:"  +length);
	System.out.println("*******************************");
 boolean equals=s.equals("hello javva");
 System.out.println("whether the above string equal or not:"+equals);
 System.out.println("*******************************");
  

 boolean d=s.equalsIgnoreCase("hello Javva");
 System.out.println("ignore case sensitive:"+d);
 System.out.println("*******************************");
 
 String upperCase = s.toUpperCase();
 System.out.println("print string in upper case:"+upperCase);
 System.out.println("*******************************");
 
 String lowerCase=e.toLowerCase();
 System.out.println("print string in lower case:"+lowerCase);
 System.out.println("*******************************");
 
boolean startsWith= s.startsWith("hel");
System.out.println("check the string start with given prefix:"+startsWith);
System.out.println("*******************************");

boolean endsWith = s.endsWith("aa");
System.out.println("check the string ends with given suffix:"+endsWith);
System.out.println("*******************************");


boolean contains = s.contains("llo");
System.out.println("check the given value from string:"+contains);
System.out.println("*******************************");

int indexof =s.indexOf("l");
System.out.println("return the give character index: "+indexof);
System.out.println("*******************************");

int lastIndexOf = s.lastIndexOf("l");
System.out.println("it returns last index value: "+lastIndexOf);
System.out.println("*******************************");


char charAt=s.charAt(6);
System.out.println("returns character index:  "+charAt);
System.out.println("*******************************");

String replace=s.replace("ja", "11");
System.out.println("replace character: "+replace);
System.out.println("*******************************");


String subString=s.substring(3, 11);
System.out.println(subString);
System.out.println("*******************************");

boolean isEmpty=s.isEmpty();
System.out.println("whether the string is empty or not: "+isEmpty);
System.out.println("*******************************");

String[] split=s.split("");
System.out.println("split the word: "+split[0]);
for(String str : split)
{
	System.out.println(str);
}
System.out.println("*******************************");

String trim=e.trim();
System.out.println("remove unwanted spaces:"+trim);
System.out.println("*******************************");

String a1="A";
String a2="F";
int compareTo=a1.compareTo(a2);
System.out.println(compareTo);
System.out.println("*******************************");

a1=a1+a2;
String concat=a1.concat(a2);
System.out.println(concat);
System.out.println("*******************************");

int f=575754674;
 String valueOf=String.valueOf(f);
 System.out.println(valueOf);
 System.out.println("*******************************");
 
 char[] chararray = s.toCharArray();
 for(char c : chararray){
	 System.out.println(c);
 }
System.out.println(chararray);
System.out.println("*******************************");
}


}
