package com.DateClassical;

import java.sql.Date;

//java.sql.Date
public class SQLDateExample {  
    public static void main(String[] args) {  
        
    	//java.sql.Date Example: get current date
    	long millis=System.currentTimeMillis();  
        java.sql.Date date=new java.sql.Date(millis);  
        System.out.println(date);  
        
        //Java String to java.sql.Date Example
        String str="2015-03-31";  
        Date date1=Date.valueOf(str);//converting string into sql date  
        System.out.println(date1);  
    }  
}  