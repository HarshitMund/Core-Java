package com.rays.basic;

public class ThreeDArray {

	public static void main(String[] args) {
		
		int[][][] a = new int[5][5][5];
		
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < a.length; j++) {
				for(int k = 0; k < a.length; k++) {
					a[i][j][k] = (i + 1) * (j + 1) * (k + 1);
					System.out.print(a[i][j][k] + "\t");
				}
				System.out.println();
			}
			System.out.println();
		}

	}

}
