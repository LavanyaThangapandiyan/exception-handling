package com.exceptionhandling;
import java.util.Scanner;
import java.util.Arrays;
public class ArrayIndexException
{
	public static void main(String[]args)
	{
		int[] age = new int[5];
		try
		{
		age[0] = 10;
		age[1] = 4;
		age[2] = 5;
		age[3] = 6;
		age[4] = 2;
		age[5] = 3;
		}
		catch (ArrayIndexOutOfBoundsException ae)
		{
			System.out.println("Please check the array Length");
		}
		
		System.out.println("Accessing Elements of Array:");
		   System.out.println("First Element: " + age[0]);
		   System.out.println("Second Element: " + age[1]);
		   System.out.println("Third Element: " + age[2]);
		   System.out.println("Fourth Element: " + age[3]);
		   System.out.println("Fifth Element: " + age[4]);
		 }
}

