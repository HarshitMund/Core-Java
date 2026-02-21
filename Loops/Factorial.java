package com.rays.basic;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a number");
		int num = sc.nextInt();
		int temp = num;
		int mul = 1;
		while (num > 0) {
			mul = mul * num;
			num--;
		}
		
		System.out.println("Factorial of " + temp + " is " + mul);
		
		sc.close();

	}

}
