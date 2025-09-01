package com.abstraction;
abstract class X
{
	abstract public void m1();
	abstract public void m2();
}
abstract class Y extends X
{
	@Override
	public void m1() {
		System.out.println("M1()-Y");
		}
	
}
class Z extends Y
{
	@Override
	public void m2() {
		System.out.println("M1()-Z");}

}
public class Test1 {

	public static void main(String[] args) {
		X a =new Z();
		a.m1();
		a.m2();
		
	}

}
