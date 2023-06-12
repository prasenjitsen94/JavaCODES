package smriti_practice;
import java.util.Scanner;
public class Class10 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter a year: ");
		int year= sc.nextInt();
		
		if( ( (year%100==0)&&(year%400==0))|| ((year%100!=0)&&(year%4==0) ) )
		{
			System.out.println("Leap Year");
		}
		else
		{
			System.out.println("Not a leap year");
		}
	}

}
