package interviewPracticeSet;

public class FactInArray
{

	public static void main(String[] args) 
	{
		int arr[] = new int[5];
		for(int num =1;num<=5;num++)
		{
			int fact=1;
			for(int i =1;i<=num;i++)
			{
				fact=fact*i;
			}
			arr[num-1]=fact;
		}
		
		int j=0;
		while(j<5)
		{
			System.out.print(arr[j]+ " ");
			j++;
		}
	}

}
