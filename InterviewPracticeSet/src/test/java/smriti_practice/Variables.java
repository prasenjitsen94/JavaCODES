package smriti_practice;

public class Variables {
	static int global= 23;

	public static void main(String[] args) {
		int a=10;
		
		System.out.println("I am inside main:" + a);
		System.out.println("I am inside main, global :" + global);
		
		Variables obj= new Variables();
		
		
		my_var();
		obj.non_s();

	}
	
	public static void my_var()
	{
		int x=9;
		//global= 50;
		System.out.println("I am inside my_var: " + x);
		System.out.println("I am inside main, global :" + global);

	}
	
	public void non_s()
	{
		
		global=30;
		System.out.println("I am inside non_s: " + global);
	}

}
