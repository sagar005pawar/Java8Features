package com.DateTimeAPI;

import java.time.LocalDateTime;  
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;  

public class LocalDateTimeExample {  
    public static void main(String[] args) {  
        
    	/* Java LocalDateTime Example  */ System.out.println();
    	LocalDateTime now = LocalDateTime.now();  
        System.out.println("Before Formatting: " + now);  
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");  
        String formatDateTime = now.format(format);  
        System.out.println("After Formatting: " + formatDateTime);  

    	/* now() */ System.out.println();    
        LocalDateTime datetime1 = LocalDateTime.now();  
        DateTimeFormatter format1 = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");  
        String formatDateTime1 = datetime1.format(format1);   
        System.out.println(formatDateTime1);    
    
    	/* get()  */ System.out.println();
    	LocalDateTime a = LocalDateTime.of(2017, 2, 13, 15, 56);    
        System.out.println(a.get(ChronoField.DAY_OF_WEEK));  
        System.out.println(a.get(ChronoField.DAY_OF_YEAR));  
        System.out.println(a.get(ChronoField.DAY_OF_MONTH));  
        System.out.println(a.get(ChronoField.HOUR_OF_DAY));  
        System.out.println(a.get(ChronoField.MINUTE_OF_DAY));   
        
        
    	/* minusDays()  */ System.out.println();        
        LocalDateTime datetime3 = LocalDateTime.of(2017, 1, 14, 10, 34);  
        LocalDateTime datetime4 = datetime3.minusDays(100);  
        System.out.println("Before Formatting: " + datetime4);  
        DateTimeFormatter format3 = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");  
        String formatDateTime3 = datetime4.format(format3);   
        System.out.println("After Formatting: " + formatDateTime3);  
        
    	/* plusDays()  */ System.out.println();                
        LocalDateTime datetime5 = LocalDateTime.of(2017, 1, 14, 10, 34);  
        LocalDateTime datetime6 = datetime5.plusDays(120);  
        System.out.println("Before Formatting: " + datetime6);  
        DateTimeFormatter format5 = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");  
        String formatDateTime5 = datetime6.format(format5);   
        System.out.println("After Formatting: " + formatDateTime5 );  
        
    }  
} 