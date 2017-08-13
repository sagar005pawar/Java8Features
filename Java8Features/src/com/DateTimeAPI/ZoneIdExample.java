package com.DateTimeAPI;

import java.time.*;
import java.time.format.TextStyle;
import java.util.Locale;  

//Java ZoneId class
public class ZoneIdExample {  
  public static void main(String... args) {  
    
	/*	Java ZoneId class Example	*/ System.out.println();  
	ZoneId zoneid1 = ZoneId.of("Asia/Kolkata");  
    ZoneId zoneid2 = ZoneId.of("Asia/Tokyo");  
    LocalTime id1 = LocalTime.now(zoneid1);  
    LocalTime id2 = LocalTime.now(zoneid2);  
    System.out.println(id1);  
    System.out.println(id2);  
    System.out.println(id1.isBefore(id2));    
    
    /*	*/ System.out.println();
    ZoneId zone = ZoneId.systemDefault();     
    System.out.println(zone);  
    
    /*	*/ System.out.println();
    ZoneId z = ZoneId.systemDefault();  
    String s = z.getId();  
    System.out.println(s);  

    /*	*/ System.out.println();
    ZoneId z2 = ZoneId.systemDefault();  
    System.out.println(z2.getDisplayName(TextStyle.FULL, Locale.ROOT));  
    
  }  
}  