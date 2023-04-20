package javaPractice.capsule8;
import java.util.Scanner;
// WAP to take user's age and name as i/p and print them in 2 different lines using a single System.out.print() statement
//with name within double quotes 
// Example : I am "Prasenjit Sen"
// I am 29 years old
public class Ques1
{
	Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) 
	{
		Ques1 obj = new Ques1();
		obj.print();
		obj.sc.close();

	}
	
	public String getName()
	{
		String name = "";
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
		int age =0;
		try
		{
			System.out.print("Enter your age : ");
			age =  sc.nextInt();
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
		System.out.println("I am \""+getName()+"\"\nI am "+getAge()+" years old.");
	}
	

}
