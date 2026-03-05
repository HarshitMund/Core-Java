package com.rays.string;

public class SumOfDigitsInString {

	public static void main(String[] args) {
		String s = "Hello World 24.02.2026!";
		int sum = 0;

		char c;
		for(int i = s.length() - 1; i >= 0; i--) {
			
			c = s.charAt(i);
			if (c >= '0' && c <= '9')
				sum = sum + Character.getNumericValue(c);
				//sum=sum+(c-48);
			
		}
			System.out.println(sum);

	}

}
