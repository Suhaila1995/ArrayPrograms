package com.arrays.practice;

public class SecondLargest {
	
	public static int secondlargest(int[] arr) {
	    
		

		  // assign first element to fmax, smax
		  int fmax = arr[0];
		  int smax = 0;

		  // firstLargest
		  for (int i = 0; i < arr.length; i++) {
		    if (arr[i] > fmax) {
		      fmax = arr[i];
		    }}
		      System.out.println("Largest="+ fmax);
		   
		   //Second Largest 
		  for (int i = 0; i < arr.length; i++) {
		       if(arr[i] > smax && arr[i]<fmax) {
		      smax = arr[i];
		       }}
		      System.out.println("Smallest="+ smax);
		  return smax;
		}

	public static void main(String[] args) {

		int[] numbers = {2, -9, 0, 5, 12, -25, 22, 9, 8, 12};
		System.out.println(secondlargest(numbers));
		
		

	}

}
