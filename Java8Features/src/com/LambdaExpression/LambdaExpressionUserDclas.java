package com.LambdaExpression;

import java.util.*;
import java.util.stream.Stream;

class Product
{      
	private Integer id;  
    private String name;  
    private Float price;
    
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Float getPrice() {
		return price;
	}
	public void setPrice(Float price) {
		this.price = price;
	}
	public Product(Integer id, String name, Float price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + "]";
	}  
    
}  

class NameCompr implements Comparator<Product>
{
	@Override
	public int compare(Product o1, Product o2) {
		return o1.getName().compareTo(o2.getName());	
	}
}

class PriceCompr implements Comparator<Product>
{
	@Override
	public int compare(Product o1, Product o2) {
		return o1.getPrice().compareTo(o2.getPrice());
	}
}

public class LambdaExpressionUserDclas{  
    public static void main(String[] args) {  
    	
        List<Product> list=new ArrayList<Product>();  
          
        Product p1 = new Product(3,"HP Laptopp",250.0f);
        Product p2 = new Product(1,"Keyboarddd",300.0f);
        Product p3 = new Product(2,"Dell Mouse",150.0f);

        //Adding Products  
        list.add(p1);  
        list.add(p2);  
        list.add(p3);  

/*        
        Stream<Product> FList = list.stream().filter(p->p.getName().equals("Dell Mouse"));
        FList.forEach(System.out::println);        
*/        
        // java 7
//        Collections.sort(list, new NameCompr());
//        Collections.sort(list, new PriceCompr());

        // java 8
//		  Collections.sort(list, (p5,p6) -> p5.getPrice().compareTo(p6.getPrice())); //wrapper Float class
// 		  Collections.sort(list, (p1,p2) -> p1.getName().compareTo(p2.getName()));	//String class
        
        
        
        
        
        list.forEach(System.out::println);
          
/*        
        System.out.println("\nSorting on the basis of name...");  
        list.forEach(n->System.out.println(n));//lambda expression

        System.out.println("\nfiltering on the basis of salary...");  
        Stream<Product> filter = list.stream().filter(p -> p.getPrice() > 200);
        filter.forEach(System.out::println);// lambda expression with method reference

*/    
    }  
}  

