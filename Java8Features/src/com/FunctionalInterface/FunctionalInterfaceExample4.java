package com.FunctionalInterface;

//Single Abstract Method
interface doable{  
    default void doIt(){  				//This method is not abstract method
        System.out.println("Do it now");  
    }  
}  
  
@FunctionalInterface  					//This Annotation shows SAM Interface
interface sayable4 extends doable{  
    void say(String msg);   // abstract method  
}  
  
public class FunctionalInterfaceExample4 implements sayable4
{    
    public void say(String msg){  
        System.out.println(msg);  
    }  
    public static void main(String[] args) {  
        FunctionalInterfaceExample4 fie = new FunctionalInterfaceExample4();  
        fie.say("Hello there");  
        fie.doIt();  
    }  
}  
