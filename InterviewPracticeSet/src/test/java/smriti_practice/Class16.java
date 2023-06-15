package smriti_practice;

import java.util.Scanner;

public class Class16 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		String number=sc.nextLine();
		
		//int number=145;
		
		int n=Integer.valueOf(number);
		 
		int rev=palindrome(n);
		
		if(rev==n)
		{
			System.out.println("Palindrome number");
		}
		else
		{
			System.out.println("not a palindrome number");
		}
		
	}
	
	public static int palindrome(int n)
	{
		int num=Integer.valueOf(n);
		int rev=0;
		//int temp=n;
		int ld;
		
		while(num!=0)
		{
			ld=num%10;
			rev=rev*10+ld;
			num=num/10;	
		}
		
		return rev;
	}

}
