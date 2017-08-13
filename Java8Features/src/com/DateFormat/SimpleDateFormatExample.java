package com.DateFormat;

import java.text.ParseException;
import java.text.SimpleDateFormat;  
import java.util.Date;  

//Java SimpleDateFormat
public class SimpleDateFormatExample {  
	public static void main(String[] args) {  

	    /* Date to String	*/System.out.println();
		Date date2 = new Date();  
	    SimpleDateFormat formatter2 = new SimpleDateFormat("dd/MM/yyyy");  
	    String strDate2= formatter2.format(date2);  
	    System.out.println(strDate2);  
	    
	    
	    
	    
	    /* format date and time in java	*/System.out.println();	    
	    Date date = new Date();  
	    SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");  
	    String strDate = formatter.format(date);  
	    System.out.println("Date Format with MM/dd/yyyy : "+strDate);  
	  
	    formatter = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");  
	    strDate = formatter.format(date);  
	    System.out.println("Date Format with dd-M-yyyy hh:mm:ss : "+strDate);  
	  
	    formatter = new SimpleDateFormat("dd MMMM yyyy");  
	    strDate = formatter.format(date);  
	    System.out.println("Date Format with dd MMMM yyyy : "+strDate);  
	  
	    formatter = new SimpleDateFormat("dd MMMM yyyy zzzz");  
	    strDate = formatter.format(date);  
	    System.out.println("Date Format with dd MMMM yyyy zzzz : "+strDate);  
	  
	    formatter = new SimpleDateFormat("E, dd MMM yyyy HH:mm:ss z");  
	    strDate = formatter.format(date);  
	    System.out.println("Date Format with E, dd MMM yyyy HH:mm:ss z : "+strDate);  
	    
	    
	    
	    /* String to Date	*/System.out.println();
	    SimpleDateFormat formatter1 = new SimpleDateFormat("dd/MM/yyyy");  
	    try {  
	        Date date1 = formatter1.parse("31/03/2015");  
	        System.out.println("Date is: "+date1);  
	    } catch (ParseException e) {e.printStackTrace();}  
	    
	}  
}