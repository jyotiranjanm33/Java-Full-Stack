package com.dsa;

public class Test {

	public static void main(String[] args) {
		Object o=20;
		System.out.println(o);
//System.out.println(o*2);
		Integer i=new Integer(10);
		System.out.println(i);
		System.out.println(i*2);
		
		System.out.println(((Integer) o).intValue());
		System.out.println((Integer)o*2);
	}

}
