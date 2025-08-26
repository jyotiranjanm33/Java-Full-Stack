package com.inheritance;

class C {
	C()
	{
		System.out.println("No args in C");	
	}}
	class D extends C
	{
		D()
		{
			System.out.println("No args in D");
		}
	}
class Test3
{
	public static void main(String[] args) {
		new D();
	}
}
