package interviewPracticeSet;

import java.util.Scanner;

/*
 * WAP to print all even number between 30 and 50 using do-while
 */
public class EvenDoWhile 
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter starting number : ");
		int start = sc.nextInt();
		System.out.print("Enter last number : ");
		int last = sc.nextInt();
		System.out.println("Numbers that are Even between "+start+" and "+last+" are : ");
		do
		{
			if(start%2==0)
				System.out.print(start+" ");
			start++;
		}while(start<=last);


	}

}
