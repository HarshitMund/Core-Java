package com.rays.basic;

public class ArrayContainsTableOf2To10 {

	public static void main(String[] args) {
		int a[][] = new int[9][10];
		int num = 2;
		for(int i = 0; i < 9; i++) {
			for(int j = 0; j < 10; j++) {
				a[i][j] = num * (j+1);
			}
			num++;
		}
		for(int i = 0; i < 9; i++) {
			for(int j = 0; j < 10; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}

	}

}
