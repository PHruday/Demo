package com.programs.java;

public class Reverse_String {

	public static void main(String[] args) {
		String name = "MOM";
		System.out.println("Given String is:-->" + name);
		char[] ch = name.toCharArray();
		String rev = "";

		for (int i = ch.length - 1; i >=0; i--) {
			ch[i] = name.charAt(i);
			rev = rev + ch[i];
		}
		System.out.println("After String Reverse:-->" + rev);
		if (rev.equals(name)) {
			System.out.println("It is a Palindrome!!!");
		} else {
			System.out.println("It is not a Palindrome!!!");
		}
	}

}
