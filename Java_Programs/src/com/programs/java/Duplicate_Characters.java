package com.programs.java;

public class Duplicate_Characters {

	public static void main(String[] args) {
		String name = "P Hruday pravardhan";
		char[] ch = name.toCharArray();
		int count = 0;

		for (int i = 0; i < ch.length; i++) {
			count = 1;
			for (int j = i + 1; j < ch.length; j++) {
				if (ch[i] == ch[j] && ch[i] != ' ') {
					count++;
					ch[j] = '0';
				}
			}
			if (count > 0 && ch[i] != '0' &&ch[i]!=' ') {
				System.out.print(ch[i]);

			}

		}
	}

}
