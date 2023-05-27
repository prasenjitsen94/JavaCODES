package interviewPracticeSet;

import java.util.Scanner;

public class SumMethod 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter num1 : ");
		int a = sc.nextInt();
		System.out.print("Enter num2 : ");
		int b = sc.nextInt();
		System.out.print("Enter num3 : ");
		int c = sc.nextInt();

		System.out.println("Sum of "+a+" "+b+" "+c+" is : "+sum(a,b,c));
	}
	
	public static int sum(int a,int b, int c)
	{
		return a+b+c ;
	}

}
