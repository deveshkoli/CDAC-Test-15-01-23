package com.Test.main;

import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
		
		int[] arr = {10,20,30,40,50};
		
		System.out.println("Original Array: "+Arrays.toString(arr)+"\n"); 
		
		int max = arr[0];
		int min = arr[0];
		
		for(int i = 1; i < arr.length; i++)
		{
			if(arr[i] > max)
				max = arr[i];
			
			else if(arr[i] < min)
				min = arr[i];
		}
		
		System.out.println("Largest value of an array: "+max);
		System.out.println("Largest value of an array: "+min+"\n");
		System.out.println("Difference between the largest and smallest values of an array: "+( max - min ));	
	 }
}