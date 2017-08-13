package com.DateTimeAPI;

import java.time.*;  
import java.time.temporal.ChronoUnit;  

//Java Duration class
public class DurationExample {  
	public static void main(String[] args) {  
	
		/* get()	*/ System.out.println();
		Duration d = Duration.between(LocalTime.NOON,LocalTime.MAX);  
		System.out.println(d.get(ChronoUnit.SECONDS));    
		
		/* isNegative()	*/ System.out.println();
		Duration d1 = Duration.between(LocalTime.MAX,LocalTime.NOON);  
	    System.out.println(d1.isNegative());  
	    Duration d2 = Duration.between(LocalTime.NOON,LocalTime.MAX);  
	    System.out.println(d2.isNegative());   
		
		/* between()	*/ System.out.println();
		Duration d3 = Duration.between(LocalTime.NOON,LocalTime.MAX);  
	    System.out.println(d3.get(ChronoUnit.SECONDS));    
		
		/* minus()	*/ System.out.println();
		Duration d4 = Duration.between(LocalTime.NOON,LocalTime.MAX);  
	    System.out.println(d4.getSeconds());  
	    Duration d5 = d4.minus(d4);  
	    System.out.println(d5.getSeconds());  
		
		/* plus()	*/ System.out.println();
		Duration d6 = Duration.between(LocalTime.NOON,LocalTime.MAX);  
	    System.out.println(d6.getSeconds());  
	    Duration d7 = d6.plus(d6);  
	    System.out.println(d7.getSeconds());  
		
	}  
}  