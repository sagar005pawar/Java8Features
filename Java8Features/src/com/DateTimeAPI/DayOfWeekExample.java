package com.DateTimeAPI;

import java.time.*;  
import java.time.temporal.ChronoField;  

//Java DayOfWeek enum
public class DayOfWeekExample {  
	public static void main(String[] args) {  

		/* of()	*/ System.out.println();
		LocalDate localDate = LocalDate.of(2017, Month.JANUARY, 25);  
		DayOfWeek dayOfWeek = DayOfWeek.from(localDate);  
		System.out.println(dayOfWeek.get(ChronoField.DAY_OF_WEEK));  

		
		/* get()	*/ System.out.println();
		DayOfWeek day = DayOfWeek.of(5);  
	    System.out.println(day.name());  
	    System.out.println(day.ordinal());  
	    System.out.println(day.getValue());  
	    
	    
		/* plus()	*/ System.out.println();
		LocalDate date = LocalDate.of(2017, Month.JANUARY, 31);  
	    DayOfWeek day2 = DayOfWeek.from(date);  
	    System.out.println(day2.getValue());  
	    day2 = day2.plus(3);  
	    System.out.println(day2.getValue());  
	    
	    
		/* minus()	*/ System.out.println();
		LocalDate date3 = LocalDate.of(2017, Month.JANUARY, 31);  
	    DayOfWeek day3 = DayOfWeek.from(date3);  
	    System.out.println(day3.getValue());  
	    day3 = day3.minus(3);  
	    System.out.println(day3.getValue());  

	}  
} 