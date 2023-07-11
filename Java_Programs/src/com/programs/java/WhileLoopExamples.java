package com.programs.java;

public class WhileLoopExamples {

	public static void main(String[] args) {
		String str = "Pada Hruday Pravrdhan";
		char[] ch = str.toCharArray();
		String word = "";
		for (int i = 0; i < (ch.length); i++) {
			if (ch[i] != ' ') {
				word = word + ch[i];
				// System.out.print(word);
			} else {
				for (int j = word.length(); j > 0; j--) {
					System.out.print(word.charAt(j - 1));
				}
				System.out.print(" ");
				word = "";
				System.out.println(word+"=====19");
			}
		}
		for (int i = word.length(); i > 0; i--) {
			System.out.print(word.charAt(i - 1));

		}

		String name = "Pravardhan pada";
		int[] in = new int[256];
//	int len=name.length();

		for (int i = 0; i < name.length(); i++) {
			in[(int) name.charAt(i)]++;

		}
		for (int i = 0; i < 256; i++) {
			if (in[i] != 0 && in[i] != ' ') {
				System.out.println((char) i + "-->" + in[i]);
			}
		}
		String n = "Hruday pra";
		char[] c = n.toCharArray();
		int count = 0;
		for (int i = 0; i < n.length(); i++) {
			c[i] = n.charAt(i);
			count++;

		}
		System.out.print(n + "======>>>>" + count);
		System.out.println();
		
		int len=str.length();
		while (len>0) {
			System.out.print(str.charAt(len-1));
			len--;
		}
	}
}
