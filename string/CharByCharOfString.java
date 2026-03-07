package com.rays.string;

import java.util.Scanner;

public class CharByCharOfString {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		String s;
		System.out.println("Enter a string");
		s=sc.nextLine();
		
		for(int i = 0; i < s.length(); i++)
			System.out.println(s.charAt(i));
		
		sc.close();

	}

}
