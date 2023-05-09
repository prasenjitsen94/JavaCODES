package javaPractice;

public class UnaryOperatorPractice2
{

	public static void main(String[] args) 
	{
		int x = 3;
		int z = ++x + ++x + x++ + ++x + x++;
	        //4+5+5+7+7
		System.out.println(x);//8
		System.out.println(z);//28

	}

}
