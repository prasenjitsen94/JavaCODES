package javaPractice.capsule5;

import java.util.Scanner;

//WAP to print the largest among 3 numbers using if-else
public class Ques4 
{
	Scanner sc = new Scanner(System.in);
	public static void main(String args[])
	{
		Ques4 obj = new Ques4();
		System.out.println("The Largest number is : "+obj.findLargest());
		obj.sc.close();
	}

	public double returnNum()
	{
		
		System.out.print("Enter a num  : ");
		double num = sc.nextDouble();
		System.out.println("You have entered the number as : "+num);
		return num;
	}

	public double findLargest()
	{
		double max=0;
		try
		{
			double a = returnNum();
			double b = returnNum();
			double c = returnNum();

			if(a>b)
			{
				if(a>c)
					max=a;
				else
					max=c;

			}
			else
			{
				if(b>c)
					max=b;
				else
					max =c;

			}
			return max;
		}
		catch(Throwable e)
		{
			e.printStackTrace();
			return max;
		}
	}

}
