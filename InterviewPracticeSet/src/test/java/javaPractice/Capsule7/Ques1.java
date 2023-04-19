package javaPractice.Capsule7;

import java.util.Scanner;

//WAP to take name and age as user input and display the person name and age.
public class Ques1 
{
	Scanner sc = new Scanner(System.in);
	
	public static void main(String args[])
	{
		Ques1 obj = new Ques1();
		obj.print();
		obj.sc.close();
	}
	
	public String getName()
	{
		String name ="";
		try
		{
			System.out.print("Enter your name : ");
			name = sc.nextLine();
			return name;
		}
		catch(Throwable e)
		{
			e.printStackTrace();
			return name;
		}
	}
	
	public int getAge()
	{
		int age=0;
		try
		{
			System.out.print("Enter your age : ");
			age = sc.nextInt();
			return age;
		}
		catch(Throwable e)
		{
			e.printStackTrace();
			return age;
		}
	}
	
	public void print()
	{
		System.out.println("Your name is : "+getName()+" and your's age is :"+getAge());
	}
}
