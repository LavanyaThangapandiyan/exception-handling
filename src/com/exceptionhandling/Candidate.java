

import java.util.Scanner;
class InvalidSalaryException extends Exception
{
    public InvalidSalaryException(String s)
    {
       super(s);
    }
}

class Candidate {

private String name;
private String gender;
private double expectedSalary;
public String getName()
{
return name;
}
public void setName(String name)
{
this.name = name;
}
public String getGender()
{
return gender;
}
public void setGender(String gender)
{
this.gender = gender;
}
public double getExpectedSalary()
{
return expectedSalary;
}
public void setExpectedSalary(double expectedSalary)
{
this.expectedSalary = expectedSalary;
}
public void getCandidateDetails(double sal) throws InvalidSalaryException
   {
       if(sal<10000)
       {
           throw new InvalidSalaryException("Registration Failed. Salary cannot be less than 10000.");
       }
       else
       {
           setExpectedSalary(sal);
       }
   }
}

class CandidateDetails {
public static void main(String args[])
    {
Candidate ob = new Candidate();
System.out.println("Enter the candidate Details");
Scanner sc = new Scanner(System.in);

        System.out.println("Name");
        String name = sc.nextLine();
        ob.setName(name);
           
       
        System.out.println("Gender");
        String gender = sc.nextLine();
        ob.setGender(gender);
       
       
        System.out.println("Expected Salary");
        double sal = sc.nextDouble();
        try
        {
            ob.getCandidateDetails(sal);
            System.out.println("Registration Successful");
        }
        catch(InvalidSalaryException e)
        {
            System.out.println(e);
        }
    }
}
