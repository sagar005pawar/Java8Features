package com.DateTimeAPI;

import java.time.Period;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;  

//Java YearMonth class
public class YearExample2 {  
	public static void main(String[] args) {  
		
		/* Java YearMonth Example: now()	*/ System.out.println();
		YearMonth ym = YearMonth.now();  
		System.out.println(ym);  

		/* format()	*/ System.out.println();
		YearMonth ym3 = YearMonth.now();  
	    String s = ym3.format(DateTimeFormatter.ofPattern("MM yyyy"));  
	    System.out.println(s);  

		/* get()	*/ System.out.println();
	    YearMonth y = YearMonth.now();  
	    long l1 = y.get(ChronoField.YEAR);  
	    System.out.println(l1);  
	    long l2 = y.get(ChronoField.MONTH_OF_YEAR);  
	    System.out.println(l2);  
	    
		/* plus()	*/ System.out.println();
	    YearMonth ym1 = YearMonth.now();  
	    YearMonth ym2 = ym1.plus(Period.ofYears(2));  
	    System.out.println(ym2);  
	    
		/* minus()	*/ System.out.println();
	    YearMonth ym4 = YearMonth.now();  
	    YearMonth ym5 = ym4.minus(Period.ofYears(2));  
	    System.out.println(ym5);  
	    
	
	}  
} 