package com.rays.basic;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter first number: ");
		int a = sc.nextInt();
		System.out.println("Please enter second number: ");
		int b = sc.nextInt();
		System.out.println("Please enter the operator: ");
		String opt = sc.next();
		
		switch (opt) {
		case "+": {
			System.out.println(a + " " + opt + " " + b + " = " + (a + b));
			break;
		}
		case "-": {
			System.out.println(a + " " + opt + " " + b + " = " + (a - b));
			break;
		}
		case "*": {
			System.out.println(a + " " + opt + " " + b + " = " + (a * b));
			break;
		}
		case "/": { 
			System.out.println(a + " " + opt + " " + b + " = " + (a / b));
			break;
		}
		case "%": {
			System.out.println(a + " " + opt + " " + b + " = " + (a % b));
			break;
		}
		default:
			System.out.println("Unexpected value: " + opt);
		}
		
		sc.close();


	}

}
