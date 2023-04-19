package javaPractice.capsule1;

import java.util.Scanner;

// WAP to print I am student at ReGrow Tech
public class Ques6 
{
	public static void main(String args[])
	{
//		creating object/instance of class Ques6
		Ques6 obj = new Ques6();
//		Calling function print() with object
		obj.print();
	}
	
//	function with return type String to take input from user and return the same
	public String takeStringInputFromUSer()
	{
		Scanner  sc= new Scanner(System.in);
		String str = null;
//	try-catch block for exception handling
		try
		{
			System.out.print("Enter the sentence : ");
			str=sc.nextLine();
			return str;
		}
		catch(Throwable e)
		{
			return str;
		}
	}
//	function with return type void that calls the takeStringInputFromUSer() and prints the input given by user
	public void print()
	{
		System.out.println("You have enterter : \n"+takeStringInputFromUSer());		
	}	
}
