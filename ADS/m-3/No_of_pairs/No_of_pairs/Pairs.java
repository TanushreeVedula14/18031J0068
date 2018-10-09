package com.m_3.pairs;

import java.util.Arrays;
import java.util.Scanner;

public class Pairs 
{
	int count;
	int size;
	Scanner sc = new Scanner(System.in);
	public void pair()
	{
		System.out.println("Enter array size:");
		size = sc.nextInt() ;
		
		int[] A = new int[size];
		for(int i=0;i<size;i++)
		{
			System.out.println("Enter "+i+" element:");
			A[i] = sc.nextInt();
		}
		
		Arrays.sort(A);
		System.out.println("Sorted order is: ");
		
		for(int j=0;j<A.length;j++)
		{
		
			System.out.print(" "+A[j]);
			
		}
		for(int i=0;i<(A.length-1);i++)
		{
		
			if(A[i] == A[i+1])
			{
				count++;			
			}
		
		}
		
		System.out.println("\nNo of equal pairs: "+count);
	}
}


