package com.strings;

public class Countch {

	public static void main(String[] args) {
		String s="Java123@#";
		int uc=0,lc=0,digit=0,sc=0;
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(ch>='a' && ch<='z')
				lc++;
			else if(ch>='A' && ch<='Z')
				uc++;
			else if(ch>='0' && ch<='9')
				digit++;
			else
				sc++;
		}
		System.out.println("Upper Case "+uc+"\n"+"Lower case "+lc+"\n"+"Digit "+digit+"\n"+"Special "+sc);

	}

}
