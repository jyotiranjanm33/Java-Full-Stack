package com.array;

public class Binary {

	public static void main(String[] args) {
		int a[]= {10,20,30,40,50};
		int key=50;
		System.out.println(Search(a,key));}
	
	static int Search(int []a,int key) {
		int start=0,end=a.length-1;
		while(start<=end)
		{
			int mid=(start+end)/2;
			if(key==a[mid])
				return mid;
				else if(key<a[mid])
					end=mid-1;
				else
					start=mid+1;
		}
		return -1;
	}
	
}
