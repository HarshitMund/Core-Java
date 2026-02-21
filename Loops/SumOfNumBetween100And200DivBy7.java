package com.rays.basic;

public class SumOfNumBetween100And200DivBy7 {

	public static void main(String[] args) {
		int sum = 0;
		
		for(int i = 100; i <= 200; i++) {
			if (i % 7 == 0) {
				sum = sum + i;
			}
		}
		System.out.println("sum of all integers greater then 100 and less than 200 that are divided by 7 is " + sum);

	}

}
