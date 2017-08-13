package com.DateTimeAPI;

import java.time.*;  
import java.time.temporal.Temporal;  

//
public class PeriodExample {  
  public static void main(String[] args) {  
  
	/* Java Period Example: addTo()	*/ System.out.println();  
	Period period = Period.ofDays(24);  
    Temporal temp = period.addTo(LocalDate.now());  
    System.out.println(temp); 
    
    /* of()	*/ System.out.println();
    Period p = Period.of(2017,02,16);  
    System.out.println(p.toString());  
    
    /* minus()	*/ System.out.println();
    Period period1 = Period.ofMonths(4);   
    Period period2 = period1.minus(Period.ofMonths(2));  
    System.out.println(period2);  
    
    /* plus()	*/ System.out.println();
    Period period3 = Period.ofMonths(4);   
    Period period4 = period3.plus(Period.ofMonths(2));  
    System.out.println(period4);  

  }  
} 