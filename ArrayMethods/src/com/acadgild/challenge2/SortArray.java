package com.acadgild.challenge2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]={10,8,6,1,19,-6,-5,15,25};
		System.out.println("Array Elements Before Sort");
		displayArray(a);
		Arrays.sort(a);
		System.out.println("Array Elements After Sort");
		displayArray(a);
		System.out.println("Add Elements -8 to sorted array");
		insertElement(a,-8);
		Arrays.sort(a);	
		System.out.println("display After adding -8 and sort");
		displayArray(a);

	}

	

	private static void displayArray(int[] a) {
		// TODO Auto-generated method stub
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

	private static void insertElement(int[] a,int x) {
		// TODO Auto-generated method stub
		
		int l=a.length;
		a[l-5]=x;
		
		}

}
