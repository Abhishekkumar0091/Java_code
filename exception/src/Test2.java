
public class Test2 
{
	public static void main(String[] args) 
	{
	   try
	   {
		   System.out.println("Try block executed!");
	       System.out.println("Result = "+(10 / 0));
	   }
	   catch(NullPointerException ex)
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
