package com.exceptionhandling;
import java.util.Scanner;
public class Division
{ 
		   
		   public String divideTwoNumbers(int number1,intnumber2)
		   {
			   int value=0;
			   String str="";
			      
		    try
		    {
		    value=number1/number2;
	            str = ("The answer is"+value);
		    }
		    catch (ArithmeticException e)
		    {
		    str = "Division by Zero is not possible";
		    }
		    finally
			{
				return(srt+"Thanks for using the application.");
			}
		  }
		public static void main(String[]args)
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the numbers");
			int num1= sc.nextInt();
			int num2=sc.nextInt();
			Division div=new Division();
			System.out.print(div.divideTwoNumbers(num1,num2));
		}
}
			





	
