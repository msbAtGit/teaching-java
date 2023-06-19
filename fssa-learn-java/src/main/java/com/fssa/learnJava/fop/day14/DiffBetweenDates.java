package com.fssa.learnJava.fop.day14;

import java.time.LocalDate;
import java.time.Period;

public class DiffBetweenDates {

	public static void main(String[] args) {

        LocalDate from = LocalDate.of(2020, 5, 4);
        LocalDate to = LocalDate.of(2020, 10, 10);

        Period period = Period.between(from, to);
       
        

        System.out.println(period.getYears() + " years,");
        System.out.println(period.getMonths() + " months,");
        System.out.println(period.getDays() + " days");
        long noOfDays = to.toEpochDay() - from.toEpochDay();
        System.out.printf("Number of days between %s and %s is %d", 
        		from.toString(), to.toString(), noOfDays);
    }
}
