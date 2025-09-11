package com.strings;

public class Palinword2 {
public static boolean isPalin(String s)
{
	int i=0,j=s.length()-1;
	while(i<j)
	{
		if(s.charAt(i)!=s.charAt(j))
			return false;
		i++;
		j--;
	}
	return true;
}
	public static void main(String[] args) {
		String s="malayalam";
		if(isPalin(s))
			System.out.println("Palindrome");
		else
			System.out.println("Not");
		

	}

}
