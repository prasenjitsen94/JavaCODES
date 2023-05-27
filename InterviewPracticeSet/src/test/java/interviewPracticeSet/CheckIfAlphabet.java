package interviewPracticeSet;

import java.util.Scanner;
/*
 * WAP to find whether a given character is an alphabet
 */
public class CheckIfAlphabet 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a character : ");
		char ch = sc.next().charAt(0);
		if(Character.isAlphabetic(ch))
			System.out.println(ch+":  is an Aphabet");
		else
			System.out.println(ch+":  is not an Aphabet");
	}

}
