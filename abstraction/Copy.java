package com.constructors;


class Copy {
	int i,j;
	Copy(int i,int j)
	{
		this.i=i;
		this.j=j;
	
	}
	Copy(Copy a)
	{
		this.i=a.i;
		this.j=a.j;
		
	}

	public static void main(String[] args) {
		Copy a=new Copy(10,20);
		Copy b=new Copy(a);
		System.out.println(b.i+"\n"+b.j);

	}

}
