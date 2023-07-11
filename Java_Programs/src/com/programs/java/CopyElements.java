package com.programs.java;

import java.util.Arrays;

public class CopyElements {

	public static void main(String[] args) {
		int[] numbers = { 2, 5, 10, 5, 12, 25, 22, 9, 8, 12 };
		System.out.println(numbers.length);
		int[] duplicate=new int[10];
		
for (int i = 0; i < numbers.length; i++) {
	
			duplicate[i]=numbers[i];
		}
		System.out.println(Arrays.toString(duplicate));
	}

}
