package com.strings;

public class Palinword {

	public static void main(String[] args) {
		String s = "malayalam", rev = "";
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			rev = ch + rev;
		}
		if(s.equals(rev))
			System.out.println("Palindrome");
		else
			System.out.println("Not");
	
	}

}
