package interviewPracticeSet;

import java.util.Scanner;

/*
 * WAP to print whether a number is palindrome using string concept.
 * Take the number as Input from user in an INTEGER variable
 */
public class Palindrome_Integer 
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num = sc.nextInt();
		
		String str = String.valueOf(num);
		String rev="";
		for(int i=0;i<str.length();i++)
		{
			rev= str.charAt(i)+rev;
		}
		if(str.equals(rev))
			System.out.println(num+ " : Palindrome Number");
		else
			System.out.println(num+ " : not a Palindrome Number");
	}

}
