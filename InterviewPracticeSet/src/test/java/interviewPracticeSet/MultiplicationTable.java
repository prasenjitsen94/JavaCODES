package interviewPracticeSet;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num = sc.nextInt();
		
		System.out.print("Enter starting number : ");
		int start =sc.nextInt();
		
		System.out.print("Enter last number : ");
		int end =sc.nextInt();
		
		for(int i=start;i<=end;i++)
		{
			System.out.println(num+" X "+i+" = "+(num*i));
		}

	}

}
