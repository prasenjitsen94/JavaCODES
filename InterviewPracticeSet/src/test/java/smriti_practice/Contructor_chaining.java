package smriti_practice;

public class Contructor_chaining {
	
	Contructor_chaining()
	{
		this(5);
		System.out.println("The default contructor");
	}

	Contructor_chaining(int x)
	{
		this(5,15);
		System.out.println(x);
	}
	
	Contructor_chaining(int x, int y)
	{
		System.out.println(x*y);
	}
	public static void main(String[] args) {
		Contructor_chaining a= new Contructor_chaining();
		

	}

}
