package com.FunctionalInterface;

@FunctionalInterface  
interface sayable1{  
    void say(String msg);   // abstract method  
      
    // It can contain any number of methods of Object class.  
    int hashCode();  
    String toString();  
    boolean equals(Object obj);
    
}  

public class FunctionalInterfaceExample1 implements sayable1
{    
    public void say(String msg){  
        System.out.println(msg);  
    }  
    public static void main(String[] args) {  
        FunctionalInterfaceExample fie = new FunctionalInterfaceExample();  
        fie.say("Hello there");  
    }  
}  
