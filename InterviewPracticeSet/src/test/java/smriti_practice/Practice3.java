package smriti_practice;
import java.util.Scanner;
public class Practice3 {

	public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			
			System.out.println("Enter a number:");
			int num=sc.nextInt();
			
			String number=String.valueOf(num);
			String rev="";
			for(int i=0; i<number.length(); i++)
			{
				char ch=number.charAt(i);
				rev=ch+rev;
			}
			
			if(rev.equals(number))
			{
				System.out.println("Plaindrome");
			}
			else 
			{
				System.out.println("Not a palindrome");
			}
	}

}
