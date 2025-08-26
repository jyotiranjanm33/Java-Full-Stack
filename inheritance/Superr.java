package com.inheritance;

class Superr {
static int i=10;int j=20;
}
class A extends Superr
{
	static int i=30;int j=40;
	public void m1() {
		System.out.println(i+" "+j);
		System.out.println(super.i+" "+super.j);
	}
	public static void m2()
	{
		System.out.println(i);
		//System.out.println(super.i);
		System.out.println(Superr.i);
	}
}
class Demo2
{
	public static void main(String[] args) {
		A a =new A();
		a.m1();
		a.m2();
	}
}