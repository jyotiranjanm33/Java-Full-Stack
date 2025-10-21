package com.dsa.linkedlist;

public class Call {

	public static void main(String[] args) {
		SingleLinked l=new SingleLinked();
		l.add(10);
		l.add(20);
		l.add(30);
		System.out.println(l.toString());
		l.add(1,40);
		System.out.println(l.toString());
		l.remove(1);
		System.out.println(l.toString());

	}

}
