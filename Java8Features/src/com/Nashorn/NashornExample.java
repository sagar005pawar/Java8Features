package com.Nashorn;

import javax.script.*;  
import java.io.*;  

//Executing JavaScript file in Java Code
public class NashornExample {  
    public static void main(String[] args) throws Exception{  
        // Creating script engine  
        ScriptEngine ee = new ScriptEngineManager().getEngineByName("Nashorn");  
        // Reading Nashorn file  
        ee.eval(new FileReader("js/hello.js"));  
    }  
}  


