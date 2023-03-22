package com.exceptionhandling;
import java.util.Scanner;
class ArithmeticException
{ 
		   public static void main(String[]args)
			  {
			   ArithmeticException obj=new ArithmeticException();
			   obj.divide();
			  }
		   public void divide()
		   {
			   
		    Scanner input = new Scanner (System.in);
		    System.out.print("Enter the first number: ");
		    int a = input.nextInt();
		    System.out.print("Enter the second number: ");
		    int b = input.nextInt();
		    try
		    {
		    int result = (a/b);
		    System.out.println("The division of a and b is:" +result);
		    }
		    catch (Exception e)
		    {
		    System.out.println("Please check Second Number ");
		    divide();
		    }
		    finally
			{
				System.out.println("The finally Block");
			}
		  }
		}





	
