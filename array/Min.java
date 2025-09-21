package com.array;

public class Min {

	public static void main(String[] args) {
		int[]a= {5,10,96,1,2};int min=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<min)
				min=a[i];
		}
		System.out.println("Minimum is "+min);
	}


}
