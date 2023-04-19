package javaPractice.capsule4;

import java.util.Scanner;

//WAP to divide 2 numbers and print its quotient and reaminder
public class Ques5 
{
	Scanner sc = new Scanner(System.in);
	
	public static void main(String args[])
	{
		Ques5 obj = new Ques5();
		obj.printRemainderQuotient();
		obj.sc.close();
		
	}
	public void printRemainderQuotient()
	{
		int div = getDividend();
		int divisor = getDivisor();
		System.out.println("Dividing "+div+" by "+divisor+" gives quotient : "+(div/divisor)+", remainder : "+(div%divisor));
	}
	
	public int getDividend()
	{
		int dividend = 0;
		try
		{
			System.out.print("Enter the dividend : ");
			dividend = sc.nextInt();
			System.out.println("You have entered the dividend as : "+dividend);
			return dividend;
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			return dividend;
		}
	}
	public int getDivisor()
	{
		int divisor = 0;
		try
		{
			System.out.print("Enter the divisor : ");
			divisor = sc.nextInt();
			System.out.println("You have entered the divisor as : "+divisor);
			return divisor;
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			return divisor;
		}
	}

}
