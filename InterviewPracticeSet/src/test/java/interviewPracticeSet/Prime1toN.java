package interviewPracticeSet;

import java.util.Scanner;

public class Prime1toN 
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the last number : ");
		int N = sc.nextInt();
		System.out.println("Prime numbers between 1 to "+N+" are : ");
		for(int num =2;num<=N;num++)
		{
			boolean prime =true;
			for(int i =2;i<num;i++)
			{
				if(num%i==0)
				{
					prime= false;
					break;
				}
			}
			if(prime)
				System.out.print(num+" ");
		}

	}

}
