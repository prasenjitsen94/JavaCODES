package interviewPracticeSet;

import java.util.Scanner;

public class OddEvenTernary 
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num = sc.nextInt();
		String res =(num%2==0?"Even":"Odd");
		System.out.println(num+" is : "+res+" number");

	}

}
