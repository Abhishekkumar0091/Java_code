
public class Test 
{
	public static void main(String[] args) 
	{
	   try
	   {
		   System.out.println("Try block executed!");
	       System.out.println(10 / 0);
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

}
