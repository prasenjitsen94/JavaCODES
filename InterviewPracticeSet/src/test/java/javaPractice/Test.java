package javaPractice;
//WAP to store first 5 factorials in an array and display them using while loop
public class Test {

	public static void main(String[] args) 
	{
		int totalNo=5;// you can take this as input from user using Scanner class

		//declaring an int type array of length 5
		int factorials[] = new int[totalNo];

		for(int num = 1; num<=totalNo;num++)//this loop will provide the numbers one by one as 1, 2, 3, 4, 5
		{
			//factorial logic starts here
			int fact=1;
			for(int j =1;j<=num;j++)
			{
				fact=fact*j;
			}
			//factorial logic ends here

			//initializing array elements using array index starting from zero
			factorials[num-1]=fact;// as index starts from 0 so num-1, as num will count from 1-5 but index 0-4
		}
		//To fetch the array element using index
		int n=1;
		while(n<=totalNo)
		{
			System.out.println("Factorial of "+n+" is : "+ factorials[n-1]);
			n++;
		}
	}

}
