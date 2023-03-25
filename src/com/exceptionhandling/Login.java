import java.util.Scanner;

public class Login
{
	private String email;
	private String password;
	String login(String email,String password) throws Exception 
	{
			if((email.equals("validuser@gmail.com"))&& (password.length()<=6)) 
			{
				return ("Verified");
			}
			else
			{
				throw new Exception("invalid email and password");
			}
	}
}
class LoginForm 
{  
    public static void main(String arg[]) throws Exception  
    {  
    	String email,password;
    	String ex;
    	Scanner sc= new Scanner(System.in);
    	System.out.println("Enter the email id");
    	email=sc.nextLine();
    	System.out.println("Enter the Password");
    	password=sc.nextLine();
    	Login obj=new Login();
    	ex=obj.login(email,password);
        try  
        {  
        	System.out.println(ex);
        }  
        catch(Exception e)  
        {     
        	System.out.println(e);
        }  
    }  
}
