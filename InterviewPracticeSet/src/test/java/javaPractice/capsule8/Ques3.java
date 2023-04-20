package javaPractice.capsule8;

import java.util.Scanner;

//WAP to check if the reverse of a number is same as the number itself
public class Ques3 
{
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) 
	{
		Ques3 obj = new Ques3();
		obj.Checkreverse();
		obj.sc.close();
	}

	public void Checkreverse()
	{
		int temp = getNum();
		int n =temp;

		int rev =0;
		while(n!=0)
		{
			int ld = getLastdigit(n);
			rev = (rev*10)+ld;
			n = reduceOneDigit(n);
		}

		if(compare(temp,rev))
			System.out.println(temp + " : Palindrome Number");
		else
			System.out.println(temp + " : Not a Palindrome Number");

	}
	public int getNum()
	{
		int num = 0;
		try
		{
			System.out.print("Enter the number : ");
			num = sc.nextInt();
			return num;
		}
		catch(Throwable e)
		{
			e.printStackTrace();
			return num;
		}
	}

	
	public int getLastdigit(int num)
	{
		return num%10;
	}

	public int reduceOneDigit(int num)
	{
		return num/10;
	}
	
	public boolean compare(int num1, int num2)
	{
		if(num1==num2)
			return true;
		else
			return false;

	}


}
