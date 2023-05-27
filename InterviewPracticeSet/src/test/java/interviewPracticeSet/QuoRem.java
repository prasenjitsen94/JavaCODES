package interviewPracticeSet;

import java.util.Scanner;

/*
 * WAP to divide 2 numbers and print its quotient and remainder
 */
public class QuoRem 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter dividend : ");
		int div = sc.nextInt();
		
		System.out.print("Enter divisor : ");
		int dsor = sc.nextInt();
		
		System.out.println("Dividing "+div+" by "+dsor+" gives Quotient as : "+(div/dsor)+" and Remainder as : "+(div%dsor));
	}

}
