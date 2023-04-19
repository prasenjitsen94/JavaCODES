package javaPractice.Capsule7;

import java.util.Scanner;

//WAP to take double, int sentence, word, char from user and print each of them
public class Ques2 
{
	Scanner sc = new Scanner(System.in);
	public static void main(String args[])
	{
		Ques2 obj = new Ques2();
		System.out.println("Double type data entered is : "+obj.enterDouble());
		System.out.println("Int type data entered is : "+obj.enterInt());
		System.out.println("Sentence type data entered is : "+obj.enterSentence());
		System.out.println("Word type data entered is : "+obj.enterWord());
		System.out.println("Char type data entered is : "+obj.enterChar());
	}

	public double enterDouble()
	{
		System.out.print("Enter a double_type data : ");
		double data = sc.nextDouble();
		return data;

	}
	public int enterInt()
	{
		int data =0;
		try
		{
			System.out.print("Enter a int_type data : ");
			data = sc.nextInt();
			return data;
		}
		catch(Throwable e)
		{
			e.printStackTrace();
			return data;
		}
	}
	public String enterSentence()
	{
		System.out.print("Enter a String_type data : ");
		sc.nextLine();
		String data = sc.nextLine();
		return data;

	}
	public String enterWord()
	{
		System.out.print("Enter a word : ");

		String data = sc.next();
		return data;

	}
	public char enterChar()
	{
		System.out.print("Enter a Char_type data : ");
		sc.nextLine();
		char data = sc.next().charAt(0);
		return data;
	}

}
