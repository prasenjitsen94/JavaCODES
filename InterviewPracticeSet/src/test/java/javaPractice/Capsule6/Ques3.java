package javaPractice.Capsule6;

import java.util.Scanner;
//WAP to create a basic calculator using switch statement
public class Ques3 
{
	Scanner sc = new Scanner(System.in);

	public static void main(String args[])
	{
		Ques3 obj = new Ques3();
		obj.cal();
		obj.sc.close();
	}

	
	public void cal()
	{
		int a = enternum();
		int b = enternum();
		switch(enterChoice())
		{
		case "add" : add(a,b);
		break;
		
		case "sub" : sub(a,b);
		break;
		
		case "mul" : mul(a,b);
		break;
		
		case "div" : div(a,b);
		break;

		default:
			System.out.println("Wrong choice entered");
		}	
	}
	public int enternum()
	{
		System.out.print("Enter a number : ");
		int num = sc.nextInt();
		System.out.println("You have entered : "+num);
		return num;
	}
	public String enterChoice()
	{

		System.out.println("Enter add, sub, mul, div");
		System.out.print("Enter your choice : ");
		sc.nextLine();
		String choice =sc.nextLine();

		if (choice.equals("add")||choice.equals("sub")||choice.equals("mul")||choice.equals("div"))
			return choice;
		else
			return  "Wrong choice";
	}
	public void add(int num1, int num2)
	{
		System.out.println("Addition of "+num1+" and "+num2+ " is : "+(num1+num2));
	}

	public void sub(int num1, int num2)
	{
		System.out.println("Subtracting  "+num1+" from "+num2+ " gives : "+(num1-num2));
	}

	public void mul(int num1, int num2)
	{
		System.out.println("Multiplication of "+num1+" and "+num2+ " is : "+(num1*num2));
	}

	public void div(int num1, int num2)
	{
		System.out.println("Division of "+num1+" and "+num2+ " Quotient is : "+(num1/num2)+" Reaminder is : "+(num1%num2));
	}
}
