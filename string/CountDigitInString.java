package com.rays.string;

public class CountDigitInString {

	public static void main(String[] args) {
		String str = "mndharshit062002@gmail.com";
		int[] a = new int[57];
		
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) >= '0' && str.charAt(i) <= '9')
				a[(int)str.charAt(i)]++;
		}
		
		for(int i = 0; i < 57; i++) {
			if(a[i] != 0)
				System.out.println((char)i + " - " + a[i]);
		}

	}

}
