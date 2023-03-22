package com.exceptionhandling;

import java.util.Scanner;
import java.util.InputMismatchException;

public class InputMismatch
{
	public static void main(String[]args)
	  {
		InputMismatch obj=new InputMismatch();
	    obj.sum();
	  }
	public void sum()
	{
		int a,b,cal;
		Scanner sc=new Scanner(System.in);
		try 
		{
		System.out.println("Enter two number");
		a=sc.nextInt();
		b=sc.nextInt();
		int cal1 =a+b;
		System.out.println("The Sum of two numbers a and b is"+cal1);
	    }
		catch(InputMismatchException im)
		{
			System.out.println("Enter the valid input");
			sum();
			
		}
	
}
}
