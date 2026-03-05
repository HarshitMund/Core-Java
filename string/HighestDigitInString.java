package com.rays.string;

public class HighestDigitInString {

	public static void main(String[] args) {
		String s = "harshit89174@gmail.com";
		int highest = 0, i, temp = 0;
		
		for(i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			
			if(c >= '0' && c <= '9')
				temp = c;
			
			if(temp > highest)
				highest = temp;
		}
		
		System.out.println((char)highest);

	}

}
