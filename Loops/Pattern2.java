package com.rays.loops;

public class Pattern2 {

	public static void main(String[] args) {
		for(int i = 4; i > 0; i--) {
			
			for(int j = 0; j < i - 1; j++) 
				System.out.print("  ");
			
			for(int j = 4; j >= i; j--)
				System.out.print("* ");
			
			System.out.println();
		}

	}

}
