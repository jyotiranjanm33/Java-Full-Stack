package com.inheritance;

class AA {
	int i=10,j=20;}
class BB extends AA{
	int k=30;
	void display() {
		System.out.println(i);
		System.out.println(j);
		System.out.println(k);

	}
}
class Demo1
{
	public static void main(String[] args) {
		BB b=new BB();
		b.display();
	}
}