package com.type;

import java.util.HashSet;


public class Set {
	public static void main(String[] args) {
		HashSet<Object>s=new HashSet<Object>();
		HashSet<Object>s1=new HashSet<Object>();
		s.add(12);
		s.add("gjg");
		s.add(454);
		s.add(null);
		s.add(null);
		s.add(54);
		s1.add(576);
		s1.add("dell");
		s1.add(123);
		
		System.out.println(s);
		System.out.println(s1);
		
		int size = s.size();
		System.out.println(size);
		
		boolean contains = s.contains(12);
		System.out.println(contains);
		
		boolean empty = s.isEmpty();
		System.out.println(empty);
		s.addAll(s1);
		System.out.println(s);
		
		s.remove(0);
		System.out.println(s);
		s.clear();
		System.out.println(s);
		
		
		
		
		
	}

}


