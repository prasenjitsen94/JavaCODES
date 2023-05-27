package capsul17;
import java.util.Scanner;
public class Question2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a size of array : ");
		int N=sc.nextInt();
		
		int a[]= new int [N];
		
		for(int i=0; i<N; i++)
		{
			System.out.println("Enter a number: ");
			a[i]=sc.nextInt();
		}
		
		for(int ele : a)
		{
			if(ele % 6==0)
			{
				System.out.println(ele);
			}
		}
		
		
	}

}
