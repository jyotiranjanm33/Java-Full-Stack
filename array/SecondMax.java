package com.array;

public class SecondMax {

	public static void main(String[] args) {
		int a[]= {10,20,6,1,40};
		int max1=0,max2=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max1)
			{
				max2=max1;
				max1=a[i];
			}
			else if(a[i]>max2 && a[i]!=max1)
				max2=a[i];
		}
		System.out.println(max2);

	}

}
