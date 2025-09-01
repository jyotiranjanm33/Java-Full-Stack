package com.abstraction;
abstract class Bank
{
	abstract int rateofInt();
}
class SBI extends Bank
{
	@Override
	int rateofInt() {
		// TODO Auto-generated method stub
		return 10;
	}
}
class ICICI extends Bank
{
	@Override
	int rateofInt() {
		// TODO Auto-generated method stub
		return 11;
	}
}
class Axis extends Bank
{
	@Override
	int rateofInt() {
		// TODO Auto-generated method stub
		return 12;
	}
}
public class Test3 {

	public static void main(String[] args) {
		Bank b;
		b=new SBI();
		System.out.println(b.rateofInt());
		b=new ICICI();
		System.out.println(b.rateofInt());
		b=new Axis();
		System.out.println(b.rateofInt());
	}

}
