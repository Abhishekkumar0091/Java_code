
public class Test4 
{
	public static int get()
	{
	  try
	   {
		   System.out.println("Try block executed!");
	       return 10;
	   }
	   catch(NullPointerException ex)
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

