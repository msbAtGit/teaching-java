package com.fssa.learnJava.fop.day14;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateDemo3 {

	public static void main(String[] args) {

		// Date in String format
		String dateString = "2023-05-23";

		// Format the DateString is In.
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

		// Converting dateString to LocalDate
		LocalDate parsedDate = LocalDate.parse(dateString, formatter);
		System.out.println(parsedDate);
		System.out.println(parsedDate.getYear());
		System.out.println(parsedDate.getMonth());
		System.out.println(parsedDate.getMonthValue());
		System.out.println(parsedDate.getDayOfMonth());
		System.out.println(parsedDate.getDayOfWeek());
		System.out.println(parsedDate.minusDays(180));
	}

}
