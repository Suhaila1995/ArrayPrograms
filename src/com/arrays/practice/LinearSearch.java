package com.arrays.practice;

public class LinearSearch {

	public static void main(String[] args) {
		int searchNum=4;
		int count=0;;
		int[] numbers = {1,2,3,4,5,6,4,0};
		 for (int i = 0; i < numbers.length; i++) {
			 if(numbers[i]==searchNum) {
				 System.out.println("Number found at position "+i);
				 count++;
			 }
		 }
		 if(count!=0) {
			 System.out.println(count +" times");
		 }else {
			 System.out.println("Not found");
		 }

	}

}
