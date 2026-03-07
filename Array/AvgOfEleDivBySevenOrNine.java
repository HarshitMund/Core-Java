package com.rays.array;

public class AvgOfEleDivBySevenOrNine {

	public static void main(String[] args) {
		int a[] = new int[] {11, 2, 3, -49, 5, 153, 121, 145, 28, 6, 3, 5, 11, -32};
		int i;
		float count = 0.0f, sum = 0.0f, avg;
		
		for(i = 0; i < a.length; i++) {
			
			if(a[i] % 7 == 0 || a[i] % 9 == 0) {
				
				sum = sum + a[i];
				count++;
			}
		}
		avg = sum / count;
		
		System.out.println(avg);

	}

}
