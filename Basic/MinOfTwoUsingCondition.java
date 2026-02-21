package com.rays.basic;

import java.util.Scanner;

public class MinOfTwoUsingCondition {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the First Number");
		int a = sc.nextInt();
		
		System.out.println("Enter the Second Number");
		int b = sc.nextInt();
		
		if (a < b) {
			System.out.println(a + " is smaller than " + b);
		}
		else {
			System.out.println(b + " is smaller than " + a);
		}
		
		sc.close();
		
	}
}
