package com.rays.basic;

import java.util.Scanner;

public class HarmonicSeries {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a number for Harmonic Series");
		int num = sc.nextInt();
		double a = 1, sum = 0;

		for(int i = 1; i <= num; i++) {
			System.out.print(a/i + " ");
			sum += (a/i);
		}
		
		System.out.println();
		System.out.println("Sum of Harmonic Series is " + sum);
		sc.close();
	}

}
