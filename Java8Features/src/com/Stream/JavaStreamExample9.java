package com.Stream;

import java.util.*;
import java.util.stream.Collectors;
//Java Stream Example : Convert List into Set
public class JavaStreamExample9 {  
    public static void main(String[] args) {  
        List<Product> productsList = new ArrayList<Product>();  
  
        //Adding Products  
        productsList.add(new Product(1,"HP Laptop",25000f));  
        productsList.add(new Product(2,"Dell Laptop",30000f));  
        productsList.add(new Product(3,"Lenevo Laptop",28000f));  
        productsList.add(new Product(4,"Sony Laptop",28000f));  
        productsList.add(new Product(5,"Apple Laptop",90000f));  
          
        // Converting product List into Set  
        Set<Float> productPriceList = productsList.stream()  
            .filter(product->product.price < 30000)   // filter product on the base of price  
            .map(product->product.price)  
            .collect(Collectors.toSet());   // collect it as Set(remove duplicate elements)  
        System.out.println(productPriceList);  
                
//        productsList.stream()  
//                .filter(product->product.price < 30000)   // filter product on the base of price  
//                .map(Product::getPrice)  
//                .collect(Collectors.toSet())   // collect it as Set(remove duplicate elements)  
//                .forEach(System.out::println);        
    }  
}  

