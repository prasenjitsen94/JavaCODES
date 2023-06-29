package smriti_practice;

public class MultipleCatch {

	public static void main(String[] args) {
		int arr[]= {2,3,4,5};
		
		try {
			System.out.println(arr[3]);
			int p=9/0;
			System.out.println(p);
		}
		catch(ArrayIndexOutOfBoundsException a)
		{
			System.out.println("There is an exception");
			//a.printStackTrace();
		}
		catch(Exception b)
		{
			System.out.println("There is another exception");
			b.printStackTrace();
		}
		
		finally
		{
			System.out.println("I am the finally block");
		}

	}

}
