package com.programs.java;

public class Remove_Duplicate {

	public static void main(String[] args) {

		String name="pravardhanp";
		System.out.println("Given String:-->" +name);
		char[] ch=name.toCharArray();
		int i,j;
		for ( i = 0; i < ch.length; i++) {
			for ( j = 0; j < i; j++) {
				if (ch[i]==ch[j]) {
					break;
				}
			} if(i==j) {
				System.out.print(ch[i]);
			}
		}System.out.print("\nAfter Removal of Duplicate Character");
	}

}
