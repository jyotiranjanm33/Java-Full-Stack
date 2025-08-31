package com.inheritance;
import java.util.Scanner;
class Vehicle
{
	public void start() {
	}
	public void accelerate() {
}
	public void stop() {}
}
class BMW extends Vehicle
{
	@Override
	public void start() {
		System.out.println("BMW Started");
	}
	
	@Override
	public void accelerate() {
		System.out.println("BMW Accelerate");}
	
	@Override
	public void stop()
		{
			System.out.println("BMW Stopped");
		}
	public void autopilot()
	{
		System.out.println("BMW Autopilot");
	}
}
class Audi extends Vehicle
{
	@Override
	public void start() {
		System.out.println("Audi Start");
	}
	@Override
	public void accelerate() {
		System.out.println("Audi Accelerate");
	}
	@Override
	public void stop() {
		System.out.println("Audi Stop");
	}
	
	public void abs() {
		System.out.println("Audi Abs");

	}
}
class Benz extends Vehicle
{
	@Override
	public void start() {
		System.out.println("Benz Start");
	}
	@Override
	public void accelerate() {
		System.out.println("Benz Accelerate");
	}
	@Override
	public void stop() {
		System.out.println("Benz Stop");
	}
	public void gps() {
		System.out.println("Benz Gps");
	}
	}
public class Testing {
	public static void drive(Vehicle v)
	{
		v.start();
		v.accelerate();
		v.stop();
		if(v instanceof BMW)
			((BMW)v).autopilot();
		else if(v instanceof Audi)
			((Audi)v).abs();
		else if(v instanceof Benz)
			((Benz)v).gps();
	}
	public static Vehicle getCar()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("1.BMW \n 2.Audi \n3.Benz \n 4.None");
		int n=s.nextInt();
		if(n==1)
			return new BMW();
		else if(n==2)
			return new Audi();
		else if(n==3)
			return new Benz();
		else {
			System.out.println("Invalid Input");
		return null;}
	}
	public static void main(String[] args) {
		drive(getCar());

	}

}
