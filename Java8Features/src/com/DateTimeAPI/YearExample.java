package com.DateTimeAPI;

import java.time.LocalDate;
import java.time.Year;  

//Java Year class
public class YearExample {  
  public static void main(String[] args) {  
  
	/* Java Year Example: now()	*/ System.out.println();  
	Year y = Year.now();  
    System.out.println(y);  
  
	/* atDay()	*/ System.out.println();  
	Year y1 = Year.of(2017);  
    LocalDate l = y1.atDay(123);  
    System.out.println(l);  
  
	/* length()	*/ System.out.println(); 
	Year year = Year.of(2017);  
    System.out.println(year.length());  

	/* isLeap()	*/ System.out.println();  
	Year year2 = Year.of(2016);  
    System.out.println(year2.isLeap());  

  
  }
} 