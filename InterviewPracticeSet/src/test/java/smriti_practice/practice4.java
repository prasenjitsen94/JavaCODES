package smriti_practice;

public class practice4 {

	public static void main(String[] args) {
      
		for(int i=1; i<=3; i++)
		{
			for(int j=3; j>=i; j--)
			{
				System.out.print(" ");
			}
			System.out.print("*");
			for(int k=1; k<=i; k++)
			{
				if(i==1)
					continue;
				else
					System.out.print("#");
			}
			if(i>1)
				System.out.print("*");
			
		System.out.println();
		}
	}

}
