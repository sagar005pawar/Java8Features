package com.DateTimeAPI;

import java.time.*;
import java.time.temporal.ChronoField;
import java.time.temporal.Temporal;  

public class ZoneOffsetExample {  
  public static void main(String[] args) {  
  
	/* Java ZoneOffset Example	*/ System.out.println();  
	ZoneOffset zone = ZoneOffset.UTC;  
    Temporal temp = zone.adjustInto(ZonedDateTime.now());  
    System.out.println(temp);  
    
	/* ofHours()	*/ System.out.println();  
	ZoneOffset zone2 = ZoneOffset.ofHours(5);  
    System.out.println(zone2);  
	
    /* ofHoursMinutes()	*/ System.out.println();  
	ZoneOffset zone3 = ZoneOffset.ofHoursMinutes(5,30);  
    System.out.println(zone3);  

    /* isSupported()	*/ System.out.println();  
	ZoneOffset zone4 = ZoneOffset.UTC;  
    boolean b1 = zone4.isSupported(ChronoField.OFFSET_SECONDS);  
    System.out.println(b1);  
    boolean b2 = zone4.isSupported(ChronoField.SECOND_OF_MINUTE);  
    System.out.println(b2);  

    
  }  
} 