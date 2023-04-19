package javaPractice.Capsule6;

import java.util.Scanner;

//WAP to find whether the given character is an alphabet
public class Ques1 
{
	Scanner sc = new Scanner(System.in);
	
	public static void main(String[]args)
	{
		Ques1 obj = new Ques1();
		obj.checkIfAlphabet();
		obj.sc.close();
	}
	
	public char enterCharacter()
	{
		System.out.print("Enter a character : ");
		char ch = sc.next().charAt(0);
		return ch;
	}
	
	public void checkIfAlphabet()
	{
		char ch =enterCharacter();
		if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z'))
			System.out.println(ch+" : is a an Alphabet ");
		else
			System.out.println(ch+" : is a not an Alphabet ");
	}
}
