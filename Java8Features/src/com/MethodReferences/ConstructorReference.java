package com.MethodReferences;

//Reference to a Constructor	ClassName::new  
interface Messageable{  
    Message getMessage(String msg);  
}  
class Message{  
    public Message(String msg){  
        System.out.print(msg);  
    }  
}  
public class ConstructorReference {  
    public static void main(String[] args) {  
        Messageable hello = Message::new;  
        hello.getMessage("Hello");  
    }  
} 

