package smriti_practice;

public class ExceptionHandling {

	public static void main(String[] args) {
		int num=9;
		int deno=0;
		try {
			int c=num/deno;
			System.out.println(c);
		}
		catch(ArithmeticException e)
		{
			System.out.println("you are dividing by 0.Kindly use another no.");
		}
		
		try {
			Thread.sleep(5000);
		}
		catch(Exception c)
		{
			System.out.println("Did not wait for 5 sec");
		}
		
		System.out.println("I am the last statement in main method");

	}

}
