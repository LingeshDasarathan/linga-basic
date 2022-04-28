package com.type;

import java.util.ArrayList;
import java.util.LinkedList;



public class Collection {
	public static void main(String[] args) {
		ArrayList<Object> l1=new ArrayList<Object>();
		l1.add("hello");
		l1.add("1");
		l1.add("1");
		l1.add("function");
		l1.set(2, "add");
		System.out.println(l1);
		
		for(Object list:l1) {
			System.out.println(list);
		}
		
		LinkedList<Object> l2=new LinkedList<Object>();
		l2.add("array");
		l2.add("vector");
		l2.add("12354");
		l2.add("7879");
		l2.addFirst("set");
		l2.add("vector");
		
		l2.remove(4);
		l2.add(4, "changed");
		l2.size();
		l2.get(2);
		System.out.println(l2);
		
		for(Object list1:l2) {
			System.out.println(list1);
		}
		
		
	}
	
}