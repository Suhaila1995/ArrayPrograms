package com.arrays.practice;

public class NumberPairsEqualsSum {

	public static void main(String[] args) {
		int num=6;
		int[] numbers = {1,2,3,4,5,6,7,0};
		for (int i = 0; i < numbers.length; i++) {
			for (int j = i+1; j < numbers.length; j++) {
				
				if(numbers[i]+numbers[j]==num) {
					System.out.println(numbers[i] +" "+ numbers[j]);
				}}
		}

	}
	

}
