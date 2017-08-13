package com.TypeAnnotations;

import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import com.sun.istack.internal.NotNull;

@Repeatable(Pros.class)
@interface Pro{
	int id();
	@NotNull String name();
	float price();
}

@Retention(RetentionPolicy.RUNTIME)
@interface Pros{
	Pro[] value();
}

@Pro(id=1, name="sagar", price=25.0f)
@Pro(id=2, name="vijay", price=35.0f)
@Pro(id=3, name="pawar", price=45.0f)
public class Test {

	public static void main(String[] args) {
		Pro[] pro = Test.class.getDeclaredAnnotationsByType(Pro.class);

		for (Pro pro2 : pro) {
			System.out.println(pro2.id()+"\t"+pro2.name()+"\t"+pro2.price());
		}
		
		
	}	
	
}
