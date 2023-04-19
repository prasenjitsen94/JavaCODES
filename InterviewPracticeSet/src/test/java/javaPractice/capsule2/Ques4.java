package javaPractice.capsule2;

import java.util.Scanner;

//WAP to print Hi, my name is _______ and my age is ___ .

public class Ques4 
{
	Scanner sc = new Scanner(System.in);
	
	public static void main(String args[])
	{
		Ques4 obj = new Ques4();
		obj.print();
		obj.sc.close();
	}
	
	public String enterName()
	{
		String name = null;
		try
		{
			System.out.print("Enter your name : ");
			name = sc.nextLine();
			return name;
		}
		catch(Throwable e)
		{
			System.out.println(e.getMessage());
			return name;	
		}	
	}
	
	public int enterAge()
	{
		int age = 0;
		try
		{
			System.out.print("Enter you age : ");
			age = sc.nextInt();
			return age;
		}
		catch(Throwable e)
		{
			System.out.println(e.getMessage());
			return age;
		}
	}
	
	public void print()
	{
		System.out.println("Hi, my name is "+enterName()+" and my age is "+enterAge()+ ".");
	}

}
