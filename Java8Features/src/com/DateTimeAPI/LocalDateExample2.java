package com.DateTimeAPI;

import java.time.*;
import java.time.temporal.ChronoField;
import java.time.temporal.ValueRange;  

//Java MonthDay class
public class LocalDateExample2 {  
  public static void main(String[] args) {  
    
	System.out.println("\n  Java MonthDay class Example ");  
	MonthDay month = MonthDay.now();  
    LocalDate date = month.atYear(1994);  
    System.out.println(date);  
    
	System.out.println("\n isValidYear()  ");  
	MonthDay month1 = MonthDay.now();  
    boolean b = month1.isValidYear(2012);  
    System.out.println(b);  
    
    System.out.println("\n  get() ");
    MonthDay month2 = MonthDay.now();  
    long n = month2.get(ChronoField.MONTH_OF_YEAR);  
    System.out.println(n);  

    System.out.println("\n  range() ");
    MonthDay month3 = MonthDay.now();  
    ValueRange r1 = month3.range(ChronoField.MONTH_OF_YEAR);  
    System.out.println(r1);  
    ValueRange r2 = month3.range(ChronoField.DAY_OF_MONTH);  
    System.out.println(r2);  
    
    
  }  
}  