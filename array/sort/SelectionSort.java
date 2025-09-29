package com.array.sort;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		int[] a = { 2, 10, 5, 6, 1,10,-6 };
		Sort(a);
		System.out.println(Arrays.toString(a));

	}
	static void Sort(int[]a)
	{
		for(int i=0;i<a.length;i++) {
			int smallIndex=i;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[j]<a[smallIndex])
				{
					int temp=a[j];
					a[j]=a[smallIndex];
					a[smallIndex]=temp;
				}
			}
	}

}
}
