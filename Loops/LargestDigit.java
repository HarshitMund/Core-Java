package com.rays.basic;

import java.util.Scanner;

public class LargestDigit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a number: ");
		int num = sc.nextInt();
		int a = 0;
		while (num > 0) {
			int b = num % 10;
			if (a < b) {
				a = b;
			}
			num = num / 10;
		}
		System.out.println("Largest Digit: " + a);
		sc.close();
		
	}

}
