package smriti_practice;

public class NestedTry {

	public static void main(String[] args) {
		int a[]= {1,3,4};
		
		try {
			System.out.println(a[4]);
			
			try {
				int x= 12/0;
				System.out.println(x);
			}
			catch(ArithmeticException c)
			{
				System.out.println("Divding by 0");
			}
		}
			
			catch(Exception b)
			{
				System.out.println("array has exception");
				b.printStackTrace();
			}
			

	}

}
