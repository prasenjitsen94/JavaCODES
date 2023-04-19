package javaPractice.capsule5;

import java.util.Scanner;
//WAP using ternary operator to display a number is even or odd
public class Ques3 
{
	Scanner sc = new Scanner(System.in);
	
	public static void main(String args[])
	{
		Ques3 obj = new Ques3();
		obj.checkEvenOdd();
		obj.sc.close();
		
	}
	
	public int enterNum()
	{
		int num=0;
		try
		{
			System.out.print("Enter a number : ");
			num = sc.nextInt();
			System.out.println("You have entered number as : "+num);
			return num;
		}
		catch(Throwable e)
		{
			System.out.println(e.getMessage());
			return num;
		}
	}
	
	public void checkEvenOdd()
	{
		
		try
		{
			int num=enterNum();
			String res =(num%2==0?num+": Even":num+" : Odd");
			System.out.println(res);
		}
		catch(Throwable e)
		{
			e.printStackTrace();
			
		}
	}
}
