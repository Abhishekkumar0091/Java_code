
public class Test5 
{
	public static int get()
	{
	  try
	   {
		   System.out.println("Try block executed!");
		   System.out.println(10 / 0);
	       return 10;
	   }
	   catch(ArithmeticException ex)
	   {
		   System.out.println("Catch block executed!");
		   System.out.println("Somthing went wrong:" + ex);
		   return 5;
	   }
	   finally
	   {
		   System.out.println("Finally block executed!");
		   return 1;
	   }
	}
	public static void main(String[] args) 
	{
	 int res = get();
	 System.out.println(res);
	}

}

