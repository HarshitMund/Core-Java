//Write a Java program that calculates the total taxi fare based on the distance traveled (in kilometers).
//
//The fare rules are:
//
//For the first 20 km, the fixed fare is ₹200.
//
//For distance more than 20 km and up to 50 km, charge ₹5 per km for every kilometer above 20 km, in addition to ₹200.
//
//For distance more than 50 km and up to 100 km, charge ₹5 per km for every kilometer above 50 km.
//
//For distance above 100 km, charge ₹15 per km for every kilometer above 100 km.

package com.rays.basic;

import java.util.Scanner;

public class TravellAllowance {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int dis, amount;
		
		System.out.println("Enter the distance ");
		dis = sc.nextInt();
		
		if (dis <= 20)
			amount = 200;
			
		else if(dis > 20 && dis <= 50)
			amount = 200 + (dis - 20) * 5;
			
		else if(dis > 50 && dis <= 100)
			amount = 500 + (dis - 50) * 5;  
			
		else 
			amount = 750 + (dis - 100) * 15;
			
		System.out.println(amount);

		sc.close();

	}

}
