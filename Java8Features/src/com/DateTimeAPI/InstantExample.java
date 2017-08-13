package com.DateTimeAPI;

import java.time.Duration;
import java.time.Instant;
import java.time.temporal.ChronoUnit;  

//Java Instant class
public class InstantExample {  
	public static void main(String[] args) {  

		/* parse()	*/ System.out.println();
		Instant inst = Instant.parse("2017-02-03T10:37:30.00Z");  
		System.out.println(inst);  
		
		/* now()	*/ System.out.println();
		Instant instant = Instant.now();  
	    System.out.println(instant);    

	    /* minus()	*/ System.out.println();
		Instant instant1 = Instant.parse("2017-02-03T11:25:30.00Z");  
	    instant1 = instant1.minus(Duration.ofDays(125));  
	    System.out.println(instant1);   
		
	    /* plus()	*/ System.out.println();
		Instant inst1 = Instant.parse("2017-02-03T11:25:30.00Z");  
	    Instant inst2 = inst1.plus(Duration.ofDays(125));  
	    System.out.println(inst2);   
		
	    /* isSupported()	*/ System.out.println();
		Instant inst3 = Instant.parse("2017-02-03T11:35:30.00Z");  
	    System.out.println(inst3.isSupported(ChronoUnit.DAYS));  
	    System.out.println(inst3.isSupported(ChronoUnit.YEARS));      
		
	}  
} 