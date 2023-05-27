package interviewPracticeSet;

import java.util.Scanner;

public class SpecialNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num = sc.nextInt();
		int temp=num;
		int sum=0;
		while(temp!=0)
		{
			int ld = temp%10;
			
			int fact=1;
			for(int i =1;i<=ld;i++)
			{
				fact=fact*i;
			}
			sum=sum+fact;
			temp=temp/10;
		}
		if(num==sum)
			System.out.println(num+" : Special Number");
		else
			System.out.println(num+" : not a Special Number");

	}

}
