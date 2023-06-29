package smriti_practice;

public class ExceptionHandeling1 {

	public static void main(String[] args) {
		int a[]= {1,2,3};
		
		try {
			System.out.println(a[3]);
		}
		catch(Exception e)
		{
			System.out.println("There is an exception");
			e.printStackTrace();
		}
		
		finally
		{
			System.out.println("I am finally block");
		}
		

	}

}
