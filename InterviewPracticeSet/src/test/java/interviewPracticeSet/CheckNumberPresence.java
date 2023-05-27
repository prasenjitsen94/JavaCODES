package interviewPracticeSet;
//WAP to take a static array of size 10. Check whether a number is present in the array.Display appropriate message
import java.util.Scanner;

public class CheckNumberPresence {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int arr[] = {1,2,3,4,5,6,7,8,9,10};
		boolean found = false;
		System.out.print("Enter the number to be searched : ");
		int num = sc.nextInt();
		for(int i : arr)
		{
			if(i==num)
			{
				
				System.out.println(num+" is present.");
				found=true;
				break;
			}

		}
		if(!found)
		{
			System.out.println(num+" : is not present");
		}
	}

}
