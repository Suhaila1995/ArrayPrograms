package com.arrays.practice;

public class PrintDuplicates {

	public static void main(String[] args) {
		int[] numbers = {1,2,3,4,5,6,4,0,2,0};
		int duplicate=0;
		for (int i = 0; i < numbers.length; i++) {
			for (int j = i+1; j < numbers.length; j++) {
				if(numbers[i]==numbers[j]) {
					duplicate=numbers[i];
					System.out.println(duplicate);
				}
			}
			}
	

	}

}
