package interviewPracticeSet;

import java.util.Scanner;

/*
 * WAP to print all numbers divisible by 3 between 1 to N
 */
public class Divisible3 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the first number : ");
		int first = sc.nextInt();
		
		System.out.print("Enter the last number : ");
		int last = sc.nextInt();
		
		System.out.print("Enter which number divisibility needs to be checked : ");
		int num = sc.nextInt();
		System.out.println("Numbers divisible by "+num+" are : ");
		while(first<=last)
		{
			if(first%num==0)
				System.out.print(first +"\t");
			first++;
		}
		

	}

}
