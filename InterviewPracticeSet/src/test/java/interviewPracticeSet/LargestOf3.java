package interviewPracticeSet;

import java.util.Scanner;

public class LargestOf3 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number 1 : ");
		int a = sc.nextInt();
		
		System.out.print("Enter number 2 : ");
		int b = sc.nextInt();
		
		System.out.print("Enter number 3 : ");
		int c = sc.nextInt();
		
		int max=0;
		
		if(a>b)
		{
			if(a>c)
				max=a;
			else
				max=c;
		}
		else
		{
			if(b>c)
				max=b;
			else
				max=c;
		}
		
		System.out.println("Max among "+a+" "+b+" "+c+" is : "+max);
	}

}
