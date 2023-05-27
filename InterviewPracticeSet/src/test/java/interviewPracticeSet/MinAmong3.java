package interviewPracticeSet;

import java.util.Scanner;

public class MinAmong3
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter number 1 : ");
		int a =sc.nextInt();

		System.out.print("Enter number 2 : ");
		int b =sc.nextInt();

		System.out.print("Enter number 3 : ");
		int c =sc.nextInt();

		int min=0;

		if(a<b)
		{
			if(a<c)
				min=a;
			else
				min=c;
		}
		else
		{
			if(b<c)
				min=b;
			else
				min=c;
		}

		System.out.println("Minimum among "+a+" "+b+" "+c+" : "+min);

	}

}
