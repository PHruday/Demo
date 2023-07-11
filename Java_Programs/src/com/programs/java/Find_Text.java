package com.programs.java;

import java.util.regex.*;

public class Find_Text {

	public static int findText(String name, String text) {
		Pattern p = Pattern.compile(name);
		Matcher m = p.matcher(text);

		int noOfStringOcc=0;
		while(m.find()) {
			noOfStringOcc++;
		}
		return noOfStringOcc;
	}

	public static void main(String[] args) {
       String text="Fuzzy Wuzzy was a bear. Fuzzy Wuzzy had no hair. Fuzzy Wuzzy wasn’t fuzzy, was he?";
       String name="Fuzzy";
       System.out.println(findText(name,text));
	}

}
