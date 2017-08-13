package com.DateTimeAPI;

import java.time.LocalDate;
import java.time.LocalDateTime;

//Java LocalDate class from java.time pkg.
public class LocalDateExample {  
	  public static void main(String[] args) {  
		
		  //Java LocalDate Example
	    LocalDate date = LocalDate.now();  
	    LocalDate yesterday = date.minusDays(1);  
	    LocalDate tomorrow = yesterday.plusDays(2);  
	    System.out.println("Today date: "+date);  
	    System.out.println("Yesterday date: "+yesterday);  
	    System.out.println("Tommorow date: "+tomorrow); 
	    
	    //isLeapYear()
	    LocalDate date1 = LocalDate.of(2017, 1, 13);  
	    System.out.println(date1.isLeapYear());  
	    LocalDate date2 = LocalDate.of(2016, 9, 23);  
	    System.out.println(date2.isLeapYear());  
	    
	    //atTime()
	    LocalDate date3 = LocalDate.of(2017, 1, 13);  
	    LocalDateTime datetime3 = date3.atTime(1,50,9);      
	    System.out.println(datetime3);  
	    
	  }  
}

/*

Java Date and Time
	The java.time, java.util, java.sql and java.
	text packages contains classes for representing date and time.
	Following classes are important for dealing with date in java.

	Java 8 Date/Time API
		Java has introduced a new Date and Time API since Java 8.
		The java.time package contains Java 8 Date and Time classes.
	
		java.time.LocalDate class
		java.time.LocalTime class
		java.time.LocalDateTime class
		java.time.MonthDay class
		java.time.OffsetTime class
		java.time.OffsetDateTime class
		java.time.Clock class
		java.time.ZonedDateTime class
		java.time.ZoneId class
		java.time.ZoneOffset class
		java.time.Year class
		java.time.YearMonth class
		java.time.Period class
		java.time.Duration class
		java.time.Instant class
		java.time.DayOfWeek enum
		java.time.Month enum
	
	
	Classical Date/Time API
		But classical or old Java Date API is also useful.
		Let's see the list of classical Date and Time classes.
	
		java.util.Date class
		java.sql.Date class
		java.util.Calendar class
		java.util.GregorianCalendar class
		java.util.TimeZone class
		java.sql.Time class
		java.sql.Timestamp class
	
	
	Formatting Date and Time
		We can format date and time in java by the use of following classes:
	
		java.text.DateFormat class
		java.text.SimpleDateFormat class
	
*/