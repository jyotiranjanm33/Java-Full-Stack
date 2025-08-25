package com.inheritance;

class Animal {
	void eat(){
		System.out.println("Animal Eating");
	}

}
class Dog extends Animal
{
	void bark()
	{
		System.out.println("Dog Barking");
	}
}
class Babydog extends Dog
{
	void weep()
	{
		System.out.println("Babydog Weeping");
	}
}
class Demo
{
	public static void main(String[] args) {
		Animal a=new Animal();
		a.eat();
		Dog d=new Dog();
		d.eat();
		d.bark();
		Babydog b=new Babydog();
		b.eat();
		b.bark();
		b.weep();
	}
}