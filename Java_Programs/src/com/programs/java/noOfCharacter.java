package com.programs.java;

public class noOfCharacter {

	public static void main(String[] args) {
		String name = "My name is Hruday";
		int len = name.length();
		while (len > 0) {
			System.out.print(name.charAt(len - 1));
			len--;
		}

		String input = "My name is Hruday";

		// creating StringBuilder object

		StringBuilder stringBuildervarible = new StringBuilder();

		// append a string into StringBuilder stringBuildervarible

		// append is inbuilt method to append the data

		stringBuildervarible.append(input);

		// reverse is inbuilt method in StringBuilder to use reverse the string

		stringBuildervarible.reverse();

		// print reversed String
		System.out.println();
		System.out.println("Reversed String  : " + stringBuildervarible);

	}
}
