package com.DateTimeAPI;

import java.time.Clock;
import java.time.Duration;  

//Java Clock class
public class LocalDateExample3 {  
  public static void main(String[] args) {  
    
	/*	getZone()	*/ System.out.println();  
	Clock c = Clock.systemDefaultZone();      
    System.out.println(c.getZone());  
    
	/*	instant()	*/ System.out.println();  
	Clock c1 = Clock.systemUTC();  
    System.out.println(c1.instant());  

    /*	systemUTC()	*/ System.out.println();  
	Clock c2 = Clock.systemUTC();  
    System.out.println(c2.instant());  
	
    /*	offset()	*/ System.out.println();  
	Clock c3 = Clock.systemUTC();  
    Duration d3 = Duration.ofHours(5);  
    Clock clock3 = Clock.offset(c3, d3);    
    System.out.println(clock3.instant());  

  }  
}  