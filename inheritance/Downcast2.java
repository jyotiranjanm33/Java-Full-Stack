package com.inheritance;
class Animalll
{
	void eat()
	{
		System.out.println("Animal Eat");
	}
}
class Doggg extends Animalll
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
class Babyydog extends Doggg
{
	@Override
	void eat()
	{
		System.out.println("BabyDog Eat");
		
	}
	@Override
	void bark()
	{
		System.out.println("BabyDog Bark");
	}
	void weep()
	{
		System.out.println("Babydog Weep");
	}
}
public class Downcast2 {

	public static void main(String[] args) {
		Animalll a =new Babyydog();
		a.eat();
		//Doggg d=new Doggg();
		//Babyydog b=new Babyydog();
		//d=b;
		Doggg d=(Doggg)a;
		d.eat();
		d.bark();
		//d.weep();
		Babyydog b=(Babyydog)a;
		b.eat();
		b.bark();
		b.weep();
	}

}
