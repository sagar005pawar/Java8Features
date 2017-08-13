package com.DateTimeAPI;

import java.time.LocalTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;

public class LocalTimeExample {  
	public static void main(String[] args) {  
		
		//Java LocalTime Example: now()
		LocalTime time = LocalTime.now();  
	    System.out.println(time);  
	    
	    System.out.println();
	    //Java LocalTime Example: of()	
	    LocalTime time4 = LocalTime.of(10,43,12);  
	    System.out.println(time4);  
	    
	    System.out.println();
	    //minusHours() and minusMinutes()
	    LocalTime time1 = LocalTime.of(10,43,12);  
	    System.out.println(time1);  
	    LocalTime time2=time1.minusHours(2);
	    System.out.println(time2);
	    LocalTime time3=time2.minusMinutes(34);  
	    System.out.println(time3);  
	    
	    System.out.println();
	    //plusHours() and plusMinutes()
	    LocalTime time5 = LocalTime.of(10,43,12);  
	    System.out.println(time1);  
	    LocalTime time6=time5.plusHours(4);
	    System.out.println(time6);
	    LocalTime time7=time6.plusMinutes(18);  
	    System.out.println(time7);  
	    
	    System.out.println();
	    //Java LocalTime Example
	    ZoneId zone1 = ZoneId.of("Asia/Kolkata");  
	    ZoneId zone2 = ZoneId.of("Asia/Tokyo");  
	    LocalTime time8 = LocalTime.now(zone1);  
	    System.out.println("India Time Zone: "+time8);  
	    LocalTime time9 = LocalTime.now(zone2);  
	    System.out.println("Japan Time Zone: "+time9);  
	    long hours = ChronoUnit.HOURS.between(time8, time9);  
	    System.out.println("Hours between two Time Zone: "+hours);  
	    long minutes = ChronoUnit.MINUTES.between(time8, time9);  
	    System.out.println("Minutes between two time zone: "+minutes); 
	    
	    
	}  
}  