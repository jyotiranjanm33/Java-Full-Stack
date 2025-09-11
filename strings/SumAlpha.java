package com.strings;

public class SumAlpha {

	public static void main(String[] args) {
		String s = "Ram@123";
		int sum = 0;
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch >= '0' && ch <= '9') {
				//sum = sum + ch-'0';
				sum+=Integer.parseInt(ch+"");
			}
		}
		System.out.println(sum);
	}

}
