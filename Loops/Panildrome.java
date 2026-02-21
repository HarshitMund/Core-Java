package com.rays.basic;

import java.util.Scanner;

public class Panildrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter number");
		int num = sc.nextInt();
		
		int rev = 0, temp = num;
		while (temp > 0) {
			int a = temp % 10;
			rev = rev * 10 + a;
			temp = temp / 10;
		}
		
		if(num == rev) {
			System.out.println("This is a palindrome");
		}
		else {
			System.out.println("This is not a palindrome");
		}
		
		sc.close();

	}

}
