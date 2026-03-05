package com.rays.string;

import java.util.Scanner;

public class FastLastCharOfString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s;
		System.out.println("Enter a string");
		s=sc.nextLine();
		
		
		
		System.out.println(s.charAt(0));
		System.out.println(s.charAt(s.length()-1));
		
		sc.close();

	}

}
