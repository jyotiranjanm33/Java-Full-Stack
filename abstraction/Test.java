package com.abstraction;
abstract class A
{
	abstract public void m1();
}
 class B extends A
{
	@Override
	public void m1() {
		System.out.println("M1() -B");
	}
}
public class Test {

	public static void main(String[] args) {
		A a=new B();
		a.m1();

	}

}
