package com.array.sort;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int []a= {4,6,2,10,5,10};
		Sort(a);
		System.out.println(Arrays.toString(a));
	}
	static void Sort(int []a)
	{
		for(int i=0;i<a.length;i++) {
		for(int j=0;j<a.length-1-i;j++)
		{
			if(a[j]>a[j+1])
			{
				int temp=a[j];
				a[j]=a[j+1];
				a[j+1]=temp;
			}
		}
	}
	}
}
