package interviewPracticeSet;

public class SwapWithout3 {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		System.out.println("Before Swapping \n a = "+a+" and b = "+b);
		
		a=a+b;//10+20=30
		b=a-b;//30-20=10;
		a=a-b;//30-10=20
		System.out.println("After Swapping \n a = "+a+" and b = "+b);
	}

}
