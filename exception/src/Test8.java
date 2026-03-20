
public class Test8 
{
	String str;
	public  void get()
	{
		int [] arr = {10, 20};
	  try
	   {
		   System.out.println("Try block executed!");
		   System.out.println(10 / 0);
	   }
	   catch(NullPointerException ex)
	   {
		   System.out.println("Catch block executed!");
		   System.out.println("Somthing went wrong:" + ex); 
		   System.out.println(arr[3]);
	   }
	   finally
	   {
		   System.out.println("Finally block executed!");
		   System.out.println(str.toString());
	   }
	}
	public static void main(String[] args) 
	{
	 new Test8().get();
	 System.out.println("Main executed!");
	}
}

