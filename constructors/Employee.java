package com.constructors;

public class Employee {
	String name;int age,id;
	Employee(String name)
	{
		this.name=name;
	}
	Employee(String name,int age)
	{
		this(name);
		this.age=age;
	}
	Employee(String name,int age,int id)
	{
		this(name,age);
		this.id=id;
	}
	public void display()
	{
		System.out.println(name+"\n"+age+"\n"+id);
	}

	public static void main(String[] args) {
		Employee e=new Employee("Bittu",23,1);
		e.display();
	}

}
