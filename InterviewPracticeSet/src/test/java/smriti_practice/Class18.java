package smriti_practice;

public class Class18 {
	
//	int a=10;
//	int b=20;

	public static void main(String[] args) {
		Class18 obj= new Class18();
		//obj.rimi();
		
	int add= obj.sum(10,200);
	System.out.println(add);

	}
	
	public void rimi()
	{
		System.out.println("I am rimi");
		smriti();
	}
	
	public static void smriti()
	{
		System.out.println("I am smriti");
	}
	
	public int sum(int a,int b)
	{
		int c= a+b;
		//System.out.println(c);
		return c;
	}
}
