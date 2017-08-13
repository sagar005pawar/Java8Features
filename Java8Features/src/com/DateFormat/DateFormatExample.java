package com.DateFormat;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;  

//Java Date Format
public class DateFormatExample {  
    public static void main(String[] args) throws Exception {  

    	/*	*/ System.out.println();
    	Date currentDate1 = new Date();  
        System.out.println("Current Date: "+currentDate1);  
        String dateToStr1 = DateFormat.getInstance().format(currentDate1);  
        System.out.println("Date Format using getInstance(): "+dateToStr1);  

        
    	/*	*/ System.out.println();
    	Date currentDate = new Date();  
        System.out.println("Current Date: "+currentDate);  
  
        String dateToStr = DateFormat.getInstance().format(currentDate);  
        System.out.println("Date Format using getInstance(): "+dateToStr);  
  
        dateToStr = DateFormat.getDateInstance().format(currentDate);  
        System.out.println("Date Format using getDateInstance(): "+dateToStr);  
  
        dateToStr = DateFormat.getTimeInstance().format(currentDate);  
        System.out.println("Date Format using getTimeInstance(): "+dateToStr);  
  
        dateToStr = DateFormat.getDateTimeInstance().format(currentDate);  
        System.out.println("Date Format using getDateTimeInstance(): "+dateToStr);  
  
        dateToStr = DateFormat.getTimeInstance(DateFormat.SHORT).format(currentDate);  
        System.out.println("Date Format using getTimeInstance(DateFormat.SHORT): "+dateToStr);  
  
        dateToStr = DateFormat.getTimeInstance(DateFormat.MEDIUM).format(currentDate);  
        System.out.println("Date Format using getTimeInstance(DateFormat.MEDIUM): "+dateToStr);  
          
        dateToStr = DateFormat.getTimeInstance(DateFormat.LONG).format(currentDate);  
        System.out.println("Date Format using getTimeInstance(DateFormat.LONG): "+dateToStr);  
          
        dateToStr = DateFormat.getDateTimeInstance(DateFormat.LONG,DateFormat.SHORT).format(currentDate);  
        System.out.println("Date Format using getDateTimeInstance(DateFormat.LONG,DateFormat.SHORT): "+dateToStr);  
    	
        
    	/*	*/ System.out.println();
//    	Date d = DateFormat.getDateInstance().parse("31 Mar, 2015");  
//      System.out.println("Date is: "+d);  
    	

        
    }  
} 

/*

	java.text.DateFormat Fields
	
	protected Calendar calendar  
	protected NumberFormat numberFormat  
	public static final int ERA_FIELD  
	public static final int YEAR_FIELD  
	public static final int MONTH_FIELD  
	public static final int DATE_FIELD  
	public static final int HOUR_OF_DAY1_FIELD  
	public static final int HOUR_OF_DAY0_FIELD  
	public static final int MINUTE_FIELD  
	public static final int SECOND_FIELD  
	public static final int MILLISECOND_FIELD  
	public static final int DAY_OF_WEEK_FIELD  
	public static final int DAY_OF_YEAR_FIELD  
	public static final int DAY_OF_WEEK_IN_MONTH_FIELD  
	public static final int WEEK_OF_YEAR_FIELD  
	public static final int WEEK_OF_MONTH_FIELD  
	public static final int AM_PM_FIELD  
	public static final int HOUR1_FIELD  
	public static final int HOUR0_FIELD  
	public static final int TIMEZONE_FIELD  
	public static final int FULL  
	public static final int LONG  
	public static final int MEDIUM  
	public static final int SHORT  
	public static final int DEFAULT  

*/
