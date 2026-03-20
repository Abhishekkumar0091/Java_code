
public class Test6 
{
	public static void get()
	{
	  try
	   {
		   System.out.println("Try block executed!");
//		   System.exit(0);
	   }
	   catch(ArithmeticException ex)
	   {
		   System.out.println("Catch block executed!");
		   System.out.println("Somthing went wrong:" + ex);  
	   }
	   finally
	   {
		   System.out.println("Finally block executed!");	  
	   }
	}
	public static void main(String[] args) 
	{
	 get();
	 System.out.println("Main executed!");
	}
}

