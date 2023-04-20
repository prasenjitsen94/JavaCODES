package javaPractice.capsule8;

import java.util.Scanner;

//WAP to print all the even numbers between 30 to 50 using do while loop
public class Ques4 
{
	Scanner sc = new Scanner(System.in);
	public static void main(String args[])
	{
		Ques4 obj = new Ques4();
		obj.printEvens();
		obj.sc.close();
	}
	
	public void printEvens()
	{
		int start = getStartingNumber();
		int end = getEndNumber();
		System.out.print("Even numbers between "+start+" to "+end+" : ");
		do
		{
			if(evenCheck(start))
				System.out.print(start+"\t");
			start++;
		}while(start<=end);
	}
	
	public boolean evenCheck(int num)
	{
		if(num%2==0)
			return true;
		else
			return false;
	}
	public int getNumber()
	{
		return sc.nextInt();
	}
	
	public int getStartingNumber()
	{
		int s = 0;
		try
		{
			System.out.print("Enter starting number : ");
			s = getNumber();
			return s;
		}
		catch(Throwable e)
		{
			e.printStackTrace();
			return s;
		}
	}
	public int getEndNumber()
	{
		int s = 0;
		try
		{
			System.out.print("Enter last number : ");
			s = getNumber();
			return s;
		}
		catch(Throwable e)
		{
			e.printStackTrace();
			return s;
		}
	}

}
