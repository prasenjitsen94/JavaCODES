package interviewPracticeSet;
import java.util.Scanner;
/*
 * WAP to print Hi, my name is ________ and my age is ____ .
 */
public class NameAge 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your name : ");
		String name = sc.nextLine();
		System.out.print("Enter age name : ");
		int age = sc.nextInt();
		
		System.out.println("Hi, my name is "+name+" and my age is "+age+".");
		
		
	}
}
