package interviewPracticeSet;

public class NumReverse {

	public static void main(String[] args) {
		int num=2468;
		int temp=num;
		int rev =0;
		while(temp!=0)
		{
			int ld = temp%10;
			rev=(rev*10)+ld;
			temp/=10;
		}
		System.out.println("Reverse of "+num+" is : "+rev);

	}

}
