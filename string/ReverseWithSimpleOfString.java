package com.rays.string;

public class ReverseWithSimpleOfString {

	public static void main(String[] args) {
		String str = "Hey There Good Morning";
		
		String[] s = str.split(" ");
		
		for(int i = 0; i < s.length; i++) {
			
			for(int j = s[i].length()-1; j >= 0; j--) 
				System.out.print(s[i].charAt(j));
			
			System.out.print(" ");
		}

	}

}
