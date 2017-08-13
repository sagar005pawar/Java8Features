package com.Stream;

import java.util.*;
import java.util.stream.Collectors;
//Java Stream Example : Convert List into Map
public class JavaStreamExample10 {  
    public static void main(String[] args) {  
        List<Product> productsList = new ArrayList<Product>();  
  
        //Adding Products  
        productsList.add(new Product(1,"HP Laptop",25000f));  
        productsList.add(new Product(2,"Dell Laptop",30000f));  
        productsList.add(new Product(3,"Lenevo Laptop",28000f));  
        productsList.add(new Product(4,"Sony Laptop",28000f));  
        productsList.add(new Product(5,"Apple Laptop",90000f));  
          
        // Converting Product List into a Map  
        Map<Integer,String> productMap = productsList.stream()  
                        .collect(Collectors.toMap(p->p.id, p->p.name));  
              
        System.out.println(productMap);  

//        Map<Integer,String> productMap = productsList.stream()  
//                .collect(Collectors.toMap(Product::getId, Product::getName));  
//        		//collecting By Method Reference
//        System.out.println(productMap);  
    
        
//        System.out.println(productsList.stream().collect(Collectors.toMap(Product::getId, Product::getName)));        
    }  
}  