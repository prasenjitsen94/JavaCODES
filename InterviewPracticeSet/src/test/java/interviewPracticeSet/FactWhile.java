package interviewPracticeSet;
//WAP to find the factorial of a number using while
import java.util.Scanner;

public class FactWhile {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num = sc.nextInt();
		int i=1;
		
		int fact=1;
		while(i<=num)
		{
			fact=fact*i;
			i++;
		}
		System.out.println("Factorial of "+num+" is : "+fact);
	}

}
