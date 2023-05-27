package capsul17;

public class Question1 {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6,7,8,9,10};
		
		int search=5;
		boolean check=false;
		
		for(int i=0; i<a.length; i++)
		{
			if(search==a[i])
			{
				check=true;
				break;
			}
		}
		
		if(check==false)
		{
			System.out.println("No is not  present");
		}
		else
		{
			System.out.println("No is  present");
		}
	}

}
