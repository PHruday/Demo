package com.Integerprograms;

public class CountNoofIntegers {

	public static void main(String[] args) {

		{
	        int a[] = {1,2,3,4,5};
	        int count = 0, i = 0;
	        try
	        {
	            while(a[i] != ' ')
	            {
	                count++;
	                i++;
	            }
	        }
	        catch(Exception e)
	        {
	            System.out.println("Number of elements in array:"+count);
	        }
			
		}
	}

}
