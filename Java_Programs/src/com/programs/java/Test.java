package com.programs.java;

public class Test {

	public static void main(String[] args) {
		
			String str="Hruday Pravardhan Pada";
			String word="";
				 
			char[] ch=str.toCharArray(); 
			for(int i=0;i<(ch.length);i++)
			{
				if(ch[i]!=' ')
				{
				word=word+ch[i];				
				}
				else
				{
				  for(int c=word.length();c>0;c--)
				  {
				   System.out.print(word.charAt(c-1)); 	   
				  }
				  System.out.print(" "); 	
				  word="";
				  System.out.println(word+"====25");
				} 	   
			}
			for(int c=word.length();c>0;c--)
			{
				   System.out.print(word.charAt(c-1)); 	   
			}
		}
}
