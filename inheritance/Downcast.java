package com.inheritance;
class Animall
{
	void eat()
	{
		System.out.println("Animal Eat");
	}
}
class Dogg extends Animall
{
	@Override
	void eat()
	{
		System.out.println("Dog Eat");
		
	}
	
	void bark()
	{
		System.out.println("Dog Bark");
	}
}

public class Downcast {

	public static void main(String[] args) {
		Animall a=new Animall();
		a.eat();
		// a=new Dogg();
		//a.eat();
		Dogg d=new Dogg();
		a=(Dogg)d;//a=d
		a.eat();
		d=(Dogg)a;//Downcasting
		d.eat();
		d.bark();
	}

}
