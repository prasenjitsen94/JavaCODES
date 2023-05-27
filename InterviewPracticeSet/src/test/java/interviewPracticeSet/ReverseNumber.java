package interviewPracticeSet;

import java.util.Scanner;

public class ReverseNumber 
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num = sc.nextInt();
		int temp=num;
		int rev=0;
		while(temp!=0)
		{
			int ld = temp%10;
			rev = (rev*10)+ld;
			temp/=10;
		}
		System.out.println("The reverse of "+num+" is "+rev);
		if(rev==num)
			System.out.println(num+" : is Palindrome");
		else
			System.out.println(num+" : is not Palindrome");

	}

}
