package com.DateClassical;

import java.util.*;  

//Java TimeZone class
public class TimeZoneExample {  
   public static void main( String args[] ){         
	
	   /*	*/ System.out.println();
	   String[] id = TimeZone.getAvailableIDs();        
	   System.out.println("In TimeZone class available Ids are: ");  
	   for (int i=0; i<id.length; i++){  
		   System.out.println(id[i]);  
	   }   
	   
	   /*	*/ System.out.println();	   
	   TimeZone zone = TimeZone.getTimeZone("Asia/Kolkata");   
	   System.out.println("The Offset value of TimeZone: " +   
	   zone.getOffset(Calendar.ZONE_OFFSET));  
	   
	   /*	*/ System.out.println();	   
	   TimeZone timezone = TimeZone.getTimeZone("Asia/Kolkata");       
	   System.out.println("Value of ID is: " + timezone.getID());  
	   
	   /*	*/ System.out.println();	   
	   TimeZone zone1 = TimeZone.getDefault();  
	   String name = zone1.getDisplayName();         
	   System.out.println("Display name for default time zone: "+ name);  
   }      
}  


