package com.acadgild.challenge4;

public class MatrixMultiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int a[][]= new int [1][2];
		int b[][]=new int [2][5];
		
		for (int i=0;i<a.length;i++)
			for(int j=0;j<a[i].length;j++)
				a[i][j]=i+1*j+1;
		
		System.out.println("Matrix A");
		for (int i=0;i<a.length;i++)
			for(int j=0;j<a[i].length;j++)
				System.out.print(a[i][j]+"   ");
		System.out.println();
		
		for (int i=0;i<b.length;i++)
			for(int j=0;j<b[i].length;j++)
				b[i][j]=i+1*j+1;
		
		System.out.println("Matrix B");
		for (int i=0;i<b.length;i++)
		{
			for(int j=0;j<b[i].length;j++)
	
				System.out.print(b[i][j]+"   ");
		
		System.out.println();
		}
		
		if(a[0].length==b.length)
		{
			int c[][]=new int [1][5];
			for(int i=0;i<a.length;i++)
				for(int j=0;j<b[i].length;j++)
					for(int k=0;k<b.length;k++)
						c[i][j]=c[i][j]+a[i][k]*b[k][j];
		
			System.out.println("Product Matrix ");
			for (int i=0;i<c.length;i++)
			{
				for(int j=0;j<c[i].length;j++)
	
					System.out.print(c[i][j]+"   ");
		
			System.out.println();
			}
		}
		else
			System.out.println("Multiplication not possible due to invalid order of matrix");
	
	}

}
