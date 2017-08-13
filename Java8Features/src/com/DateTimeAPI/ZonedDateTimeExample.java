package com.DateTimeAPI;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;  

//Java ZonedDateTime class
public class ZonedDateTimeExample{  
	  public static void main(String[] args) {  
	   
		  	/*Java ZonedDateTime class Example	*/ System.out.println();
			ZonedDateTime zone = ZonedDateTime.parse("2016-10-05T08:20:10+05:30[Asia/Kolkata]");  
		    System.out.println(zone); 
		    
		  	/* of() and withZoneSameInstant()	*/ System.out.println();		    
		    LocalDateTime  ldt = LocalDateTime.of(2017, Month.JANUARY,  19,   15,   26);  
		    ZoneId  india = ZoneId.of("Asia/Kolkata");   
		    ZonedDateTime zone1  = ZonedDateTime.of(ldt, india);   
		    System.out.println("In India Central Time Zone: " + zone1);  
		    ZoneId  tokyo = ZoneId.of("Asia/Tokyo");   
		    ZonedDateTime zone2   = zone1.withZoneSameInstant(tokyo);   
		    System.out.println("In Tokyo Central Time Zone:"  + zone2);  
		    
		  	/* getZone()	*/ System.out.println();		    
		    ZonedDateTime zone3 =ZonedDateTime.now();  
		    System.out.println(zone3.getZone());  
		   
		  	/* minus()	*/ System.out.println();
		    ZonedDateTime zone4= ZonedDateTime.now();  
		    ZonedDateTime m = zone4.minus(Period.ofDays(126));  
		    System.out.println(m);  
		    
		  	/* plus()	*/ System.out.println();		    
		    ZonedDateTime zone5= ZonedDateTime.now();  
		    ZonedDateTime p = zone5.plus(Period.ofDays(126));  
		    System.out.println(p);  
		    
	  }  
}  