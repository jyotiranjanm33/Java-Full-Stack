package com.array;

public class max {

	public static void main(String[] args) {
		int[]a= {5,10,96,1,2};int max=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
				max=a[i];
		}
		System.out.println("Maximum is "+max);
	}

}
