package smriti_practice;
import java.util.Scanner;
public class Class12 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter a sentence: ");
		String line= sc.nextLine();
		String number="";
		
		for(int i=0; i<line.length();i++)
		{
			char ch=line.charAt(i);
			
			if(Character.isDigit(ch))
			{
				number=number+ch;
			}
		}
		
		int n=Integer.valueOf(number);
		int sum=0;
		while(n!=0)
		{
			int ld=n%10;
			sum= sum+ld;
			n=n/10;
		}
		
		System.out.println("The sum is: " + sum);

	}

}
