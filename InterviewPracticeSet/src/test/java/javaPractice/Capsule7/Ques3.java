package javaPractice.Capsule7;

import java.util.Scanner;

//WAP to check if a year is a leap year or not
public class Ques3 
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{
		int year = getYear();
		checkLeapYear( year);

	}
	
	public static int getYear()
	{
		int year =0;
		try
		{
			System.out.print("Enter the year : ");
			year =  sc.nextInt();
			return year;
		}
		catch(Throwable e)
		{
			System.out.println(e.getMessage());
			return year;
		}
	}
	
	public static void checkLeapYear(int year)
	{
		
		if(year%100==0)
		{
			if(year%400==0)
				System.out.println(year +" : Leap Year");
			else
				System.out.println(year +" : Not a Leap Year");
		}
		else
		{
			if(year%4==0)
				System.out.println(year +" : Leap Year");
			else
				System.out.println(year +" : Not a Leap Year");
		}
	}

}
