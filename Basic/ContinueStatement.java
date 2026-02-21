package com.rays.basic;

public class ContinueStatement {
	public static void main(String[] args) {
		System.out.println("Odd Number");
		for(int i = 1; i <= 10; i++) {
			if (i % 2 == 0) {
				continue;
			}
			System.out.println(i);
		}
		
		System.out.println("Even Number");
		for(int i = 1; i <= 10; i++) {
			if (i % 2 != 0) {
				continue;
			}
			System.out.println(i);
		}
	}
}
