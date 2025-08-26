package com.inheritance;

class X {
int i,j;
	X(int i,int j)
	{
		this.i=i;this.j=j;
	}
}
class Y extends X
{
	int k,l;
	Y(int i,int j,int k,int l)
	{
		super(i,j);
		this.k=k;
		this.l=l;
	}
	/*void display()
	{
		System.out.println(i+" "+j+" "+k+" "+l);
	}*/
}
class Test1
{
	public static void main(String[] args) {
		Y y=new Y(10,20,30,40);
		System.out.println(y.i+" "+y.j+" "+y.k+" "+y.l);
		//y.display();
	}
}
