package com.ParallelArraySorting;

import java.util.Arrays;  
//Java Parallel Array Sorting Example
public class ParallelArraySorting {  
    public static void main(String[] args) {  
    	
		String sp = "java is a programming language";
		String[] arrs = sp.split("\\s");				//** Split() **
		Arrays.parallelSort(arrs);						//sorting by arrays
		for(String s : arrs){
			System.out.print(s +" ");			
		}
		System.out.println("\n\n");
    	
    	
        // Creating an integer array   
        int[] arr = {5,8,1,0,6,9};  
        // Iterating array elements  
        for (int i : arr) {  
            System.out.print(i+" ");  
        }  
        // Sorting array elements parallel  
        Arrays.parallelSort(arr);  
        System.out.println("\nArray elements after sorting");  
        // Iterating array elements  
        for (int i : arr) {  
            System.out.print(i+" ");  
        }  
    }  
} 

