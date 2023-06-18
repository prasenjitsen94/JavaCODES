package smriti_practice;
import java.util.Scanner;
public class Class17 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int number= sc.nextInt();
		
		//int number=145;
		 
		int addition=special(number);
		
		boolean res=check(number,addition);
		
		
		
		if(res==true)
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
	
	public static boolean check(int n, int sum)
	{
		boolean result;
		if(n==sum)
		{
			result=true;
		}
		else
		{
			result= false;
		}
		
		return result;
	}

}
