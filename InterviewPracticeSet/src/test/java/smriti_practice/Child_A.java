package smriti_practice;

public   class Child_A implements Interface_A, Int_B {

	public static void main(String[] args) {
		Child_A obj= new Child_A();
		
		obj.m1();
		obj.m2();
		obj.m3();
		obj.m1_B();
		obj.m2_B();
		
     //   m1();  how can I call this method? m1 is non static method.
//But for abstract class we can not create an object.
		
	}

	public void m1()
	{
		System.out.println("I am inside m1 method");
	}

	public void m2()
	{
		System.out.println("I am inside m2 method");
	}
	public void m3()
	{
		System.out.println("I am inside m3 method");
	}

	@Override
	public void m1_B() {
		System.out.println("I am inside m1_B method");
		
	}

	@Override
	public void m2_B() {
		System.out.println("I am inside m2_B method");
		
	}

	
	
	
}
