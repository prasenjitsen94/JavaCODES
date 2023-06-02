package smriti_practice;

public class Method_overloading {

	public static void main(String[] args) {
		abc();
		abc("Rina");
		abc(2);
		abc("RImi", 30,20);
		abc(2,"Smriti",3);

	}
	
	public static void abc()
	{
		System.out.println("I am zero parameter");
	}
	
	public static void   abc(int a)
	{
		System.out.println("I am with 1 int  parameter"); 
	}
	
	public static void abc(String str)
	{
		System.out.println("I am with 1 String  parameter");
	}
	
	public static void abc(int a, int b)
	{
		System.out.println("I am with 2 int  parameter");
	}

	public static void   abc(String str, int a, int b)
	{
		System.out.println("I am with 2 int and 1 string  parameter");
		//return a;
	}
	
	public static void  abc(int a, String str, int b)
	{
		System.out.println("I am with 1 string and 2 int   parameter");
		//return str;
	}
	
	
}
