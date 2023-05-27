package interviewPracticeSet;
/*
 *WAP to add all the digits present in a string and display it with adding
 */
public class SeparateAdd 
{

	public static void main(String[] args)
	{
		String str = "India 1s my love 3000";
		String num="";
		
		for(int i = 0;i<str.length();i++)
		{
			if(Character.isDigit(str.charAt(i)))
				num=num+str.charAt(i);
		}
		
		int n=Integer.valueOf(num);
		int sum=0;
		while(n!=0)
		{
			int ld=n%10;
			sum=sum+ld;
			n/=10;
		}
		System.out.println(sum);
		

	}

}
