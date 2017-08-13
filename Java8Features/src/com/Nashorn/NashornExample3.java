package com.Nashorn;

import javax.script.*;  
import java.io.*;  

//Setting JavaScript variable in Java File
public class NashornExample3 {  
    public static void main(String[] args) throws Exception{  
        // Creating script engine  
        ScriptEngine ee = new ScriptEngineManager().getEngineByName("Nashorn");  
        //Binding script and Define scope of script  
        Bindings bind = ee.getBindings(ScriptContext.ENGINE_SCOPE);  
        bind.put("name", "Nashorn");  
        // Reading Nashorn file  
        ee.eval(new FileReader("js/hello1.js"));  
    }  
}  