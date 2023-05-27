package interviewPracticeSet;

import java.util.Scanner;

public class NumberIn2DArray 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number to be searched : ");
		int num = sc.nextInt();
		
		int arr[][]= {{1,2,3},{4,5,6},{7,8,9}};
		boolean found = false;
		for(int i =0;i<arr.length;i++)
		{
			for(int j =0;j<arr[i].length;j++)
			{
				if(num==arr[i][j])
				{
					System.out.print(num+" : is present");
					found = true;
					break;
				}
					
			}
			if(found)
				break;	
		}
		if(!found)
			System.out.println(num+" : is not present.");

	}

}
