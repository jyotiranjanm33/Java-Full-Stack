package com.inheritance;
class M
{
	void m1()
	{
		System.out.println("A m1()");
	}
}
class N extends M
{
	void m2()
	{
		super.m1();
		System.out.println("B m1()");
	}
}

class Demo5 {

	public static void main(String[] args) {
		N n=new N();
		n.m2();

	}

}
