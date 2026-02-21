package com.rays.basic;

public class RandomNumbers {

	public static void main(String[] args) {
		int max = 100, min = 1;
		System.out.println("5 random integer number between 1 to 100: ");
		
		for ( int i = 0; i < 5 ; i++) {
			System.out.println(min + (int)(Math.random() * ((max - min) + 1)));
		}
		
	}

}
