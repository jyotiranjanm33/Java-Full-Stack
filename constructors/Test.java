package com.constructors;

public class Test {
int a,b;
Test(int i,int j)
{
	a=i;
	b=j;
	System.out.println(a+"\n"+b);}
public static void main(String []args)
{
	new Test(10,20);
}
}
