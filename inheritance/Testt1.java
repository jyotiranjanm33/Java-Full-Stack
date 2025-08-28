package com.inheritance;
class Phone
{
	int ram,displaysize,storage;
	Phone(int r,int d,int s)
	{
		ram=r;
		displaysize=d;
		storage=s;
	}
	void display()
	{
		System.out.println("RAM "+ram);
		System.out.println("DisplaySize "+displaysize);
		System.out.println("Storage "+storage);
		
	}
}
class CameraPhone extends Phone
{
	int pixels;
	CameraPhone(int r,int d,int s,int p)
	{
		super(r,d,s);
		pixels=p;
	}
	
	@Override
	void display()
	{
		System.out.println("RAM "+ram);
		System.out.println("DisplaySize "+displaysize);
		System.out.println("Storage "+storage);
		System.out.println("Pixels "+pixels);
	}
}

public class Testt1 {

	public static void main(String[] args) {
		CameraPhone c=new CameraPhone(12, 7, 128, 1080);
		c.display();

	}

}
