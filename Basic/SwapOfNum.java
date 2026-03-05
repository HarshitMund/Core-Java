package com.rays.basic;

public class SwapOfNum {

	public static void main(String[] args) {
		int a = 5;
		int b = 7;
		
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		
		System.out.println("Swaping value of a & b");
		
		a = a + b; 
		b = a - b; 
		a = a - b; 
		
		System.out.println("a = " + a);
		System.out.println("b = " + b);
	}

}
