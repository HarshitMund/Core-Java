package com.rays.string;

public class NumberOfWordsInString {

	public static void main(String[] args) {
		String s = "Good Morning World. Today date is 24th feb 2026.";
		char c; 
		int count = 1;
		
		for(int i = 0; i < s.length(); i++) {
			c = s.charAt(i);
			
			if(c == ' ')
				count++;
		}
		
		System.out.println(count);

	}

}
