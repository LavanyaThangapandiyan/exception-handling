import java.util.InputMismatchException;
import java.util.Scanner;

class CapacityException extends InputMismatchException
{
       public CapacityException(String s)
    {
        super(s);
    }
}

interface Motor
{
	int getCapacity() throws CapacityException;
	public void run();
	public void consume();
}
 class WashingMachine implements Motor
 {
 private int capacity;
 public WashingMachine(int capacity)
 {
	 this.capacity = capacity;
	 
 }
 public int getCapacity()throws CapacityException
 {
		if(capacity==(int)capacity) 
		{
		return capacity;
		}
		throw new CapacityException("invalid datatype");
		
 }
	public void run()

	{
	 System.out.println("Washing machine is running.");	
	}
	public void consume()
	{
	System.out.println("consuming");
	}
	
 }
  class MotorProgram
 {
	 
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter capacity:");
		int capacity=sc.nextInt();
		WashingMachine obj= new WashingMachine(capacity);
		try
		{
			System.out.println("Capacity:" +obj.getCapacity());
		}
		catch(CapacityException e)
		{
			System.out.println(e);
		}
		
		obj.run();
		obj.consume();	
	
	}
 }
