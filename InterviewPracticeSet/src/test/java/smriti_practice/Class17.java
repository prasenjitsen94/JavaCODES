package smriti_practice;
import java.util.Scanner;
public class Class17 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int number= sc.nextInt();
		
		//int number=145;
		 
		int result=special(number);
		
		if(result==number)
		{
			System.out.println("special number");
		}
		else
		{
			System.out.println("not a special number");
		}
		
	}
	
	public static int special(int n)
	{
		int sum=0;
		//int temp=n;
		int ld;
		
		while(n!=0)
		{
			ld=n%10;
			int fact=1;
			
			while(ld!=0)
			{
				fact=fact*ld;
				ld--;
			}
			sum=sum+fact;
			n=n/10;
		}
		
		return sum;
		
		
	}

}
