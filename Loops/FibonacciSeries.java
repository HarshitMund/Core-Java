package com.rays.basic;

import java.util.Scanner;

public class FibonacciSeries {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		
		int a = 0, b = 1, sum;
		
		System.out.println("Fibonacci Series of " + n);
		System.out.print(a + " " + b);
		
		for (int i = 2; i < n; i++) {
			sum = a + b;
			System.out.print(" " + sum);
			a = b;
			b = sum;
		}
		
		sc.close();
	}
}
