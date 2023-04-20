package javaPractice.capsule8;

import java.util.Scanner;
//WAP to print all the number divisible by 3 between 1 to N
public class Ques2
{
	Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{
		Ques2 obj = new Ques2();
		obj.printNum3Div();
		obj.sc.close();

	}
	
	public int getLastNumber()
	{
		int last = 1;
		try
		{
			System.out.print("Enter the last number : ");
			last = sc.nextInt();
			return last;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return last;
		}
	}
	public void printNum3Div()
	{
		int l = getLastNumber();
		for(int i =1;i<=l;i++)
		{
			if(divisible3(i))
				System.out.print(i+"\t");
		}
	}
	public boolean divisible3(int num)
	{
		boolean ch =false;
		try
		{
			if(num%3==0)
				ch=true;
			else
				ch= false;
			return ch;
		}
		catch(Throwable e)
		{
			e.printStackTrace();
			return ch;
		}
	}

}
