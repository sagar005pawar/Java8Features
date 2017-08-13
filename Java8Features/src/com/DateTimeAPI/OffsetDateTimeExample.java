package com.DateTimeAPI;

import java.time.OffsetDateTime;  

public class OffsetDateTimeExample {  
    public static void main(String[] args) {  
    	
    	/*	getDayOfMonth()	*/ System.out.println();
        OffsetDateTime offsetDT = OffsetDateTime.now();  
        System.out.println(offsetDT.getDayOfMonth());  
        
    	/*	getDayOfYear()	*/ System.out.println();        
        OffsetDateTime offsetDT1 = OffsetDateTime.now();  
        System.out.println(offsetDT1.getDayOfYear());  
        
    	/*	getDayOfWeek()	*/ System.out.println();                
        OffsetDateTime offsetDT2 = OffsetDateTime.now();  
        System.out.println(offsetDT2.getDayOfWeek());  
        
    	/*	toLocalDate()	*/ System.out.println();                        
        OffsetDateTime offsetDT3 = OffsetDateTime.now();  
        System.out.println(offsetDT3.toLocalDate());  

    	/*	minusDays()	*/ System.out.println();                        
        OffsetDateTime offset = OffsetDateTime.now();  
        OffsetDateTime value =  offset.minusDays(240);  
        System.out.println(value);  

    	/*	plusDays()	*/ System.out.println();                        
        OffsetDateTime offset2 = OffsetDateTime.now();  
        OffsetDateTime value2 =  offset2.plusDays(240);  
        System.out.println(value2);  
        
    }  
}  