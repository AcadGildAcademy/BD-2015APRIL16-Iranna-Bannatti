package com.acadgild.reverseString;

public class ReverseStringRecursively {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="Hello";
		int l=str.length();
		System.out.println("Actual String: "+str);
		System.out.print("Reversed String:" );
		reverseString(str,l-1);
		
		
	}
	public static void reverseString(String str, int n)
	{
		if(n==0)
		{
			System.out.println(str.charAt(n));
			return;
		}
		else
			System.out.print(str.charAt(n));
			reverseString(str,n-1);
		
	}

}
