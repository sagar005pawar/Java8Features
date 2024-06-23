package com.JDBC;

import java.sql.*;    

//implementing DriverAction interface  
public class JdbcExample implements DriverAction, SQLType
{    
	 // implementing deregister method of DriverAction interface  
	 @Override  
	 public void deregister() {  
	     System.out.println("Driver deregistered");  
	 }  

	 public static void main(String args[]){  
	     try{  
	         // Creating driver instance  
	         Driver driver = new com.mysql.cj.jdbc.Driver();  
	         // Creating Action Driver  
	         DriverAction da = new JdbcExample();  
	         // Registering driver by passing driver and driverAction  
	         DriverManager.registerDriver(driver, da);  
	         // Creating connection  
	         Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/spring","root","root");
	         //Here student is database name, root is username and password is mysql  
	         Statement stmt = con.createStatement();   
	         // Executing SQL query  
	         ResultSet rs = stmt.executeQuery("select * from employee");    
	         while(rs.next()){    
	             System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));    
	         }  
	         // Closing connection  
	         con.close();    
	         // Calling deregisterDriver method  
	         DriverManager.deregisterDriver(driver);  
	     }catch(Exception e){ System.out.println(e);}    
	 }

	@Override
	public String getName() {
		return "JDBC";
	}

	@Override
	public String getVendor() {
		return "MySQL";
	}

	@Override
	public Integer getVendorTypeNumber() {
		return 3306;
	}    
   
}    
/*
	The JDBC-ODBC Bridge has been removed.
		Oracle does not support the JDBC-ODBC Bridge. 
		Oracle recommends that you use JDBC drivers 
		provided by the vendor of your database instead of the JDBC-ODBC Bridge.
		
*/
