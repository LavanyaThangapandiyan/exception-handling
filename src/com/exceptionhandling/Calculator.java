import java.util.Scanner;

class InvalidOperatorException extends Exception
{
	private static final long serialVersionUID = 1L;
    public InvalidOperatorException(String s)
    {
       super(s);
    }
}
class Operator 
{
	char operator;
    Double number1, number2, result;
	Double operator(String operator,Double number1,Double number2) throws InvalidOperatorException
	{

	     
	      if(operator.equals("+")||operator.equals("-")||operator.equals("/")||operator.equals("*")) 
	      {
	        if(operator.equals("+")) 
	        {
	        	result = number1 + number2;
	        	return (result);
	        }
	        else if(operator.equals("-")) 
	        {
	        	result = number1 - number2;
	        	return (result);
	        }
	        else if(operator.equals("*")) 
	        {
	        	result = number1 * number2;
	        	return (result);
	        }
	        
	        else  
	        {
	        	result = number1 / number2;
	        	return (result);
	        }
	      }
	      else 
	      {
	    	  throw new InvalidOperatorException("invalid operator");
	      }
	}
}
public class Calculator 
{
  public static void main(String[] args) throws InvalidOperatorException
  {

    String operator;
    Double number1, number2, result;
    
    Scanner sc = new Scanner(System.in);
       
    System.out.println("Choose an operator: +, -, *, /");
    operator = sc.nextLine();
    System.out.println("Enter two number");
    number1 = sc.nextDouble();
    number2 = sc.nextDouble();
      
    Operator obj=new Operator();
    result =obj.operator(operator,number1,number2);
    try 
    {
    System.out.println(number1 + operator + number2 + " = " +result );
    }
    catch(Exception e)
    {
    	System.out.println(e);
    }
    finally 
    {
    	System.out.println("Thanks for using this Application");
    }
  }
}
