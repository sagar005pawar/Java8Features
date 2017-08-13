package com.MethodReferences;

//1) Reference to a Static Method		ContainingClass::staticMethodName  
interface Sayable{  
    void say();  
}  
public class MethodReference {  
    public static void saySomething(){  
        System.out.println("Hello, this is static method.");  
    }  
    public static void main(String[] args) {  
        // Referring static method  
        Sayable sayable = MethodReference::saySomething;  
        // Calling interface method  
        sayable.say();  
    }  
} 

/*
	There are four types of method references:
	
	Reference to a static method.
	Reference to an instance method of a particular object.
	Reference to an instance method of an arbitrary object of a particular type.
	Reference to a constructor.
*/

