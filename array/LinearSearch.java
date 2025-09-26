package com.array;

public class LinearSearch {

	public static void main(String[] args) {
		int []a= {10,5,50,4,9};
		int key=4;
		System.out.println(Search(a,key));
		

	}
	static int Search(int[]a,int key)
	{
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==key)
				return i;
		}
		return -1;
	}

}
