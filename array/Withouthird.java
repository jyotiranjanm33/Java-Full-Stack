package com.array;

import java.util.Arrays;

public class Withouthird {

	public static void main(String[] args) {
		int a[]= {1,5,4,6};
		int b[]= {5,4,3,8};
		int c=a.length>b.length?b.length:a.length;
		for(int i=0;i<c;i++)
		{
			if(a.length>b.length)
			{
				a[i]+=b[i];
			}
			else
				b[i]+=a[i];
		}
		if(a.length>b.length)
			System.out.println(Arrays.toString(a));
		else
			System.out.println(Arrays.toString(b));

	}

}
