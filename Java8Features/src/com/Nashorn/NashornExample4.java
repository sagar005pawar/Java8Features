package com.Nashorn;

import javax.script.*;  
import java.io.*;  

//
public class NashornExample4 {  
    public static void main(String[] args) throws Exception{  
        // Creating script engine  
        ScriptEngine ee = new ScriptEngineManager().getEngineByName("Nashorn");  
        // Reading Nashorn file  
        ee.eval(new FileReader("js/hello4.js"));  
        Invocable invocable = (Invocable)ee;  
        // calling a function  
        invocable.invokeFunction("functionDemo1");  
        // calling a function and passing variable as well.  
        invocable.invokeFunction("functionDemo2","Nashorn");       
    }  
}  