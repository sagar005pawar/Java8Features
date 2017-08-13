package com.forEach;

import java.util.*;

public class ForEachExample {  
    public static void main(String[] args) {  
        List<String> gamesList = new ArrayList<String>();  
        gamesList.add("Football");  
        gamesList.add("Cricket");  
        gamesList.add("Chess");  
        gamesList.add("Hocky");  

/*        
        //forEach() Signature in Iterable Interface
        System.out.println("------------Iterating by passing lambda expression--------------");  
        gamesList.forEach(games -> System.out.println(games));            
        System.out.println("------------Iterating by passing method reference---------------");  
        gamesList.forEach(System.out::println);          
*/      
        
        //Java Stream forEachOrdered() Method Example
        System.out.println("------------Iterating by passing lambda expression---------------");  
        gamesList.stream().forEachOrdered(games -> System.out.println(games));  
        System.out.println("------------Iterating by passing method reference---------------");  
        gamesList.stream().forEachOrdered(System.out::println);  

        
    }  
}  