package com.Nashorn;

import javax.script.*;  
//Embedding JavaScript Code in Java Source File
public class NashornExample2 {  
    public static void main(String[] args) throws Exception{  
        // Creating script engine  
        ScriptEngine ee = new ScriptEngineManager().getEngineByName("Nashorn");  
        // Evaluating Nashorn code  
        ee.eval("print('Hello Nashorn');");  
    }  
} 