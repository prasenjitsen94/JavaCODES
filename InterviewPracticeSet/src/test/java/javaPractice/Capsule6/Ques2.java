package javaPractice.Capsule6;

import java.util.Scanner;

//WAP to find the minimum value among 3 values using nested if-else
public class Ques2 
{
	Scanner sc = new Scanner(System.in);
	
	public static void main(String args[])
	{
		Ques2 obj = new Ques2();
		System.out.println("The smallest number is : "+obj.returnMin());
	}
	
	public double enterNum()
	{
		System.out.print("Enter a number : ");
		double num = sc.nextDouble();
		System.out.println("You have entered : "+num);
		return num;
	}
	
	public double returnMin()
	{
		double min=0;
		double a = enterNum();
		double b = enterNum();
		double c = enterNum();
		
		if(a<b)
		{
			if(a<c)
				min =a;
			else
				min =c;
			
		}
		else
		{
			
			if(b<c)
				min=b;
			else
				min=c;
			
		}
		
		return min;
	}
}
