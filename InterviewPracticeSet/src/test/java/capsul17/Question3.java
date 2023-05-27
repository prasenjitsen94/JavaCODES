package capsul17;
import java.util.Scanner;
public class Question3 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the count of the elememt you want to store in array: ");
		int count= sc.nextInt();
		
		int a[]= new int[count];
		
		for(int index=0; index<a.length; index++)
		{
			int fact=1;
			for(int i=1; i<=(index+1); i++)
			{
				fact=fact*i;
			}
			a[index]=fact;
		}
		
		int num=0;
		while(num<a.length)
		{
			System.out.println(a[num]);
			num++;
		}
		
	}

}
