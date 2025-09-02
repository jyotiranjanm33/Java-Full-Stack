package com.Interface;
interface I1
{
	int i=10;//public static final int i=10;
	void m1();//public abstract void m1();
}
class B implements I1
{
	@Override
	public void m1() {
		System.out.println("M1()-B");
	}
}
public class Test {
public static void main(String[] args) {
	I1 i=new B();
	i.m1();
}
}
