package com.array;

import java.util.Arrays;

public class Usingthird {

	public static void main(String[] args) {
		int a[]= {1,5,4,6};
		int b[]= {5,4,3,8};
		int c[]=new int[a.length];
		for(int i=0;i<a.length;i++)
			c[i]=a[i]+b[i];
		System.out.println(Arrays.toString(c));
		
	}

}
