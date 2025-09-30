package com.array.sort;

public class Currency {

	public static void main(String[] args) {
		int num= 49456789;
		convert(num/10000000,"crore");
		convert((num/100000)%100,"lakhs");
		convert((num/1000)%100,"thousand");
		convert((num/100)%10,"hundred");
		convert(num%100,"");
	
	}
	static void convert(int n,String s)
	{
		String[] one= {"","one","two","three","four","five","six"};
	}

}
