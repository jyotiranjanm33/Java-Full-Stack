package com.strings;

public class Revword {

	public static void main(String[] args) {
		String s="Bittu",res="";
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			res=ch+res;
		}
System.out.println(res);
	}

}
