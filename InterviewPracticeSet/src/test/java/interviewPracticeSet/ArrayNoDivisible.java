package interviewPracticeSet;

import java.util.Scanner;

public class ArrayNoDivisible {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter total nos to be entered : ");
		int count = sc.nextInt();
		int arr[] = new int[count];
		
		for(int i =0;i<arr.length;i++)
		{
			System.out.print("Enter number "+(i+1)+" : ");
			arr[i] = sc.nextInt();
			
		}
		System.out.print("Enter the number to check its divisibility : ");
		int dsor =sc.nextInt();
		
		int counter =0;
		for(int z : arr)
		{
			if(z%dsor==0)
			{
				System.out.print(z +" ");
			}
			else
			{
				counter++;
			}
		}
		if(arr.length==counter)
		{
			System.out.println("No number is divisible by "+dsor);
		}
		else
		{
			System.out.print(" : divisible by "+dsor);
		}

	}

}
