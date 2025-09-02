package com.Interface;
interface I11
{
	void m1();
}
interface I2 extends I11
{
	void m2();
}
class BB implements I2
{
	@Override
	public void m1() {
		System.out.println("M1()-B");
		
	}
	@Override
	public void m2() {
		System.out.println("M2()-B");
		
	}
}
public class Test2 {

	public static void main(String[] args) {
		I11 i=new BB();
		i.m1();
		//i.m2();
		I2 i1=new BB();
		i1.m1();
		i1.m2();

	}

}
