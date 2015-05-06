package com.acadgild.challenge1;

public class ArrayReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {10,8,-6,-5,4,3,2,1,11,16,20,56,75,65};
		
		System.out.println("ArrayElements Before Revrse");
		displayArray(a);
		
		System.out.println("Reverse of an Array");
		ReverseArray(a);
		
	}
	
	private static void ReverseArray(int[] a) {
		// TODO Auto-generated method stub
		if(a.length>0)
		{
			for(int i=a.length-1;i>0;i--)
			{
				
				System.out.print(a[i]+",");
			}
			System.out.print(a[0]);
		}
		
	}

	public static void displayArray(int a[])
	{
		if(a.length>0)
		{
			for(int i=0;i<a.length-1;i++)
			{
				System.out.print(a[i]+",");
			}
	System.out.println(a[a.length-1]);
		}
		else
			System.out.println("Empty array");
	}
	

}
