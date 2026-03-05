package com.rays.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestSimpleDateFormat {

	public static void main(String[] args) throws ParseException {

		Date d = new Date();
		System.out.println(d);
		
		System.out.println("-------------------------");
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		
		String s = sdf.format(d);
		System.out.println(s);
		
		System.out.println("---------------------------");
		
		String dob = "2002-02-06";
		System.out.println("String dob: " + dob);
		
		Date date = sdf.parse(dob);
		System.out.println("Date dob: " + date);

	}

}
