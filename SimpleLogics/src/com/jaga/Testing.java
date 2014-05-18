package com.jaga;

public class Testing {
	public static void main(String[] args) {
		int rows=6;
		for(int i=0;i<=rows;i++)
		{
			for(int j=0;j<=rows;j++)
			{
				System.out.print(" ");
			}
			for(int k=0;k<=i;k++)
			{
				System.out.print("+ ");
			}
			System.out.print("\n");
			rows--;
		}
		int rows1 = 6;
		for(int i= rows1;i>0;i--)
		{
			for(int j=rows1-i;j>0;j--)
			{
				System.out.print(" ");
			}
			for(int k=0;k<i;k++)
			{
				System.out.print("= ");
			}
			System.out.print("\n");
			
		}
	}
}
