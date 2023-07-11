package com.programs.java;

public class SecondLargest {

	public static void main(String[] args) {
		int[] num = { 2, 5, 10, 5, 12, 25, 22, 9, 8, 12, 1, 23 };

		int lar;
		// length of the array
		int n = num.length;
		System.out.println(n);
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (num[i] > num[j]) {
					lar = num[i];
					num[i] = num[j];
					num[j] = lar;
				}
			}
		}
		System.out.println(num[n - 4]);
		System.out.println(num[0]);

	}

}
