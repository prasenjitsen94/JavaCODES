package smriti_practice;

public class practice4 {

	public static void main(String[] args) {
      
		for(int i=3; i>=1; i--)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print("# ");
			}
			for(int k=3; k>=i; k--)
			{
				System.out.print("*" + " #");	
			}
			
		System.out.println();
		}
	}

}
