package com.Stream;

import java.util.stream.Stream;

//Java Stream Iterating Example
public class JavaStreamExample3 {  
    public static void main(String[] args){  
        Stream.iterate(1, element -> element+1)  
		        .filter(element->element%5==0)  
		        .limit(10)  
		        .forEach(System.out::println);  
    }  
}