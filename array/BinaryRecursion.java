package com.array;

public class BinaryRecursion {

	public static void main(String[] args) {
		int []a= {30,40,60,70,100};
		System.out.println(Search(a,100,0,a.length-1));
		
	}
	static int Search(int []a,int key,int start,int end)
	{
		while(start<=end)
		{
			int mid=(start+end)/2;
			if(key==a[mid])
				return mid;
			else if(key<a[mid])
				return Search(a,key,start,mid-1);
			else
				return Search(a,key,mid+1,end);
		}
		return -1;
	}

}
