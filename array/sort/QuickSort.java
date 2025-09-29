package com.array.sort;

import java.util.Arrays;

public class QuickSort {

	public static void main(String[] args) {
		int[] a = { 4, 10, 5, 6, 77, 6, 2 };
		Sort(a, 0, a.length - 1);
		System.out.println(Arrays.toString(a));

	}

	static void Sort(int []a,int start,int end)
	{
		if(start>end)
			return;
		int i=start;
		int j=end;
		if(i<j)
		{
			int pivot=(start+end)/2;
			while(a[i]<a[pivot])
				i++;
			while(a[j]>a[pivot])
				j--;
		}
		if(i<=j)
		{
			int  temp=a[i];
			a[i]=a[j];
			a[j]=temp;
			i++;
			j--;
		}
		Sort(a,start,j);
		Sort(a,i,end);
	}

}
