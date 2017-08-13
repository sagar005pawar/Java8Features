package com.DateClassical;

import java.util.Calendar;  

//Java Calendar Class
public class CalendarExample {  
   public static void main(String[] args) {  

	   /*	*/ System.out.println();
	   Calendar calendar = Calendar.getInstance();  
	   System.out.println("The current date is : " + calendar.getTime());  
	   calendar.add(Calendar.DATE, -15);  
	   System.out.println("15 days ago: " + calendar.getTime());  
	   calendar.add(Calendar.MONTH, 4);  
	   System.out.println("4 months later: " + calendar.getTime());  
	   calendar.add(Calendar.YEAR, 2);  
	   System.out.println("2 years later: " + calendar.getTime());  
  
	   /*	*/ System.out.println();	   
	   Calendar calendar1 = Calendar.getInstance();  
	   System.out.println("At present Calendar's Year: " + calendar1.get(Calendar.YEAR));  
	   System.out.println("At present Calendar's Day: " + calendar1.get(Calendar.DATE));  
	   
	   /*	*/ System.out.println();	   
	   Calendar calendar2 = Calendar.getInstance();  
	   System.out.print("At present Date And Time Is: " + calendar2.getTime());  
	   
	   /*	*/ System.out.println();	   
	   Calendar calendar3 = Calendar.getInstance();  
	   int maximum = calendar3.getMaximum(Calendar.DAY_OF_WEEK);  
	   System.out.println("Maximum number of days in week: " + maximum);  
	   maximum = calendar3.getMaximum(Calendar.WEEK_OF_YEAR);  
	   System.out.println("Maximum number of weeks in year: " + maximum);  
	   
	   /*	*/ System.out.println();	   
	   Calendar cal = Calendar.getInstance();  
	   int maximum2 = cal.getMinimum(Calendar.DAY_OF_WEEK);  
	   System.out.println("Minimum number of days in week: " + maximum2);  
	   maximum2 = cal.getMinimum(Calendar.WEEK_OF_YEAR);  
	   System.out.println("Minimum number of weeks in year: " + maximum2);  
	   
   }  
} 