package interviewPracticeSet;

public class Swap3rdVariable {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		System.out.println("Before Swapping \n a = "+a+" and b = "+b);

		int c=a;
		a=b;
		b=c;
		
		System.out.println("After Swapping \n a = "+a+" and b = "+b);
	}

}
