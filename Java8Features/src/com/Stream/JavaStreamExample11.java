package com.Stream;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.*;
import java.util.stream.*;

//Method Reference in stream
public class JavaStreamExample11 {  
	  
    public static void main(String[] args) {  
          
        List<Product> productsList = new ArrayList<Product>();  

        Product p1 = new Product(6,"Bell Laptop",30000f);
        Product p2 = new Product(7,"Mony Laptop",28000f);		  
        
        //Adding Products  
        productsList.add(new Product(4,"Sony Laptop",28000f));  
        productsList.add(new Product(2,"Dell Laptop",30000f));
        productsList.add(new Product(3,"Lenevo Laptop",28000f));
        productsList.add(new Product(1,"HP Laptop",25000f));  
        productsList.add(new Product(5,"Apple Laptop",90000f));  
        productsList.add(new Product(9,"Dells Paptop",35000f));  
        productsList.add(p1);
        productsList.add(p2);
        productsList.add(p1);
        productsList.add(p2);

        
        
/*        
        productsList.stream()
        .sorted((p15,p25)->p15.getName().toLowerCase().compareTo(p25.getName().toLowerCase()))
    	.forEach(System.out::println);
*/        
        
/*        
        productsList.stream()
        	.filter(p->p.getName().contains("Pa"))
        	.map(Product::getName)
        	.collect(Collectors.toList())
        	.forEach(System.out::println);
*/        
        
/*        
        String str = "java is paltform independent language";
//        StringJoiner sj = new StringJoiner(", ");
        StringJoiner sj = new StringJoiner(", ", "[", "]");
        sj.add(str);
        sj.add("sagar");
        sj.add("pawar");
        System.out.println(sj);
*/        
                
        
        
/*        
        Class cls = p1.getClass();					//method parameter reflection
        Method[] method = cls.getDeclaredMethods();
        for(Method m1:method){
        	System.out.print("\n" + m1.getName());
        	Parameter[] para = m1.getParameters();
        	for (Parameter parameter : para) {
				System.out.print("\t"+parameter.getParameterizedType()+"\t"+parameter.getName());
			}
        }        
*/        
        
        
        //productsList.stream().skip(4).forEachOrdered(System.out::println);
        //IntStream.range(1, productsList.size()).forEachOrdered(System.out::println);
        //LongStream.range(1, productsList.stream().count()).forEachOrdered(System.out::println);
        
/*        
        productsList.stream()
	        .filter(p->{return (p.getPrice()>28000.0f);})
	        .peek(System.out::println)
	        .map(Product::getName)
	        .peek(System.out::println)
	        .collect(Collectors.toList());
*/
        
//        productsList.stream().distinct().forEach(System.out::println);;
        
/*        
        productsList.stream()
			        .filter(p->p.getName().toUpperCase().contains("del".toUpperCase()))
			        .map(Product::getName)
			        .limit(1)
			        .collect(Collectors.toList())
			        .forEach(System.out::println);        
*/
        
//        List<Float> productPriceList = productsList.stream()  
//                            .filter(p -> p.price > 30000) // filtering data  
//                            .map(Product::getPrice)         // fetching price by referring getPrice method  
//                            .collect(Collectors.toList());  // collecting as list  
//        System.out.println(productPriceList);  
        
//        productsList.stream().filter(p -> p.price > 30000) // filtering data  
//					        .map(Product::getPrice)         // fetching price by referring getPrice method  
//					        .collect(Collectors.toList())
//					        .forEach(System.out::print);
        

//        productsList.stream().forEachOrdered(System.out::println);
        
//        Arrays.asList(1, 2, 3)
//        .stream().findAny().filter(p->p.equals(3))
//        .ifPresent(System.out::print);
        
        //Stream.of(1, 2, 3).findAny().ifPresent(System.out::println);
        //Stream.of(2, 3, 1).findFirst().ifPresent(System.out::println);

        
//        IntStream.range(1, 5).forEachOrdered(System.out::println);
        
//        productsList.stream().filter(p->p.getPrice()==28000.0f)
//        .sorted((s1, s2)->s1.getName().compareToIgnoreCase(s2.getName()))
//        .collect(Collectors.toList())
//        .forEach(System.out::println);
        
//        productsList.stream()
//        .sorted((f1, f2)->f1.getName().compareToIgnoreCase(f2.getName()))
//        .map(Product::getName)
//        .collect(Collectors.toSet())
//        .forEach(System.out::println);
        
        
    }  
}  


