package smriti_practice.methodoverloading;

public class MethodOverloadingClass 
{

	public static void main(String[] args)
	{
		
		m1(1,2);
	}
	
	public static int m1(int a, double b)
	{
		return 0;
		
	}
	
	public static double m1(int a, int b)
	{
		return 2.3;
		
	}

}
// method name same
//class same
// methods are identified based on
// parameterized or non -paraterized
// no of parameters passed
// type differnce of parameters