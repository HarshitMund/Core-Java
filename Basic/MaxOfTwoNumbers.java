package com.rays.basic;

import java.util.Scanner;

public class MaxOfTwoNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the First Number");
		int a = sc.nextInt();
		
		System.out.println("Enter the Second Number");
		int b = sc.nextInt();
		
		System.out.println("Maximum of two is " + Math.max(a, b));
		
		sc.close();
	}

}
