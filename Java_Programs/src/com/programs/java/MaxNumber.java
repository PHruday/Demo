package com.programs.java;

public class MaxNumber {

	public static void main(String[] args) {
		int[] num = { 2, 5, 10, 5, 12, 25, 22, 9, 8, 12,1};
		int max=num[0];
		System.out.println(max);
		for (int i = 0; i < num.length; i++) {
			if (max<num[i]) {
				max=num[i];
			}
			
		}System.out.println(max);

	}

}
