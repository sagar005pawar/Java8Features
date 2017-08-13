package com.MethodReferences;

//Reference to an Instance Method		containingObject::instanceMethodName  
interface Sayable2{  
    void say();  
}  
public class MethodReference2 {  
    public void saySomething2(){  
        System.out.println("Hello, this is non-static method.");  
    }  
    public static void main(String[] args) {  
        MethodReference2 methodReference = new MethodReference2(); // Creating object  
        // Referring non-static method using reference  
            Sayable2 sayable2 = methodReference::saySomething2;
        // Calling interface method  
            sayable2.say();  
            
            // Referring non-static method using anonymous object  
            Sayable2 sayable3 = new MethodReference2()::saySomething2; // You can use anonymous object also  
            // Calling interface method  
            sayable3.say();  
    }  
}  

