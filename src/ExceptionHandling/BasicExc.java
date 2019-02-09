package ExceptionHandling;

public class BasicExc 
{

	public static void main(String[] args)
	{
		System.out.println("main method started");
		
		try
		{
			int i=1/0;
		}
		catch(ArithmeticException a)
		{
			System.out.println("handled");
		}
		System.out.println("main method ende");
		
	}
}
