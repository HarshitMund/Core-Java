package com.rays.date;

import java.time.LocalDate;

public class TestLocalDate {

	public static void main(String[] args) {
		
		LocalDate now = LocalDate.now();
		
		System.out.println("Today " + now);
		System.out.println("Day of week " + now.getDayOfWeek());
		System.out.println("Day of month " + now.getDayOfMonth());
		System.out.println("Month " + now.getMonth());
		System.out.println("Month " + now.getMonthValue());
		System.out.println("Day of year " + now.getDayOfYear());
		System.out.println("Year " + now.getYear());
		
		System.out.println("------------------------------");
		
		LocalDate dob = LocalDate.of(2002, 02, 06);
		
		System.out.println("Date of birth " + dob);
		System.out.println("Dob day of week " + dob.getDayOfWeek());
		System.out.println("Dob day of month " + dob.getDayOfMonth());
		System.out.println("Dob month " + dob.getMonth());
		System.out.println("Dob month " + dob.getMonthValue());
		System.out.println("dob Day of year " + dob.getDayOfYear());
		System.out.println("Dob year " + dob.getYear());
		
		System.out.println("------------------------------");
		
		System.out.println("Age " + (now.getYear() - dob.getYear()));
		

	}

}
