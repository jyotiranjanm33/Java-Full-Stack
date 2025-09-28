package com.array.sort;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		int []a= {2,7,5,6,9,1,9};
		Sort(a);
		System.out.println(Arrays.toString(a));
	}
	static void Sort(int []a)
	{
		for(int i=1;i<a.length;i++)
		{
			int j=i-1;
			int key=a[i];
			while(j>=0 && a[j]>key)
			{
				a[j+1]=a[j];
				j--;
			}
			a[j+1]=key;
		}
	}

}
