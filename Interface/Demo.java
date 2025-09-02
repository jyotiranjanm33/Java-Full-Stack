package com.Interface;
interface Switch
{
	void on();
	void off();
}
interface Regulator
{
	void incspeed();
	void decspeed();
}
class Fan implements Switch,Regulator
{
	@Override
	public void on() {
		System.out.println("Fan On");
		
	}
	@Override
	public void off() {
		System.out.println("Fan Off");
	}
	@Override
	public void incspeed() {
		System.out.println("Fan Increase speed");
		
	}
	@Override
	public void decspeed() {
		System.out.println("Fan Decrease Speed");
		
	}
}
public class Demo {

	public static void main(String[] args) {
		Switch s=new Fan();
		s.on();
		s.off();
		Regulator r=new Fan();
		r.incspeed();
		r.decspeed();
		
	}

}
