package com.programs.java;

public class Arrays {

	public static void main(String[] args) {
		int[] age = { 12, 72, 14, 19, 20 };
		int len = age.length;

		// System.out.println(len);

		for (int i = 0; i < len; i++) {
			while (age[i]>20) {
				i++;
			}
			System.out.println(age[i]);
		}
	}

}
