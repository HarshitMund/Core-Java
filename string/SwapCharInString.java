package com.rays.string;

public class SwapCharInString {

	public static void main(String[] args) {
		String s = "Rays Tech";
		String s1 = "";
		
		for(int i = 0; i < s.length(); i = i + 2) {
			
			if(i + 2 <= s.length())
				s1 = s1 + s.charAt(i + 1) + s.charAt(i);
			else
				s1 = s1 + s.charAt(i);
		}
		
		System.out.println(s1);

	}

}
