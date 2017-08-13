package com.DateTimeAPI;

import java.time.*;  
import java.time.temporal.*;  

//Java Month enum
public class MonthExample {  
	
    public static void main(String[] args) {  
    
    	/* 	*/ System.out.println();
    	Month month = Month.valueOf("January".toUpperCase());  
        System.out.printf("For the month of %s all Sunday are:%n", month);  
        LocalDate localdate = Year.now().atMonth(month).atDay(1).  
        with(TemporalAdjusters.firstInMonth(DayOfWeek.SUNDAY));  
        Month mi = localdate.getMonth();  
        while (mi == month) {  
            System.out.printf("%s%n", localdate);  
            localdate = localdate.with(TemporalAdjusters.next(DayOfWeek.SUNDAY));  
            mi = localdate.getMonth();  
        }  

    	/* getValue()	*/ System.out.println();        
        Month month1 = Month.from(LocalDate.now());  
        System.out.println(month1.getValue());  
        System.out.println(month1.name());  
        
    	/*	*/ System.out.println();        
        Month month2 = Month.from(LocalDate.now());    
        System.out.println(month2.minus(2));  
        
    	/*	*/ System.out.println();        
        Month month3 = Month.from(LocalDate.now());    
        System.out.println(month3.plus(2));  
        
    	/*	*/ System.out.println();        
        Month month4 = Month.from(LocalDate.now());    
        System.out.println("Total Number of days: "+month4.length(true));  
    }  
}  