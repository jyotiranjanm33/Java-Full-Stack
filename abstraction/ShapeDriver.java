package com.abstraction;
abstract class Shape
{
	String color;
	public Shape(String color)
	{
		this.color=color;
	}
	abstract public void getArea();
	public abstract void display();
}
class Rectangle extends Shape
{
	int length,breadth;
	public Rectangle(String color,int length,int breadth)
	{
		super(color);
		this.length=length;
		this.breadth=breadth;
	}
	@Override
	public void getArea() {
		System.out.println(length*breadth);
		
	}
	@Override
	public void display() {
		System.out.println("Color of Rectangle is "+color);
		System.out.println("Length is "+length);
		System.out.println("Breadth is "+breadth);
	}
}
class Circle extends Shape
{
	int radius;
	public Circle(String color,int radius)
	{
		super(color);
		this.radius=radius;
	}
	@Override
	public void getArea() {
		double res=(22/7)*radius*radius;
		System.out.println(res);
		
	}
	@Override
	public void display() {
		System.out.println("Color of Circle is "+color);
		System.out.println("Radius is "+radius);
		
	}
}
public class ShapeDriver {

	public static void main(String[] args) {
		Shape s;
				s=new Rectangle("Red",10,5);
				s.getArea();
				s.display();
				s=new Circle("Yellow",5);
				s.getArea();
				s.display();

	}

}
