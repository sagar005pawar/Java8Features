package com.DateTimeAPI;

import java.time.OffsetTime;  
import java.time.temporal.ChronoField;  
public class OffsetTimeExample {  
  public static void main(String[] args) { 
	  
	  
	/* Java OffsetTime class Example	*/ System.out.println();  
    OffsetTime offset = OffsetTime.now();  
    int h = offset.get(ChronoField.HOUR_OF_DAY);  
    System.out.println(h);  
    int m = offset.get(ChronoField.MINUTE_OF_DAY);  
    System.out.println(m);  
    int s = offset.get(ChronoField.SECOND_OF_DAY);  
    System.out.println(s);  

	/* getHour()	*/ System.out.println();  
    OffsetTime offset1 = OffsetTime.now();  
    int h1 = offset1.getHour();  
    System.out.println(h1+ " hour");  
    
	/* getMinute()	*/ System.out.println();  
    OffsetTime offset2 = OffsetTime.now();  
    int m2 = offset2.getMinute();  
    System.out.println(m2+ " minute");  
    
	/* getSecond()	*/ System.out.println();  
    OffsetTime offset3 = OffsetTime.now();  
    int s3 = offset3.getSecond();  
    System.out.println(s3+ " second");  
    
  }  
}  